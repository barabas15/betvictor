package com.betvictor.sender.controllers;

import com.betvictor.receiver.service.CommentListService;
import com.betvictor.sender.messaging.MessageSender;
import com.betvictor.service.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

  @Controller
public class SenderController {

  @Autowired
  MessageSender messageSender;
  @Autowired
  CommentListService commentListService;

  @GetMapping("/view")
  public String myView(Model model) {
    model.addAttribute("comment", new Comment());
    model.addAttribute("comments", commentListService.retrieveComments());
    return "view-page";
  }

  @PostMapping("/view")
  public String greetingSubmit(@ModelAttribute Comment comment, Model model) {
    messageSender.sendMessage(comment.getText());
    model.addAttribute("comments", commentListService.retrieveComments());
    return "view-page";
  }
}
