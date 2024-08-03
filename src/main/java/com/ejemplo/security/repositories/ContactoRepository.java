package com.ejemplo.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.security.models.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
    
}
