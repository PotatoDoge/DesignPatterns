package behavioral.interpreter;

public class Example {
    public static void main(String[] args) {
        Expression isMale = new TerminalExpression("John");
        Expression isMarried = new TerminalExpression("Married");
        Expression isSingle = new TerminalExpression("Single");

        Expression isMaleAndMarried = new OrExpression(isMale, isMarried);
        Expression isMaleOrSingle = new OrExpression(isMale, isSingle);

        System.out.println("John is male or married: " + isMaleAndMarried.interpret("John"));
        System.out.println("John is male or single: " + isMaleOrSingle.interpret("John"));
        System.out.println("John is male or single: " + isMaleOrSingle.interpret("Single"));
    }
}
