package com.facebook.rtcactivity.common;

import X.C0il;
import com.facebook.jni.HybridData;
import java.util.Set;

/* loaded from: SessionWithMasterNative.class */
public class SessionWithMasterNative implements SessionWithMaster {
    public final HybridData mHybridData;

    static {
        C0il.A0B("rtcactivity");
    }

    public SessionWithMasterNative(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.rtcactivity.common.SessionWithMaster
    public native String getMasterUserId();

    @Override // com.facebook.rtcactivity.common.SessionWithMaster
    public native Set getParticipants();
}
