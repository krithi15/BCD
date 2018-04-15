package com.dao;

import com.model.Patient;
import com.model.Sensor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.derby.jdbc.*;

public class MyDao {
	
	

	private static  Patient myPatient = new Patient();
	private static  Sensor sensorInfo = new Sensor();
	
	
	public static Patient getPatient() {
		return myPatient;
	}
	
	public static void insertInfo() {
		
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
					
			Connection	con = DriverManager.getConnection("jdbc:derby://localhost:1527/myDB");
			
			Statement statement = con.createStatement();
			
			String query = "update Patient set activity ='" + myPatient.getActivity() + "' where name = 'david'"; 
			statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void insertSensorInfo() {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			
			Connection	con = DriverManager.getConnection("jdbc:derby://localhost:1527/myDB");
			
			Statement statement = con.createStatement();
			
			String query = "update Sensor set sensornumber ='" + sensorInfo.getSensorNumber() + "' and timeOn='"+ sensorInfo.getTimeOn() +"' where name = 'david'"; 
			statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void updateInfo() {
		
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
					
			Connection	con = DriverManager.getConnection("jdbc:derby://localhost:1527/myDB");
			
			Statement statement = con.createStatement();
			
			String query = "update Patient set activity ='" + myPatient.getActivity() + "' where name = '"+ myPatient.getPname()+"'"; 
			statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void deleteInfo() {
		
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
					
			Connection	con = DriverManager.getConnection("jdbc:derby://localhost:1527/myDB");
			
			Statement statement = con.createStatement();
			
			String query = "delete from  Patient where activity ='" + myPatient.getActivity() + "' where name = '"+ myPatient.getPname()+"'"; 
			statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void getInfo() {
		
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
					
			Connection	con = DriverManager.getConnection("jdbc:derby://localhost:1527/myDB");
			
			Statement statement = con.createStatement();
			
			String query = "select * from  Patient where name ='" + myPatient.getPname() + "'";  
			statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
