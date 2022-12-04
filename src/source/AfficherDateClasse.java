package source;

import java.util.Date;

public abstract class AfficherDateClasse extends ClasseComposite implements IJournal{
	private String classe;
	private Date date;
	
	
	public AfficherDateClasse(String classe, Date date) {
		super();
		this.classe = classe;
		this.date = date;
	}
	
	public String getClasse() {
		return classe;
	}
	public Date getDate() {
		return date;
	}

	@Override
	public void outPut_Msg(String message) {
		// TODO Auto-generated method stub
		
        System.out.println(getClasse());
        System.out.println(getDate());

	}


}
