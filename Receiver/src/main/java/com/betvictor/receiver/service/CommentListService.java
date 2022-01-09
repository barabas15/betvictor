package com.betvictor.receiver.service;

import com.betvictor.service.model.Comment;

import java.util.List;

public interface CommentListService {

  List<Comment> retrieveComments();
}
