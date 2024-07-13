package OpenClosedPrinciple.QuizGeneratorApp.InitialState;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionBank {
    public static List<Question> generate(){
        return new ArrayList<>(Arrays.asList(
                new Question(
                        "What is the four pillars of OOP?",
                        "8",
                        null,
                        QuestionType.WHQuestion
                ),
                new Question(
                        "Which of the following are value types in C#?",
                        "6",
                        new ArrayList<>(Arrays.asList(
                                "  A: Integer",
                                "  B: Array",
                                "  C: String",
                                "  D: Long"   )),
                        QuestionType.MCQuestion
                ),
                new Question(
                        "Earth is Bigger than Sun?",
                        "4",
                        null,
                        QuestionType.TrueOrFalseQuestion
                )
        ));
    }
}
