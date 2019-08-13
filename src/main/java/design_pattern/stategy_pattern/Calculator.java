package design_pattern.stategy_pattern;

/**
 * 
 * @author moushuai
 * 
 * 抽象策略(Strategy)角色:规定了所有具体策略角色所需的接口。在 java 它通常由接口或者抽象类来实现。
 * 
 * @param <T>
 */
public interface Calculator {
	public int calculate(int a, int b);
}
