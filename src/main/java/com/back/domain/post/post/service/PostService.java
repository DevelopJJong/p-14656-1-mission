package com.back.domain.post.post.service;

import com.back.domain.post.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PostService {
    private PostRepository postRepository;

    public long count() {
        return postRepository.count();
    }
}