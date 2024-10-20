package com.facebook.jni.kotlin;

import X.11T;
import X.C0kM;
import com.facebook.jni.HybridData;
import kotlin.jvm.functions.Function1;

/* loaded from: NativeFunction1.class */
public final class NativeFunction1 extends C0kM implements Function1 {
    public final HybridData mHybridData;

    public NativeFunction1(HybridData hybridData) {
        11T.A0F(hybridData, 1);
        this.mHybridData = hybridData;
    }

    @Override // kotlin.jvm.functions.Function1
    public native Object invoke(Object obj);
}
