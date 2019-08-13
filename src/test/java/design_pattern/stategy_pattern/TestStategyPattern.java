package design_pattern.stategy_pattern;

import org.junit.Test;

public class TestStategyPattern {
	
	@Test
	public void test1() {
		//乘法
		Context context = new Context(new Divide());
		int calculate = context.calculate(10, 2);
		System.out.println(calculate);
		
		//加法
		Calculator calculator = new Plus();
		context.setCalculator(calculator);
		calculate = context.calculate(10, 2);
		System.out.println(calculate);
		
		//减法
		calculator = new Minus();
		context.setCalculator(calculator);
		calculate = context.calculate(10, 2);
		System.out.println(calculate);
	}

}
