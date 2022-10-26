package kailamoraes.repositories;

import org.springframework.data.repository.CrudRepository;
import kailamoraes.models.Aluno;

public interface AlunosRepository extends CrudRepository<Aluno, Integer> {
}