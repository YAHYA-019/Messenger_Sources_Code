package com.facebook.webrtc.exceptions;

/* loaded from: CallIsNotValidException.class */
public class CallIsNotValidException extends RuntimeException {
    public static final String MESSAGE = "C++ ConferenceCall is not valid.";

    public CallIsNotValidException() {
        super(MESSAGE);
    }
}
