package br.com.caelum.eats.pedido;

import br.com.caelum.eats.restaurante.ItemDoCardapioDto;

public class ItemDoPedidoDto {

	private Long id;
	private Integer quantidade;
	private String observacao;
	private ItemDoCardapioDto itemDoCardapio;

	public ItemDoPedidoDto(Long id, Integer quantidade, String observacao, ItemDoCardapioDto itemDoCardapio) {
		this.id = id;
		this.quantidade = quantidade;
		this.observacao = observacao;
		this.itemDoCardapio = itemDoCardapio;
	}

	public ItemDoPedidoDto() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public ItemDoCardapioDto getItemDoCardapio() {
		return itemDoCardapio;
	}

	public void setItemDoCardapio(ItemDoCardapioDto itemDoCardapio) {
		this.itemDoCardapio = itemDoCardapio;
	}

	public ItemDoPedidoDto(ItemDoPedido item) {
		this(item.getId(), item.getQuantidade(), item.getObservacao(), new ItemDoCardapioDto(item.getItemDoCardapio()));
	}

}
