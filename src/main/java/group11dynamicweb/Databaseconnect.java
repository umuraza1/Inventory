package group11dynamicweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Databaseconnect {
	private String dbUrl = "jdbc:mysql://localhost:3306/inventory";
	private String dbUser = "root";
	private String dbPass="";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		Connection con=null;
		 
		try {
			 con  = DriverManager.getConnection(dbUrl, dbUser, dbPass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
		
	}
	public String insert(adminl admin) {
		loadDriver(dbDriver);
		Connection con=getConnection();
		String query= "INSERT INTO adminlogin VALUES(?,?,?)";
		String message="wow!!! Your record has been successfully recorded";
		
		
		try {
			PreparedStatement ps = 	con.prepareStatement(query);
			ps.setString(1, null);
			ps.setString(2, admin.getUsername());
			ps.setString(3, admin.getPassword());
			ps.executeUpdate();
		}
		catch(SQLException e) {
			message="record not registered";
			e.printStackTrace();
		}
		return message;
	}
	
	public boolean checkCredintials(String username, String password) {
	loadDriver(dbDriver);
	Connection con=getConnection();
	String querry="SELECT * FROM adminlogin WHERE username=? AND password=?";

	String message="wow!!! Your record has been successf+ully recorded";
	PreparedStatement ps=null;
	
	try {
		ps = 	con.prepareStatement(querry);		
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet result=ps.executeQuery();
		if(result.next()) {
			return true;
		}
	}
	catch(SQLException e) {
		message="record not registered";
		e.printStackTrace();
	}
	return false;
	
}
	public String insertemplo(Employeel emplo) {
		loadDriver(dbDriver);
		Connection con=getConnection();
		String querye= "INSERT INTO employees VALUES(?,?,?,?,?,?)";
		String message="wow!!! Your record has been successfully recorded";
		
		
		try {
			PreparedStatement ps = 	con.prepareStatement(querye);
			ps.setString(1, null);
			ps.setString(2, emplo.getEmpfname());
			ps.setString(3, emplo.getEmplname());
			ps.setString(4, emplo.getPhone());
			ps.setString(5, emplo.getUsername());
			ps.setString(6, emplo.getPassword());
			ps.executeUpdate();
		}
		catch(SQLException e) {
			message="record not registered";
			e.printStackTrace();
		}
		return message;
	}
	public String insertpay(Payment pay) {
		loadDriver(dbDriver);
		Connection con=getConnection();
		String querye= "INSERT INTO payment VALUES(?,?,?,?,?,?)";
		String message="wow!!! Your record has been successfully recorded";
		
		
		try {
			PreparedStatement ps = 	con.prepareStatement(querye);
			ps.setString(1, null);
			ps.setInt(2, pay.getProid());
			ps.setInt(3, pay.getCustid());
			ps.setInt(4, pay.getQuantity());
			ps.setInt(5, pay.getAmountpaid());
			ps.setString(6, pay.getDate());
			ps.executeUpdate();
		}
		catch(SQLException e) {
			message="record not registered";
			e.printStackTrace();
		}
		return message;
	}
		public String insertcustomer(Customer cust) {
			loadDriver(dbDriver);
			Connection con=getConnection();
			String querye= "INSERT INTO customer VALUES(?,?,?,?,?)";
			String message="wow!!! Your record has been successfully recorded";
			
			
			try {
				PreparedStatement ps = 	con.prepareStatement(querye);
				ps.setString(1, null);
				ps.setString(2, cust.getCfname());
				ps.setString(3, cust.getClname());
				ps.setString(4, cust.getPhone());
				ps.setInt(5, cust.getAddid());
				ps.executeUpdate();
			}
			catch(SQLException e) {
				message="record not registered";
				e.printStackTrace();
			}
			return message;
	}
	public String insertsup(Supplier sup) {
		loadDriver(dbDriver);
		Connection con=getConnection();
		String querys= "INSERT INTO supplier VALUES(?,?,?,?,?,?,?,?)";
		String message="wow!!! Your record has been successfully recorded";
		
		
		try {
			PreparedStatement ps = 	con.prepareStatement(querys);
			ps.setString(1, null);
			ps.setString(2, sup.getSupfname());
			ps.setString(3, sup.getSuplname());
			ps.setString(4, sup.getPhone());
			ps.setInt(5, sup.getProid());
			ps.setInt(6, sup.getQuantity());
			ps.setInt(7, sup.getPrice());
			ps.setString(8, sup.getDate());
			ps.executeUpdate();
		}
		catch(SQLException e) {
			message="record not registered";
			e.printStackTrace();
		}
		return message;
	}
	public boolean checkCredintialsforemployee(String username, String password) {
		loadDriver(dbDriver);
		Connection con=getConnection();
		String querrye="SELECT * FROM employees WHERE username=? AND password=?";

		String message="wow!!! Your record has been successfully recorded";
		PreparedStatement ps=null;
		
		try {
			ps = 	con.prepareStatement(querrye);		
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet result=ps.executeQuery();
			if(result.next()) {
				return true;
			}
		}
		catch(SQLException e) {
			message="record not registered";
			e.printStackTrace();
		}
		return false;
		
	}
	public String inputemp(Employee emp) {
		loadDriver(dbDriver);
		Connection conn=getConnection();
		String sqlquery=" INSERT INTO employees VALUES(?,?,?,?,?,?)";
		String sms="The employee has been successfully recorded";
		try {
			PreparedStatement ps = 	conn.prepareStatement(sqlquery);
			ps.setString(1, null);
			ps.setString(2, emp.getEmpfname());
			ps.setString(3, emp.getEmplname());
			ps.setString(4, emp.getPhone());
			ps.setString(5, emp.getUsername());
			ps.setString(6, emp.getPassword());
			ps.executeUpdate();
		}
		catch(SQLException e) {
			
			sms="record not registered";
			e.printStackTrace();
		}
		
		return sms;
		
	}
	public String inputpro(Producta proa) {
		loadDriver(dbDriver);
		Connection conn=getConnection();
		String sqlqueryp=" INSERT INTO product VALUES(?,?,?,?,?,?,?)";
		String sms="The product has been successfully recorded";
		try {
			PreparedStatement ps = 	conn.prepareStatement(sqlqueryp);
			ps.setString(1, null);
			ps.setString(2, proa.getProname());
			ps.setString(3, proa.getProtype());
			ps.setString(4, proa.getQuantity());
			ps.setString(5, proa.getPrice());
			ps.setString(6, proa.getFabricationdate());
			ps.setString(7, proa.getExpireddate());
			ps.executeUpdate();
		}
		catch(SQLException e) {
			
			sms="record not registered";
			e.printStackTrace();
		}
		
		return sms;
		
	}

}
