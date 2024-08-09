package br.com.shoppingaraguaina.repository;

import br.com.shoppingaraguaina.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
}
