package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IMarchandiseDao;
import fr.adaming.model.Cargaison;
import fr.adaming.model.Marchandise;

@Service
@Transactional
public class MarchandiseServiceImpl implements IMarchandiseService{
	
	@Autowired
	private IMarchandiseDao marchDao;
	
	public void setMarchDao(IMarchandiseDao marchDao) {
		this.marchDao = marchDao;
	}

	@Override
	public Marchandise addMarchandise(Marchandise m) {
		return marchDao.addMarchandise(m);
	}

	@Override
	public Marchandise getMarchandiseByNom(String nom) {
		return marchDao.getMarchandiseByNom(nom);
	}

	@Override
	public List<Marchandise> getMarchandiseByCargaison(Cargaison c) {
		return marchDao.getMarchandiseByCargaison(c);
	}

	@Override
	public void deleteMarchandise(int id) {
		marchDao.deleteMarchandise(id);
		
	}

}
