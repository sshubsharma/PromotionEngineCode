package com.promotionengine.execute;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyInt;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.promotionengine.promotion.PromotionCal;


@RunWith(MockitoJUnitRunner.class)
public class TestExecutePromotionEngine {

	@Mock
	private PromotionCal promotionCal;

	private ExecutePromotionEngine executePromotionEngine;

	@Before
	public void setup() {
		promotionCal = Mockito.mock(PromotionCal.class);

		executePromotionEngine = new ExecutePromotionEngine(promotionCal);

	}

	@Test
	public void testExecution1() {

		Mockito.when(promotionCal.calculateTotalCost(anyInt(), anyInt(), anyInt(), anyInt())).thenReturn(280);

		int total = executePromotionEngine.execute(3,5,1,1);

		assertThat(total).isEqualTo(280);

	}
	
	@Test
	public void testExecution2() {

		Mockito.when(promotionCal.calculateTotalCost(anyInt(), anyInt(), anyInt(), anyInt())).thenReturn(100);

		int total = executePromotionEngine.execute(1,1,1,0);

		assertThat(total).isEqualTo(100);

	}
	
	@Test
	public void testExecution3() {

		Mockito.when(promotionCal.calculateTotalCost(anyInt(), anyInt(), anyInt(), anyInt())).thenReturn(370);

		int total = executePromotionEngine.execute(5,5,1,0);

		assertThat(total).isEqualTo(370);

	}
	
	@Test
	public void testExecution4() {

		Mockito.when(promotionCal.calculateTotalCost(anyInt(), anyInt(), anyInt(), anyInt())).thenReturn(505);

		int total = executePromotionEngine.execute(5,6,5,4);

		assertThat(total).isEqualTo(505);

	}
	
	@Test
	public void testExecution5() {

		Mockito.when(promotionCal.calculateTotalCost(anyInt(), anyInt(), anyInt(), anyInt())).thenReturn(750);

		int total = executePromotionEngine.execute(5,5,3,5);

		assertThat(total).isEqualTo(470);

	}


}
