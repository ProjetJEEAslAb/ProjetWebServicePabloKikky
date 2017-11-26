package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Cargaison;
import fr.adaming.model.CargaisonAerienne;
import fr.adaming.model.CargaisonRouti�re;

public interface ICargaisonService {
	
public List<Cargaison> getAllCargaison();
	
	public CargaisonAerienne addCargaisonA(CargaisonAerienne ca);
	
	public CargaisonRouti�re addCargaisonR(CargaisonRouti�re cr);

}
