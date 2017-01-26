import java.util.ArrayList;

public class RuleSmallDeal implements Rule {

	@Override
	public void process(ArrayList<Item> items) {
		// TODO Auto-generated method stub
		
		int smallCounter = 0;
		for (Item item : items) {
			if (item.getCode().equals(ItemFactory.CODE_ULT_SML)) {
				smallCounter++;
			}
			if (smallCounter == 3) {
				smallCounter = 0;
				item.setPrice(0);
			}
		}
		
	}

	
}
