package br.com.caelum.eats.pagamento;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("monolito")
public interface MonolitoClient {

    @RequestMapping(method = RequestMethod.PUT, value = "/pedidos/{numeroDoPedido}/status",
            consumes = "application/json")
    void notificaPagamentoDoPedido(@PathVariable Long numeroDoPedido, PedidoMudancaDeStatusRequest pedidoMudancaDeStatusRequest);
}
