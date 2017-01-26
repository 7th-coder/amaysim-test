
public class ItemFactory {

	public ItemFactory() {
	}
	
	public static final String CODE_ULT_SML = "ult_small";
	public static final String CODE_ULT_MED = "ult_medium";
	public static final String CODE_ULT_LRG = "ult_large";
	public static final String CODE_1GB = "1gb";
	
	public Item createItem(String code) {
		switch(code) {
			case CODE_ULT_SML:
				return new Item(CODE_ULT_SML, "Unlimited 1 GB", 24.9f);
			case CODE_ULT_MED:
				return new Item(CODE_ULT_MED, "Unlimited 2 GB", 29.9f);
			case CODE_ULT_LRG:
				return new Item(CODE_ULT_LRG, "Unlimited 5 GB", 44.9f);
			case CODE_1GB:
				return new Item(CODE_1GB, "1 GB Data-pack", 9.9f);
			default:
				return null;
		}
	}
	
}
