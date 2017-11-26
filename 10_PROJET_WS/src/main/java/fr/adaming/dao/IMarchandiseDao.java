package fr.adaming.dao;

import fr.adaming.model.Cargaison;
import fr.adaming.model.Marchandise;

public interface IMarchandiseDao {
	
	public Marchandise addMarchandise(Marchandise m);
	
	public Marchandise getMarchandiseByNom (String nom);
	
	public Marchandise getMarchandiseByCargaison (Cargaison c);
	
	public void deleteMarchandise (int id);

}
