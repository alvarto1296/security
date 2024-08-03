package com.ejemplo.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.security.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{


}
