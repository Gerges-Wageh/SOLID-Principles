package OpenClosedPrinciple.QuizGeneratorApp.OCPDesign;

public class Main {
    public static void main(String[] args) {

        Quiz quiz = new Quiz(QuestionBank.generate());
        quiz.print();
    }
}

// We got the same results with our new design
// Now think about adding new type of questions (i.e. Matching question)
// All you need is to create the MatchingQuestion class that extends the Question class
// Override the print() method .. and that's it.