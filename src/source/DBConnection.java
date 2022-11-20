package source;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DBConnection implements Connection{
	   
	
		String BDD = "tp02al";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private Connection conn;
	    private static DBConnection instance;

	   
	    public DBConnection() throws SQLException{
	    	this.conn = DriverManager.getConnection(url, user,passwd);
		}
	    
	    public Connection getConn() {
	    	if (conn == null) {
	    		String url = "jdbc:mysql://localhost:3306/" + BDD;
	    	try {
	    		conn = DriverManager.getConnection(url, user, passwd);
	    	}catch(SQLException e) {
	    		e.printStackTrace();
	    	}
	    	}
			return conn;
		}
	    
	    public static DBConnection getInstance() throws SQLException{
	    	if(instance == null) {
	    		DBConnection instance;
	    	}else {
	    		return instance;
	    	}
			return instance;
	    }


		
	
}
