package com.example.creatorboard.user.dto.response;

import com.example.creatorboard.content.Content;
import lombok.Getter;

@Getter
public class ContentResponse {
    private Long id;
    private String title;
    private Integer price;
    private boolean isFree;
}
