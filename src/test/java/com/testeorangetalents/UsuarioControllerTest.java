package com.testeorangetalents;

import java.net.URI;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.testeorangetalents.controllers.UsuarioController;
import com.testeorangetalents.models.Usuario;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc

public class UsuarioControllerTest extends OrangeTalentsApplicationTests{
	
	//responsavel pelas requisicoes
	private MockMvc mockMvc;
	
	@Autowired
	private UsuarioController usuarioController;
	
	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(usuarioController).build();
	}
	
	@Test
	public void criarUsuarioCorretamente_retornarStatusCode201() throws Exception {
		Usuario usuario = new Usuario(1000, "Teste de Teste", "teste@teste.com", "12345678900", null, null);
		
		URI uri = new URI("/usuario");
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(usuario);
		
		mockMvc
			.perform(MockMvcRequestBuilders
				.post(uri)
				.content(json)
				.contentType(MediaType.APPLICATION_JSON))
			.andExpect(MockMvcResultMatchers
					.status()
					.is(400));
		
	}
	
}
