//PACOTE QUE CONTEM AS CLASSES DE SERVIÇO PARA OPERAÇÕES DE CONSULTAS AO OBJETO E CLASSE
//CAMADA DE SERVIÇO
package com.kelsoliveira.cursomc.services;

//PACOTES DE IMPORTAÇÕES
import org.springframework.stereotype.Service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.kelsoliveira.cursomc.domain.Categoria;
import com.kelsoliveira.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	/*
	 * ANOTAÇÃO PARA INSTANCIAR AUTOMATICAMENTE PELO MECANISMO DE INJEÇÃO DE
	 * DEPENDÊNCIA OU INVERSÃO DE CONTROLE DO SPRING
	 */
	// INSTANCIA QUE ACESSA A CAMADA DAO
	@Autowired
	private CategoriaRepository repo; // DECLARAÇÃO DA DEPENDÊNCIA DO OBJETO DA CLASSE DAO

	// MÉTODO PARA CHAMAR OPERAÇÃO DA CLASSE DA CAMADA DAO
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
