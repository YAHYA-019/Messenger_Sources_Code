package com.facebook.graphqlrealtimeservice.interfaces;

/* loaded from: StreamStatus.class */
public class StreamStatus {
    public final String mCode;
    public final String mType;

    public StreamStatus(String str, String str2) {
        this.mCode = str;
        this.mType = str2;
    }

    public static StreamStatus init(String str, String str2) {
        return new StreamStatus(str, str2);
    }
}
