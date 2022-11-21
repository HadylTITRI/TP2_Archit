package source;
import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		EtudiantService serv = null;
		try {
			serv.inscription(2, "Titri", "Hadyl", "titrihadyl@gmail.com", "", 5);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
