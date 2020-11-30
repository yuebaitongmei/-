package db;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class dbconnect {
	static final String db_driver= "com.mysql.cj.jdbc.Driver";  
    static final String dbUrl = "jdbc:mysql://localhost:3306/personmanagedb?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
    static final String  username="root";
    static final String password="155755";
    public Connection getConnect() {
    	try {
    		Class.forName(db_driver);
    	}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	Connection  link=null;
    	try {
    		link=DriverManager.getConnection(dbUrl,username,password);
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
    	return link;
    }
    public void closeLink(Connection link) throws Exception{
    	if(link!=null)
		 link.close();
	}
    
    public static void main(String[] args) {
    	dbconnect link=new dbconnect();
    	try {
			link.getConnect();
			System.out.println("数据库连接成功！");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("数据库连接失败！");
		}
    }
}
