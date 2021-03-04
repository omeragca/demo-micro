package org.example.msg.controller;

import org.example.msg.model.dto.Message;
import org.example.msg.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/msg")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public List<Message> getMessages(){
        return messageService.getMessages();
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void saveMessage(@RequestBody Message message){
        messageService.saveMessage(message);
    }

}
