package com.facebook.rsys.turnallocation.msys.gen;

import X.C0il;
import X.GOo;
import X.HEP;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.RedactedString;
import com.facebook.rsys.turnallocation.gen.TurnAllocationProxy;

/* loaded from: TurnAllocationMsysProxy.class */
public abstract class TurnAllocationMsysProxy {

    /* loaded from: TurnAllocationMsysProxy$CProxy.class */
    public final class CProxy extends TurnAllocationMsysProxy {
        static {
            if (HEP.A00) {
                return;
            }
            GOo.A14();
            C0il.A0B("rsysturnallocationmsysjni");
            HEP.A00 = true;
        }

        public static native TurnAllocationProxy create(NetworkSession networkSession, RedactedString redactedString);

        public static native TurnAllocationMsysProxy createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
