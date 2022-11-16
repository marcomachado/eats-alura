package br.com.caelum.eats.restaurante;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
class Cardapio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false)
    private Restaurante restaurante;

    @OneToMany(mappedBy = "cardapio")
    private List<CategoriaDoCardapio> categorias = new ArrayList<>();

    public Cardapio() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public List<CategoriaDoCardapio> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<CategoriaDoCardapio> categorias) {
        this.categorias = categorias;
    }
}
