package br.com.luizlmc.dsmovie.services;

import br.com.luizlmc.dsmovie.dto.MovieDTO;
import br.com.luizlmc.dsmovie.entities.Movie;
import br.com.luizlmc.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable){
        Page<Movie> result = movieRepository.findAll(pageable);
        Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
        return page;
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id){
        Movie movie = movieRepository.getById(id);
        MovieDTO movieDTO = new MovieDTO(movie);
        return movieDTO;
    }
}
