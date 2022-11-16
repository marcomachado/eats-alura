package br.com.caelum.eats.restaurante;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.caelum.eats.administrativo.TipoDeCozinha;


@Service
public class RestauranteService {

	@Autowired
	private RestauranteRepository repo;

	public Page<Restaurante> findAllByAprovado(boolean aprovado, Pageable limit) {
		return repo.findAllByAprovado(aprovado, limit);
	}

	public Page<Restaurante> findAllByAprovadoAndTipoDeCozinha(boolean aprovado, TipoDeCozinha tipo, Pageable limit) {
		return repo.findAllByAprovadoAndTipoDeCozinha(aprovado, tipo, limit);
	}

	public Optional<Restaurante> findById(Long id) {
		return repo.findById(id);
	}

}
