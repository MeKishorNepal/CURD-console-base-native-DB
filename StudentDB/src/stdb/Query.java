package stdb;

public class Query {
     static String insert="INSERT INTO employee(id,name,email,address) VALUES(?,?,?,?)";
     static String update="UPDATE employee SET name=? WHERE id=?";
     static String delete="DELETE FROM employee WHERE id=?";
     static String select="SELECT * FROM employee";
}
