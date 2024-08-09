package br.com.shoppingaraguaina.repository;

import br.com.shoppingaraguaina.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
