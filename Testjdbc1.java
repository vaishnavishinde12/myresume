//import sqlpackage
import java.sql.*;
//class
class Testjdbc1{
public static void main(String[] ar)
{
try{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Root@123");
System.out.println("MySQL connection ok");
Statement st=con.createStatement();
System.out.println("Statment obj created");
ResultSet rs=st.executeQuery("select * from employee");
while(rs.next())
{
System.out.println(rs.getString(1)+":"+rs.getString(2));
}
}catch(SQLException e)
{
System.out.println("my connection issue :"+e );
}
}
}