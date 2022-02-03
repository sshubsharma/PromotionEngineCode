package com.promotionengine.execute;

import com.promotionengine.promotion.PromotionCal;

public class ExecutePromotionEngine {

	private PromotionCal calc;
	private int total;
	private int option;

	public ExecutePromotionEngine(PromotionCal calc) {
		this.total = 0;
		this.calc = calc;
		this.option = 1;
	}

	public int execute(int skuIdA, int skuIdB, int skuIdC, int skuIdD) {

		switch (option) {
		case 1:
			total = calc.calculateTotalCost(skuIdA, skuIdB, skuIdC, skuIdD);
			break;
		default:
			break;
		}
		return total;
	}

}
