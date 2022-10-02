package tn.boutique.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class CentreCommercial implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcc")
	private Long id;
	private String nom;
	private String adresse;
	private String login;
	private String password;
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL, mappedBy="centreCommercial")
	private List<Boutique> boutiques;
	
}
