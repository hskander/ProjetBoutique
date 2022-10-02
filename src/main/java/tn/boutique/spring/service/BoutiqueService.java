package tn.boutique.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.boutique.spring.entity.Boutique;
import tn.boutique.spring.entity.CentreCommercial;
import tn.boutique.spring.repository.BoutiqueRepository;
import tn.boutique.spring.repository.CentreCommercialRepository;

@Service
public class BoutiqueService implements IBoutiqueService  {
	@Autowired
	BoutiqueRepository br;
	@Autowired
	CentreCommercialRepository ccr;
	@Override
	public void ajouterEtaffecterListeboutique(List<Boutique> boutiques, Long idCentre) {
		for(Boutique b:boutiques){
			CentreCommercial centre =ccr.findById(idCentre).get();
			b.setCentreCommercial(centre);
			br.save(b);
		}
	}
	@Override
	public List<Boutique> afficherBoutique() {
		return (List<Boutique>)br.findAll();
	}
	@Override
	public List<Boutique> listedeBoutiques(Long idCentre) {
		
		return ccr.findById(idCentre).get().getBoutiques();
	}

}
