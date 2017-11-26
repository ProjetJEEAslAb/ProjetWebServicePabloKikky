package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Cargaison;
import fr.adaming.model.CargaisonAerienne;
import fr.adaming.model.CargaisonRoutière;

@Repository
public class CargaisonDaoImpl implements ICargaisonDao {

	@Autowired // Injection automatique du collaborateur sessionFactoryBean
	private SessionFactory sf;

	// Le setter pour l'injection
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public List<Cargaison> getAllCargaison() {
		// Recuperation de la session
		Session s = sf.getCurrentSession();

		// Requete HQL
		String req = "FROM CargaisonAerienne, CargaisonRoutière";

		// Creation du Query
		Query query = s.createQuery(req);

		// Envoi de la requete et récupération du resultat
		return query.list();
	}

	@Override
	public CargaisonAerienne addCargaisonA(CargaisonAerienne ca) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CargaisonRoutière addCargaisonR(CargaisonRoutière cr) {
		// TODO Auto-generated method stub
		return null;
	}

}
