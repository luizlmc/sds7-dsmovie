package br.com.luizlmc.dsmovie.repositories;

import br.com.luizlmc.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
