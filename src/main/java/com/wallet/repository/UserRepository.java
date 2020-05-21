package com.wallet.repository;


<<<<<<< HEAD
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

=======
>>>>>>> 104fa58097c0c4078fb608c83ef58f6256fc57f9
import com.wallet.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByEmailEquals(String email);
}
