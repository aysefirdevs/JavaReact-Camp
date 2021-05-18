package Abstract;

import Entities.Discount;
import Entities.Game;
import Entities.User;

public interface SaleService {
	void sale(Game[] games,User user,Discount discount);
	void addToList(Game[] games,User user);
}
