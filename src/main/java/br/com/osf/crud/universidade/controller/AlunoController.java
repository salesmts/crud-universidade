package br.com.osf.crud.universidade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.osf.crud.universidade.model.Aluno;
import br.com.osf.crud.universidade.repository.AlunoRepository;

@RestController
@RequestMapping(value="/universidade")
public class AlunoController {

	@Autowired
	AlunoRepository alunoRepository;
	
	@GetMapping("/alunos")
	public List<Aluno> listaAlunos() {
		return alunoRepository.findAll();
	}
	
	@GetMapping("/alunos/{id}")
	public Aluno listaAlunoId(@PathVariable(value= "id") Long id) {
		return alunoRepository.findById(id);
	}
	
	@PostMapping("/alunos")
	@ResponseStatus(HttpStatus.CREATED)
	public Aluno salvaAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	@DeleteMapping("/alunos")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletaAluno(@RequestBody Aluno aluno) {
		alunoRepository.delete(aluno);
	}
	
	@PutMapping("/alunos")
	@ResponseStatus(HttpStatus.OK)
	public Aluno atualizaAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	
}
