package br.com.digisystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/*
 * 
 * Descrição: Entidade pessoa
 * Data: 25/04/2020  18:17
 * Autor: José Walter
 * 
 */

@Entity
@Table(name = "tbl_pessoa")
public class Pessoas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fu_codigo")
	private Long codigo;

	@NotBlank(message = "Por favor preencha o campo nome")
	@Column(name = "fu_nome", length = 35, nullable = false)
	private String nome;

	@NotBlank(message = "Por favor preencha o campo idade")
	@Column(name = "fu_idade", length = 3, nullable = false)
	private String idade;

	@NotBlank(message = "Por favor preencha o campo salário")
	@Column(name = "fu_salario", length = 6, nullable = false)
	private String salario;

	// ======================================================================================================================
	// Construtor builder
	public Pessoas() {
		super();

	}

	// ======================================================================================================================
	// Construtor and fields
	public Pessoas(Long codigo, String nome, String idade, String salario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;

	}

	// ======================================================================================================================
	// Getters and Setters
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	// ======================================================================================================================
	// ToString
	@Override
	public String toString() {
		return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
	}

	// ======================================================================================================================
			// HashCode and Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((idade == null) ? 0 : idade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((salario == null) ? 0 : salario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoas other = (Pessoas) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (idade == null) {
			if (other.idade != null)
				return false;
		} else if (!idade.equals(other.idade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (salario == null) {
			if (other.salario != null)
				return false;
		} else if (!salario.equals(other.salario))
			return false;
		return true;
	}
}
