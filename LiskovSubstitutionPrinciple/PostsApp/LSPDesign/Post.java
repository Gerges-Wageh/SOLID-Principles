package LiskovSubstitutionPrinciple.PostsApp.LSPDesign;

public class Post {

    public String createPost(PostDatabase db, String post){
        return db.addPost(post);
    }

}
