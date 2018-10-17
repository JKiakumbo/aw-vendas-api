package pl.jkiakumbo.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.jkiakumbo.vendas.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {
}
