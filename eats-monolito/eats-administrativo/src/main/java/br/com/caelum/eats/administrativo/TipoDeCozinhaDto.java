package br.com.caelum.eats.administrativo;

public class TipoDeCozinhaDto {

	private Long id;
	private String nome;

	public TipoDeCozinhaDto(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public TipoDeCozinhaDto(TipoDeCozinha tipo) {
		this(tipo.getId(), tipo.getNome());
	}

	public TipoDeCozinha toTipoDeCozinha() {
    return new TipoDeCozinha(id, nome);
	}
}
