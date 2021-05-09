package com.testeorangetalents.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testeorangetalents.models.Endereco;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
	
}
