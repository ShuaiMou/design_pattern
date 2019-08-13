package design_pattern.stategy_pattern;

/**
 * 
 * @author moushuai
 *
 * 具体策略(Concrete Strategy)角色:实现了抽象策略角色定义的接口。
 */
public class Divide implements Calculator {

	public int calculate(int a, int b) {
		if (b == 0) {
			throw new RuntimeException("除数不能为0！");
		}else {
			return a/b;
		}	
	}
}
