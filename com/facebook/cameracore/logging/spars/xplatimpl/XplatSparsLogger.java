package com.facebook.cameracore.logging.spars.xplatimpl;

import X.11T;
import X.7zP;
import X.7zT;
import X.C0ft;
import X.C0il;
import X.EV7;
import X.GEO;
import com.facebook.jni.HybridData;

/* loaded from: XplatSparsLogger.class */
public final class XplatSparsLogger {
    public static final EV7 Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.EV7] */
    static {
        C0il.A0B("camera-xplat-spars-jni");
    }

    public XplatSparsLogger() {
    }

    public XplatSparsLogger(XplatRawEventLogger xplatRawEventLogger) {
        setRawEventLogger(xplatRawEventLogger);
    }

    public static final native boolean consistencyHelperHasError();

    public static final native int consistencyHelperNumProcessedSessions();

    public static final native void debugExpectSessionOpen(String str);

    public static final native void flushAndDestroyConsistencyHelper();

    public static final native void flushConsistencyHelper();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    public static final XplatSparsLogger makeInstance() {
        return new XplatSparsLogger();
    }

    public static final XplatSparsLogger makeInstance(GEO geo) {
        11T.A0F(geo, 0);
        return new XplatSparsLogger(new XplatRawEventLogger(geo));
    }

    public static final XplatSparsLogger makeInstance(XplatRawEventLogger xplatRawEventLogger) {
        return xplatRawEventLogger != null ? new XplatSparsLogger(xplatRawEventLogger) : new XplatSparsLogger();
    }

    public void logSessionClosure(String str, boolean z) {
        11T.A0F(str, 0);
        logSessionClosureNative(str, z);
    }

    public final native void logSessionClosureNative(String str, boolean z);

    public void logSessionCreation(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        7zT.A1S(str, str2, str3);
        7zP.A1L(str5, 4, str6);
        logSessionCreationNative(C0ft.A02(), str, str2, str3, str4, str5, z, str6);
    }

    public final native void logSessionCreationNative(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7);

    public final native void setRawEventLogger(XplatRawEventLogger xplatRawEventLogger);
}
