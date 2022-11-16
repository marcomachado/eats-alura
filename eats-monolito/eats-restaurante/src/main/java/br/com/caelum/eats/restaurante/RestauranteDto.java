package br.com.caelum.eats.restaurante;

import java.math.BigDecimal;

import br.com.caelum.eats.administrativo.TipoDeCozinhaDto;

public class RestauranteDto {

	private Long id;

	private String cnpj;

	private String nome;

	private String descricao;

	private String cep;

	private String endereco;

	private BigDecimal taxaDeEntregaEmReais;

	private Integer tempoDeEntregaMinimoEmMinutos;

	private Integer tempoDeEntregaMaximoEmMinutos;

	private Boolean aprovado;

	private TipoDeCozinhaDto tipoDeCozinha;

	public RestauranteDto() {

	}

	public RestauranteDto(Long id, String cnpj, String nome, String descricao, String cep, String endereco,
						  BigDecimal taxaDeEntregaEmReais, Integer tempoDeEntregaMinimoEmMinutos,
						  Integer tempoDeEntregaMaximoEmMinutos, Boolean aprovado, TipoDeCozinhaDto tipoDeCozinhaDto) {

		this.id = id;
		this.cnpj = cnpj;
		this.nome = nome;
		this.descricao = descricao;
		this.cep = cep;
		this.endereco = endereco;
		this.taxaDeEntregaEmReais = taxaDeEntregaEmReais;
		this.tempoDeEntregaMaximoEmMinutos = tempoDeEntregaMaximoEmMinutos;
		this.tempoDeEntregaMinimoEmMinutos = tempoDeEntregaMinimoEmMinutos;
		this.aprovado = aprovado;
		this.tipoDeCozinha = tipoDeCozinhaDto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public BigDecimal getTaxaDeEntregaEmReais() {
		return taxaDeEntregaEmReais;
	}

	public void setTaxaDeEntregaEmReais(BigDecimal taxaDeEntregaEmReais) {
		this.taxaDeEntregaEmReais = taxaDeEntregaEmReais;
	}

	public Integer getTempoDeEntregaMinimoEmMinutos() {
		return tempoDeEntregaMinimoEmMinutos;
	}

	public void setTempoDeEntregaMinimoEmMinutos(Integer tempoDeEntregaMinimoEmMinutos) {
		this.tempoDeEntregaMinimoEmMinutos = tempoDeEntregaMinimoEmMinutos;
	}

	public Integer getTempoDeEntregaMaximoEmMinutos() {
		return tempoDeEntregaMaximoEmMinutos;
	}

	public void setTempoDeEntregaMaximoEmMinutos(Integer tempoDeEntregaMaximoEmMinutos) {
		this.tempoDeEntregaMaximoEmMinutos = tempoDeEntregaMaximoEmMinutos;
	}

	public Boolean getAprovado() {
		return aprovado;
	}

	public void setAprovado(Boolean aprovado) {
		this.aprovado = aprovado;
	}

	public TipoDeCozinhaDto getTipoDeCozinha() {
		return tipoDeCozinha;
	}

	public void setTipoDeCozinha(TipoDeCozinhaDto tipoDeCozinha) {
		this.tipoDeCozinha = tipoDeCozinha;
	}

	public RestauranteDto(Restaurante restaurante) {
		this(restaurante.getId(), restaurante.getCnpj(), restaurante.getNome(), restaurante.getDescricao(), restaurante.getCep(), restaurante.getEndereco(),
				restaurante.getTaxaDeEntregaEmReais(), restaurante.getTempoDeEntregaMinimoEmMinutos(),
				restaurante.getTempoDeEntregaMaximoEmMinutos(), restaurante.getAprovado(),
				new TipoDeCozinhaDto(restaurante.getTipoDeCozinha()));
	}

  public void populaRestaurante(Restaurante restaurante) {
    restaurante.setCnpj(cnpj);
    restaurante.setNome(nome);
    restaurante.setDescricao(descricao);
    restaurante.setCep(cep);
    restaurante.setEndereco(endereco);
    restaurante.setTaxaDeEntregaEmReais(taxaDeEntregaEmReais);
    restaurante.setTempoDeEntregaMinimoEmMinutos(tempoDeEntregaMinimoEmMinutos);
    restaurante.setTempoDeEntregaMaximoEmMinutos(tempoDeEntregaMaximoEmMinutos);
    restaurante.setTipoDeCozinha(tipoDeCozinha.toTipoDeCozinha());
  }

}
