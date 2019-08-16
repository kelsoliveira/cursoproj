//PACOTE QUE CONTEM AS CLASSES DE ACESSO A BASE DE DADOS PARA REALIZAR OPERAÇÕES E ACESSO AO DADOS
//CAMADA DAO
package com.kelsoliveira.cursomc.repositories;

//PACOTES DE IMPORTAÇÕES
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kelsoliveira.cursomc.domain.Categoria;

/* JPAREPOSITORY, INTERFACE DO SPRING QUE ACESSA OS DADOS COM BASE NO TIPO INFORMADO, NO CASO TIPO CATEGORIA  */

//INTERFACE PARA ACESSAR A BASE DE DADOS E REALIZAR CONSULTAS
@Repository // ANOTAÇÃO PARA TORNAR O ACESSO POSSIVEL
//OBJETO DESSA CLASSE TERÁ A FUNÇÃO DE REALIZAR AS OPERAÇÕES CRUD
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
