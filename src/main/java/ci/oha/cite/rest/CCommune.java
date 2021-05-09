package ci.oha.cite.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ci.oha.cite.entites.Commune;
import ci.oha.cite.services.SCommune;

@RestController
public class CCommune {
@Autowired
SCommune service;

@GetMapping("/commune/liste")
public List<Commune> listeCommune(){

	return service.liste();
}
@PostMapping("/commune")
public Commune ajouter(@RequestBody Commune c) {
	return service.save(c);
}

@PutMapping("/commune")
public Commune modifier(@RequestBody Commune c) {
	return service.save(c);
}
}
