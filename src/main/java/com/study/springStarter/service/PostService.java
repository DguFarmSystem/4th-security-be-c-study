package com.study.springStarter.service;

import com.study.springStarter.entity.Post;
import com.study.springStarter.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post create(Post post) {
        return postRepository.save(post);
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Post findById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public Post update(Long id, Post updatePost) {
        Post post = findById(id);
        if (post != null) {
            post.setTitle(updatePost.getTitle());
            post.setContent(updatePost.getContent());
            return postRepository.save(post);
        }
        return null;
    }

    public void delete(Long id) {
        postRepository.deleteById(id);
    }
}
