package LiskovSubstitutionPrinciple.PostsApp.OCP_LSP_Design;

import LiskovSubstitutionPrinciple.PostsApp.OCP_LSP_Design.db.IDatabase;
import LiskovSubstitutionPrinciple.PostsApp.OCP_LSP_Design.db.MentionPostDatabase;
import LiskovSubstitutionPrinciple.PostsApp.OCP_LSP_Design.db.PostDatabase;
import LiskovSubstitutionPrinciple.PostsApp.OCP_LSP_Design.db.TagPostDatabase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Post postObj = new Post();
        IDatabase db;

        List<String> newPosts = new ArrayList<>();
        newPosts.add("original post");
        newPosts.add("#tag post");
        newPosts.add("@mention post");

        for(String post : newPosts){

            if(post.startsWith("#")){
                db = new TagPostDatabase();
            }else if (post.startsWith("@")){
                db = new MentionPostDatabase();
            }else {
                db = new PostDatabase();
            }

            String result = postObj.createPost(db, post);
            System.out.println(result);
        }
    }
}

// Now we got the expected behavior but with an extensible code which allows for adding new post types without modification