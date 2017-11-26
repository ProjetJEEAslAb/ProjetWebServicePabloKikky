package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.ICargaisonDao;
import fr.adaming.model.Cargaison;
import fr.adaming.model.CargaisonAerienne;
import fr.adaming.model.CargaisonRoutière;

@Service
@Transactional
public class CargaisonServiceImpl implements ICargaisonService {
	
	@Autowired
	private ICargaisonDao cargDao;
	
	public void setCargDao(ICargaisonDao cargDao) {
		this.cargDao = cargDao;
	}

	@Override
	public List<Cargaison> getAllCargaison() {
		return cargDao.getAllCargaison();
	}

	@Override
	public CargaisonAerienne addCargaisonA(CargaisonAerienne ca) {
		return cargDao.addCargaisonA(ca);
	}

	@Override
	public CargaisonRoutière addCargaisonR(CargaisonRoutière cr) {
		// TODO Auto-generated method stub
		return cargDao.addCargaisonR(cr);
	}
	
	

}
