package com.personmanage.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.dbconnector;

public class Personnel extends dbconnector {
	public   int  getPersonnel(String description){
		 String sql="select  code  from   personnel_change  where description=?";
		 int res = 0;
		try {
			PreparedStatement operator=link.prepareStatement(sql);
			operator.setString(1, description);
			ResultSet  result=operator.executeQuery();
			if(result.next())
				res=result.getInt("code");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return res;
	}
}
