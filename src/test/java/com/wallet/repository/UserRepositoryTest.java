package com.wallet.repository;

import com.wallet.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserRepositoryTest {

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

}
