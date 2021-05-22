package br.com.desafio.blog.model;

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
@Table(name = "albuns")
public class Album {
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome_album", length = 100)
	private String nome;
	
	@Column(name = "descricao_album")
	private String descricao;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "data_criacao")
	private LocalDate dataCriacao;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
    private Usuario usuario;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "album", fetch = FetchType.LAZY)
	@OrderBy("data_upload ASC")
	private List<Imagem> imagens;

}
