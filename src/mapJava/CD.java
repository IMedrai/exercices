package mapJava;

public class CD implements Comparable {
	private String auteur, titre;
	private double prix;
	

	public CD(String auteur, String titre, double prix) {
		super();
		this.auteur = auteur;
		this.titre = titre;
		this.prix = prix;
	}
	


	@Override
	public String toString() {
		return "CD [auteur=" + auteur + ", titre=" + titre + ", prix=" + prix + "]";
	}





	public String getAuteur() {
		return auteur;
	}



	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}



	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public double getPrix() {
		return prix;
	}



	public void setPrix(double prix) {
		this.prix = prix;
	}



	@Override
	public int compareTo(Object o) {
	if(o.getClass().equals(CD.class)) {
			CD cd = (CD)o;
			if(this.auteur.compareTo(cd.getAuteur())==0) 
				return this.titre.compareTo(getTitre());
			
	return this.auteur.compareTo(cd.getAuteur());
		}
		// TODO Auto-generated method stub
		return -1;
	}
}

	
	
	

