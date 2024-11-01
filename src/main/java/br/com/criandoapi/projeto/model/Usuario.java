package br.com.criandoapi.projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@NotBlank(message = "O nome é obrigatorio!")
	@Column(name = "nome", length = 200, nullable = true)
	private String nome;
	
	@Email(message = "Insura um E-mail valido!")
	@NotBlank(message = "O e-mail é obrigatorio!")
	@Column(name = "email", length = 50, nullable = true)
	private String email;
	
	@NotBlank(message = "A senha é obrigatoria!")
	@Column(name = "senha", columnDefinition = "TEXT", nullable = true)
	private String senha;
	
	@NotBlank(message = "O Telefone é obrigatorio!")
	@Column(name = "telefone", length = 15, nullable = true)
	private String telefone;
		
}
