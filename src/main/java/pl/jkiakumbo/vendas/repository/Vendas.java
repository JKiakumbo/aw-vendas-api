package pl.jkiakumbo.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.jkiakumbo.vendas.model.Venda;

public interface Vendas extends JpaRepository<Venda,Long> {
}
