package com.facebook.privacy.zone.upf.nocton;

import X.11T;
import X.C0il;
import X.KXD;
import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: AndroidPurposePolicyFlowsToEvaluator.class */
public final class AndroidPurposePolicyFlowsToEvaluator {
    public static final KXD Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.KXD] */
    static {
        C0il.A0B("mobile_purpose_policy");
    }

    public AndroidPurposePolicyFlowsToEvaluator() {
        this(initHybrid0());
    }

    public AndroidPurposePolicyFlowsToEvaluator(HybridData hybridData) {
        11T.A0F(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native int flowsTo(String str, String str2, Map map);

    public static final native HybridData initHybrid0();
}
