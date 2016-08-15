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
public class NamedQueries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_LINK");
        EntityManager entitymanager = emfactory.createEntityManager();
        Query query = entitymanager.createNamedQuery("some name for NamedQuery");

        query.setParameter("id", 1204);
        List<EmployeeEntity> list = query.getResultList();

        for (EmployeeEntity e : list) {
            System.out.print("Employee ID :" + e.getEid());
            System.out.println("\t Employee Name :" + e.getEname());
        }
    }

}
