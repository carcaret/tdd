package com.grupobbva.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TDDTest {

	@Test
	public void testEquality() {
		Assert.assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		Assert.assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		Assert.assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}

	@Test
	public void testMultiplication() {
		Money five = Money.dollar(5);
		Assert.assertEquals(Money.dollar(10), five.times(2));
		Assert.assertEquals(Money.dollar(15), five.times(3));
	}

	@Test
	public void testCurrency() {
		Assert.assertEquals("USD", Money.dollar(1).currency());
		Assert.assertEquals("CHF", Money.franc(1).currency());
	}

	@Test
	public void testSimpleAddition() {
		Money sum = Money.dollar(5).plus(Money.dollar(5));
		Assert.assertEquals(Money.dollar(10), sum);
	}

}