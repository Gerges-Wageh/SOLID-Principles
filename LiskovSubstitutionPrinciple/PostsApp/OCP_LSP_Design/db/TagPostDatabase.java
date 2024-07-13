package LiskovSubstitutionPrinciple.PostsApp.OCP_LSP_Design.db;

public class TagPostDatabase implements IDatabase{
    @Override
    public String add(String post) {
        return "tag post: " + post;
    }
}
