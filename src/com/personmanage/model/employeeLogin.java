package com.personmanage.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import db.dbconnector;

public class employeeLogin extends dbconnector {
	EnDecode code=new EnDecode();
	
	public employee Login(employee em) {
		String sqlstr = "select * from user_employee  where name=? and password=?";
		employee resultEmployee = null;
		try {
			PreparedStatement operator = link.prepareStatement(sqlstr);
			operator.setString(1, em.getName());
			operator.setString(2, code.encode(em.getPassword()));
			ResultSet dbResult = operator.executeQuery();
			if (dbResult.next()) {
				resultEmployee = new employee();
				resultEmployee.setId(dbResult.getInt("id"));
				resultEmployee.setName(dbResult.getString("name"));
				resultEmployee.setPassword(code.decode(dbResult.getString("password")));
			}
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
		return resultEmployee;
	}

	public String editpassword2(employee em, String newpassword) {
		String resString = "修改失败！";
		String sql = "update user_employee  set password=? where name=? and password=?";
		String sql2 = "update  person  set passwd=? where name=? and passwd=?";
		PreparedStatement operator = null;
		PreparedStatement operator2 = null;
		try {
			operator = link.prepareStatement(sql);
			operator.setString(1, code.encode(newpassword));
			operator.setString(2, em.getName());
			operator.setString(3,code.encode( em.getPassword()));
			int result = operator.executeUpdate();
			if (result > 0) {
				resString = "密码修改成功！";
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			operator2 = link.prepareStatement(sql2);
			operator2.setString(1, code.encode(newpassword));
			operator2.setString(2, em.getName());
			operator2.setString(3, code.encode(em.getPassword()));
			int result = operator2.executeUpdate();
			if (result <= 0) {
				resString = "密码修改失败！";
			}
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
		return resString;
	}
}
