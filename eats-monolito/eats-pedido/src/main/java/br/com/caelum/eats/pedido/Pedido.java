package br.com.caelum.eats.pedido;

import br.com.caelum.eats.restaurante.Restaurante;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pedido {

    public static enum Status {
        REALIZADO,
        PAGO,
        CONFIRMADO,
        PRONTO,
        SAIU_PARA_ENTREGA,
        ENTREGUE;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private LocalDateTime dataHora;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(optional = false)
    private Restaurante restaurante;

    @OneToOne(cascade = CascadeType.PERSIST, optional = false, mappedBy = "pedido")
    private Entrega entrega;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "pedido")
    private List<ItemDoPedido> itens = new ArrayList<>();

    public Pedido() {
    }

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }


    public List<br.com.caelum.eats.pedido.ItemDoPedido> getItens() {
        return itens;
    }

    public void setItens(List<br.com.caelum.eats.pedido.ItemDoPedido> itens) {
        this.itens = itens;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }
}
