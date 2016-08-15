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
public abstract class AbstractCirteria implements Criteria {

    protected String value, equalToOrContain;
    protected List<Person> filterPerson;

    protected AbstractCirteria(String value, String equalToOrContain) {
        this.value = value;
        this.equalToOrContain = equalToOrContain;
    }

    public abstract List<Person> meetCriteria(List<Person> persons);
}
