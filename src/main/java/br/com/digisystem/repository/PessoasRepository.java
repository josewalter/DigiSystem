package br.com.digisystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.digisystem.model.Pessoas;

/*
 * 
 * Descrição: Classe Repository responsável por gerenciar os dados no banco de dados
 * Data: 25/04/2020  20:51
 * Autor: José Walter
 * 
 */

@Repository
public interface PessoasRepository extends JpaRepository<Pessoas, Long>{

		Pessoas buscarPorSalario(String salario);

		Pessoas buscarPorNome(String nome);
	    

 }
