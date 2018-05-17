import org.antlr.v4.runtime.*;

public class Calculator {

	public static int calculate(String expression) {
		CharStream cs = CharStreams.fromString(expression);
		CalcParser.ExpContext exp =
			new CalcParser(new CommonTokenStream(new CalcLexer(cs))).exp();

		int sum = Integer.parseInt(exp.NUM(0).getText());
		for (int i = 0; i < exp.OP().size(); i++) {
			int num = Integer.parseInt(exp.NUM(i + 1).getText());
			switch (exp.OP(i).getText()) {
			case "+":
				sum += num;
				break;
			case "-":
				sum -= num;
				break;
			}
		}
		return sum;
	}
}