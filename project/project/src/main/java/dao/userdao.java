package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.userdetail;

public class userdao {

	
	 static String driver="com.mysql.cj.jdbc.Driver";
	  static String url="jdbc:mysql://localhost:3306/userdetail";
	  static String username="root";
	  static String password="root";
	  
	  
	  public void saveuser(userdetail u) throws Exception {
		  Class.forName(driver);
		  Connection c=DriverManager.getConnection(url,username,password);
		  PreparedStatement ps =c.prepareStatement("insert into new_table values (?,?,?,?,?,?,?)");
		  ps.setInt(1,u.getId() );
		  ps.setString(2,u.getFname() );
		  ps.setString(3,u.getLname() );
		  ps.setString(4,u.getGender() );
		  ps.setString(5,u.getEmail() );
		  ps.setString(6,u.getPassword() );
		  ps.setLong(7,u.getPhone() );
		  ps.executeUpdate();
		  
		  c.close();
		  
		  System.out.println(" data saved ");
		 
		}
	  
	  public void deletebyid(int id) throws Exception {
		  Class.forName(driver);
		  Connection c=DriverManager.getConnection(url,username,password);
		  PreparedStatement ps =c.prepareStatement("Delete from new_table where id=? ");
		  ps.setInt(1,id);
		  ps.executeUpdate();
		  c.close();
		  System.out.println("data deleted ");
		}
	  
	  public userdetail getbyid(int id) throws Exception {
		  Class.forName(driver);
		  Connection c=DriverManager.getConnection(url,username,password);
		  PreparedStatement ps =c.prepareStatement("Select * from new_table where id=?");
		  ps.setInt(1, id);
		  
		  ResultSet rs=ps.executeQuery();
		  
		  while(rs.next()) {
			  int id1=rs.getInt("id");
			  String fname=rs.getString("fname");
			  String Lname=rs.getString("Lname");
			  String Gender=rs.getString("Gender");
			  String Email=rs.getString("Email");
			  String password=rs.getString("password");
			  long phone=rs.getLong("phone");
			 
			  
			  userdetail u=new userdetail();
			  u.setId(id1);
			  u.setFname(fname);
			  u.setLname(Lname);
			  u.setEmail(Email);
			  u.setGender(Gender);
			  u.setPassword(password);
			  u.setPhone(phone);
			  
			  
			  
			  
			  return u;
		  }
		return null;
		
	}
	  
	  public userdetail getbyEmail(String  email) throws Exception {
		  Class.forName(driver);
		  Connection c=DriverManager.getConnection(url,username,password);
		  PreparedStatement ps =c.prepareStatement("select * from new_table where Email=?");
		  ps.setString(1, email);
		  
		  ResultSet rs=ps.executeQuery();
		  
		  while(rs.next()) {
			  int id=rs.getInt("id");
			  String fname=rs.getString("fname");
			  String Lname=rs.getString("Lname");
			  String Gender=rs.getString("Gender");
			  String Email=rs.getString("Email");
			  String password=rs.getString("password");
			  long phone=rs.getLong("phone");
			 
			  
			  userdetail u=new userdetail();
			  u.setId(id);
			  u.setFname(fname);
			  u.setLname(Lname);
			  u.setEmail(Email);
			  u.setGender(Gender);
			  u.setPassword(password);
			  u.setPhone(phone);
			  
			  
			  
			  
			  return u;
		  }
		return null;
		}
	  public List<userdetail> fetchall() throws Exception {
		  
	  
		  Class.forName(driver);
		  Connection c=DriverManager.getConnection(url,username,password);
		  
		  Statement s=c.createStatement();
		  
		  ResultSet rs=s.executeQuery("select * from new_table ");
		  ArrayList<userdetail> al=new ArrayList<>();
		  
		  while(rs.next()){
			  int id=rs.getInt("id");
			  String fname=rs.getString("fname");
			  String Lname=rs.getString("Lname");
			  String Gender=rs.getString("Gender");
			  String Email=rs.getString("Email");
			  String password=rs.getString("password");
			  long phone=rs.getLong("phone");
			 
			  
			  userdetail u=new userdetail();
			  u.setId(id);
			  u.setFname(fname);
			  u.setLname(Lname);
			  u.setEmail(Email);
			  u.setGender(Gender);
			  u.setPassword(password);
			  u.setPhone(phone);
			 
			  
			  
			  al.add(u);
			 
			  
		  }
		  return al;
		  

			  
		  }
	  
	  public void updata_userdetail(userdetail u) throws Exception {
		  Class.forName(driver);
		  Connection c=DriverManager.getConnection(url,username,password);
		  PreparedStatement ps=c.prepareStatement("update new_table set fname=? ,lname=? ,gender=? , email=?,password=?, phone=? where id=?");
		  
		 
		  ps.setString(1,u.getFname() );
		  ps.setString(2,u.getLname() );
		  ps.setString(3,u.getGender() );
		  ps.setString(4,u.getEmail() );
		  ps.setString(5,u.getPassword() );
		  ps.setLong(6,u.getPhone() );
		  ps.setInt(7,u.getId() );
		  
		  
		  ps.executeUpdate();
		  
		  c.close();
		  System.out.println("data updated ");
		  
	}
	  
	  
}
