package com.ejemplo.security.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.security.models.Contacto;
import com.ejemplo.security.repositories.ContactoRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class ContactoController {

    private final ContactoRepository contactoRepository;

    @GetMapping("/contactos")
    public List<Contacto> listaContacto(){
        return contactoRepository.findAll();
    }

   
}
