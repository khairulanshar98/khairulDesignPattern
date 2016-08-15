/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.designpattern.CompositePattern;

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
        Employee CEO = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Robert", "VP Sales", 20000);
        Employee headMarketing = new Employee("Michel", "VP Marketing", 20000);
        Employee Khairul = new Employee("Khairul", "VP IT", 20000);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);
        
        

        CEO.add(headSales);
        CEO.add(headMarketing);
        CEO.add(Khairul);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //print all employees of the organization
        System.out.println("0 ==> "+CEO);
        printAll(CEO,1,"      ");
    }
    
    private static void printAll(Employee parent,int level,String space){
        parent.getSubordinates().stream().map((headEmployee) -> {
            System.out.println(space+level+" ==> "+headEmployee);
            return headEmployee;
        }).forEach((headEmployee) -> {
            printAll(headEmployee,level+1,(space+"      "));
        });
    }

}
