package com.rcd.model;

import org.apache.mahout.cf.taste.impl.model.jdbc.ConnectionPoolDataSource;
import org.apache.mahout.cf.taste.impl.model.jdbc.MySQLJDBCDataModel;
import org.apache.mahout.cf.taste.model.JDBCDataModel;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class MyDataModel {

	public static JDBCDataModel myDataModel() {
        MysqlDataSource dataSource = new MysqlDataSource();
        JDBCDataModel dataModel = null;
        try {
            dataSource.setUrl("jdbc:mysql://localhost:3306/movies");
            dataSource.setUser("root");
            dataSource.setPassword("123");
            // use JNDI
            JDBCDataModel jdbcDataModel = new MySQLJDBCDataModel(dataSource, "movie_preferences", "userID", "movieID", "preference");

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return dataModel;

    } 

}
