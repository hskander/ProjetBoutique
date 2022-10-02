package tn.boutique.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.boutique.spring.entity.Boutique;
import tn.boutique.spring.entity.Categorie;
import tn.boutique.spring.entity.Client;
import tn.boutique.spring.entity.Genre;
import tn.boutique.spring.repository.BoutiqueRepository;
import tn.boutique.spring.repository.ClientRepository;
@Slf4j
@Service
public class ClientService implements IClientService {
	@Autowired
	ClientRepository cr;
	@Autowired
	BoutiqueRepository br;
	@Override
	public void ajouterEtAffecterClientBoutiques(Client client, List<Long> idBoutiques) {
		Boutique boutique=null;
		for(Long i:idBoutiques){
			boutique=br.findById(i).get();
			boutique.getClients().add(client);
		}
		cr.save(client);
		
		
	}
	@Override
	public List<Client> listedeClients(Long idBoutique) {
		return br.findById(idBoutique).get().getClients();
	}
	@Override
	public List<Client> listeDeClientsParCategorie(Categorie categorie) {
		return cr.listeDeClientsParCategorie(categorie);
	}
	
	@Override
	@Scheduled(fixedDelay=30000)
	public void nbreClientParGenre() {
		
			//System.out.println(cr.nbreClientParGenre(Genre.FEMININ));
		log.info("Genre Feminin : "+cr.nbreClientParGenre(Genre.FEMININ));
	}

}
