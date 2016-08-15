/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author khairulanshar
 */
public class JPQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_LINK");
        EntityManager entitymanager = emfactory.createEntityManager();

        //Scalar function
        Query query = entitymanager.
                createQuery("Select UPPER(e.ename) from EmployeeEntity e");
        List<String> list = query.getResultList();

        for (String e : list) {
            System.out.println("Employee NAME :" + e);
        }

        //Aggregate function
        Query query1 = entitymanager.createQuery("Select MAX(e.salary) from EmployeeEntity e");
        Double result = (Double) query1.getSingleResult();
        System.out.println("Max Employee Salary :" + result);

        //Between
        query = entitymanager.createQuery("Select e " + "from Employee e " + "where e.salary " + "Between 30000 and 40000");

        List<EmployeeEntity> list1 = (List<EmployeeEntity>) query.getResultList();

        for (EmployeeEntity e : list1) {
            System.out.print("Employee ID :" + e.getEid());
            System.out.println("\t Employee salary :" + e.getSalary());
        }

        //Like
        query1 = entitymanager.createQuery("Select e " + "from Employee e " + "where e.ename LIKE 'M%'");

        list1 = (List<EmployeeEntity>) query1.getResultList();

        for (EmployeeEntity e : list1) {
            System.out.print("Employee ID :" + e.getEid());
            System.out.println("\t Employee name :" + e.getEname());
        }
    }

}
