package com.chuwa.redbook.service.Impl;

import com.chuwa.redbook.dao.AuthorRepository;
import com.chuwa.redbook.entity.Author;
import com.chuwa.redbook.payload.AuthorDto;
import com.chuwa.redbook.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public AuthorDto createAuthor(AuthorDto authorDto) {

        Author authorEntityToBeSaved = new Author();
        authorEntityToBeSaved.setName(authorDto.getName());
        authorEntityToBeSaved.setPostId(authorDto.getPostId());
        authorEntityToBeSaved.setUserId(authorDto.getUserId());


        Author authorSaved = this.authorRepository.save(authorEntityToBeSaved);

        AuthorDto response = new AuthorDto();
        response.setId(authorSaved.getId());
        response.setName(authorSaved.getName());
        response.setPostId(authorSaved.getPostId());
        response.setUserId(authorSaved.getUserId());

        return response;
    }
}
