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

    public AlunoModel criarAluno(AlunoModel alunoModel) {
        return alunoRepository.save(AlunoModel);
    }

    public List<AlunoModel> findAll() {
        return alunoRepository.findAll();
    }

    public void deletarAluno(Long id) {
        alunoRepository.deleteById(id);
    }


}
