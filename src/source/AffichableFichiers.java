package source;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public abstract class AffichableFichiers implements IJournal {
	File file = new File("./File.txt");
	
	@Override
	public void outPut_Msg(String message) {
		ObjectOutputStream flux;
		try {
			flux = new ObjectOutputStream(
					new FileOutputStream(file));
			flux.close();
		
			flux.writeChars(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
