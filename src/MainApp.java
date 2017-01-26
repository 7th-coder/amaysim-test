
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("start application");
		
		ItemFactory itemFactory = new ItemFactory();
		PricingRules pricingRules = new PricingRules();
		pricingRules.addRule(new RuleSmallDeal());
		pricingRules.addRule(new RuleLargeBulk());
		pricingRules.addRule(new RuleMediumBundle());
		
		Cart cart = new ShoppingCart(pricingRules);
		
		System.out.println("SCENARIO 1");
		cart = new ShoppingCart(pricingRules);
		cart.add(itemFactory.createItem(ItemFactory.CODE_ULT_SML));
		cart.add(itemFactory.createItem(ItemFactory.CODE_ULT_SML));
		cart.add(itemFactory.createItem(ItemFactory.CODE_ULT_SML));
		cart.add(itemFactory.createItem(ItemFactory.CODE_ULT_LRG));
		cart.total();
		cart.items();
		
		System.out.println("SCENARIO 2");
		cart = new ShoppingCart(pricingRules);
		cart.add(itemFactory.createItem(ItemFactory.CODE_ULT_SML));
		cart.add(itemFactory.createItem(ItemFactory.CODE_ULT_SML));
		cart.add(itemFactory.createItem(ItemFactory.CODE_ULT_LRG));
		cart.add(itemFactory.createItem(ItemFactory.CODE_ULT_LRG));
		cart.add(itemFactory.createItem(ItemFactory.CODE_ULT_LRG));
		cart.add(itemFactory.createItem(ItemFactory.CODE_ULT_LRG));
		cart.total();
		cart.items();
		
		System.out.println("SCENARIO 3");
		cart = new ShoppingCart(pricingRules);
		cart.add(itemFactory.createItem(ItemFactory.CODE_ULT_SML));
		cart.add(itemFactory.createItem(ItemFactory.CODE_ULT_MED));
		cart.add(itemFactory.createItem(ItemFactory.CODE_ULT_MED));
		cart.total();
		cart.items();
		
		
		System.out.println("SCENARIO 4");
		cart = new ShoppingCart(pricingRules);
		cart.add(itemFactory.createItem(ItemFactory.CODE_ULT_SML), PromoProcessor.CODE_PROMO_LOVE_AMAYSIM);
		cart.add(itemFactory.createItem(ItemFactory.CODE_1GB));
		cart.total();
		cart.items();
		
	}

}
