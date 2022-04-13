package com.devsuperior.dscatalog.services;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.devsuperior.dscatalog.repositories.ProductRepository;

@ExtendWith(SpringExtension.class)
public class ProductServiceTests {
	
	@InjectMocks
	private ProductService service;
	
	@Mock //usada quando classe de teste não carrega contexto da aplicação, para testes mais isolados
	private ProductRepository repository; // normalmente usada junto com @ExtendWith  +rapido + enxuto
	
	@MockBean //usada quando classes de teste carrega contexto da aplicação, e precisa carregar algum bean do sistema
	private ProductRepository repository2;//@WebMvcTest    @SpringBootTest   +lento
	
}
