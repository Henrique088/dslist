package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

//registra um componente do sistema
@Service
public class GameService {
	
	//faz a injeção, auto resolve a independência
	@Autowired
	private GameRepository gameRepository;
	
	//List<GameMinDTO> é o tipo de retorno
	public List<GameMinDTO> findAll(){
		
		//cria uma lista do tipo Game
		List<Game> result = gameRepository.findAll();
		
		// stream permite trabalhar com uma sequencias de dados e o map transforma objetos de uma coisa para outra
		// toList volta para uma lista normal
		return result.stream().map(GameMinDTO::new).toList();
	}
}