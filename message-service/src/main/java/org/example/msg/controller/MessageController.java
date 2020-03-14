package org.example.msg.controller;

import org.example.msg.model.dto.Message;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/msg")
public class MessageController {

    @RequestMapping(value = "/{body}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Message getMessages(@PathVariable String body) {
        return Message.builder().title("").body(body).build();
    }

}
