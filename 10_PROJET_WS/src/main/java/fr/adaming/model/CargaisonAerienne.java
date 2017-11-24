package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cargaisonsAeriennes")
public class CargaisonAerienne extends Cargaison implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Declaration des attributs
	private double poidsMax;

	//Constructeurs
	public CargaisonAerienne() {
		super();
	}

	public CargaisonAerienne(double poidsMax) {
		super();
		this.poidsMax = poidsMax;
	}

	//Getters et setters
	public double getPoidsMax() {
		return poidsMax;
	}

	public void setPoidsMax(double poidsMax) {
		this.poidsMax = poidsMax;
	}

	@Override
	public String toString() {
		return "CargaisonAerienne [poidsMax=" + poidsMax + ", ref=" + ref + ", distance=" + distance
				+ ", dateLivraison=" + dateLivraison + "]";
	}
	
	
}
