package Concrete;

import Abstract.SaleService;
import Entities.Discount;
import Entities.Game;
import Entities.User;

public class SaleManager implements SaleService {
	
	private double disPercent;
	private double price;
	
	@Override
	public void sale(Game[] games, User user, Discount discount) {
		for(Game game: games) {
			disPercent = discount.getDiscountPercent();
			price= game.getGamePrice();
			price= price - (price*disPercent/100);
			System.out.println(game.getGameName()+" oyunu "+discount.getDiscountName()
			+" ile "+user.getFirstName()+" tarafindan "+price+" TL'ye alindi.");
		}
		
	}

	@Override
	public void addToList(Game[] games, User user) {
		for(Game game: games) {
			System.out.println(game.getGameName()+" sepete "+game.getGamePrice()+" TL'ye eklendi.");
		}
		
	}

}
