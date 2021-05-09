package com.testeorangetalents.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testeorangetalents.models.Endereco;

import com.testeorangetalents.repository.EnderecoRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/api")
public class EnderecoController {
	
	@Autowired
	EnderecoRepository enderecoRepository;
	
	@PostMapping(path = "/endereco")
	public ResponseEntity<Endereco> post (@RequestBody Endereco endereco){
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(enderecoRepository.save(endereco));
	}
}
