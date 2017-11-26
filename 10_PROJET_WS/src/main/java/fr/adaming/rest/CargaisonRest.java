package fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Cargaison;
import fr.adaming.model.CargaisonAerienne;
import fr.adaming.model.CargaisonRoutière;
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
	 * Récupérer la liste de toutes les cargaisons, quel que soit leur type, en
	 * appelant la méthode depuis Service
	 * 
	 * @return Le retour de la méthode Service : une liste de toutes les
	 *         cargaisons
	 */
	@RequestMapping(value = "/cargaisons", method = RequestMethod.GET, produces = "application/json")
	public List<Cargaison> getAllCargaison() {
		return cService.getAllCargaison();
	}

	/**
	 * Ajouter une cargaison aérienne en appelant la méthode depuis Service
	 * 
	 * @param ca
	 *            La cargaison aérienne à ajouter
	 * @return Le retour de la méthode Service : la cargaison aérienne ajoutée
	 */
	@RequestMapping(value = "/ajoutCA", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public CargaisonAerienne addCargaisonA(@RequestBody CargaisonAerienne ca) {
		return cService.addCargaisonA(ca);
	}
	
	/**
	 * Ajouter une cargaison routière en appelant la méthode depuis Service
	 * 
	 * @param ca
	 *            La cargaison routière à ajouter
	 * @return Le retour de la méthode Service : la cargaison routière ajoutée
	 */
	@RequestMapping(value = "/ajoutCR", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public CargaisonRoutière addCargaisonR(@RequestBody CargaisonRoutière cr) {
		return cService.addCargaisonR(cr);
	}
	
	

}
