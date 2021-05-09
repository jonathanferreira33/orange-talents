package com.testeorangetalents.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.testeorangetalents.models.Usuario;

@Service
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	public Usuario findById(int id);
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
}
