import java.util.ArrayList;

public class PricingRules {

	private ArrayList<Rule> rules;
	
	public PricingRules() {
		rules = new ArrayList<Rule>();
	}
	
	public void addRule(Rule rule) {
		rules.add(rule);
	}
	
	public ArrayList<Rule> getRules() {
		return this.rules;
	}
	
}
