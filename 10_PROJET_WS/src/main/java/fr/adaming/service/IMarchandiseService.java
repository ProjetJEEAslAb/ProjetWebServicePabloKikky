package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Cargaison;
import fr.adaming.model.Marchandise;

public interface IMarchandiseService {

public Marchandise addMarchandise(Marchandise m);
	
	public Marchandise getMarchandiseByNom (String nom);
	
	public List<Marchandise> getMarchandiseByCargaison (Cargaison c);
	
	public void deleteMarchandise (long id);
}
