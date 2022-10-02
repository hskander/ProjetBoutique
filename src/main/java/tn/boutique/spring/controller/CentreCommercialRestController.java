package tn.boutique.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.boutique.spring.entity.CentreCommercial;
import tn.boutique.spring.service.ICentreCommercialService;

@RestController
public class CentreCommercialRestController {
	@Autowired
	ICentreCommercialService iccs;
	
	@PostMapping("ajouCentre")
	public void ajouCentre(@RequestBody CentreCommercial centre) {
		iccs.ajouCentre(centre);
	}
}
