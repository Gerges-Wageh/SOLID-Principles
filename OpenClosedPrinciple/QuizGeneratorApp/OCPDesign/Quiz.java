package OpenClosedPrinciple.QuizGeneratorApp.OCPDesign;

import java.util.List;

public class Quiz {
    private final List<Question> questions;

    public Quiz(List<Question> questions) {
        this.questions = questions;
    }

    public void print(){
        for(Question question : questions){
            question.print();
        }
    }
}
