package source;

public interface IJournal extends Conection{
	
	public abstract void outPut_Msg(String message);
	public void inscription(int matricule, String nom, String prenom, String email,String pwd, int id_universite);
	public void add(Etudiant e);

}
