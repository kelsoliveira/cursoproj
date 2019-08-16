//PACOTE QUE CONTEM AS CLASSES DE DOMINIO
//CAMADA DE DOMINIO (MODEL)
package com.kelsoliveira.cursomc.domain;

//PACOTES DE IMPORTAÇÕES
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/* SERIALIZABLE IMPLEMENTADA PARA QUE OS OBJETOS SEJAM CONVERTIDOS EM UMA SEQUENCIA DE BYTES
 * PARA QUE OS OBJETOS SEJAM GRAVADOS EM ARQUIVOS, TRAFEGAR EM REDE...
 * SENDO UMA EXIGENCIA DO JAVA 
 */

/*
 * ANOTAÇÃO OBJETO RELACIONAL, INDICA QUE A CLASSE É UMA ENTIDADE, JPA ESTABELE
 * A LIGAÇÃO ENTIDADE/TABELA
 */
@Entity
//CLASSE DE DOMINIO DAS CATEGORIAS DE PRODUTOS
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L; // NUMERO DE VERSÃO DA CLASSE

	// ATRIBUTOS DA CLASSE, POR PADRÃO SÃO PRIVADOS, NÃO ACESSIVEIS A OUTRAS CLASSES
	// DEFININDO A ESTRATÉGIA DE GERAÇÃO AUTOMÁTICA DOS IDs DAS CATEGORIAS
	// ANOTAÇÃO QUE INDICA AO JPA QUE O ATRIBUTO É A PRIMARY KEY
	@Id
	// ANOTAÇÃO PARA CONTROLE DE GERAÇÃO DE IDs PELO PROVEDOR DE PERSISTÊNCIA
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCat;
	private String nome;

	/*
	 * CONSTRUTOR DA CLASSE, VAZIO ONDE SE INSTANCIA OBJETOS SEM JOGAR NADA PARA OS
	 * ATRIBUTOS
	 */
	public Categoria() {

	}

	// CONSTRUTOR PARA POVOAR OS ATRIBUTOS
	public Categoria(Integer idCat, String nome) {
		super();
		this.idCat = idCat;
		this.nome = nome;
	}

	// METODOS DE ACESSO PARA OS ATRIBUTOS DA CLASSE
	public Integer getIdCat() {
		return idCat;
	}

	public void setIdCat(Integer idCat) {
		this.idCat = idCat;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/*
	 * HASH CODE E EQUALS EM JAVA PARA QUE DOIS OBJETOS SEJAM COMPARADOS POR SEU
	 * CONTEÚDO E NÃO PELO PONTEIRO DE MEMÓRIA POR PADRÃO A COMPARAÇÃO É FEITA PELA
	 * O ID DA CLASSE, SE O ID FOR DIFERENTE OS OBJETOS TAMBÉM SERÃO
	 */

	// GERA UM CODIGO NÚMERICO PARA CADA OBJETO
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCat == null) ? 0 : idCat.hashCode());
		return result;
	}

	// METODO DE COMPARAÇÃO ENTRE OS OBJETOS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (idCat == null) {
			if (other.idCat != null)
				return false;
		} else if (!idCat.equals(other.idCat))
			return false;
		return true;
	}

}
