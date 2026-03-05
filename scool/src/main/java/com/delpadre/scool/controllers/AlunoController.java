package com.delpadre.scool.controllers;

import com.delpadre.scool.models.AlunoModel;
import com.delpadre.scool.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    // Criar aluno
    @PostMapping
    public AlunoModel criarAluno(@RequestBody AlunoModel alunoModel) {
        return alunoService.criarAluno(alunoModel);
    }

    // Buscar todos
    @GetMapping
    public List<AlunoModel> buscarTodosAlunos() {
        return alunoService.findAll();
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public AlunoModel buscarAlunoPorId(@PathVariable Long id) {
        return alunoService.buscarAlunoPorId(id);
    }

    // Atualizar
    @PutMapping("/{id}")
    public AlunoModel atualizarAluno(@PathVariable Long id,
                                     @RequestBody AlunoModel alunoModel) {
        return alunoService.atualizarAluno(id, alunoModel);
    }

    // Deletar
    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable Long id) {
        alunoService.deletarAluno(id);
    }
}