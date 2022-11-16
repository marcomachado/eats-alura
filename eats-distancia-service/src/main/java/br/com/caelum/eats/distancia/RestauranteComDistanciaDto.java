package br.com.caelum.eats.distancia;

import java.math.BigDecimal;








class RestauranteComDistanciaDto {

	private Long restauranteId;

	private BigDecimal distancia;

	public RestauranteComDistanciaDto(Long restauranteId, BigDecimal distancia) {
		this.restauranteId = restauranteId;
		this.distancia = distancia;
	}

	public Long getRestauranteId() {
		return restauranteId;
	}

	public void setRestauranteId(Long restauranteId) {
		this.restauranteId = restauranteId;
	}

	public BigDecimal getDistancia() {
		return distancia;
	}

	public void setDistancia(BigDecimal distancia) {
		this.distancia = distancia;
	}
}
