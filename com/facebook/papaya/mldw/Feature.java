package com.facebook.papaya.mldw;

import X.C0il;
import com.facebook.jni.HybridData;
import com.google.common.collect.ImmutableList;

/* loaded from: Feature.class */
public class Feature {
    public final HybridData mHybridData;

    static {
        C0il.A0B("papaya-mldw");
    }

    public Feature(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native ImmutableList nativeGetColumnNames();

    private native int nativeGetColumns();

    private native long nativeGetFeatureId();

    private native ImmutableList nativeGetRow(int i);

    private native ImmutableList nativeGetRows(ImmutableList immutableList);

    private native int nativeGetRowsNumber();

    private native void nativeToKeyValuePair(int i);

    public ImmutableList getRow(int i) {
        return nativeGetRow(i);
    }

    public int getRows() {
        return nativeGetRowsNumber();
    }
}
