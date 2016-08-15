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
public class CriteriaGender extends AbstractCirteria {

    public CriteriaGender(String value, String equalToOrContain) {
        super(value, equalToOrContain);
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        filterPerson = new ArrayList<Person>();
        persons.stream().filter((Person person) -> {
            if (CriteriaGender.this.equalToOrContain.equals("Like") || CriteriaGender.this.equalToOrContain.equals("Like")) {
                return person.getGender().contains(CriteriaGender.this.value);
            } else if (CriteriaGender.this.equalToOrContain.equals("=")) {
                return person.getGender().equalsIgnoreCase(CriteriaGender.this.value);
            }
            return false;
        }).forEach((person) -> {
            filterPerson.add(person);
        });
        return filterPerson;
    }
}
