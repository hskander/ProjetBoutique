package tn.boutique.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.boutique.spring.entity.CentreCommercial;
import tn.boutique.spring.repository.CentreCommercialRepository;
@Service
public class CentreCommercialService implements ICentreCommercialService {
	
	@Autowired
	CentreCommercialRepository ccr;
	@Override
	public void ajouCentre(CentreCommercial centre) {
		ccr.save(centre);
	}

}
