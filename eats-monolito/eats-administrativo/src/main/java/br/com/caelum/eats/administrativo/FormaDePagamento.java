package br.com.caelum.eats.administrativo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class FormaDePagamento {

	static enum Tipo {
		CARTAO_CREDITO, CARTAO_DEBITO, VALE_REFEICAO;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Enumerated(EnumType.STRING)
	private Tipo tipo;

	@NotBlank
	@Size(max = 100)
	private String nome;

	public FormaDePagamento() {
	}

	public FormaDePagamento(Long id, Tipo tipo, String nome) {
		this.id = id;
		this.tipo = tipo;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
