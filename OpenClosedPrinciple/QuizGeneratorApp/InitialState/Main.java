package OpenClosedPrinciple.QuizGeneratorApp.InitialState;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz(QuestionBank.generate());
        quiz.print();
    }
}

// Think about if we were asked to add new question type (i.e. Matching Question)
// We need to modify in 2 places:
// First we need to modify the enum "QuestionType" to add the new type
// Second we modify Quiz::print() to handle the new question printing
// This violates the OCP and leads to fragile, messy code!


