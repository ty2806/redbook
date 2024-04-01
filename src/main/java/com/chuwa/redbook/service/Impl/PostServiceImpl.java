package com.chuwa.redbook.service.Impl;

import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.payload.PostDto;
import com.chuwa.redbook.service.PostService;
import com.chuwa.redbook.dao.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public PostDto createPost(PostDto postDto) {

        Post postEntityToBeSaved = new Post();
        postEntityToBeSaved.setTitle(postDto.getTitle());
        postEntityToBeSaved.setDescription(postDto.getDescription());
        postEntityToBeSaved.setContent(postDto.getContent());

        Post postSaved = this.postRepository.save(postEntityToBeSaved);

        PostDto response = new PostDto();
        response.setId(postSaved.getId());
        response.setTitle(postSaved.getTitle());
        response.setDescription(postSaved.getDescription());
        response.setContent(postSaved.getContent());

        return response;
    }
}
