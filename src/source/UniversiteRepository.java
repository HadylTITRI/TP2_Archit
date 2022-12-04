package source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository {
	
	
	public Universite GetById(int universityId) throws SQLException{
		
		DBConnection BD = null;
		Connection connect=BD.getConn(); 
		Statement stmt;
			stmt = connect.createStatement();
			// TODO Auto-generated catch block
		
		System.out.println("LogBD : début recherche de id université dans la base de ldonnée");
		
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs;
			rs = stmt.executeQuery(sql);
			// TODO Auto-generated catch block
		
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);
			
		System.out.println("LogBD : université récupérée");
		
		connect.close();
		return u;	
	
		
	}	
	
}
