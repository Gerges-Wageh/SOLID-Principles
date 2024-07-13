package LiskovSubstitutionPrinciple.PostsApp.OCP_LSP_Design;

import LiskovSubstitutionPrinciple.PostsApp.OCP_LSP_Design.db.IDatabase;

public class Post {
    public String createPost(IDatabase db, String post){
        return db.add(post);
    }
}
