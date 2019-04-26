package com.infotel.TpMavenSpringDev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpMavenSpringDev.dao.Idao;
import com.infotel.TpMavenSpringDev.metier.Dev;
import com.infotel.TpMavenSpringDev.metier.DevLogiciel;
import com.infotel.TpMavenSpringDev.metier.Etudiant;
import com.infotel.TpMavenSpringDev.metier.Formation;

@Service("service")
public class ServiceImpl implements Iservice {
	
	@Autowired
	private Idao dao;

	public Idao getDao() {
		return dao;
	}

	public void setDao(Idao dao) {
		this.dao = dao;
	}

	@Override
	public int ajouterDev(Dev d) {
		// TODO Auto-generated method stub
		return dao.ajouterDev(d);
	}

	@Override
	public int ajouterDevLogiciel(DevLogiciel dl) {
		// TODO Auto-generated method stub
		return dao.ajouterDevLogiciel(dl);
	}

	@Override
	public int ajouterEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return dao.ajouterEtudiant(e);
	}

	@Override
	public int ajouterFormation(Formation f) {
		// TODO Auto-generated method stub
		return dao.ajouterFormation(f);
	}
	
}
