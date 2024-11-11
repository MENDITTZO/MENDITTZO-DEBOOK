package com.mendittzo.chat.command.domain.aggregate;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.time.LocalDateTime;

@RedisHash("Chat")
@NoArgsConstructor
@Getter
public class Chat {

    @Id
    private String chatId;

    private String chatContent;

    private LocalDateTime createDatetime;

    private Long userId;

    private Long chatroomId;

    @Builder
    public Chat(String chatId, String chatContent, LocalDateTime createDatetime, Long userId, Long chatroomId) {
        this.chatId = chatId;
        this.chatContent = chatContent;
        this.createDatetime = createDatetime;
        this.userId = userId;
        this.chatroomId = chatroomId;
    }
}
