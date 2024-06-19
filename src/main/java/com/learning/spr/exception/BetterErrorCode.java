//package com.learning.spr.exception;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public enum BetterErrorCode {
//
//    UNCATEGORIZED_EXCEPTION("Uncategorized exception"),
//    USER_EXISTED("Username already exists"),
//    USERNAME_INVALID("Username must be at least 5 characters"),
//    INVALID_PASSWORD("Invalid password"),;
//
//    private static final Map<String, BetterErrorCode> map = new HashMap<>();
//    final String message;
//
//
//    BetterErrorCode(String message) {
//        this.message = message;
//    }
//
//    static {
//        for (BetterErrorCode errorCode : BetterErrorCode.values()) {
//            map.put(errorCode.message, errorCode);
//        }
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
////    public BetterErrorCode valueOf(String messages) {
////        return map.get(message);
////    }
//}
