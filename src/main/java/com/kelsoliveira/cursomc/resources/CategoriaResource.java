//PACOTE QUE CONTEM AS CLASSES DE CONTROLE DE RECURSOS
package com.kelsoliveira.cursomc.resources;

//DEPENDENCIAS

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//CLASSE DE DOMINIO DO TIPO CONTROLADORA REST
@RestController
@RequestMapping(value = "/categorias") // EndPoint PARA ESSE RECURSO
public class CategoriaResource {
	@RequestMapping(method = RequestMethod.GET) //ASSOCIAÇÃO COM O VERBO HTTP - NO CASO OBTER DADOS - GET
	public String listar() {
		return "REST FUNCIONANDO";
	}
}
