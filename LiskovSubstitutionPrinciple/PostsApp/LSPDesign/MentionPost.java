package LiskovSubstitutionPrinciple.PostsApp.LSPDesign;

public class MentionPost extends Post{
    @Override
    public String createPost(PostDatabase db, String post) {
        return db.addMentionPost(post);
    }
}
