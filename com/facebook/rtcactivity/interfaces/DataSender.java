package com.facebook.rtcactivity.interfaces;

import java.util.Collection;

/* loaded from: DataSender.class */
public interface DataSender {
    void sendDataMessageToPeers(String str, byte[] bArr);

    void sendDataMessageToPeers(String str, byte[] bArr, Collection collection);

    void sendDataMessageToPeersTransacted(String str, byte[] bArr);

    void sendDataMessageToPeersTransacted(String str, byte[] bArr, Collection collection);
}
