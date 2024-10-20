package com.facebook.rsys.calltransfer.msysstore.gen;

import X.AbstractC2326GOr;
import X.C0il;
import X.HE2;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mca.Mailbox;
import com.facebook.rsys.calltransfer.gen.CallTransferStore;

/* loaded from: CallTransferMsysStore.class */
public abstract class CallTransferMsysStore {

    /* loaded from: CallTransferMsysStore$CProxy.class */
    public final class CProxy extends CallTransferMsysStore {
        static {
            if (HE2.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsyscalltransfermsysstorejniStaging" : "rsyscalltransfermsysstorejniLatest");
            HE2.A00 = true;
        }

        public static native CallTransferStore create(Mailbox mailbox);

        public static native CallTransferMsysStore createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
