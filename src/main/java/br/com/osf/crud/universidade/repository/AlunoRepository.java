package br.com.osf.crud.universidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.osf.crud.universidade.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

	Aluno findById(Long id);
	
}
