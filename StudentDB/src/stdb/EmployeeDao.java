package stdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;



public class EmployeeDao {

	public static void createEmployee(Employee employee)throws Exception {
		Connection con=DB.connect();
		String query=Query.insert;
		PreparedStatement preparedStatement =con.prepareStatement(query);
		preparedStatement.setInt(1,employee.getId());
		preparedStatement.setString(2,employee.getName());
		preparedStatement.setString(3,employee.getEmail());
		preparedStatement.setString(4,employee.getAddress());
		
		System.out.println("\n ps= "+preparedStatement+"\n"+employee);
		preparedStatement.executeUpdate();
		preparedStatement.close();
		
		
		
		
	}

	public static ArrayList<Employee> readAllData()throws SQLException {
		ArrayList<Employee> emplist=new ArrayList<>();
		Connection con=DB.connect();
		String query=Query.select;
		
		Statement statement = con.prepareStatement(query);
		System.out.println("\n st= " +statement);
		ResultSet rs=statement.executeQuery(query);
		
		while(rs.next()) {
			Employee emp=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			emplist.add(emp);
		}
		statement.close();
		return emplist;
		
		
		
	}

	public static void updateEmployee(int id, String name)throws Exception {
		Connection con=DB.connect();
		String query=Query.update;
		
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(2,id);
		pst.setString(1,name);
		System.out.println("\n ps= "+pst);
		pst.executeUpdate();
		pst.close();
		
		
	}

	public static void DeleteData(int id) throws SQLException {
		Connection con=DB.connect();
		String query=Query.delete;
		
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1,id);
		System.out.println("\n pst= "+pst);
		
		int rowsAffected=pst.executeUpdate();
		if(rowsAffected>0) {
			System.out.println("Employee with ID "+id+" deleted successfully.");
		}else {
			System.out.println("NO employee found with Id "+id+". NO deletion performed.");
		}
		
		
		
		
		
		
	}

	

}
