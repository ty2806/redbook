package com.chuwa.redbook.controller;

import com.chuwa.redbook.payload.PostDto;
import com.chuwa.redbook.service.PostService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PostGraphQLController {
    private PostService postService;

    public PostGraphQLController(PostService postService) {
        this.postService = postService;
    }

    @MutationMapping
    public PostDto createPost(@Argument String title, @Argument String description, @Argument String content) {
        PostDto postDto = new PostDto();

        postDto.setTitle(title);
        postDto.setDescription(description);
        postDto.setContent(content);

        return this.postService.createPost(postDto);
    }
}
