package br.com.desafio.blog.model;

import java.io.Serializable;
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
@Table(name = "imagens")
public class Imagem implements Serializable{

	private static final long serialVersionUID = -5320136688453780335L;

	@Id
	@Column(name = "id")
	private Long id;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "data_upload")
	private LocalDate dataUpload;
	
	@ManyToOne
	@JoinColumn(name = "id_post")
    private Post post;
	
	@ManyToOne
	@JoinColumn(name = "id_album")
	private Album album;

}
