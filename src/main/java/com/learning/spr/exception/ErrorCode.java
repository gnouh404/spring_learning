package com.learning.spr.exception;

public enum ErrorCode {

    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized exception"),
    INVALID_KEY(1001, "Invalid key"),
    USER_EXISTED(1002, "Username already exists"),
    USERNAME_INVALID(1003, "Username must be at least 5 characters"),
    INVALID_PASSWORD(1004, "Password must be at least 8 characters and less or equal than 20"),
    USER_NOT_EXISTED(1005,  "User does not exist"),
    UNAUTHENTICATED(1006,  "Unauthenticated"),
    INVAlID_TOKEN(1007,  "Invalid token"),
    ;

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
