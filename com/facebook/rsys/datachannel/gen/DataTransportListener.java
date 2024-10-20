package com.facebook.rsys.datachannel.gen;

/* loaded from: DataTransportListener.class */
public abstract class DataTransportListener {
    public abstract void onMessage(byte[] bArr, String str, Long l);

    public abstract void onReady();
}
