import java.util.ArrayList;

public class RuleMediumBundle implements Rule {

	@Override
	public void process(ArrayList<Item> items) {
		// TODO Auto-generated method stub
		int freeCounter = 0;
		for (Item item : items) {
			if (item.getCode().equals(ItemFactory.CODE_ULT_MED)) {
				freeCounter++;
			}
		}
		
		if (freeCounter > 0) {
			ItemFactory itemFactory = new ItemFactory();
			for (int i = 0; i < freeCounter; i++) {
				Item freeItem = itemFactory.createItem(ItemFactory.CODE_1GB);
				freeItem.setPrice(0f);
				items.add(freeItem);
			}
		}
		
		
	}

}
