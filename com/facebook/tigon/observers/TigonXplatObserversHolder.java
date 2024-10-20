package com.facebook.tigon.observers;

import X.2Eo;
import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: TigonXplatObserversHolder.class */
public abstract class TigonXplatObserversHolder {
    public static final 2Eo Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.2Eo] */
    static {
        C0il.A0B("tigonxplatobserversholder");
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public final native HybridData initHybrid();

    public final native void registerObserver(TigonObserver tigonObserver);
}
