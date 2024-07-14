package LiskovSubstitutionPrinciple.PostsApp.InitialState;

public class TagPost extends Post{

    // Creating tag post and add it to the Db
    public String createTagPost(PostDatabase db, String post){
        return db.addTagPost(post);
    }
}
