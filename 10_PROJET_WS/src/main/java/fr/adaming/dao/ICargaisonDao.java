package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Cargaison;
import fr.adaming.model.CargaisonAerienne;
import fr.adaming.model.CargaisonRoutière;

public interface ICargaisonDao {
	
	public List<Cargaison> getAllCargaison();
	
	public CargaisonAerienne addCargaisonA(CargaisonAerienne ca);
	
	public CargaisonRoutière addCargaisonR(CargaisonRoutière cr);
	

}
