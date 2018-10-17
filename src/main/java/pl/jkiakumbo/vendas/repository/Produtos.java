package pl.jkiakumbo.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.jkiakumbo.vendas.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {
}
