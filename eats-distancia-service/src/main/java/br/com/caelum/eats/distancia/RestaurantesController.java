package br.com.caelum.eats.distancia;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;


@RestController

class RestaurantesController {

    @Autowired
    private RestauranteRepository repo;

    @PostMapping("/restaurantes")
    ResponseEntity<Restaurante> adiciona(@RequestBody Restaurante restaurante, UriComponentsBuilder uriBuilder) {
        Restaurante salvo = repo.save(restaurante);
        UriComponents uriComponents = uriBuilder.path("/restaurantes/{id}").buildAndExpand(salvo.getId());
        URI uri = uriComponents.toUri();
        return ResponseEntity.created(uri).contentType(MediaType.APPLICATION_JSON).body(salvo);
    }

    @PutMapping("/restaurantes/{id}")
    Restaurante atualiza(@PathVariable("id") Long id, @RequestBody Restaurante restaurante) {
        if (!repo.existsById(id)) {
            throw new ResourceNotFoundException();
        }
        return repo.save(restaurante);
    }

}
