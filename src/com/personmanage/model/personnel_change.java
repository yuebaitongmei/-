package com.personmanage.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.dbconnector;

public class personnel_change extends dbconnector{
	public   void  update(int id,int person,int num,String description){
		 String sql="insert into  personnel  values(?,?,?,?) ";
		try {
			PreparedStatement operator=link.prepareStatement(sql);
			operator.setInt(1,id);
			operator.setInt(2, person);
			operator.setInt(3, num);
			operator.setString(4, description);
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
