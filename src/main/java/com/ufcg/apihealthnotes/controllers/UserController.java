package com.ufcg.apihealthnotes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufcg.apihealthnotes.dto.CaregiverAutenticationDTO;
import com.ufcg.apihealthnotes.dto.CaregiverPostRequestDTO;
import com.ufcg.apihealthnotes.services.UserService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin("*")
@RequestMapping
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> efetuarLogin(@RequestBody @Valid CaregiverAutenticationDTO caregiverDTO) {
        return ResponseEntity
        		.status(HttpStatus.OK)
        		.body(userService.efetuarLogin(caregiverDTO));
    }

    @PostMapping("/cadastro")
    public ResponseEntity<?> efetuarCadastro(@RequestBody @Valid CaregiverPostRequestDTO caregiverDTO) {
    	return ResponseEntity
        		.status(HttpStatus.CREATED)
        		.body(userService.efetuarCadastro(caregiverDTO));
    }
}
