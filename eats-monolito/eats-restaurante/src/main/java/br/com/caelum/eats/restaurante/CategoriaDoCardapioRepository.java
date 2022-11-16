package br.com.caelum.eats.restaurante;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaDoCardapioRepository extends JpaRepository<CategoriaDoCardapio, Long> {

}
