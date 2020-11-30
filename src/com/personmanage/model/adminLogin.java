package com.personmanage.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import db.dbconnector;

public class adminLogin extends dbconnector {
	public admin Login(admin ad) {
		String sqlstr = "select * from user_admin where name=? and password=?";
		admin resultAdmin = null;
		try {
			PreparedStatement operator = link.prepareStatement(sqlstr);
			operator.setString(1, ad.getName());
			operator.setString(2, ad.getPassword());
			ResultSet dbResult = operator.executeQuery();
			if (dbResult.next()) {
				resultAdmin = new admin();
				resultAdmin.setId(dbResult.getInt("id"));
				resultAdmin.setName(dbResult.getString("name"));
				resultAdmin.setPassword(dbResult.getString("password"));
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
		return resultAdmin;
	}

	public String editpassword1(admin ad, String newpassword) {
		String resString = "修改失败！";
		String sql = "update user_admin set password=? where name=? and password=?";
		String sql2 = "update  person  set passwd=? where name=? and passwd=?";
		PreparedStatement operator = null;
		PreparedStatement operator2 = null;
		try {
			operator = link.prepareStatement(sql);
			operator.setString(1, newpassword);
			operator.setString(2, ad.getName());
			operator.setString(3, ad.getPassword());
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
			operator2.setString(1, newpassword);
			operator2.setString(2, ad.getName());
			operator2.setString(3, ad.getPassword());
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
