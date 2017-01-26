import java.util.ArrayList;

public class RuleLargeBulk implements Rule {

	@Override
	public void process(ArrayList<Item> items) {
		// TODO Auto-generated method stub
		boolean apply = false;
		int largeCounter = 0;
		for (Item item : items) {
			if (item.getCode().equals(ItemFactory.CODE_ULT_LRG)) {
				largeCounter++;
			}
			if (largeCounter > 3) {
				apply = true;
				break;
			}
		}
		if (apply) {
			for (Item item : items) {
				if (item.getCode().equals(ItemFactory.CODE_ULT_LRG)) {
					item.setPrice(39.9f); ;
				}
			}
		}
	}

}
