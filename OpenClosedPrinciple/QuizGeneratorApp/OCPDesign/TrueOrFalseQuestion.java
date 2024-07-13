package OpenClosedPrinciple.QuizGeneratorApp.OCPDesign;

public class TrueOrFalseQuestion extends Question{
    public TrueOrFalseQuestion(String title, String mark) {
        super(title, mark);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("  1. True");
        System.out.println("  2. False");
        System.out.print("\n");
    }
}
