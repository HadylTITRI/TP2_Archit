package source;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public abstract class AffichableFichiers extends ClasseComposite implements IJournal {
	
	public AffichableFichiers(String classe, Date date) {
		super(classe, date);
		// TODO Auto-generated constructor stub
	}

	File file = new File("./File.txt");
	
	@Override
	public void outPut_Msg(String message) {
		ObjectOutputStream flux;
		try {
			flux = new ObjectOutputStream(new FileOutputStream(file));
			flux.close();
		
			flux.writeChars(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
