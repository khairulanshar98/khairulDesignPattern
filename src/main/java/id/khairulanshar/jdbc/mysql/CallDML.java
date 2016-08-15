/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.jdbc.mysql;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khairulanshar
 */
public class CallDML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String sql_query="select * from somedb.some_table where col1=?";
            List inputargs = new ArrayList();
            inputargs.add("some_value");
            dml.getInstance().dml_query(sql_query, inputargs);
        } catch (Exception localException) {
        }
        
        try {
            String sql_update= "insert into somedb.some_table (col1_string,col2_int,col3_date)  values (?,?,CURDATE())";
            List inputargs = new ArrayList();
            inputargs.add("some_value_for_col1");
            inputargs.add(2);
            dml.getInstance().dml_update(sql_update, inputargs);
        } catch (Exception localException) {
        }
    }
    
}
