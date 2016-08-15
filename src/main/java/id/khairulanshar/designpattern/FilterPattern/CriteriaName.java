/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.designpattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author khairulanshar
 */
public class CriteriaName extends AbstractCirteria {

    public CriteriaName(String value, String equalToOrContain) {
         super(value, equalToOrContain);
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        filterPerson = new ArrayList<Person>();
        persons.stream().filter((Person person) -> {
            if (CriteriaName.this.equalToOrContain.equals("Like") || CriteriaName.this.equalToOrContain.equals("contain")) {
                return person.getName().contains(CriteriaName.this.value);
            } else if (CriteriaName.this.equalToOrContain.equals("=")) {
                return person.getName().equalsIgnoreCase(CriteriaName.this.value);
            }
            return false;
        }).forEach((person) -> {
            filterPerson.add(person);
        });
        return filterPerson;
    }
}
