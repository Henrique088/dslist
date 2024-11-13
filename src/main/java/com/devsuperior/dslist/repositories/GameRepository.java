package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

// JpaRepository é uma interface e o que extende ela também tem que ser, <Tipo da entidade, Tipo do id da entidade>
public interface GameRepository extends JpaRepository<Game, Long>{

}
