package br.com.desafio.blog.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "posts")
public class Post implements Serializable{

	private static final long serialVersionUID = -7756874922146794882L;

	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "texto")
	private String texto;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "data_post")
	private LocalDate dataPost;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "data_ultima_alteracao")
	private LocalDate dataUltimaAlteracao;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
    private Usuario usuario;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "post", fetch = FetchType.LAZY)
	@OrderBy("data_upload ASC")
	private List<Imagem> imagens;



}
