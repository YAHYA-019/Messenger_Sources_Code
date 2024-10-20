package com.facebook.tigon.observers;

import X.0Q8;
import com.facebook.jni.HybridData;

/* loaded from: TigonObserver.class */
public abstract class TigonObserver {
    public boolean disabled;
    public HybridData mHybridData;

    public TigonObserver() {
        throw 0Q8.createAndThrow();
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public abstract boolean getDisabled();

    public abstract HybridData getMHybridData();

    public abstract void setDisabled(boolean z);

    public abstract void setMHybridData(HybridData hybridData);
}
