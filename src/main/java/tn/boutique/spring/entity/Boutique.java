package tn.boutique.spring.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Boutique implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idBoutique")
	private Long id;
	private String nom;
	@Enumerated(EnumType.STRING)
	private Categorie categorie;
	@JsonIgnore
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Client> clients;
	
	@ManyToOne
	private CentreCommercial centreCommercial;
}
