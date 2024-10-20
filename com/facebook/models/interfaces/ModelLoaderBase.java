package com.facebook.models.interfaces;

import com.facebook.jni.HybridData;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: ModelLoaderBase.class */
public abstract class ModelLoaderBase {
    public final HybridData mHybridData;

    public ModelLoaderBase(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public abstract ListenableFuture load(String str);

    public abstract ListenableFuture load(String str, long j);

    public abstract ListenableFuture loadPersonalized(String str, Long l);

    public abstract boolean removePersonalized(String str, Long l);
}
