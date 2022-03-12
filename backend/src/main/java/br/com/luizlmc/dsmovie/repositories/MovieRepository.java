package br.com.luizlmc.dsmovie.repositories;

import br.com.luizlmc.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
