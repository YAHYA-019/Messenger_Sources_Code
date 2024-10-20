package com.facebook.webrtc.turnallocation;

/* loaded from: TurnAllocationCallback.class */
public interface TurnAllocationCallback {
    void turnAllocationFailure();

    void turnAllocationSuccess(String str);
}
