package test;
import java.util.*;
import java.sql.*;
public class DBCon4  {
	public static void main(String[] args) throws ClassNotFoundException,
	SQLException{
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the table structure to be created:");
	String tB= s.nextLine();
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:sohit","scott","tiger");
	Statement stm=con.createStatement();
	int k=stm.executeUpdate(tB);
	if(k>=0)
	{
		System.out.println("table Created");
	}
    con.close();
    s.close();
	}

}
