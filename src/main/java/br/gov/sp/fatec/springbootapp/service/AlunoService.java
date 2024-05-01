package br.gov.sp.fatec.springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.gov.sp.fatec.springbootapp.entity.Aluno;
import br.gov.sp.fatec.springbootapp.repository.AlunoRepository;
import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoService {
    
    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    public List<Aluno> buscarAlunosPorNomeOuData(String nome, LocalDate dataMatricula) {
        return alunoRepository.findByNomeCompletoContainingIgnoreCaseOrDataMatriculaLessThan(nome, dataMatricula);
    }

    public Aluno cadastrarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }
}