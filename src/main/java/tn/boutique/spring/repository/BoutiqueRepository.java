package tn.boutique.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.boutique.spring.entity.Boutique;

@Repository
public interface BoutiqueRepository extends CrudRepository<Boutique,Long> {

}
