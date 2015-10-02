import java.sql.*;
public class jdbcconnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Meco","SYSTEM","qweasd");
Statement st=con.createStatement();
String sql="select * from hello";
ResultSet rs=st.executeQuery(sql);
while(rs.next())
	System.out.println(rs.getString(1));
con.close();

		}
		catch(Exception e){System.out.println(e);}
	}

}
