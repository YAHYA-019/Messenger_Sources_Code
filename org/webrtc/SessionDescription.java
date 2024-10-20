package org.webrtc;

/* loaded from: SessionDescription.class */
public class SessionDescription {
    public final String description;
    public final Type type;

    /* loaded from: SessionDescription$Type.class */
    public enum Type {
        OFFER,
        PRANSWER,
        ANSWER
    }

    public SessionDescription(Type type, String str) {
        this.type = type;
        this.description = str;
    }
}
