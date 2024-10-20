package com.facebook.rsys.cowatchad.msysstore.gen;

import X.AbstractC2326GOr;
import X.C0il;
import X.HE5;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mca.Mailbox;
import com.facebook.rsys.cowatchad.gen.CowatchAdStore;

/* loaded from: CowatchAdMsysStore.class */
public abstract class CowatchAdMsysStore {

    /* loaded from: CowatchAdMsysStore$CProxy.class */
    public final class CProxy extends CowatchAdMsysStore {
        static {
            if (HE5.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsyscowatchadmsysstorejniStaging" : "rsyscowatchadmsysstorejniLatest");
            HE5.A00 = true;
        }

        public static native CowatchAdStore create(Mailbox mailbox);

        public static native CowatchAdMsysStore createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
