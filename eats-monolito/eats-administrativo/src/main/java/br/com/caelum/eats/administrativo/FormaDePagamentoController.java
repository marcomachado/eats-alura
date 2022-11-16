package br.com.caelum.eats.administrativo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FormaDePagamentoController {

    @Autowired
    private FormaDePagamentoRepository formaRepo;


    @GetMapping("/formas-de-pagamento")
    List<FormaDePagamentoDto> lista() {
        return formaRepo.findAllByOrderByNomeAsc().stream().map(FormaDePagamentoDto::new).collect(Collectors.toList());
    }

    @GetMapping("/admin/formas-de-pagamento/tipos")
    List<FormaDePagamento.Tipo> tipos() {
        return Arrays.asList(FormaDePagamento.Tipo.values());
    }

    @PostMapping("/admin/formas-de-pagamento")
    FormaDePagamentoDto adiciona(@RequestBody FormaDePagamento tipoDeCozinha) {
        return new FormaDePagamentoDto(formaRepo.save(tipoDeCozinha));
    }

    @PutMapping("/admin/formas-de-pagamento/{id}")
    FormaDePagamentoDto atualiza(@RequestBody FormaDePagamento tipoDeCozinha) {
        return new FormaDePagamentoDto(formaRepo.save(tipoDeCozinha));
    }

    @DeleteMapping("/admin/formas-de-pagamento/{id}")
    void remove(@PathVariable("id") Long id) {
        formaRepo.deleteById(id);
    }

}
