package com.wallet.repository;

<<<<<<< HEAD
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
=======
import com.wallet.entity.User;
import org.junit.jupiter.api.Test;
>>>>>>> 104fa58097c0c4078fb608c83ef58f6256fc57f9
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserRepositoryTest {

<<<<<<< HEAD
	private static final String EMAIL = "email@teste.com";
	
	@Autowired
	UserRepository repository;
	
	@Before
	public void setUp() {
		User u = new User();
		u.setName("Set up User");
		u.setPassword("Senha123");
		u.setEmail(EMAIL);
		
		repository.save(u);
	}
	
	@After
	public void tearDown() {
		
		repository.deleteAll();
	}
	
	@Test
	public void testSave() {
		User x = new User();
		x.setName("Teste");
		x.setPassword("123456");
		x.setEmail("teste@teste.com");
		
		User response = repository.save(x);
		
		assertNotNull(response);
	}
	
	public void testFindByEmail() {
		Optional<User> response = repository.findByEmailEquals(EMAIL);
		
		assertTrue(response.isPresent());
		assertEquals(response.get().getEmail(), EMAIL);
	}
=======
    @Autowired
    UserRepository repository;

    @Test
    public void testSave() {
        User u = new User();
        u.setName("Teste");
        u.setPassword("123456");
        u.setEmail("teste@teste.com");

        User response = repository.save(u);

        assertNotNull(response);
    }

>>>>>>> 104fa58097c0c4078fb608c83ef58f6256fc57f9
}
