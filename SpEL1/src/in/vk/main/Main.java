package in.vk.main;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression =  parser.parseExpression(" 'hello Vineet' ");
		Object obj = expression.getValue();
		System.out.println(obj);
	}
}
