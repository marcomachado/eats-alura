package br.com.caelum.eats.restaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;








class CardapioDto {

	private Long id;
	private List<CategoriaDoCardapioDto> categorias = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<CategoriaDoCardapioDto> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<CategoriaDoCardapioDto> categorias) {
		this.categorias = categorias;
	}

	public CardapioDto() {
	}

	public CardapioDto(Long id, List<CategoriaDoCardapioDto> categorias) {
		this.id = id;
		this.categorias = categorias;
	}

	CardapioDto(Cardapio cardapio) {
		this(cardapio.getId(), trataCategorias(cardapio.getCategorias()));
	}

	private static List<CategoriaDoCardapioDto> trataCategorias(List<CategoriaDoCardapio> categorias) {
		return categorias.stream().map(CategoriaDoCardapioDto::new).collect(Collectors.toList());
	}
}
