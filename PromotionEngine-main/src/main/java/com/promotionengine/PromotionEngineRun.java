
package com.promotionengine;

import java.util.Scanner;

import com.promotionengine.execute.ExecutePromotionEngine;
import com.promotionengine.promotion.PromotionCal;


public class PromotionEngineRun {


	public static void main(String[] args) {
		PromotionCal calc = new PromotionCal();
		ExecutePromotionEngine engine = new ExecutePromotionEngine(calc);
		
		System.out.println(" ********** Started Promotion Engine  ********** ");
		
		Scanner sc=new Scanner(System.in);

			System.out.println("Enter quantity value of  A");
			int skuIdA = sc.nextInt();

			System.out.println("Enter quantity value of  B");

			int skuIdB = sc.nextInt();

			System.out.println("Enter quantity value of  C");

			int skuIdC = sc.nextInt();

			System.out.println("Enter quantity value of  D");

			int skuIdD = sc.nextInt();
			
			int total = engine.execute(skuIdA, skuIdB, skuIdC, skuIdD);
			
			System.out.println(" ********** Total Calculated Cost -----> " + total);
			
	}
	
}
