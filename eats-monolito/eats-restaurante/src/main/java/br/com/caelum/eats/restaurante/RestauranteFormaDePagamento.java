package br.com.caelum.eats.restaurante;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import br.com.caelum.eats.administrativo.FormaDePagamento;

@Entity
class RestauranteFormaDePagamento {

	@EmbeddedId
	private RestauranteFormaDePagamentoId id;

	@ManyToOne
	@MapsId("restauranteId")
	private Restaurante restaurante;

	@ManyToOne
	@MapsId("formaDePagamentoId")
	private FormaDePagamento formaDePagamento;

	public RestauranteFormaDePagamento() {
	}

	public RestauranteFormaDePagamento(RestauranteFormaDePagamentoId id, Restaurante restaurante, FormaDePagamento formaDePagamento) {
		this.id = id;
		this.restaurante = restaurante;
		this.formaDePagamento = formaDePagamento;
	}

	public RestauranteFormaDePagamentoId getId() {
		return id;
	}

	public void setId(RestauranteFormaDePagamentoId id) {
		this.id = id;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	public FormaDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	@Embeddable
	static class RestauranteFormaDePagamentoId implements Serializable {
		private static final long serialVersionUID = 1L;

		@Column(name = "restaurante_id")
		private Long restauranteId;

		@Column(name = "forma_de_pagamento_id")
		private Long formaDePagamentoId;

		public RestauranteFormaDePagamentoId() {
		}

		public RestauranteFormaDePagamentoId(Long restauranteId, Long formaDePagamentoId) {
			this.restauranteId = restauranteId;
			this.formaDePagamentoId = formaDePagamentoId;
		}

		public Long getRestauranteId() {
			return restauranteId;
		}

		public void setRestauranteId(Long restauranteId) {
			this.restauranteId = restauranteId;
		}

		public Long getFormaDePagamentoId() {
			return formaDePagamentoId;
		}

		public void setFormaDePagamentoId(Long formaDePagamentoId) {
			this.formaDePagamentoId = formaDePagamentoId;
		}
	}
}
