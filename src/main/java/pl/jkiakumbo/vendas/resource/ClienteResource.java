package pl.jkiakumbo.vendas.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.jkiakumbo.vendas.model.Cliente;
import pl.jkiakumbo.vendas.repository.Clientes;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {

    @Autowired
    private Clientes clientes;

    @GetMapping
    public List<Cliente> listar(){
        return clientes.findAll();
    }
}
