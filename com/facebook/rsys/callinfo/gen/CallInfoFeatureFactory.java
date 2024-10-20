package com.facebook.rsys.callinfo.gen;

import X.HMk;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: CallInfoFeatureFactory.class */
public abstract class CallInfoFeatureFactory {

    /* loaded from: CallInfoFeatureFactory$CProxy.class */
    public final class CProxy extends CallInfoFeatureFactory {
        static {
            HMk.A00();
        }

        public static native FeatureHolder create(CallInfoStore callInfoStore);

        public static native CallInfoFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
