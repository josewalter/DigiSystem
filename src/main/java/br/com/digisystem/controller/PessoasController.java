package br.com.digisystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.digisystem.model.Pessoas;
import br.com.digisystem.service.PessoaService;


/*
 * 
 * Descrição: Entidade Cliente Controller EbdPoints
 * Data: 25/04/2020  21:06
 * Autor: José Walter
 * 
 */

@RestController
public class PessoasController {

	@Autowired
	PessoaService pessoaService;

	// EndPoints
	
// ================================================================================================================
	// Método para salvar os dados da pessoa
	@RequestMapping(method = RequestMethod.POST, value = "/pessoas", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pessoas> cadastrarPessoas(@RequestBody Pessoas pessoa) {

		Pessoas pessoaSalvo = pessoaService.cadastrar(pessoa);
		return new ResponseEntity<>(pessoaSalvo, HttpStatus.CREATED);
	}

// ================================================================================================================
	// Método para buscar todas as pessoas da lista
	@RequestMapping(method = RequestMethod.GET, value = "/pessoas", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Pessoas>> buscarTodasPessoas() {

		List<Pessoas> pessoasEncontradas = pessoaService.buscarTodos();
		return new ResponseEntity<>(pessoasEncontradas, HttpStatus.OK);
	}

// ================================================================================================================
	// Método para buscar pessoa pelo ID
	@RequestMapping(method = RequestMethod.GET, value = "/pessoas/{codigo}")
	public ResponseEntity<Pessoas> buscarPorId(@PathVariable("codigo") Long codigo) {

		Pessoas codigoEncontrado = pessoaService.buscarPorId(codigo);

		return new ResponseEntity<>(codigoEncontrado, HttpStatus.OK);

	}

// ================================================================================================================
	// Método para buscar pessoa pelo Nome
	@RequestMapping(method = RequestMethod.GET, value = "/pessoas/{nome}")
	public ResponseEntity<Pessoas> buscarPeloNome(@PathVariable String nome) {

		Pessoas nomeEncontrado = pessoaService.buscarPorNome(nome);

		return new ResponseEntity<>(nomeEncontrado, HttpStatus.OK);

	}

// ================================================================================================================
	// Método para buscar pessoa pelo salário
	@RequestMapping(method = RequestMethod.GET, value = "/pessoas/{salario}")
	public ResponseEntity<Pessoas> buscarPeloSalario(@PathVariable String salario) {

		Pessoas salarioEncontrado = pessoaService.buscarPorSalario(salario);

		return new ResponseEntity<>(salarioEncontrado, HttpStatus.OK);

	}

// =================================================================================================================
	// Método alterar pessoa pelo ID
	@RequestMapping(method = RequestMethod.PUT, value = "/pessoas/{codigo}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pessoas> alterarPessoa(@RequestBody Pessoas pessoas) {

		Pessoas pessoaAlterado = pessoaService.alterar(pessoas);
		return new ResponseEntity<>(pessoaAlterado, HttpStatus.OK);
	}

}
