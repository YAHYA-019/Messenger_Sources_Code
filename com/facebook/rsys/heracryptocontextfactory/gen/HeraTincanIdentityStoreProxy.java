package com.facebook.rsys.heracryptocontextfactory.gen;

import X.2JQ;
import X.Kac;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mca.Mailbox;
import com.facebook.simplejni.NativeHolder;

/* loaded from: HeraTincanIdentityStoreProxy.class */
public abstract class HeraTincanIdentityStoreProxy {
    public static 2JQ CONVERTER = LVi.A00(15);

    /* loaded from: HeraTincanIdentityStoreProxy$CProxy.class */
    public final class CProxy extends HeraTincanIdentityStoreProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            Kac.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native HeraTincanIdentityStoreProxy createFromMcfType(McfReference mcfReference);

        public static native HeraTincanIdentityStoreProxy createProxy(long j, Mailbox mailbox);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof HeraTincanIdentityStoreProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.heracryptocontextfactory.gen.HeraTincanIdentityStoreProxy
        public native int getLocalDeviceId();

        @Override // com.facebook.rsys.heracryptocontextfactory.gen.HeraTincanIdentityStoreProxy
        public native IdentityKey getLocalIdentityKeyPair();

        @Override // com.facebook.rsys.heracryptocontextfactory.gen.HeraTincanIdentityStoreProxy
        public native PublicKeyHolder getRemotePublicIdentityKey(long j, int i);

        public native int hashCode();

        @Override // com.facebook.rsys.heracryptocontextfactory.gen.HeraTincanIdentityStoreProxy
        public native int saveRemotePublicIdentityKey(long j, int i, PublicKeyHolder publicKeyHolder);
    }

    public abstract int getLocalDeviceId();

    public abstract IdentityKey getLocalIdentityKeyPair();

    public abstract PublicKeyHolder getRemotePublicIdentityKey(long j, int i);

    public abstract int saveRemotePublicIdentityKey(long j, int i, PublicKeyHolder publicKeyHolder);
}
