//PACOTE QUE CONTEM AS CLASSES DE CONTROLE DE RECURSOS
//CAMADA DE CONTROLE
package com.kelsoliveira.cursomc.resources;

//DEPENDENCIAS
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import com.kelsoliveira.cursomc.domain.Categoria;
import com.kelsoliveira.cursomc.services.CategoriaService;

//CLASSE DO TIPO CONTROLADORA REST
@RestController // ANOTAÇÃO QUE TORNA A CLASSE EM CONTROLADORA REST
@RequestMapping(value = "/categorias") // EndPoint PARA ESSE RECURSO
public class CategoriaResource {

	// INSTANCIA QUE ACESSA A CLASSE DE SERVIÇO
	@Autowired
	private CategoriaService service;

	// ASSOCIAÇÃO COM O VERBO HTTP - NO CASO OBTER DADOS - GET
	// @PathVariable, INDICA AO SPRING QUE O ID DA URL DEVE IR PARA O ID DA VARIÁVEL
	/*
	 * ResponseEntity, TIPO ESPECIAL DO SPRING, ENCAPSULA INFORMAÇÕES DE UMA
	 * RESPOSTA HTTP PARA SERVIÇO REST
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {

		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);

	}
}
