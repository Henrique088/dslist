package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;


//registra um componente do sistema
@Service
public class GameListService {
	
	//faz a injeção, auto resolve a independência
	@Autowired
	private GameListRepository gameListRepository;
	
	//List<GameMinDTO> é o tipo de retorno
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		
		//cria uma lista do tipo Game
		List<GameList> result = gameListRepository.findAll();
		
		// stream permite trabalhar com uma sequencias de dados e o map transforma objetos de uma coisa para outra
		// toList volta para uma lista normal
		return result.stream().map(GameListDTO::new).toList();
	}
}