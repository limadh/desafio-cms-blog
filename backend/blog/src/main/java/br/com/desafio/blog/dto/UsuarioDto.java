package br.com.desafio.blog.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioDto {	
	
	private Long id;	
	private String nome;	
	private String email;	
	private String senha;
	private LocalDate dataCadastro;
	private Boolean ativo;

}
