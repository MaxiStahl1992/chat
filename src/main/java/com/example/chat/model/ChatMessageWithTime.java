package com.example.chat.model;

import com.example.chat.enums.MessageType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessageWithTime {
    private MessageType type;
    private String content;
    private String sender;
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime time = LocalTime.now();
    private String image;
}
