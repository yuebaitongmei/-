package db;

import java.sql.Connection;

public class dbconnector {
   public  Connection link=new dbconnect().getConnect();
}
