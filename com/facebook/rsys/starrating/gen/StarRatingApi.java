package com.facebook.rsys.starrating.gen;

import X.2JQ;
import X.HNF;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: StarRatingApi.class */
public abstract class StarRatingApi {
    public static 2JQ CONVERTER = IR0.A00(ActionId.OFFLINE);

    /* loaded from: StarRatingApi$CProxy.class */
    public final class CProxy extends StarRatingApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HNF.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native StarRatingApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.starrating.gen.StarRatingApi
        public native void dismissStarRating();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof StarRatingApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.starrating.gen.StarRatingApi
        public native void onUserInteraction();

        @Override // com.facebook.rsys.starrating.gen.StarRatingApi
        public native void submitStarRating(int i, String str, Long l);

        @Override // com.facebook.rsys.starrating.gen.StarRatingApi
        public native void submitStarRatingShown(int i);
    }

    public abstract void dismissStarRating();

    public abstract void onUserInteraction();

    public abstract void submitStarRating(int i, String str, Long l);

    public abstract void submitStarRatingShown(int i);
}
