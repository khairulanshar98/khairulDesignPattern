/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author khairulanshar
 */
public class UpdateEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_LINK");

        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        EmployeeEntity employee = entitymanager.find(EmployeeEntity.class, 1201);

        //before update
        System.out.println(employee);
        employee.setSalary(46000);
        entitymanager.getTransaction().commit();

        //after update
        System.out.println(employee);
        entitymanager.close();
        emfactory.close();
    }

}
