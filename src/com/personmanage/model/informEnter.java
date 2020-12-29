package com.personmanage.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.dbconnector;

public class informEnter extends dbconnector {
	//保存人事信息
	EnDecode code=new EnDecode();
	
	public String enterinform(inform info) {
		String sql = "insert into person values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		String reString = "员工信息录入失败！";
		PreparedStatement operator = null;
		try {
			operator = link.prepareStatement(sql);
			operator.setInt(1, info.getId());
			operator.setString(2,code.encode(info.getSetpasswd()));
			operator.setString(3, info.getAuthority());
			operator.setString(4, info.getName());
			operator.setString(5, info.getSex());
			operator.setString(6, info.getBirth());
			operator.setInt(7, info.getDepartment());
			operator.setInt(8, info.getJob());
			operator.setInt(9, info.getEdu());
			operator.setString(10, info.getSkill());
			operator.setString(11, info.getAddress());
			operator.setString(12, info.getTele());
			operator.setString(13, info.getEmail());
			operator.setString(14, info.getIsemployee());
			operator.setString(15, info.getNote());
			int result = operator.executeUpdate();
			if (result > 0) {
				reString = "员工信息录入成功！";
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
		return reString;
	}

	//修改人事信息
	public String changeinform(inform info) {
		String sql = "update person set name=?,birthday=?,sex=?,state=?,department=?,job=?,edu_level=?,email=?,tel=?,spcialty=?,address=?,remark=?  where id=?";
		String sql2="update user_admin set name=? where id =?";
		String sql3="update user_employee set name=? where id =?";
		int flag=0;
		PreparedStatement operator = null;
		try {
			operator = link.prepareStatement(sql);
			operator.setString(1, info.getName());
			operator.setString(2, info.getBirth());
			operator.setString(3, info.getSex());
			operator.setString(4, info.getIsemployee());
			operator.setInt(5, info.getDepartment());
			operator.setInt(6, info.getJob());
			operator.setInt(7, info.getEdu());
			operator.setString(8, info.getEmail());
			operator.setString(9, info.getTele());
			operator.setString(10, info.getSkill());
			operator.setString(11,info.getAddress());
			operator.setString(12, info.getNote());
			operator.setInt(13, info.getId());
			int result = operator.executeUpdate();
			if (result > 0) {
				flag++;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			operator=link.prepareStatement(sql2);
			operator.setString(1, info.getName());
			operator.setInt(2, info.getId());
			int result = operator.executeUpdate();
			if (result > 0) {
				flag++;
			}
		} catch (SQLException  e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			operator=link.prepareStatement(sql3);
			operator.setString(1, info.getName());
			operator.setInt(2, info.getId());
			int result = operator.executeUpdate();
			if (result > 0) {
				flag++;
			}
		} catch (SQLException  e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			link.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if(flag==2)
		return"员工信息修改成功！" ;
		else 
		return"员工信息修改失败！";
	}
	//获取所有人事信息
	public List<inform> getinformList() {
		List<inform> relist = new ArrayList<inform>();
		String sql = "select * from person";
		try {
			PreparedStatement operator = link.prepareStatement(sql);
			ResultSet result = operator.executeQuery();
			while (result.next()) {
				inform temp = new inform();
				temp.setId(result.getInt("id"));
				temp.setSetpasswd(result.getString("passwd"));
				temp.setAuthority(result.getString("authority"));
				temp.setName(result.getString("name"));
				temp.setSex(result.getString("sex"));
				temp.setBirth(result.getString("birthday"));
				temp.setDepartment(result.getInt("department"));
				temp.setJob(result.getInt("job"));
				temp.setEdu(result.getInt("edu_level"));
				temp.setSkill(result.getString("spcialty"));
				temp.setAddress(result.getString("address"));
				temp.setTele(result.getString("tel"));
				temp.setEmail(result.getString("email"));
				temp.setIsemployee(result.getString("state"));
				temp.setNote(result.getString("remark"));
				relist.add(temp);
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
		return relist;
	}
	
	//查询员工信息
	public List<inform> searchInform(String name) {
		List<inform> relist = new ArrayList<inform>();
		String sql = "select * from person where name=? ";
		try {
			PreparedStatement operator = link.prepareStatement(sql);
			operator.setString(1, name);
			ResultSet result = operator.executeQuery();
			while (result.next()) {
				inform temp = new inform();
				temp.setId(result.getInt("id"));
				temp.setSetpasswd(result.getString("passwd"));
				temp.setAuthority(result.getString("authority"));
				temp.setName(result.getString("name"));
				temp.setSex(result.getString("sex"));
				temp.setBirth(result.getString("birthday"));
				temp.setDepartment(result.getInt("department"));
				temp.setJob(result.getInt("job"));
				temp.setEdu(result.getInt("edu_level"));
				temp.setSkill(result.getString("spcialty"));
				temp.setAddress(result.getString("address"));
				temp.setTele(result.getString("tel"));
				temp.setEmail(result.getString("email"));
				temp.setIsemployee(result.getString("state"));
				temp.setNote(result.getString("remark"));
				relist.add(temp);
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
		return relist;
	}
    
	//搜索需要修改的人事信息
	public inform searchInform(int id) {
		inform temp=new inform();
		String sql = "select * from person where id=? ";
		try {
			PreparedStatement operator = link.prepareStatement(sql);
			operator.setInt(1, id);
			ResultSet result = operator.executeQuery();
			while (result.next()) {
				temp.setId(result.getInt("id"));
				temp.setSetpasswd(result.getString("passwd"));
				temp.setAuthority(result.getString("authority"));
				temp.setName(result.getString("name"));
				temp.setSex(result.getString("sex"));
				temp.setBirth(result.getString("birthday"));
				temp.setDepartment(result.getInt("department"));
				temp.setJob(result.getInt("job"));
				temp.setEdu(result.getInt("edu_level"));
				temp.setSkill(result.getString("spcialty"));
				temp.setAddress(result.getString("address"));
				temp.setTele(result.getString("tel"));
				temp.setEmail(result.getString("email"));
				temp.setIsemployee(result.getString("state"));
				temp.setNote(result.getString("remark"));
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
		return temp;
	}
	
	//授予管理员权限
	public String impower(int ID, String name, String sex) {
		String sql = "update person set authority='管理员' where id=? and name=? and sex=?";
		String sql2 = "insert into user_admin select * from user_employee where id=? and name=?";
		String sql3 = "delete   from user_employee where id=? and name=?";
		boolean res1 = false, res2 = false, res3 = false;
		try {
			PreparedStatement operator = link.prepareStatement(sql);
			operator.setInt(1, ID);
			operator.setString(2, name);
			operator.setString(3, sex);
			int result = operator.executeUpdate();
			if (result > 0)
				res1 = true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			PreparedStatement operator2 = link.prepareStatement(sql2);
			operator2.setInt(1, ID);
			operator2.setString(2, name);
			int result = operator2.executeUpdate();
			if (result > 0)
				res2 = true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			PreparedStatement operator3 = link.prepareStatement(sql3);
			operator3.setInt(1, ID);
			operator3.setString(2, name);
			int result = operator3.executeUpdate();
			if (result > 0)
				res3 = true;
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
		if (res1 && res2 && res3)
			return "授权成功！";
		else
			return "授权失败！";
	}

	//取消管理员权限
	public String deprivePower(int ID, String name, String sex) {
		String sql = "update person set authority='员工'  where id=? and name=? and sex=?";
		String sql2 = "insert into user_employee  select * from user_admin where id=? and name=?";
		String sql3 = "delete   from user_admin where id=? and name=?";
		boolean res1 = false, res2 = false, res3 = false;
		try {
			PreparedStatement operator = link.prepareStatement(sql);
			operator.setInt(1, ID);
			operator.setString(2, name);
			operator.setString(3, sex);
			int result = operator.executeUpdate();
			if (result > 0)
				res1 = true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			PreparedStatement operator2 = link.prepareStatement(sql2);
			operator2.setInt(1, ID);
			operator2.setString(2, name);
			int result = operator2.executeUpdate();
			if (result > 0)
				res2 = true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			PreparedStatement operator3 = link.prepareStatement(sql3);
			operator3.setInt(1, ID);
			operator3.setString(2, name);
			int result = operator3.executeUpdate();
			if (result > 0)
				res3 = true;
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
		if (res1 && res2 && res3)
			return "解除成功！";
		else
			return "解除失败！";
	}
    
	//删除信息
	public String  deleteInform(int id) {
		String res="删除失败！";
		String sql="delete from person where id=?";
		String sql2="delete from user_admin where id=?";
		String sql3="delete from user_employee  where id=?";
		try {
			PreparedStatement operator=link.prepareStatement(sql);
			operator.setInt(1, id);
			int result=operator.executeUpdate();
			if(result>0)
				res="删除成功！";
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			PreparedStatement operator2=link.prepareStatement(sql2);
			operator2.setInt(1, id);
	        operator2.execute();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			PreparedStatement operator3=link.prepareStatement(sql3);
			operator3.setInt(1, id);
	        operator3.execute();
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
		return res;
	}
}
