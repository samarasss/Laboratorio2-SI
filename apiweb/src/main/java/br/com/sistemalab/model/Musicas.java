package br.com.sistemalab.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Musicas {

	@Id
	@GeneratedValue
	private Integer id;
	private String avaliacao;
	private Long idUsuario;
	private String imdbID;
	private Boolean noPerfil;
	private String name;
	private String ultimaMusica;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return name;
	}
	public void setNome(String name) {
		this.name = name;
	}
	public String getImdbId() {
		return imdbID;
	}
	public void setImdbId(String imdbID) {
		this.imdbID = imdbID;
	}
	public String getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
	public String getUltimaMusicaReprod() {
		return ultimaMusica;
	}
	public void setUltimaMusicaReprod(String ultimoEpisodio) {
		this.ultimaMusica = ultimoEpisodio;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
//	public Boolean getNoPerfil() {
//		return noPerfil;
//	}
//	public void setNoPerfil(Boolean noPerfil) {
//		this.noPerfil = noPerfil;
//	}

}
