package com.facebook.webrtc.signaling;

import X.5V5;
import X.JDg;
import X.JDh;
import com.facebook.rsys.transport.gen.StatusUpdate;

/* loaded from: WebrtcSignalingMessageInterface.class */
public interface WebrtcSignalingMessageInterface {
    void onStatusUpdate(StatusUpdate statusUpdate);

    boolean sendMultiwaySignalingMessage(String str, String str2, byte[] bArr);

    boolean sendMultiwaySignalingMessage(byte[] bArr, JDg jDg, int i);

    boolean sendMultiwaySignalingMessageExt(byte[] bArr, JDg jDg, JDh jDh, int i);

    void setWebrtcInteractor(5V5 r1);

    boolean supportsMultiwaySignalingMessageExt();

    void triggerEarlyConnection(boolean z);
}
