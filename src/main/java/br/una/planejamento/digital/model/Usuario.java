package br.una.planejamento.digital.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = -941152167029993557L;

	@Id
	private String login;

	@NotBlank
	private String nome;

	private Date dataNascimento;

	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
	private List<Roteiro> roteiros;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Roteiro> getRoteiros() {
		return roteiros;
	}

	public void setRoteiros(List<Roteiro> roteiros) {
		this.roteiros = roteiros;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
