
package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.model.Student;

public class StudentDao {
	
	public int insertstudent(Student s)//for insert operation 
	{
		int check=0;
		Connection con=null;
        PreparedStatement pst=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-crud","root",null);
			String sql="insert into student(sname,saddress,spercentage) values (?,?,?)";
            pst= con.prepareStatement(sql);
            pst.setString(1, s.getSname());
			pst.setString(2, s.getSaddress());
			pst.setDouble(3, s.getSpercentage());
			
			check=pst.executeUpdate();
			


		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
        finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		return check;
	}

}
