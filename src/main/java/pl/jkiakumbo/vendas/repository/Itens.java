package pl.jkiakumbo.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.jkiakumbo.vendas.model.Item;

public interface Itens extends JpaRepository<Item,Long> {
}
