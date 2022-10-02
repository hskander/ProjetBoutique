package tn.boutique.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.boutique.spring.entity.Categorie;
import tn.boutique.spring.entity.Client;
import tn.boutique.spring.entity.Genre;

@Repository
public interface ClientRepository extends CrudRepository<Client,Long> {
	//@Query("Select c from Client c where c.categorie=:categorie")
	@Query("Select c From Client c join c.boutiques b where b.categorie=:categorie")
	List<Client> listeDeClientsParCategorie(@Param("categorie") Categorie categorie);
	@Query("Select count(c) from Client c where c.genre=:genre")
	int nbreClientParGenre(@Param("genre") Genre genre);
}
