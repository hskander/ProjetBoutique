package tn.boutique.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.boutique.spring.entity.CentreCommercial;
@Repository
public interface CentreCommercialRepository extends CrudRepository<CentreCommercial,Long> {

}
