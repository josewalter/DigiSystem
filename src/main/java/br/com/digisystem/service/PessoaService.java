package br.com.digisystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.digisystem.model.Pessoas;
import br.com.digisystem.repository.PessoasRepository;


/*
 * 
 * Descrição: Entidade Pessoa responsavél pelas regras de negócios
 * Data: 26/04/2020  13:47
 * Autor: José Walter
 * 
 */

@Service
public class PessoaService {

	@Autowired
	PessoasRepository pessoasRepository;
	
// ======================================================================
		// Método para salvar os dados no banco
	public Pessoas cadastrar(Pessoas pessoas) {

		return pessoasRepository.save(pessoas);
	}

// ======================================================================
	// Busca todos os dados do banco
	public List<Pessoas> buscarTodos() {

		return pessoasRepository.findAll();

	}
	
//======================================================================
	// Faz a busca de uma pessoa pelo ID
	public Pessoas buscarPorId(Long codigo) {
		
		return pessoasRepository.getOne(codigo);
	
  }

//======================================================================
		// Faz a busca de uma pessoa pelo nome
	public Pessoas buscarPorNome(String nome) {

		return pessoasRepository.buscarPorNome(nome);
	}

//======================================================================
			// Faz a busca de uma pessoa pelo salario
	public Pessoas buscarPorSalario(String salario) {
		
		return pessoasRepository.buscarPorSalario(salario);
	}

//======================================================================
	//Faz a alteração da pessoa já cadastrada no banco 
	public Pessoas alterar(Pessoas pessoas) {
		pessoasRepository.save(pessoas);
		return pessoas;
	}
}
