package com.betvictor.service;

import com.betvictor.service.model.Comment;
import com.betvictor.service.repository.CommentRepository;
import com.betvictor.service.service.CommentServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BetvictorServiceTests {

  @Mock private CommentRepository commentRepository;
  @Autowired @InjectMocks private CommentServiceImpl commentService;

  @Test
  void test_save_occured() {
    Comment comment = new Comment("test");

    when(commentRepository.save(any())).thenReturn(comment);
    commentService.saveComment(comment);
    verify(commentRepository, times(1)).save(any());
  }
}
