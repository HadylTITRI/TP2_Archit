package source;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
	
		String BDD = "tp02al";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private Connection conn;
	    private static DBConnection instance;

	   
	    private DBConnection() throws SQLException, ClassNotFoundException {
	    	this.conn = DriverManager.getConnection(url, user,passwd);
		}
	    
	    public Connection getConn() {
			return conn;
		}
	    
	    public static DBConnection getInstance() throws SQLException, ClassNotFoundException{
	    	if(instance == null) {
	    		instance = new DBConnection();
	    	}else {
	    		return instance;
	    	}
			return instance;
	    }


		
	
}
