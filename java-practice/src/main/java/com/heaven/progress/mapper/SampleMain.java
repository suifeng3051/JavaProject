package com.heaven.progress.mapper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
/*******************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2014 博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 * BidPlanStructForm.java Created on 2014-9-3
 * Author: <a href=mailto:wanghd@bonree.com>王厚达</a>
 * @Title: SampleMain.java
 * @Package com.heaven.mapper
 * Description:
 * Version: 1.0
 ******************************************************************************/
public class SampleMain {
		public static void main(String ...args){
		try {
			ResultSetMapper<SamplePojo> resultSetMapper = new ResultSetMapper<SamplePojo>();
			ResultSet resultSet = null;
			// simple JDBC code to run SQL query and populate resultSet - START
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String database = "jdbc:odbc:AkDb"; 
			Connection connection = DriverManager.getConnection( database ,"","");
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM UsersSample");
			resultSet = statement.executeQuery();
			/******************************/
			List<SamplePojo> pojoList = resultSetMapper.mapRersultSetToObject(resultSet, SamplePojo.class);
			/******************************/
			if(pojoList != null){
				for(SamplePojo pojo : pojoList){
					System.out.println(pojo);
				}
			}else{
				System.out.println("ResultSet is empty. Please check if database table is empty");
			}
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		}
}
