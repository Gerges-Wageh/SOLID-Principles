package OpenClosedPrinciple.QuizGeneratorApp.OCPDesign;

public class WHQuestion extends Question{

    public WHQuestion(String title, String mark) {
        super(title, mark);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.print("\n");
    }
}
