package br.com.desafio.blog.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "comentarios")
public class Comentario {
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "comentario", length = 1000)
	private String comentario;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "data_criacao")
	private LocalDate dataCriacao;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "data_ultima_alteracao")
	private LocalDate dataUltimaAlteracao;
	
	@ManyToOne
	@JoinColumn(name = "id_post")
	private Post post;	
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;	
}
