package com.personmanage.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.dbconnector;

public class edulevel extends dbconnector {
	public   int getedulevel(String edu){
		 String sql="select code  from  edu_level  where description=? ";
		 int res = 0;
		try {
			PreparedStatement operator=link.prepareStatement(sql);
			operator.setString(1, edu);
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
