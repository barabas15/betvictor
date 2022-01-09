package com.betvictor.sender.messaging;

import com.betvictor.service.constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

  public void sendMessage(String comment) {
    jmsTemplate.convertAndSend(Constants.ORDER_DESTINATION_NAME, comment);
  }

  @Autowired JmsTemplate jmsTemplate;
}
