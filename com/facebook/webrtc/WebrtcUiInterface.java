package com.facebook.webrtc;

import X.5V4;

/* loaded from: WebrtcUiInterface.class */
public interface WebrtcUiInterface {
    void handleError(int i);

    void onDataReceived(long j, String str, byte[] bArr);

    void onVideoEscalationSuccess();

    void onVoiceActivityStarted();

    void setWebrtcManager(5V4 r1);

    void updateStatesAndCallDuration();
}
