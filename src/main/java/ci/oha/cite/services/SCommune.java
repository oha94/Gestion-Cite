package ci.oha.cite.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ci.oha.cite.entites.Commune;

public interface SCommune {

	List<Commune> liste();
	Commune save(Commune c);
	Commune rechercher(int id);
	void supprimer(int c);
}
