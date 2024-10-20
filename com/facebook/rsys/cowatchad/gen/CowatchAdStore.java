package com.facebook.rsys.cowatchad.gen;

import X.2JQ;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CowatchAdStore.class */
public abstract class CowatchAdStore {
    public static 2JQ CONVERTER = N6e.A00(26);

    /* loaded from: CowatchAdStore$CProxy.class */
    public final class CProxy extends CowatchAdStore {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CowatchAdStore createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CowatchAdStore)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.cowatchad.gen.CowatchAdStore
        public native void retrieveAdBreak(String str, long j, long j2, CowatchAdStoreAdBreakCompletion cowatchAdStoreAdBreakCompletion);

        @Override // com.facebook.rsys.cowatchad.gen.CowatchAdStore
        public native void retrieveAdInsertionPoints(String str, CowatchAdStoreAdInsertionPointsCompletion cowatchAdStoreAdInsertionPointsCompletion);
    }

    public abstract void retrieveAdBreak(String str, long j, long j2, CowatchAdStoreAdBreakCompletion cowatchAdStoreAdBreakCompletion);

    public abstract void retrieveAdInsertionPoints(String str, CowatchAdStoreAdInsertionPointsCompletion cowatchAdStoreAdInsertionPointsCompletion);
}
