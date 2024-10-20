package com.facebook.mcrypto.mem;

import X.C0il;
import com.facebook.simplejni.NativeHolder;

/* loaded from: EnvelopeProperties.class */
public class EnvelopeProperties {
    public final NativeHolder mNativeHolder;

    static {
        C0il.A0B("mcryptojni");
    }

    public EnvelopeProperties(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static native NativeHolder initNativeHolder(Boolean bool, Boolean bool2, Number number, Number number2, Number number3, Number number4, Number number5);

    private native boolean nativeEquals(Object obj);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof EnvelopeProperties)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native Number getContentType();

    public native Number getEnvelopeType();

    public native Number getMessageTestConfigType();

    public native Boolean getShouldHideDecryptionErrorPlaceholder();

    public native Boolean getShouldSkipExtraFanout();

    public native Number getThreadMode();

    public native Number getThreadTypeTag();

    public native int hashCode();

    public native String toString();
}
