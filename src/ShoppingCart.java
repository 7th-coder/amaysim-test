import java.util.ArrayList;

public class ShoppingCart implements Cart {

	private ArrayList<Item> items;
	private ArrayList<String> promoCodes;
	private PricingRules pricingRules;
	
	private ShoppingCart() {
	}
	
	public ShoppingCart(PricingRules pricingRules) {
		this.items = new ArrayList<Item>();
		this.promoCodes = new ArrayList<String>();
		this.pricingRules = pricingRules;
	}
	
	@Override
	public void add(Item item) {
		// TODO Auto-generated method stub
		this.items.add(item);
	}

	@Override
	public void add(Item item, String promoCode) {
		// TODO Auto-generated method stub
		this.items.add(item);
		this.promoCodes.add(promoCode);
	}

	@Override
	public void total() {
		// TODO Auto-generated method stub
		
		// process
		for (Rule rule : this.pricingRules.getRules()) {
			rule.process(this.items);
		}
		
		float total = 0f;
		for (Item item : this.items) {
			total += item.getPrice();
		}
		
		// process
		PromoProcessor promoProcessor = new PromoProcessor();
		for (String promoCode : this.promoCodes) {
			total = promoProcessor.process(promoCode, total);
		}
		
		System.out.println("TOTAL PRICE: " + total);
	}

	@Override
	public void items() {
		// TODO Auto-generated method stub
		for (Item item : this.items) {
			System.out.println(item.getName());
		}
		
	}

}
