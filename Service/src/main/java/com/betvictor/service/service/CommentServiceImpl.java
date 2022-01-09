package com.betvictor.service.service;

import com.betvictor.service.repository.CommentRepository;
import com.betvictor.service.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

  @Autowired
  CommentRepository orderRepository;

  @Override
  public Comment saveComment(Comment comment) {
    return orderRepository.save(comment);
  }
}
