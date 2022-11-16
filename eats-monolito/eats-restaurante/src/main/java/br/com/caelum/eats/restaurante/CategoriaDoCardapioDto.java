package br.com.caelum.eats.restaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class CategoriaDoCardapioDto {

    private Long id;
    private String nome;
    private List<ItemDoCardapioDto> itens = new ArrayList<>();

    public CategoriaDoCardapioDto() {
    }

    public CategoriaDoCardapioDto(Long id, String nome, List<ItemDoCardapioDto> trataItens) {
        this.id = id;
        this.nome = nome;
        this.itens = trataItens;
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

    public List<ItemDoCardapioDto> getItens() {
        return itens;
    }

    public void setItens(List<ItemDoCardapioDto> itens) {
        this.itens = itens;
    }

    CategoriaDoCardapioDto(CategoriaDoCardapio categoria) {
        this(categoria.getId(), categoria.getNome(), trataItens(categoria.getItens()));
    }

    private static List<ItemDoCardapioDto> trataItens(List<ItemDoCardapio> itens) {
        return itens.stream().map(ItemDoCardapioDto::new).collect(Collectors.toList());
    }

}
