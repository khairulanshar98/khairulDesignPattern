/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.designpattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khairulanshar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Robert John", "Male", "Single"));
        persons.add(new Person("John Miner", "Male", "Married"));
        persons.add(new Person("Laura some", "Female", "Married"));
        persons.add(new Person("Diana John", "Female", "Single"));
        persons.add(new Person("Mike Some", "Male", "Single"));
        persons.add(new Person("Bobby Miner", "Male", "Single"));

        Criteria John = new CriteriaName("John", "contain");
        Criteria male = new CriteriaGender("Male", "=");//new CriteriaMale();
        Criteria female = new CriteriaGender("Female", "=");//new CriteriaFemale();
        Criteria single = new CriteriaMaritalStatus("Single", "=");//new CriteriaSingle();
        Criteria married = new CriteriaMaritalStatus("Married", "=");//new CriteriaMarried();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("John: ");
        printPersons(John.meetCriteria(persons));

        System.out.println("\nJohn and Single and Male: ");
        System.out.println(new java.util.Date().toString());
        Criteria JohnMale = new AndCriteria(John, male);
        Criteria JohnMaleSingle = new AndCriteria(JohnMale, single);
        printPersons(JohnMaleSingle.meetCriteria(persons));
        System.out.println(new java.util.Date().toString());

        System.out.println("\nJohn and (Single or Females): ");
        System.out.println(new java.util.Date().toString());
        Criteria FemaleOrSingle = new OrCriteria(female, single);
        Criteria JohnAndFemaleorSingle = new AndCriteria(John, FemaleOrSingle);
        printPersons(JohnAndFemaleorSingle.meetCriteria(persons));
        System.out.println(new java.util.Date().toString());

        System.out.println("\nJohn and (Married or Females): ");
        System.out.println(new java.util.Date().toString());
        Criteria FemaleOrMarried = new OrCriteria(female, married);
        Criteria JohnAndFemaleOrMarried = new AndCriteria(John, FemaleOrMarried);
        printPersons(JohnAndFemaleOrMarried.meetCriteria(persons));
        System.out.println(new java.util.Date().toString());

        System.out.println("\nMales: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));

    }

    public static void printPersons(List<Person> persons) {

        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }

}
