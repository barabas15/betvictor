package com.betvictor.receiver.messaging;

import com.betvictor.service.constants.Constants;
import com.betvictor.service.model.Comment;
import com.betvictor.service.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

  @Autowired CommentService commentService;

  @JmsListener(destination = Constants.ORDER_DESTINATION_NAME)
  public void receiveMessage(String comment) {
    commentService.saveComment(new Comment(comment));
  }
}
