import org.antlr.v4.runtime.*;

public class Hello {
	public static String parseGreeting(String input) {
		CharStream cs = CharStreams.fromString(input);
		
		HelloParser.RContext r =
			new HelloParser(
				new CommonTokenStream(
					new HelloLexer(cs))).r();
		
		return r.ID().getText();
	}
}