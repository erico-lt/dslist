package devsuperior.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import devsuperior.dslist.entites.Game;


public interface GameRepository extends JpaRepository<Game, Long>{
    
}
