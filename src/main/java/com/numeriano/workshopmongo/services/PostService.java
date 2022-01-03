package com.numeriano.workshopmongo.services;

import com.numeriano.workshopmongo.domain.Post;
import com.numeriano.workshopmongo.domain.User;
import com.numeriano.workshopmongo.dto.UserDTO;
import com.numeriano.workshopmongo.repository.PostRepository;
import com.numeriano.workshopmongo.repository.UserRepository;
import com.numeriano.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id){
       Optional<Post> post = repository.findById(id);
       return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}