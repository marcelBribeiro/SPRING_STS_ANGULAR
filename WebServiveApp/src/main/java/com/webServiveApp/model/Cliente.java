package com.webServiveApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Cliente  extends AbstractEntity {
	
	@Column(name="NOME", nullable = false)
	private String nome;
	
	@Column(name="FONE1")
	private String fone1;
	
	@Column(name="FONE2")
	private String fone2;
	
	public String getFone1() {
		return fone1;
	}

	public void setFone1(String fone1) {
		this.fone1 = fone1;
	}

	public String getFone2() {
		return fone2;
	}

	public void setFone2(String fone2) {
		this.fone2 = fone2;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
