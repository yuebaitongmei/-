package com.personmanage.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.dbconnector;

public class update_empleyee extends dbconnector {
	public   void  update(int  id,String name,String passwd){
		 String sql="insert into  user_employee  values(?,?,?) ";
		try {
			PreparedStatement operator=link.prepareStatement(sql);
			operator.setInt(1,id);
			operator.setString(2, name);
			operator.setString(3, passwd);
			operator.execute();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			link.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
