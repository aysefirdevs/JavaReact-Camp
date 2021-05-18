package Concrete;

import Abstract.GameService;
import Entities.Game;


public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("oyun eklendi: "+game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("oyun guncellendi: "+game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("oyun silindi: "+game.getGameName());
		
	}

	@Override
	public void addMultiple(Game[] games) {
		
		for(Game game: games) {
			System.out.println("oyun eklendi: "+game.getGameName());
		}
		
		
		
	}

}
