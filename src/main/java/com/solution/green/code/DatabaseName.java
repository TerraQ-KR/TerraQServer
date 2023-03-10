package com.solution.green.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DatabaseName {
    USERS("users"),
    RETIRED("퇴직"),
    URL_PREFIX("https://storage.googleapis.com/eco-reward-bucket/"),

    ;
    private final String description;
}
