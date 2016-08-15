/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.jdbc.mysql;

import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author khairulanshar
 */
public class dml {

    private static dml instance = null;

    private dml() {
    }

    private static dbconnection db = null;

    public static dml getInstance() {
        if (instance == null) {
            instance = new dml();
            db = dbconnection.getInstance();
        }
        return instance;
    }

    public void dml_update(String sql, List args)
            throws SQLException, Exception {
        Connection localConnection = null;
        PreparedStatement localPreparedStatement = null;
        try {
            localConnection = db.getConnection();
            localPreparedStatement = localConnection.prepareStatement(sql);
            setArgument(localPreparedStatement, args);
            localPreparedStatement.executeUpdate();
        } catch (SQLException localSQLException) {
            throw new SQLException(sql);
        } catch (Exception localException) {
            throw new Exception(sql);
        } finally {
            dbconnection.StatementClose(localPreparedStatement);
            dbconnection.ConnectionClose(localConnection);
        }
    }

    public JSONArray dml_query(String sql, List args)
            throws SQLException, Exception {
        Connection localConnection = null;
        PreparedStatement localPreparedStatement = null;
        ResultSet localResultSet = null;
        JSONArray localJSONArray = new JSONArray();
        try {
            localConnection = db.getConnection();
            localPreparedStatement = localConnection.prepareStatement(sql);
            setArgument(localPreparedStatement, args);
            localResultSet = localPreparedStatement.executeQuery();
            localJSONArray = convertToJsonArray(localResultSet);
        } catch (SQLException localSQLException) {
            throw new SQLException(sql);
        } catch (Exception localException) {
            throw new Exception(sql);
        } finally {
            dbconnection.ResultSetClose(localResultSet);
            dbconnection.StatementClose(localPreparedStatement);
            dbconnection.ConnectionClose(localConnection);
        }
        return localJSONArray;
    }

    public InputStream getBlob(String sql)
            throws SQLException, Exception {
        Connection localConnection = null;
        PreparedStatement localPreparedStatement = null;
        ResultSet localResultSet = null;
        String str = "select data from somedb.blob_table where uuid=?";
        try {
            localConnection = db.getConnection();
            localPreparedStatement = localConnection.prepareStatement(str);
            localPreparedStatement.setString(1, sql);
            localResultSet = localPreparedStatement.executeQuery();
            if (localResultSet.next()) {
                InputStream localInputStream = localResultSet.getBinaryStream("data");
                return localInputStream;
            }
        } catch (SQLException localSQLException) {
            throw new SQLException(str);
        } catch (Exception localException) {
            throw new Exception(str);
        } finally {
            dbconnection.ResultSetClose(localResultSet);
            dbconnection.StatementClose(localPreparedStatement);
            dbconnection.ConnectionClose(localConnection);
        }
        return null;
    }

    public void setArgument(PreparedStatement paramPreparedStatement, List args) {
        if (args == null) {
            args = new ArrayList();
        }
        int i=0;
        for (Object arg : args) {
            try {
                paramPreparedStatement.setBlob(i + 1, (InputStream) arg);
            } catch (Exception localException1) {
                try {
                    paramPreparedStatement.setString(i + 1, (String) arg);
                } catch (Exception localException2) {
                    try {
                        paramPreparedStatement.setInt(i + 1, ((Integer) arg).intValue());
                    } catch (Exception localException3) {
                        try {
                            paramPreparedStatement.setLong(i + 1, ((Long) arg).longValue());
                        } catch (Exception localException4) {
                            try {
                                paramPreparedStatement.setBigDecimal(i + 1, (BigDecimal) arg);
                            } catch (Exception localException5) {
                                try {
                                    paramPreparedStatement.setString(i + 1, arg.toString());
                                } catch (Exception localException6) {
                                }
                            }
                        }
                    }
                }
            }
            i++;
        }
    }

    public JSONArray convertToJsonArray(ResultSet paramResultSet)
            throws SQLException {
        JSONArray localJSONArray = new JSONArray();
        ResultSetMetaData localResultSetMetaData = paramResultSet.getMetaData();
        while (paramResultSet.next()) {
            int i = localResultSetMetaData.getColumnCount();
            JSONObject localJSONObject = new JSONObject();
            for (int j = 1; j < i + 1; j++) {
                String str = localResultSetMetaData.getColumnName(j);
                try {
                    if (localResultSetMetaData.getColumnType(j) == 2003) {
                        localJSONObject.put(str, paramResultSet.getArray(str));
                    } else if (localResultSetMetaData.getColumnType(j) == -5) {
                        localJSONObject.put(str, Integer.valueOf(paramResultSet.getInt(str)));
                    } else if (localResultSetMetaData.getColumnType(j) == 16) {
                        localJSONObject.put(str, Boolean.valueOf(paramResultSet.getBoolean(str)));
                    } else if (localResultSetMetaData.getColumnType(j) == 2004) {
                        localJSONObject.put(str, paramResultSet.getBlob(str));
                    } else if (localResultSetMetaData.getColumnType(j) == 8) {
                        localJSONObject.put(str, Double.valueOf(paramResultSet.getDouble(str)));
                    } else if (localResultSetMetaData.getColumnType(j) == 6) {
                        localJSONObject.put(str, Float.valueOf(paramResultSet.getFloat(str)));
                    } else if (localResultSetMetaData.getColumnType(j) == 4) {
                        localJSONObject.put(str, Integer.valueOf(paramResultSet.getInt(str)));
                    } else if (localResultSetMetaData.getColumnType(j) == -9) {
                        localJSONObject.put(str, paramResultSet.getNString(str));
                    } else if (localResultSetMetaData.getColumnType(j) == 12) {
                        localJSONObject.put(str, paramResultSet.getString(str));
                    } else if (localResultSetMetaData.getColumnType(j) == -6) {
                        localJSONObject.put(str, Integer.valueOf(paramResultSet.getInt(str)));
                    } else if (localResultSetMetaData.getColumnType(j) == 5) {
                        localJSONObject.put(str, Integer.valueOf(paramResultSet.getInt(str)));
                    } else if (localResultSetMetaData.getColumnType(j) == 91) {
                        if (paramResultSet.getDate(str) != null) {
                            localJSONObject.put(str, paramResultSet.getDate(str).toString());
                        } else {
                            localJSONObject.put(str, "");
                        }
                    } else if (localResultSetMetaData.getColumnType(j) == 93) {
                        if (paramResultSet.getTimestamp(str) != null) {
                            localJSONObject.put(str, paramResultSet.getTimestamp(str).toString());
                        } else {
                            localJSONObject.put(str, "");
                        }
                    } else {
                        localJSONObject.put(str, paramResultSet.getObject(str));
                    }
                } catch (Exception localException) {
                    localJSONObject.put(str, paramResultSet.getObject(str));
                }
            }
            localJSONArray.add(localJSONObject);
        }
        return localJSONArray;
    }
}
