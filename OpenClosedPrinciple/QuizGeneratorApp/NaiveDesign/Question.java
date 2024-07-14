package OpenClosedPrinciple.QuizGeneratorApp.InitialState;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String title;
    private String mark;
    private QuestionType questionType;
    private List<String> choices = new ArrayList<>();

    public Question(String title, String mark, List<String> choices, QuestionType questionType) {
        this.title = title;
        this.mark = mark;
        this.choices = choices;
        this.questionType = questionType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public List<String> getChoices() {
        return choices;
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }
}

enum QuestionType {
    WHQuestion,
    MCQuestion,
    TrueOrFalseQuestion
}