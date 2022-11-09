package kailamoraes.repositories;

import org.springframework.data.repository.CrudRepository;

import kailamoraes.models.Jogo;

public interface JogoRepository extends CrudRepository<Jogo, Integer> {
    
}