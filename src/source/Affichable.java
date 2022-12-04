package source;

import java.util.Date;

public abstract class Affichable extends ClasseComposite  implements IJournal {
		
		public Affichable(String classe, Date date) {
		super(classe, date);
		// TODO Auto-generated constructor stub
	}

		@Override 
		public void outPut_Msg (String message){
		// TODO Auto-generated method stub
			System.out.println(message);
		}
}


