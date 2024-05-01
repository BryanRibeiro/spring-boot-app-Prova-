package br.gov.sp.fatec.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import br.gov.sp.fatec.springbootapp.entity.Aluno;
import br.gov.sp.fatec.springbootapp.service.AlunoService;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/aluno")
@CrossOrigin
public class AlunoController {
    
    @Autowired
    private AlunoService alunoService;

    @PostMapping("/cadastrar")
    public Aluno cadastrarAluno(@RequestBody Aluno aluno) {
        return alunoService.cadastrarAluno(aluno);
    }

    @GetMapping("/listar")
    public List<Aluno> listarAlunos() {
        return alunoService.listarAlunos();
    }

    @GetMapping("/buscar")
    public List<Aluno> buscarAlunosPorNomeOuData(@RequestParam(required = false) String nome,
                                                  @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return alunoService.buscarAlunosPorNomeOuData(nome, data);
    }
}