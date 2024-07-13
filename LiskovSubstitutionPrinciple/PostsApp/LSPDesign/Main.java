package LiskovSubstitutionPrinciple.PostsApp.LSPDesign;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PostDatabase db = new PostDatabase();
        List<String> newPosts = new ArrayList<>();
        newPosts.add("original post");
        newPosts.add("#tag post");
        newPosts.add("@mention post");

        Post postObj;

        for (String post : newPosts){

            if (post.startsWith("#")){
                postObj = new TagPost();
            } else if (post.startsWith("@")) {
                postObj = new MentionPost();
            }else {
                postObj = new Post();
            }

            String result = postObj.createPost(db, post);
            System.out.println(result);
        }
    }
}

// Now we got the expected behavior as we applied the LSP