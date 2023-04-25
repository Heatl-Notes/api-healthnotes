package com.projeto1.apihealthnotes.domain.repository;

import com.projeto1.apihealthnotes.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    UserDetails findByLogin(String login);

    boolean existsByLogin(String login);
}
