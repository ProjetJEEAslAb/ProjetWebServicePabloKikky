package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="marchandises")
public class Marchandise {
	
	
	//Declaration des attributs
	@Id
	@Column(name="id_m")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String nom;
	
	private double poids;
	
	private double volume;
	
	//Transformation de la liaisont UML en Java
	@ManyToOne
	@JoinColumn(name="c_id", referencedColumnName="id_c")
	private Cargaison cargaison;

	//Constructeurs
	public Marchandise() {
		super();
	}

	public Marchandise(String nom, double poids, double volume) {
		super();
		this.nom = nom;
		this.poids = poids;
		this.volume = volume;
	}

	public Marchandise(long id, String nom, double poids, double volume) {
		super();
		this.id = id;
		this.nom = nom;
		this.poids = poids;
		this.volume = volume;
	}

	//Getters et setters
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public Cargaison getCargaison() {
		return cargaison;
	}

	public void setCargaison(Cargaison cargaison) {
		this.cargaison = cargaison;
	}

	@Override
	public String toString() {
		return "Marchandise [id=" + id + ", nom=" + nom + ", poids=" + poids + ", volume=" + volume + ", cargaison="
				+ cargaison + "]";
	}
	
	

}
