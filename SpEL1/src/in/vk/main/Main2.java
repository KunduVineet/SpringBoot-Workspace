package in.vk.main;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Main2 {
	public static void main(String[] args) {

//		ExpressionParser parser = new SpelExpressionParser();
//		Expression expression =  parser.parseExpression(" 10+20 ");
//		Object obj = expression.getValue();
//		System.out.println(obj);

		ExpressionParser parser = new SpelExpressionParser();
		EvaluationContext context = new StandardEvaluationContext();
		context.setVariable("n1", 100);
		context.setVariable("n2", 150);
		Expression expression = parser.parseExpression(" #n1 + #n2 ");
		Object obj = expression.getValue(context);
		System.out.println(obj);
		
		
	}
}
