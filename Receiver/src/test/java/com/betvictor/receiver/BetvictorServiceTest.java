package com.betvictor.receiver;

import com.betvictor.receiver.service.CommentListServiceImpl;
import com.betvictor.service.model.Comment;
import com.betvictor.service.repository.CommentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BetvictorServiceTest {

  @Mock private CommentRepository commentRepository;
  @Autowired @InjectMocks private CommentListServiceImpl commentListService;

  @Test
  public void test_retrieve_occured() {
    List<Comment> commentList = new ArrayList<>();
    commentList.add(new Comment("test"));
    commentList.add(new Comment("test2"));

    when(commentRepository.findAll()).thenReturn(commentList);
    List<Comment> commentList1 = commentListService.retrieveComments();
    Assertions.assertEquals(commentList, commentList1);
    verify(commentRepository, times(1)).findAll();
  }
}
