package br.com.desafio.blog.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.desafio.blog.dto.UsuarioDto;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;


@Data
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = -9069636620494388440L;
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "senha")
	private String senha;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "data_cadastro")
	private LocalDate dataCadastro;
	
	@Column(name = "ativo")
	private Boolean ativo;
	
	private Usuario() {
		
	}
	
	private Usuario(UsuarioDto dto) {
		
	}
	
}
