package com.personmanage.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.dbconnector;

public class Counter extends dbconnector {
public  int getCounter(String type) {
  String sql="select  counter_val from  counter  where code=? ";
  int res = 0;
  try {
	PreparedStatement operator=link.prepareStatement(sql);
	operator.setString(1, type);
	ResultSet  result=operator.executeQuery();
	if(result.next())
		res=result.getInt("counter_val");
} catch (SQLException e) {
	// TODO: handle exception
	e.printStackTrace();
}
  return res;
}
public void  updateCounter(String str) {
	  String sql="update counter set counter_val=?  where code=? ";
	  try {
		PreparedStatement operator=link.prepareStatement(sql);
		operator.setInt(1, getCounter(str)+1);
		operator.setString(2,str );
		operator.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
