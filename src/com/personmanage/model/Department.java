package com.personmanage.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.dbconnector;

public class Department extends dbconnector {
public   int getDepartment(String depart){
	 String sql="select id  from  Department  where name=? ";
	 int res = 0;
	try {
		PreparedStatement operator=link.prepareStatement(sql);
		operator.setString(1, depart);
		ResultSet  result=operator.executeQuery();
		if(result.next())
			res=result.getInt("id");
	} catch (SQLException e) {
		// TODO: handle exception
	}
	try {
		link.close();
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return res;
}
}
