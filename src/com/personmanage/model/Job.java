package com.personmanage.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.dbconnector;
public class Job extends dbconnector {
	public   int getJob(String job){
		 String sql="select code  from job where description=? ";
		 int res = 0;
		try {
			PreparedStatement operator=link.prepareStatement(sql);
			operator.setString(1, job);
			ResultSet  result=operator.executeQuery();
			if(result.next())
				res=result.getInt("code");
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
