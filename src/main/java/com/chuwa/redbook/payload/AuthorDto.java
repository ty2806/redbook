package com.chuwa.redbook.payload;

public class AuthorDto {

    private Long id;
    private String name;
    private Long postId;
    private Long userId;

    public AuthorDto() {}

    public AuthorDto(Long id, String name, Long postId, Long userId) {
        this.id = id;
        this.name = name;
        this.postId = postId;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
