package com.chuwa.redbook.controller;

import com.chuwa.redbook.payload.AuthorDto;
import com.chuwa.redbook.service.AuthorService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorGraphQLController {

    private AuthorService authorService;

    public AuthorGraphQLController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @MutationMapping
    public AuthorDto createAuthor(@Argument String name, @Argument Long postId, @Argument Long userId) {
        AuthorDto authorDto = new AuthorDto();

        authorDto.setName(name);
        authorDto.setPostId(postId);
        authorDto.setUserId(userId);

        return this.authorService.createAuthor(authorDto);
    }
}
