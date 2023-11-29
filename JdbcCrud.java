import com.dao.StudentDao;
import com.model.Student;

public class JdbcCrud 
{
    public static void main( String[] args )
    {
        StudentDao sd=new StudentDao();

       //Student s=new Student();


       /* 
       s.setSname("sayalii");   //for insert student
       s.setSaddress("sangli");
       s.setSpercentage(88.22);
       
       if(sd.insertstudent(s)>0)
       {
    	   System.out.println("inserted successfully");
       }
       */

       /* if(sd.deletestudentbysid(3)>0)  //delete student by sid
       {
    	   System.out.println(" student deleted successfully");    
       } */

       Student s=sd.findstudentbyid(1); //for find student by id
       System.out.println(s);
    }

    }
