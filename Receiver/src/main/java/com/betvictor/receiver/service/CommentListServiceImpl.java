package com.betvictor.receiver.service;

import com.betvictor.service.model.Comment;
import com.betvictor.service.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentListServiceImpl implements CommentListService {

  @Autowired CommentRepository orderRepository;

  @Override
  public List<Comment> retrieveComments() {
    return orderRepository.findAll();
  }
}
