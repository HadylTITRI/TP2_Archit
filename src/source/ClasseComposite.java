package source;

import java.util.ArrayList;
import java.util.List;

public abstract class ClasseComposite implements IJournal {
	private final List<ClasseComposite> msg = new ArrayList<>();
	
	public List<ClasseComposite> getMsg() {
		return msg;
	}
	

	public void add(ClasseComposite message) {
		msg.add(message);
	}

	@Override
	public void outPut_Msg(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
		
	}

	
	

}
