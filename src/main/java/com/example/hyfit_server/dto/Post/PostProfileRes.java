package com.example.hyfit_server.dto.Post;

import com.example.hyfit_server.dto.user.UserProfileDto;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

@NoArgsConstructor
@Data
public class PostProfileRes {
    private String email;

    private UserProfileDto userProfileDto;

    private long postNum;

    private long followingNum;

    private long followerNum;

    @Builder
    public PostProfileRes(String email, UserProfileDto userProfileDto, long postNum, long followingNum, long followerNum) {
        this.email = email;
        this.userProfileDto = userProfileDto;
        this.postNum = postNum;
        this.followingNum = followingNum;
        this.followerNum = followerNum;
    }
}
