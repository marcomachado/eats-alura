package br.com.caelum.eats.restaurante;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
class CategoriaDoCardapio {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank @Size(max=100)
	private String nome;

	@ManyToOne(optional=false)
	private Cardapio cardapio;

	@OneToMany(mappedBy="categoria")
	private List<ItemDoCardapio> itens = new ArrayList<>();

	public CategoriaDoCardapio() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cardapio getCardapio() {
		return cardapio;
	}

	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}

	public List<ItemDoCardapio> getItens() {
		return itens;
	}

	public void setItens(List<ItemDoCardapio> itens) {
		this.itens = itens;
	}
}
