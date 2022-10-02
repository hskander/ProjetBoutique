package tn.boutique.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.boutique.spring.entity.Categorie;
import tn.boutique.spring.entity.Client;
import tn.boutique.spring.service.IClientService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ClientRestController {
	@Autowired
	IClientService ics;
	
	@PostMapping("/ajouterEtAffecterClientBoutiques/{idBoutiques}")
	void ajouterEtAffecterClientBoutiques(@RequestBody Client client,@PathVariable("idBoutiques") List<Long> idBoutiques){
		ics.ajouterEtAffecterClientBoutiques(client, idBoutiques);
	}
	@GetMapping("listedeClients")
	public List<Client> listedeClients(@RequestParam("idBoutique") Long idBoutique) {
		return ics.listedeClients(idBoutique);
	}
	@GetMapping("listeDeClientsParCategorie")
	List<Client> listeDeClientsParCategorie(@RequestParam("categorie") Categorie categorie){
		return ics.listeDeClientsParCategorie(categorie);
	}
}
