package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Cargaison;
import fr.adaming.model.CargaisonAerienne;
import fr.adaming.model.CargaisonRouti�re;

public interface ICargaisonDao {
	
	public List<Cargaison> getAllCargaison();
	
	public CargaisonAerienne addCargaisonA(CargaisonAerienne ca);
	
	public CargaisonRouti�re addCargaisonR(CargaisonRouti�re cr);
	

}
