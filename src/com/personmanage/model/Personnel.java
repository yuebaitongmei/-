package com.personmanage.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.dbconnector;

public class Personnel extends dbconnector {
	private int id;
	private int person;
	private int change;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPerson() {
		return person;
	}
	public void setPerson(int person) {
		this.person = person;
	}
	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	//根据变动得到人事代码
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
	//得到人事变动记录表
	public List<Personnel> getpersonnelList(){
		List<Personnel> relist = new ArrayList<Personnel>();
		String sql = "select * from personnel  ";
		try {
			PreparedStatement operator=link.prepareStatement(sql);
			ResultSet result = operator.executeQuery();
			while (result.next()) {
				Personnel personnel=new Personnel();
				personnel.setId(result.getInt("id"));
				personnel.setPerson(result.getInt("person"));
				personnel.setDescription(result.getString("description"));
				relist.add(personnel);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return relist;
	}
	//根据员工号查询人事记录
	public List<Personnel> searchpersonnelList(int id){
		List<Personnel> relist = new ArrayList<Personnel>();
		String sql = "select * from personnel where person=? ";
		try {
			PreparedStatement operator=link.prepareStatement(sql);
			operator.setInt(1, id);
			ResultSet result = operator.executeQuery();
			while (result.next()) {
				Personnel personnel=new Personnel();
				personnel.setId(result.getInt("id"));
				personnel.setPerson(result.getInt("person"));
				personnel.setDescription(result.getString("description"));
				relist.add(personnel);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return relist;
	}
}
