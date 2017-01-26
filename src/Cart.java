public interface Cart {
	
	public void add(Item item);
	
	public void add(Item item, String promoCode);
	
	public void total();
	
	public void items();
	
}
