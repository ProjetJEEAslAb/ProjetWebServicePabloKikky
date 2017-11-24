package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="cargaisons")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Cargaison implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Déclaration des attributs
	@Id
	@Column(name="id_c")
	protected String ref;
	
	protected double distance;
	
	protected Date dateLivraison;
	
	//Transformation de la liaison UML en JAVA
	@OneToMany(mappedBy = "cargaison")
	protected List<Marchandise> listeMarchandise;

	//Constructeurs
	public Cargaison() {
		super();
	}

	public Cargaison(String ref, double distance, Date dateLivraison) {
		super();
		this.ref = ref;
		this.distance = distance;
		this.dateLivraison = dateLivraison;
	}


	//Getters et Setters
	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Date getDateLivraison() {
		return dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	@Override
	public String toString() {
		return "Cargaison [ref=" + ref + ", distance=" + distance + ", dateLivraison=" + dateLivraison
				+ "]";
	}
	
	

}
