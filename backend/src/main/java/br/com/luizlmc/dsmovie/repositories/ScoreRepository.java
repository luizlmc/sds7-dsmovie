package br.com.luizlmc.dsmovie.repositories;

import br.com.luizlmc.dsmovie.entities.Score;
import br.com.luizlmc.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
