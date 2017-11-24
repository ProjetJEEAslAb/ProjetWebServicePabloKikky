package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cargaisonsRoutieres")
public class CargaisonRouti�re extends Cargaison implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Declaration des attributs
	private double temperature;

	//Constructeurs
	public CargaisonRouti�re() {
		super();
	}

	public CargaisonRouti�re(double temperature) {
		super();
		this.temperature = temperature;
	}

	//Getters et Setters
	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "CargaisonRouti�re [temperature=" + temperature +  ", ref=" + ref + ", distance="
				+ distance + ", dateLivraison=" + dateLivraison + "]";
	}
	
	

}
