package com.example.creatorboard.user.dto.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)

public class UserProfileResponse {

    private Long creatorId;
    private String email;
    private String nickname;
    private String profileImageUrl;
    private String role;
    private String referralCode;
}
