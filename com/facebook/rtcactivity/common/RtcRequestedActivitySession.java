package com.facebook.rtcactivity.common;

import X.C0il;
import com.facebook.jni.HybridData;
import java.util.Set;

/* loaded from: RtcRequestedActivitySession.class */
public class RtcRequestedActivitySession {
    public final HybridData mHybridData;

    static {
        C0il.A0B("rtcactivity");
    }

    public RtcRequestedActivitySession(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native Set getAcceptedPeers();

    public native Set getDeclinedPeers();

    public native Set getPeers();

    public native StartResponseDetails getStartResponseDetails(String str);

    public native Set getWaitingForPeers();
}
