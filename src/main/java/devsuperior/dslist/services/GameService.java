package devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import devsuperior.dslist.dto.GameMinDTO;
import devsuperior.dslist.repository.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
        
    public List<GameMinDTO> findAll() {            
        return gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
    }
}
