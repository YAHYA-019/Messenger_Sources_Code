package com.facebook.jni.kotlin;

import X.11T;
import X.C0kM;
import com.facebook.jni.HybridData;
import kotlin.jvm.functions.Function2;

/* loaded from: NativeFunction2.class */
public final class NativeFunction2 extends C0kM implements Function2 {
    public final HybridData mHybridData;

    public NativeFunction2(HybridData hybridData) {
        11T.A0F(hybridData, 1);
        this.mHybridData = hybridData;
    }

    @Override // kotlin.jvm.functions.Function2
    public native Object invoke(Object obj, Object obj2);
}
