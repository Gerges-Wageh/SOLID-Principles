package LiskovSubstitutionPrinciple.PostsApp.InitialState;

public class MentionPost extends Post{

    // Creating mention post and add it to the DB
    public String createMentionPost(PostDatabase db, String post){
        return db.addMentionPost(post);
    }
}
