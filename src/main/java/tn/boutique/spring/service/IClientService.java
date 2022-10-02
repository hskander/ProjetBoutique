package tn.boutique.spring.service;

import java.util.List;

import tn.boutique.spring.entity.Categorie;
import tn.boutique.spring.entity.Client;


public interface IClientService {
	void ajouterEtAffecterClientBoutiques(Client client, List<Long> idBoutiques);
	List<Client> listedeClients(Long idBoutique);
	List<Client> listeDeClientsParCategorie(Categorie categorie);
	void nbreClientParGenre() ;
}
