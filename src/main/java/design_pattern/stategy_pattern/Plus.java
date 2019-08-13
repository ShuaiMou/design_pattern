package design_pattern.stategy_pattern;

/**
 * 
 * @author moushuai
 *
 *具体策略(Concrete Strategy)角色
 */
public class Plus implements Calculator{

	public int calculate(int a, int b) {
		return a + b;
	}

}
