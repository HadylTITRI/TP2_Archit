package source;
import javax.swing.*;

public abstract class Affichable implements IJournal {
		
		@Override 
		public void outPut_Msg (String message){
		// TODO Auto-generated method stub
			System.out.println(message);
		}
}


