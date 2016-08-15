/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.jdbc.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @author khairulanshar
 */
public class dbconnection {

    private static dbconnection instance = null;
    private dbconnection(){}

    public static dbconnection getInstance() {
        if (instance == null) {
            instance = new dbconnection();
        }
        return instance;
    }

    public  Connection getConnection()
            throws SQLException, Exception {
        Connection conn = null;
        try {
            /*
            Please put xml below into context.xml file under /META-INF directory of a web application or  $CATALINA_BASE/conf directory
            */
            Context initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/somedb_DS");
            conn = ds.getConnection();
        } catch (SQLException localSQLException) {
            System.out.println("Could not get the connection: " + localSQLException.getMessage());
        }
        return conn;
    }
    
     public static void ConnectionClose(Connection paramConnection) {
        try {
            if (!paramConnection.isClosed()) {
                paramConnection.close();
            }
        } catch (SQLException localSQLException) {
            localSQLException.printStackTrace();
        }
    }

    public static void ResultSetClose(ResultSet paramResultSet) {
        try {
            if (paramResultSet != null) {
                paramResultSet.close();
            }
        } catch (Exception localException) {
            localException.printStackTrace();
        }
    }

    public static void StatementClose(Statement paramStatement) {
        try {
            if (paramStatement != null) {
                paramStatement.close();
            }
        } catch (Exception localException) {
            localException.printStackTrace();
        }
    }

    public static void StatementClose(PreparedStatement paramPreparedStatement) {
        try {
            if (paramPreparedStatement != null) {
                paramPreparedStatement.close();
            }
        } catch (Exception localException) {
            localException.printStackTrace();
        }
    }

}
