package br.com.caelum.eats.pedido;

public class MediaAvaliacoesDto {

    private Long restauranteId;
    private Double media;

    public MediaAvaliacoesDto() {
    }

    public MediaAvaliacoesDto(Long restauranteId, Double media) {
        this.restauranteId = restauranteId;
        this.media = media;
    }

    public Long getRestauranteId() {
        return restauranteId;
    }

    public void setRestauranteId(Long restauranteId) {
        this.restauranteId = restauranteId;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }
}
