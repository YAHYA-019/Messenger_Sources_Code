package com.facebook.multifeed.ranking.core.value_model;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: ClientValueModelHolder.class */
public class ClientValueModelHolder {
    public final HybridData mHybridData;

    static {
        C0il.A0B("value_model_holder-jni");
    }

    public ClientValueModelHolder(String str, String str2) {
        this.mHybridData = initHybrid(str, "default");
    }

    public static native HybridData initHybrid(String str, String str2);

    private native double scoreNative(double[] dArr, double[] dArr2);

    private native double scoreNativeWithServerFeatures(double[] dArr, double[] dArr2, String str);

    private native double scoreNativeWithServerFeaturesDebug(double[] dArr, double[] dArr2, String str, String[] strArr);

    public native String[] getClientFeatures();

    public native String[] getRequiredEvents();

    public native String[] getRequiredFeatures();

    public double score(double[] dArr, double[] dArr2) {
        return scoreNative(dArr, dArr2);
    }
}
