package com.facebook.cameracore.logging.spars.xplatimpl;

import X.11T;
import X.C0il;
import X.EV6;
import X.GEO;
import com.facebook.jni.HybridData;

/* loaded from: XplatRawEventLogger.class */
public final class XplatRawEventLogger {
    public static final EV6 Companion = new Object();
    public final GEO logWriter;
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.EV6, java.lang.Object] */
    static {
        C0il.A0B("camera-xplat-spars-jni");
    }

    public XplatRawEventLogger(GEO geo) {
        11T.A0F(geo, 1);
        this.logWriter = geo;
        this.mHybridData = initHybrid();
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    public final void logEvent(String str, String str2) {
        this.logWriter.logEvent(str, str2);
    }
}
