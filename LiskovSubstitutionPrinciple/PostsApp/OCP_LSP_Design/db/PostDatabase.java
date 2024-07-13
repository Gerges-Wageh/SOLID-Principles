package LiskovSubstitutionPrinciple.PostsApp.OCP_LSP_Design.db;

public class PostDatabase implements IDatabase{
    @Override
    public String add(String post) {
        return "original post: " + post;
    }
}
