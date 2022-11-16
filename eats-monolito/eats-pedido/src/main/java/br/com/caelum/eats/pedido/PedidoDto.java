package br.com.caelum.eats.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.caelum.eats.restaurante.RestauranteDto;







public class PedidoDto {

	private Long id;
	private LocalDateTime dataHora;
	private Pedido.Status status;
	private RestauranteDto restaurante;
	private EntregaDto entrega;
	private List<ItemDoPedidoDto> itens = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public Pedido.Status getStatus() {
		return status;
	}

	public void setStatus(Pedido.Status status) {
		this.status = status;
	}

	public RestauranteDto getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(RestauranteDto restaurante) {
		this.restaurante = restaurante;
	}

	public EntregaDto getEntrega() {
		return entrega;
	}

	public void setEntrega(EntregaDto entrega) {
		this.entrega = entrega;
	}

	public List<ItemDoPedidoDto> getItens() {
		return itens;
	}

	public void setItens(List<ItemDoPedidoDto> itens) {
		this.itens = itens;
	}

	public PedidoDto() {
	}

	public PedidoDto(Long id, LocalDateTime dataHora, Pedido.Status status, RestauranteDto restaurante, EntregaDto entrega, List<ItemDoPedidoDto> itens) {
		this.id = id;
		this.dataHora = dataHora;
		this.status = status;
		this.restaurante = restaurante;
		this.entrega = entrega;
		this.itens = itens;
	}

	public PedidoDto(Pedido pedido) {
		this(pedido.getId(), pedido.getDataHora(), pedido.getStatus(), new RestauranteDto(pedido.getRestaurante()), new EntregaDto(pedido.getEntrega()), trataItens(pedido.getItens()));
	}

	private static List<ItemDoPedidoDto> trataItens(List<ItemDoPedido> itens) {
		return itens.stream().map(ItemDoPedidoDto::new).collect(Collectors.toList());
	}

	public BigDecimal getTotal() {
		BigDecimal total = restaurante.getTaxaDeEntregaEmReais() != null ? restaurante.getTaxaDeEntregaEmReais() : BigDecimal.ZERO;
		for (ItemDoPedidoDto item : itens) {
			BigDecimal preco = item.getItemDoCardapio().getPrecoPromocional() != null ? item.getItemDoCardapio().getPrecoPromocional() : item.getItemDoCardapio().getPreco() ;
			total = total.add(preco.multiply(new BigDecimal(item.getQuantidade())));
		}
		return total;
	}
}
