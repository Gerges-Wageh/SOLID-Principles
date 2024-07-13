package OpenClosedPrinciple.QuizGeneratorApp.OCPDesign;

public class Question {
    private String title;
    private String mark;

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

    public Question(String title, String mark) {
        this.title = title;
        this.mark = mark;
    }

    // Decouple from the Quiz::print()
    // by making it just a trigger and each question type should know how to print itself

    public void print(){
        System.out.printf("%s  [%s]\n", this.getTitle(), this.getMark());
    };
}
