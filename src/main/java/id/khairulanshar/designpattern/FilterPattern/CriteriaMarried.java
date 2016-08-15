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
public class CriteriaMarried implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons  = new ArrayList<Person>();

        /*
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("Married")){
               malePersons.add(person);
            }
         }
         */
        persons.stream().filter((person) -> (person.getMaritalStatus().equalsIgnoreCase("Married"))).forEach((person) -> {
            femalePersons.add(person);
        });
        return femalePersons ;
    }
}
