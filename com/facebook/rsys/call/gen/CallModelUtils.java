package com.facebook.rsys.call.gen;

import X.HMj;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CallModelUtils.class */
public abstract class CallModelUtils {

    /* loaded from: CallModelUtils$CProxy.class */
    public final class CProxy extends CallModelUtils {
        static {
            HMj.A00();
        }

        public static native CallModelUtils createFromMcfType(McfReference mcfReference);

        public static native boolean doesAnyParticipantHaveVideo(CallModel callModel);

        public static native long nativeGetMcfTypeId();
    }
}
