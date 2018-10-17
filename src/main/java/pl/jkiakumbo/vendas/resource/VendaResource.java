package pl.jkiakumbo.vendas.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.jkiakumbo.vendas.model.Venda;
import pl.jkiakumbo.vendas.repository.Vendas;

import java.util.List;

@RestController
@RequestMapping("venda")
public class VendaResource {

    @Autowired
    private Vendas vendas;

    @GetMapping
    public List<Venda> listar(){
        return vendas.findAll();
    }
}
