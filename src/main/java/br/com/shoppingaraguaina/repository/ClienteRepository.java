package br.com.shoppingaraguaina.repository;

import br.com.shoppingaraguaina.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}
