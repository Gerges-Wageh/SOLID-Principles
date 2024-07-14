package OpenClosedPrinciple.QuizGeneratorApp.InitialState;

import java.util.List;

public class Quiz {
    private final List<Question> questions;

    public Quiz(List<Question> questions) {
        this.questions = questions;
    }

    public void print(){
        for (Question question : questions){
            System.out.printf("%s  [%s]\n", question.getTitle(), question.getMark());
            switch (question.getQuestionType()){
                case WHQuestion -> {
                    System.out.println("-------------------------------------");
                    System.out.println("-------------------------------------");
                    System.out.println("-------------------------------------");
                }
                case QuestionType.TrueOrFalseQuestion -> {
                    System.out.println("  1. True");
                    System.out.println("  2. False");
                }
                case QuestionType.MCQuestion -> {
                    for (String choice : question.getChoices()){
                        System.out.println(choice);
                    }
                }
            }
            System.out.printf("\n");
        }
    }
}
