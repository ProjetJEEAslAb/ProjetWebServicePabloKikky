package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Cargaison;
import fr.adaming.model.CargaisonAerienne;
import fr.adaming.model.CargaisonRoutière;

public interface ICargaisonService {
	
public List<Cargaison> getAllCargaison();
	
	public CargaisonAerienne addCargaisonA(CargaisonAerienne ca);
	
	public CargaisonRoutière addCargaisonR(CargaisonRoutière cr);

}
