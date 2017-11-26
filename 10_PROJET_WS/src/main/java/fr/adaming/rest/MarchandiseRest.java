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
	 * Ajouter une marchandise en appelant la m�thode de Service
	 * 
	 * @param m
	 *            La marchandise � ajouter
	 * @return Le retour de la m�thode Service : la marchandise ajout�e
	 */
	@RequestMapping(value = "/ajoutM", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Marchandise addMarchandise(@RequestBody Marchandise m) {
		return mService.addMarchandise(m);
	}

	/**
	 * R�cup�rer une marchandise par son nom en appelant la m�thode de Service
	 * 
	 * @param nom
	 *            Le nom de la marchandise � r�cup�rer
	 * @return Le retour de la m�thode Service : la marchandise r�cup�r�e
	 */
	@RequestMapping(value = "/march/{pNom}", method = RequestMethod.GET, produces = "application/json")
	public Marchandise getMarchandiseByNom(@PathVariable("pNom") String nom) {
		return mService.getMarchandiseByNom(nom);
	}

	/**
	 * R�cup�rer des marchandises par leur cargaison en appelant la m�thode de
	 * Service
	 * 
	 * @param c
	 *            La cargaison des marchandises � r�cup�rer
	 * @return Le retour de la m�thode Service : une liste des marchandises
	 *         r�cup�r�es
	 */
	@RequestMapping(value = "/marchByC", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
	public List<Marchandise> getMarchandiseByCargaison(@RequestBody Cargaison c) {
		return mService.getMarchandiseByCargaison(c);
	}

	/**
	 * Supprimer une marchandise par son id en appelant la m�thode Service
	 * 
	 * @param id
	 *            Id de la marchandises � supprimer
	 */
	@RequestMapping(value = "/march/{pId}", method = RequestMethod.DELETE)
	public void deleteMarchandise(@PathVariable("pId") long id) {
		mService.deleteMarchandise(id);
	}

}
