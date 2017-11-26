package fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Cargaison;
import fr.adaming.model.CargaisonAerienne;
import fr.adaming.model.CargaisonRouti�re;
import fr.adaming.service.ICargaisonService;

@RestController
public class CargaisonRest {

	/**
	 * Injection du collaborateur Service
	 */
	@Autowired
	private ICargaisonService cService;

	/**
	 * Setter pour le collaborateur Service
	 * 
	 * @param cService
	 *            Collaborateur Service
	 */
	public void setcService(ICargaisonService cService) {
		this.cService = cService;
	}

	/**
	 * R�cup�rer la liste de toutes les cargaisons, quel que soit leur type, en
	 * appelant la m�thode depuis Service
	 * 
	 * @return Le retour de la m�thode Service : une liste de toutes les
	 *         cargaisons
	 */
	@RequestMapping(value = "/cargaisons", method = RequestMethod.GET, produces = "application/json")
	public List<Cargaison> getAllCargaison() {
		return cService.getAllCargaison();
	}

	/**
	 * Ajouter une cargaison a�rienne en appelant la m�thode depuis Service
	 * 
	 * @param ca
	 *            La cargaison a�rienne � ajouter
	 * @return Le retour de la m�thode Service : la cargaison a�rienne ajout�e
	 */
	@RequestMapping(value = "/ajoutCA", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public CargaisonAerienne addCargaisonA(CargaisonAerienne ca) {
		return cService.addCargaisonA(ca);
	}
	
	/**
	 * Ajouter une cargaison routi�re en appelant la m�thode depuis Service
	 * 
	 * @param ca
	 *            La cargaison routi�re � ajouter
	 * @return Le retour de la m�thode Service : la cargaison routi�re ajout�e
	 */
	@RequestMapping(value = "/ajoutCR", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public CargaisonRouti�re addCargaisonR(CargaisonRouti�re cr) {
		return cService.addCargaisonR(cr);
	}

}
