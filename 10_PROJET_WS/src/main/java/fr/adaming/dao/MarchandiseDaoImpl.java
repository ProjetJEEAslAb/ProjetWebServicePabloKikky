package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Cargaison;
import fr.adaming.model.Marchandise;

@Repository
public class MarchandiseDaoImpl implements IMarchandiseDao {

	@Autowired // Injection automatique du collaborateur sessionFactoryBean
	private SessionFactory sf;

	// Le setter pour l'injection
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public Marchandise addMarchandise(Marchandise m) {
		// Recuperation de la session
		Session s = sf.getCurrentSession();

		s.save(m);
		return m;
	}

	@Override
	public Marchandise getMarchandiseByNom(String nom) {
		// Recuperation de la session
		Session s = sf.getCurrentSession();

		// Requete HQL
		String req = "FROM Marchandise m WHERE m.nom=:pNom";

		// Creation du Query
		Query query = s.createQuery(req);

		// Passage du paramètre Id
		query.setParameter("pNom", nom);

		// Envoi de la requete et récupération du resultat
		Marchandise m_out = (Marchandise) query.uniqueResult();

		return m_out;
	}

	@Override
	public List<Marchandise> getMarchandiseByCargaison(Cargaison c) {
		// Recuperation de la session
		Session s = sf.getCurrentSession();

		// Requete HQL
		String req = "FROM Marchandise m WHERE m.cargaison=:pCarg";

		// Creation du Query
		Query query = s.createQuery(req);

		// Passage du paramètre Id
		query.setParameter("pCarg", c);

		// Envoi de la requete et récupération du resultat
		@SuppressWarnings("unchecked")
		List<Marchandise> lm_out = query.list();

		return lm_out;
	}

	@Override
	public void deleteMarchandise(long id) {
		// Recuperation de la session
		Session s = sf.getCurrentSession();

		// Le requete HQL
		String req = "DELETE FROM Marchandise m WHERE m.id=:pId";

		// Creer un objet query
		Query query = s.createQuery(req);

		// Passage des paramètres
		query.setParameter("pId", id);

		// Recuperatino du resultat
		query.executeUpdate();

	}

}
