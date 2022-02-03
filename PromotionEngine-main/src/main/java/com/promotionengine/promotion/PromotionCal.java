package com.promotionengine.promotion;

public class PromotionCal {
	

	public static final int PRICE_SKUA = 50;
	public static final int PRICE_COMBO_SKUA = 130;
	public static final int PRICE_SKUB = 30;
	public static final int PRICE_COMBO_SKUB = 45;
	public static final int PRICE_SKUC = 20;
	public static final int PRICE_SKUD = 15;
	public static final int PRICE_COMBO_SKUCD = 30;
	public int total =0;
	
	
	public int calculateTotalCost(int quantA, int quantB, int quantC, int quantD ) {
		  total = calculateSkuIdA(quantA, total);
		  total = calculateSkuIdB(quantB, total);
		  total = calculateSkuIdCAndD(quantC, quantD, total);
		return total ;
	}


	private int calculateSkuIdA(int quantA, int total) {
		if (quantA >= 3) {
			int quotient = quantA / 3;
			int remainder = quantA % 3;
			total = (quotient >= 0) ? total + quotient * PRICE_COMBO_SKUA : total;
			total = (remainder >= 0) ? total + remainder * PRICE_SKUA : total;
		} else {

			total = total + quantA * PRICE_SKUA;
		}
		
		return total;
	}

	private int calculateSkuIdB(int quantB, int total) {
		if (quantB >= 2) {
			int quotient = quantB / 2;
			int remainder = quantB % 2;
			total = (quotient >= 0) ? total + quotient * PRICE_COMBO_SKUB : total;
			total = (remainder >= 0) ? total + remainder * PRICE_SKUB : total;
		} else {
			total = total + quantB * PRICE_SKUB;
		}
		return total;
	}
	
	private int calculateSkuIdCAndD(int quantC, int quantD, int total) {
		if(quantC >=1 && quantD >=1 ) {
			total = (quantC == quantD ) ? total + quantC*PRICE_COMBO_SKUCD : total;
			total = (quantC > quantD ) ?  total + (quantD*PRICE_COMBO_SKUCD  + (quantC - quantD )*PRICE_SKUC) : total ;
			total = (quantD > quantC ) ?  total + (quantC*PRICE_COMBO_SKUCD  + (quantD - quantC )*PRICE_SKUD) : total;
			
		}else {
			total =total + quantC * PRICE_SKUC;
			total =total + quantD * PRICE_SKUD;
		}
		
		return total;
	}
	
	
}
