
public class PromoProcessor {
	
	public static final String CODE_PROMO_LOVE_AMAYSIM = "I<3AMAYSIM";

	public float process(String code, float total) {
		switch (code) {
			case PromoProcessor.CODE_PROMO_LOVE_AMAYSIM :
				float discount = total * 0.1f;
				total -= discount;
		}
		return total;
	}
	
}
