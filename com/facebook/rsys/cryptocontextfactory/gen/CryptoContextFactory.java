package com.facebook.rsys.cryptocontextfactory.gen;

import X.C0il;
import X.GOo;
import X.HE6;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;

/* loaded from: CryptoContextFactory.class */
public abstract class CryptoContextFactory {

    /* loaded from: CryptoContextFactory$CProxy.class */
    public final class CProxy extends CryptoContextFactory {
        static {
            if (HE6.A00) {
                return;
            }
            GOo.A14();
            C0il.A0B("rsyscryptocontextfactoryjni");
            HE6.A00 = true;
        }

        public static native CryptoContextHolder createContextHolder(long j, Mailbox mailbox);

        public static native CryptoContextHolder createContextHolderWithAccountSession(long j, AccountSession accountSession);

        public static native CryptoContextFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
