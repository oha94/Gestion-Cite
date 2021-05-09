package ci.oha.cite.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ci.oha.cite.entites.Commune;
import ci.oha.cite.repo.RCommune;
import ci.oha.cite.services.SCommune;

@Service
public class ICommune implements SCommune {

	@Autowired
	RCommune repo;
	
	@Override
	public List<Commune> liste() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Commune save(Commune c) {
		// TODO Auto-generated method stub
		return repo.save(c);
	}

	@Override
	public Commune rechercher(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public void supprimer(int c) {
		// TODO Auto-generated method stub
		repo.deleteById(c);
		
	}

}
