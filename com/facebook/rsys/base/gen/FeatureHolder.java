package com.facebook.rsys.base.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.C0il;
import X.KSE;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: FeatureHolder.class */
public abstract class FeatureHolder {
    public static 2JQ CONVERTER = LVi.A00(0);

    /* loaded from: FeatureHolder$CProxy.class */
    public final class CProxy extends FeatureHolder {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            if (KSE.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsysbasejniStaging" : "rsysbasejniLatest");
            KSE.A00 = true;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native FeatureHolder createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof FeatureHolder)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.base.gen.FeatureHolder
        public native boolean hasBeenBound();

        public native int hashCode();
    }

    public abstract boolean hasBeenBound();
}
