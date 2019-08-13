package design_pattern.stategy_pattern;

import lombok.Setter;
/**
 * 
 * @author moushuai
 *
 *算法使用环境(Context)角色:算法被引用到这里和一些其它的与环境有关的操作一起来完成任务。
 */
public class Context {
	private @Setter Calculator calculator;
	
	
	public Context(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public int calculate(int a, int b) {
		return calculator.calculate(a, b);
	}
}
