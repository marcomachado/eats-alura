package br.com.caelum.eats.administrativo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormaDePagamentoRepository extends JpaRepository<FormaDePagamento, Long> {

    List<FormaDePagamento> findAllByOrderByNomeAsc();

}
