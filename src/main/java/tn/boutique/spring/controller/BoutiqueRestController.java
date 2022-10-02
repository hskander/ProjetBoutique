package tn.boutique.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.boutique.spring.entity.Boutique;
import tn.boutique.spring.service.IBoutiqueService;

@RestController
public class BoutiqueRestController {
	@Autowired 
	IBoutiqueService ibs;
	@PostMapping("ajouterEtaffecterListeboutique")
	public void ajouterEtaffecterListeboutique(@RequestBody List<Boutique> boutiques,@RequestParam("idCentre") Long idCentre) {
		ibs.ajouterEtaffecterListeboutique(boutiques, idCentre);
	}
	
	@GetMapping("afficherBoutique")
	public List<Boutique> afficherBoutique() {
		return ibs.afficherBoutique();
	}
	@GetMapping("listedeBoutiques")
    public List<Boutique> listedeBoutiques(@RequestParam("idCentre") Long idCentre) {
		return ibs.listedeBoutiques(idCentre);
	}
}
