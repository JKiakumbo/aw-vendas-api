package pl.jkiakumbo.vendas.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.jkiakumbo.vendas.model.Produto;
import pl.jkiakumbo.vendas.repository.Produtos;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {

    @Autowired
    private Produtos produtos;

    @GetMapping
    public List<Produto> listar(){
        return produtos.findAll();
    }
}
