package OpenClosedPrinciple.QuizGeneratorApp.OCPDesign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionBank {
    public static List<Question> generate(){
        return new ArrayList<>(Arrays.asList(
                new WHQuestion(
                        "What is the four pillars of OOP?",
                        "8"
                ),
                new MCQuestion(
                        "Which of the following are value types in C#?",
                        "6",
                        new ArrayList<>(Arrays.asList(
                                "  A: Integer",
                                "  B: Array",
                                "  C: String",
                                "  D: Long"   ))
                ),
                new TrueOrFalseQuestion(
                        "Earth is Bigger than Sun?",
                        "4"))
        );
    }
}
