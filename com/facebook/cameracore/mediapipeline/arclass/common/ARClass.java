package com.facebook.cameracore.mediapipeline.arclass.common;

import X.C0il;
import X.HGg;
import com.facebook.jni.HybridData;

/* loaded from: ARClass.class */
public final class ARClass {
    public static final HGg Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.HGg] */
    static {
        C0il.A0B("arclass");
    }

    public ARClass(int i) {
        this.mHybridData = initHybrid(i);
    }

    public ARClass(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid(int i);

    public final native int getValue();
}
