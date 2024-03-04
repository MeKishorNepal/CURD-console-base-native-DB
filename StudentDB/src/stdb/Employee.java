package stdb;

public class Employee {
	private int id;
	private String name;
	private String email;
	private String address;
	
	Employee(int id, String name, String email, String address){
		this.id=id;
		this.name=name;
		this.email=email;
		this.address=address;
	}
	
	public int getId() {return id;}
	public String getName() {return name;}
	public String getEmail() {return email;}
	public String getAddress() {return address;}
	
	
	public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', email='" + email + "', address='" + address + "'}";
    }
	
	
	

}
