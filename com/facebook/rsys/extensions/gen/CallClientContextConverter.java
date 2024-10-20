package com.facebook.rsys.extensions.gen;

import X.AbstractC2326GOr;
import X.C0il;
import X.HED;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CallClientContextConverter.class */
public abstract class CallClientContextConverter {

    /* loaded from: CallClientContextConverter$CProxy.class */
    public final class CProxy extends CallClientContextConverter {
        static {
            if (HED.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsysextensionscallclientcontextjniStaging" : "rsysextensionscallclientcontextjniLatest");
            HED.A00 = true;
        }

        public static native McfReference convertToMcfReference(CallClientContext callClientContext);

        public static native CallClientContextConverter createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
