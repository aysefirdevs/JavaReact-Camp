import Adapters.MernisServiceAdapter;
import Concrete.DiscountManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Discount;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		UserManager userManager=new UserManager(new MernisServiceAdapter());
		User user=new User(1,"Rümeysa","Çelik","235684",2000);
		userManager.add(user);
		userManager.delete(user);
		userManager.update(user);
		
		System.out.println("-------------");
		
		GameManager gameManager=new GameManager();
		Game game1=new Game(1,"CS:GO",100);
		Game game2=new Game(2,"Valorant",59.90);
		Game game3=new Game(3,"Gta5",159.99);
		Game[] games= {game1,game2,game3};
		
		gameManager.delete(game2);
		gameManager.update(game3);
		gameManager.addMultiple(games);
		
		System.out.println("-----------");
		
		DiscountManager discountManager= new DiscountManager();
		Discount discount1= new Discount("Bayram indirimi",50);
		Discount discount2= new Discount("Yaz indirimi",20);
		discountManager.add(discount1);
		discountManager.update(discount2);
		discountManager.delete(discount2);
		
		System.out.println("-------------");
		
		SaleManager saleManager= new SaleManager();
		saleManager.addToList(games, user);
		saleManager.sale(games, user, discount2);
		
		
	}

}
