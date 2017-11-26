package fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Cargaison;
import fr.adaming.model.Marchandise;
import fr.adaming.service.ICargaisonService;
import fr.adaming.service.IMarchandiseService;

@RestController
public class MarchandiseRest {

	/**
	 * Injection du collaborateur Service
	 */
	@Autowired
	private IMarchandiseService mService;

	/**
	 * Setter pour le collaborateur Service
	 * 
	 * @param cService
	 *            Collaborateur Service
	 */
	public void setmService(IMarchandiseService mService) {
		this.mService = mService;
	}

	/**
	 * Ajouter une marchandise en appelant la méthode de Service
	 * 
	 * @param m
	 *            La marchandise à ajouter
	 * @return Le retour de la méthode Service : la marchandise ajoutée
	 */
	@RequestMapping(value = "/ajoutM", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Marchandise addMarchandise(@RequestBody Marchandise m) {
		return mService.addMarchandise(m);
	}

	/**
	 * Récupérer une marchandise par son nom en appelant la méthode de Service
	 * 
	 * @param nom
	 *            Le nom de la marchandise à récupérer
	 * @return Le retour de la méthode Service : la marchandise récupérée
	 */
	@RequestMapping(value = "/march/{pNom}", method = RequestMethod.GET, produces = "application/json")
	public Marchandise getMarchandiseByNom(@PathVariable("pNom") String nom) {
		return mService.getMarchandiseByNom(nom);
	}

	/**
	 * Récupérer des marchandises par leur cargaison en appelant la méthode de
	 * Service
	 * 
	 * @param c
	 *            La cargaison des marchandises à récupérer
	 * @return Le retour de la méthode Service : une liste des marchandises
	 *         récupérées
	 */
	@RequestMapping(value = "/marchByC", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
	public List<Marchandise> getMarchandiseByCargaison(@RequestBody Cargaison c) {
		return mService.getMarchandiseByCargaison(c);
	}

	/**
	 * Supprimer une marchandise par son id en appelant la méthode Service
	 * 
	 * @param id
	 *            Id de la marchandises à supprimer
	 */
	@RequestMapping(value = "/march/{pId}", method = RequestMethod.DELETE)
	public void deleteMarchandise(@PathVariable("pId") int id) {
		mService.deleteMarchandise(id);
	}

}
