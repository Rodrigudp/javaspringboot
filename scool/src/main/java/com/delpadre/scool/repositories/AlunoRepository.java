package com.delpadre.scool.repositories;

import com.delpadre.scool.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {
}
