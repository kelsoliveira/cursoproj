//PACOTE QUE CONTEM AS CLASSES DE CONTROLE DE RECURSOS
package com.kelsoliveira.cursomc.resources;

//LISTA DE IMPORTAÇÕES
import java.util.ArrayList;
import java.util.List;
import com.kelsoliveira.cursomc.domain.Categoria;

//DEPENDENCIAS
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//CLASSE DO TIPO CONTROLADORA REST
@RestController
@RequestMapping(value = "/categorias") // EndPoint PARA ESSE RECURSO
public class CategoriaResource {
	@RequestMapping(method = RequestMethod.GET) //ASSOCIAÇÃO COM O VERBO HTTP - NO CASO OBTER DADOS - GET
	public List<Categoria> listar() {
		
		Categoria cat1  = new Categoria (1,"Informática");
		Categoria cat2 = new Categoria (2,"Escritório");
		
		/*List É UMA INTERFACE E NÃO PODE SER INSTANCIADO*/
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}
}
