package com.facebook.rtcactivity;

import X.0fH;
import X.1BK;
import X.AnonymousClass001;
import X.GzJ;
import X.JGV;
import X.S99;
import X.SBq;
import X.SDb;
import X.SDc;
import X.SEn;
import com.facebook.rtcactivity.common.RtcActivityFeatureSetNative;
import com.facebook.rtcactivity.common.RtcActivityStartCallbackNative;
import com.facebook.rtcactivity.common.RtcActivityStartCode;
import com.facebook.rtcactivity.common.RtcActivityStartResponseCallback;
import com.facebook.rtcactivity.common.RtcRequestedActivitySession;
import com.facebook.rtcactivity.interfaces.RtcActivityType;
import com.facebook.rtcactivity.interfaces.Version;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.SingletonImmutableSet;
import java.util.Map;

/* loaded from: RtcActivity.class */
public abstract class RtcActivity {
    public final String mActivityId;
    public final Map mActivityParams;
    public final String mInitiatorUserId;
    public JGV mListener;
    public RtcActivityStartCallbackNative mNativeCallback;

    public RtcActivity(String str, String str2, Map map) {
        this.mInitiatorUserId = str;
        this.mActivityId = str2;
        this.mActivityParams = map == null ? AnonymousClass001.A0u() : map;
    }

    public abstract void finish();

    public final String getActivityId() {
        return this.mActivityId;
    }

    public final Map getActivityParams() {
        return this.mActivityParams;
    }

    public final String getInitiatorUserId() {
        return this.mInitiatorUserId;
    }

    public Map getStartResponseParams() {
        return AnonymousClass001.A0u();
    }

    public abstract Iterable getSupportedFeatures();

    public final Iterable getSupportedFeaturesInternal() {
        return new SingletonImmutableSet("SessionWithMaster");
    }

    public abstract RtcActivityType getType();

    public String getTypeInternal() {
        return "effect";
    }

    public abstract Version getVersion();

    public final Version getVersionInternal() {
        return new Version(1, 0);
    }

    public abstract void initParticipants(ImmutableMap immutableMap);

    public void onAbortTimerFiredInternal(RtcRequestedActivitySession rtcRequestedActivitySession, RtcActivityStartResponseCallback rtcActivityStartResponseCallback) {
        1BK.A1E(((GzJ) this).A08).execute(new SDc(this, rtcActivityStartResponseCallback, rtcRequestedActivitySession));
    }

    public final void onActivityAbortedInternal() {
        1BK.A1E(((GzJ) this).A08).execute(new S99(this));
    }

    public abstract void onParticipantsChanged(ImmutableMap immutableMap);

    public final void onReceivedActivityDataMessageFromPeerInternal(String str, byte[] bArr) {
        0fH.A0d(str, bArr, "RtcActivity", "received data from peer %s : %s");
        1BK.A1E(((GzJ) this).A08).execute(new SBq(this, bArr));
    }

    public final void onReceivedStartResponseFromPeerInternal(String str, RtcActivityStartCode rtcActivityStartCode, RtcRequestedActivitySession rtcRequestedActivitySession, RtcActivityStartResponseCallback rtcActivityStartResponseCallback, String str2) {
        1BK.A1E(((GzJ) this).A08).execute(new SEn(this, rtcActivityStartCode, rtcActivityStartResponseCallback, rtcRequestedActivitySession, str, str2));
    }

    public final void startInternal(RtcActivityStartCallbackNative rtcActivityStartCallbackNative, RtcActivityFeatureSetNative rtcActivityFeatureSetNative) {
        this.mNativeCallback = rtcActivityStartCallbackNative;
        1BK.A1E(((GzJ) this).A08).execute(new SDb(this, rtcActivityFeatureSetNative, rtcActivityStartCallbackNative));
    }
}
