package br.com.desafio.blog.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "digitalizacoes")
public class Digitalizacao implements Serializable{

	private static final long serialVersionUID = 3777698632678905409L;
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome", length = 100)
	private String nome;
	
	@Column(name = "extensao", length = 3)
	private String extensao;	

	@Lob
	@Column(name = "arquivo")
	private byte[] arquivo;
	
	@ManyToOne
	@JoinColumn(name = "id_imagem")
	private Imagem imagem;

}
