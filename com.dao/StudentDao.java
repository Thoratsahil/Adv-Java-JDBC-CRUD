
package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.model.Student;

public class StudentDao {
	
	public int insertstudent(Student s)
	{
		int check=0;
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-crud","root",null);
			String sql="insert into student(sname,saddress,spercentage) values (?,?,?)";

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return check;
	}

}
