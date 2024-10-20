package com.facebook.rsys.calltransfer.gen;

import X.N0A;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: CallTransferFeatureFactory.class */
public abstract class CallTransferFeatureFactory {

    /* loaded from: CallTransferFeatureFactory$CProxy.class */
    public final class CProxy extends CallTransferFeatureFactory {
        static {
            N0A.A00();
        }

        public static native FeatureHolder create(CallTransferStore callTransferStore);

        public static native CallTransferFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
