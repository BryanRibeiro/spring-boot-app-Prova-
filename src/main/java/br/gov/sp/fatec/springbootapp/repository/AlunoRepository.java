package br.gov.sp.fatec.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.gov.sp.fatec.springbootapp.entity.Aluno;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    List<Aluno> findByNomeCompletoContainingIgnoreCaseOrDataMatriculaLessThan(String nome, LocalDate dataMatricula);
}

