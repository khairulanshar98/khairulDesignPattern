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
public class CriteriaMaritalStatus extends AbstractCirteria {
    
    
    public CriteriaMaritalStatus(String value, String equalToOrContain) {
        super(value, equalToOrContain);
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        filterPerson = new ArrayList<Person>();
        persons.stream().filter((Person person) -> {
            if (CriteriaMaritalStatus.this.equalToOrContain.equals("Like") || CriteriaMaritalStatus.this.equalToOrContain.equals("Like")) {
                return person.getMaritalStatus().contains(CriteriaMaritalStatus.this.value);
            } else if (CriteriaMaritalStatus.this.equalToOrContain.equals("=")) {
                return person.getMaritalStatus().equalsIgnoreCase(CriteriaMaritalStatus.this.value);
            }
            return false;
        }).forEach((person) -> {
            filterPerson.add(person);
        });
        return filterPerson;
    }
}
