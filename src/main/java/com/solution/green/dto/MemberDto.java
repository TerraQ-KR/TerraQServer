package com.solution.green.dto;

import com.solution.green.entity.Member;
import lombok.*;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;


public class MemberDto {
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Login {
        @NotNull
        private String email;
        @NotNull
        private String password;
    }

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Request {
        @NotNull
        private String nickname;
        @NotNull
        private String email;
        @NotNull
        private String password;
    }

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Response {
        @NotNull
        private Long memberId;
        @NotNull
        private String nickname;
        @NotNull
        private String email;
        @NotNull
        private String password;
        @NotNull
        private Double reward;
        @Nullable
        private String imageUrl;
        @Setter
        @Nullable
        private String title;
        @Setter
        @Nullable
        private String mainBadge;
        @Setter
        @Nullable
        private Long progressQuests;
        @Setter
        @Nullable
        private Long successQuests;
        @Setter
        @Nullable
        private Long badgeCount;

        public static Response fromEntity(Member member) {
            return Response.builder()
                    .memberId(member.getId())
                    .nickname(member.getNickname())
                    .email(member.getEmail())
                    .password(member.getPassword())
                    .reward(member.getReward())
                    .imageUrl(member.getImage())
                    .build();
        }
    }
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class ToModel {
        @NotNull
        private Long memberId;
        @NotNull
        private String nickname;

        public static ToModel fromEntity(Member member) {
            return ToModel.builder()
                    .memberId(member.getId())
                    .nickname(member.getNickname())
                    .build();
        }
    }
}