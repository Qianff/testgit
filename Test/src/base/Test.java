package base;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	
	public static void main(String args[]) {
		
		Statement sql;
		ResultSet rs;
		String dbUrl = "jdbc:sqlserver://127.0.0.1:1433; DatabaseName=TestQian"; 
		String userName = "sa"; //Ĭ���û���
		String userPwd = "sa123456"; //����
		Connection dbConn;    
		try {
		           String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		           Class.forName(driverName);
		           dbConn = DriverManager.getConnection(dbUrl, userName, userPwd);
                   System.out.println(dbConn);
		         //2.�������ݿ�

		          sql=dbConn.createStatement();

		        //���������������ݿ�

		       rs=sql.executeQuery("select * from dbo.Customer");
		       if(rs.next()) {
                   System.out.println(rs.getString("Name"));
		       }
		       dbConn.close();

		  } catch (ClassNotFoundException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        } catch (SQLException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
	}

}
