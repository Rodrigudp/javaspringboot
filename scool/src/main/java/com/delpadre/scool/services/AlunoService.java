package com.delpadre.scool.services;

import com.delpadre.scool.models.AlunoModel;
import com.delpadre.scool.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    // Criar aluno
    public AlunoModel criarAluno(AlunoModel alunoModel) {
        return alunoRepository.save(alunoModel);
    }

    // Listar todos
    public List<AlunoModel> findAll() {
        return alunoRepository.findAll();
    }

    // Buscar por ID
    public AlunoModel buscarAlunoPorId(Long id) {
        return alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado com ID: " + id));
    }

    // Atualizar aluno
    public AlunoModel atualizarAluno(Long id, AlunoModel alunoModel) {
        AlunoModel model = alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado com ID: " + id));

        model.setNome(alunoModel.getNome());
        model.setMatricula(alunoModel.getMatricula());

        return alunoRepository.save(model);
    }

    // Deletar aluno
    public void deletarAluno(Long id) {
        if (!alunoRepository.existsById(id)) {
            throw new RuntimeException("Aluno não encontrado com ID: " + id);
        }
        alunoRepository.deleteById(id);
    }
}