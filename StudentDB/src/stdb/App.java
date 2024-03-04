package stdb;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args)throws Exception {
		while(true) {
			System.out.println("\n Employee Management");
			System.out.print("1 = Write, 2 = Read, 3 = update, 4 = delete");
	        Scanner sc=new Scanner(System.in);	
	        int choice=sc.nextInt();
	        
	        if(choice<1 || choice>=5) break;
	        switch(choice) {
	        case 1: System.out.println("id,name,email,address");
	        int id=sc.nextInt();
	        String name=sc.nextLine();
	        String email=sc.nextLine();
	        String address =sc.nextLine();
	        Employee emp=new Employee(id,name,email,address);
	        EmployeeDao.createEmployee(emp);
	        
	        case 2: ArrayList<Employee>List=EmployeeDao.readAllData();
	        for(Employee employee:List) {
	        	System.out.println(employee);
	        }
	        break;
	        
	        case 3:System.out.println("id And name");
	        id=sc.nextInt();
	        sc.nextLine();
	        name=sc.nextLine();
	        EmployeeDao.updateEmployee(id,name);
	        break;
	        
	        case 4:System.out.println("\n Enter Id of employee ");
	        id=sc.nextInt();
	        EmployeeDao.DeleteData(id);
	        break;
	        
	        
	       
	        
	        }
		}
		

	}

}
