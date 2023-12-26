package com.ramjava.datenjpaeinfuhrung.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "opiskelija")
public class Opiskelija {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "opiskelija_id")
	private Integer id;
	
	@Column(name = "opiskelija_nimi")
	private String opiskelijanNimi;
	
	@Column(name = "opiskelija_mobiili")
	private long mobiili;
	
	@Column(name = "opiskelija_osoite")
	private String osoite;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOpiskelijanNimi() {
		return opiskelijanNimi;
	}

	public void setOpiskelijanNimi(String opiskelijanNimi) {
		this.opiskelijanNimi = opiskelijanNimi;
	}

	public long getMobiili() {
		return mobiili;
	}

	public void setMobiili(long mobiili) {
		this.mobiili = mobiili;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}
	
	
	
}
