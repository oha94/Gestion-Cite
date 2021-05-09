package ci.oha.cite.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.oha.cite.entites.Commune;

public interface RCommune extends JpaRepository<Commune, Integer>{

	Commune findById(int id);
}
