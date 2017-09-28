package br.una.planejamento.digital.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Atividade implements Serializable {

	private static final long serialVersionUID = 9003128073357268693L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	private String descricao;
	
	private int minutosNecessarios;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getMinutosNecessarios() {
		return minutosNecessarios;
	}

	public void setMinutosNecessarios(int minutosNecessarios) {
		this.minutosNecessarios = minutosNecessarios;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

	
}
