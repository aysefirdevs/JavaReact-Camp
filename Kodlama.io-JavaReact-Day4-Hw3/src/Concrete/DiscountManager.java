package Concrete;

import Abstract.DiscountService;
import Entities.Discount;

public class DiscountManager implements DiscountService {

	@Override
	public void add(Discount discount) {
		System.out.println(discount.getDiscountName()+" sisteme %"
	+discount.getDiscountPercent()+" indirim oraniyla eklenmistir.");
		
	}

	@Override
	public void update(Discount discount) {
		System.out.println(discount.getDiscountName()+" guncellendi.");
		
	}

	@Override
	public void delete(Discount discount) {
		System.out.println(discount.getDiscountName()+" sistemden silindi.");
		
	}

}
