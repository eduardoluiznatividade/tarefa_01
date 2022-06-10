package br.edu.infnet.votaelnatividade.model.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//import javax.persistence.Transient;

@Entity
@Table(
	name = "TVoto"
)
public class Voto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDateTime data;
	private String localizacao;
	
	//@Transient
	@ManyToOne
	@JoinColumn(name = "idEleitor")
	private Eleitor eleitor;
	
	//@Transient
	@ManyToOne
	@JoinColumn(name = "idCandidato")
	private Candidato candidato;
		
	//@Transient
	@ManyToOne
	@JoinColumn(name = "idEleicao")
	private Eleicao eleicao;
	
	public Voto() {
		this.setData(LocalDateTime.now());
	}
		
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String descricao) {
		this.localizacao = descricao;
	}
	public Eleitor getEleitor() {
		return eleitor;
	}
	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}
	public Candidato getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	public Eleicao getEleicao() {
		return eleicao;
	}
	public void setEleicao(Eleicao eleicao) {
		this.eleicao = eleicao;
	}

	

}
