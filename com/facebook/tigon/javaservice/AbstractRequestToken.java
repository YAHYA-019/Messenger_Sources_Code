package com.facebook.tigon.javaservice;

import X.0Q8;
import com.facebook.jni.HybridData;

/* loaded from: AbstractRequestToken.class */
public abstract class AbstractRequestToken {
    public final HybridData mHybridData;

    public AbstractRequestToken(HybridData hybridData) {
        throw 0Q8.createAndThrow();
    }

    public abstract void cancel();

    public abstract void changeHttpPriority(byte b, boolean z);
}
