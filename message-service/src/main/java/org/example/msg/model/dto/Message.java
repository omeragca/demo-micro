package org.example.msg.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "message")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private String title;
    private String body;

}
