package com.facebook.rsys.moderator.gen;

import X.2JQ;
import X.HN9;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.HashSet;

/* loaded from: ModeratorApi.class */
public abstract class ModeratorApi {
    public static 2JQ CONVERTER = N6e.A00(44);

    /* loaded from: ModeratorApi$CProxy.class */
    public final class CProxy extends ModeratorApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HN9.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native ModeratorApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.moderator.gen.ModeratorApi
        public native void enableScreenShare(boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof ModeratorApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.moderator.gen.ModeratorApi
        public native void softMuteUser(String str);

        @Override // com.facebook.rsys.moderator.gen.ModeratorApi
        public native void softMuteUsers(HashSet hashSet);
    }

    public abstract void enableScreenShare(boolean z);

    public abstract void softMuteUser(String str);

    public abstract void softMuteUsers(HashSet hashSet);
}
