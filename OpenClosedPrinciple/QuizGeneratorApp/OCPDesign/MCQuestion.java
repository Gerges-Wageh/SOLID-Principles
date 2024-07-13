package OpenClosedPrinciple.QuizGeneratorApp.OCPDesign;

import java.util.List;

public class MCQuestion extends Question{
    List<String> choices;

    public MCQuestion(String title, String mark, List<String> choices) {
        super(title, mark);
        this.choices = choices;
    }

    public List<String> getChoices() {
        return choices;
    }


    @Override
    public void print() {
        super.print();
        for (String choice : this.getChoices()){
            System.out.println(choice);
        }
        System.out.print("\n");
    }
}
