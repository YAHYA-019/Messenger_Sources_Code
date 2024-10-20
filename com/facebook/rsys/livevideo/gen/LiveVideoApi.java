package com.facebook.rsys.livevideo.gen;

import X.2JQ;
import X.HN4;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: LiveVideoApi.class */
public abstract class LiveVideoApi {
    public static 2JQ CONVERTER = new LVi(19);

    /* loaded from: LiveVideoApi$CProxy.class */
    public final class CProxy extends LiveVideoApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HN4.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native LiveVideoApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoApi
        public native void acknowledgeLiveStream();

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoApi
        public native void cancelCreatedNotStartedBroadcast();

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoApi
        public native void createBroadcast(int i, int i2, String str, ArrayList arrayList, String str2, boolean z, ArrayList arrayList2);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoApi
        public native void endBroadcast();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof LiveVideoApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoApi
        public native void startBroadcast(ArrayList arrayList);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoApi
        public native void subscribeToBroadcast(Long l);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoApi
        public native void syncUnsubscribe();

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoApi
        public native void updateBroadcastId(Long l);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoApi
        public native void updateLiveStream(Long l, int i);
    }

    public abstract void acknowledgeLiveStream();

    public abstract void cancelCreatedNotStartedBroadcast();

    public abstract void createBroadcast(int i, int i2, String str, ArrayList arrayList, String str2, boolean z, ArrayList arrayList2);

    public abstract void endBroadcast();

    public abstract void startBroadcast(ArrayList arrayList);

    public abstract void subscribeToBroadcast(Long l);

    public abstract void syncUnsubscribe();

    public abstract void updateBroadcastId(Long l);

    public abstract void updateLiveStream(Long l, int i);
}
