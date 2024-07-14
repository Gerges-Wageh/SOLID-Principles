package LiskovSubstitutionPrinciple.PostsApp.InitialState;

public class Post {

    // Creating original post and add it to the DB
    public String createPost(PostDatabase db, String post){
        return db.addPost(post);
    }

}


