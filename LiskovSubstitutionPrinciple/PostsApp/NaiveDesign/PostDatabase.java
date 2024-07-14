package LiskovSubstitutionPrinciple.PostsApp.InitialState;

public class PostDatabase {

    // Adding original post to the DB
    public String addPost(String post){
        return "Original post: " + post;
    }

    // Adding tag post to the DB
    public String addTagPost(String post){
        return "Tag post: " + post;
    }

    // Adding mention post to the DB
    public String addMentionPost(String post){
        return "Mention post: " + post;
    }

}
