package com.facebook.rsys.calltransfer.gen;

import X.2JQ;
import X.N0A;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: CallTransferStore.class */
public abstract class CallTransferStore {
    public static 2JQ CONVERTER = N6e.A00(14);

    /* loaded from: CallTransferStore$CProxy.class */
    public final class CProxy extends CallTransferStore {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0A.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CallTransferStore createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.calltransfer.gen.CallTransferStore
        public native void cancelCallTransfer(String str);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallTransferStore)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.calltransfer.gen.CallTransferStore
        public native void setHandler(CallTransferStoreHandler callTransferStoreHandler);

        @Override // com.facebook.rsys.calltransfer.gen.CallTransferStore
        public native void startCallTransfer(long j, String str, ArrayList arrayList);

        @Override // com.facebook.rsys.calltransfer.gen.CallTransferStore
        public native void startObservers();

        @Override // com.facebook.rsys.calltransfer.gen.CallTransferStore
        public native void stopObservers();
    }

    public abstract void cancelCallTransfer(String str);

    public abstract void setHandler(CallTransferStoreHandler callTransferStoreHandler);

    public abstract void startCallTransfer(long j, String str, ArrayList arrayList);

    public abstract void startObservers();

    public abstract void stopObservers();
}
