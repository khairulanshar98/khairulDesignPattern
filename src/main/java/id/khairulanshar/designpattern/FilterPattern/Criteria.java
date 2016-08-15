/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.designpattern.FilterPattern;

import java.util.List;

/**
 *
 * @author khairulanshar
 */
public interface Criteria {
     public List<Person> meetCriteria(List<Person> persons);
}
