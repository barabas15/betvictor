package com.betvictor.service;

import com.betvictor.service.model.Comment;
import com.betvictor.service.repository.CommentRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BetvictorRepoTests {

  @Autowired CommentRepository commentRepository;
  private Comment comment;

  @BeforeEach
  void setUp() {
    comment = new Comment("test");
  }

  @AfterEach
  void delete() {
    commentRepository.deleteAll();
    comment = null;
  }

  @Test
  void test_save() {
    commentRepository.save(comment);
    Comment fetched = commentRepository.findAll().get(0);

    assertEquals("test", fetched.getText());
  }

  @Test
  void test_retrieve() {
    Comment commentTest = new Comment("test2");
    commentRepository.save(commentTest);
    commentRepository.save(comment);

    assertEquals(commentRepository.findAll().get(0).getText(), "test2");
    assertEquals(commentRepository.findAll().get(1).getText(), "test");
  }
}
