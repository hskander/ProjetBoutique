package tn.boutique.spring.service;

import java.util.List;

import tn.boutique.spring.entity.Boutique;

public interface IBoutiqueService {
	void ajouterEtaffecterListeboutique (List<Boutique> lb, Long idCentre);
	List<Boutique> afficherBoutique();
	
	List<Boutique> listedeBoutiques(Long idCentre);
}
