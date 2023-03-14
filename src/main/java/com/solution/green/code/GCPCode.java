package com.solution.green.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GCPCode {
    SERVICE_ACCOUNT_JSON_PATH("gcpBucketAccessKey.json"),
    // TODO - 이거 설정 안하면 com.google.api.client.googleapis.json.GoogleJsonResponseException: 401 Unauthorized POST https://storage.googleapis.com/upload/storage/ 에러 발생
    PROJECTED("gothic-imprint-378407"),
    ;
    private final String description;
}
