package LiskovSubstitutionPrinciple.PostsApp.OCP_LSP_Design.db;

public class MentionPostDatabase implements IDatabase{
    @Override
    public String add(String post) {
        return "mention post: " + post;
    }
}
