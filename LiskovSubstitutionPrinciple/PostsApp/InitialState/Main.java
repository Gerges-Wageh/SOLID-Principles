package LiskovSubstitutionPrinciple.PostsApp.InitialState;

import java.util.ArrayList;
import java.util.List;

// Client code
public class Main {
    public static void main(String[] args) {

        PostDatabase db = new PostDatabase();

        List<String> newPosts = new ArrayList<>();
        newPosts.add("original post");
        newPosts.add("#tag post");
        newPosts.add("@mention post");

        Post postObj;

        for(String post : newPosts){

            if(post.startsWith("#")){
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


// As you can see we don't get the expected behavior as we violate the LSP
// We want the create method to be more smart and works polymorphically
// When postObj assigns an object of type TagPost for example, we want the createPost() to create a tag post not an original post
// Let's see how this could be possible if we imply the LSP