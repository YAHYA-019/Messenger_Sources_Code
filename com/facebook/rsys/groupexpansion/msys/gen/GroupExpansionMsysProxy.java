package com.facebook.rsys.groupexpansion.msys.gen;

import X.C0il;
import X.GOo;
import X.HEF;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mca.Mailbox;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy;

/* loaded from: GroupExpansionMsysProxy.class */
public abstract class GroupExpansionMsysProxy {

    /* loaded from: GroupExpansionMsysProxy$CProxy.class */
    public final class CProxy extends GroupExpansionMsysProxy {
        static {
            if (HEF.A00) {
                return;
            }
            GOo.A14();
            C0il.A0B("rsysgroupexpansionmsysjni");
            HEF.A00 = true;
        }

        public static native GroupExpansionProxy create(Mailbox mailbox);

        public static native GroupExpansionMsysProxy createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
