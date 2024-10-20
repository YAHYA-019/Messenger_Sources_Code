package com.facebook.rsys.heracryptocontextfactory.gen;

import X.Kac;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;

/* loaded from: CryptoContextHeraFactory.class */
public abstract class CryptoContextHeraFactory {

    /* loaded from: CryptoContextHeraFactory$CProxy.class */
    public final class CProxy extends CryptoContextHeraFactory {
        static {
            Kac.A00();
        }

        public static native CryptoContextHolder createContextHolder(long j, IdentityStoreProxyCallbacks identityStoreProxyCallbacks);

        public static native CryptoContextHeraFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
