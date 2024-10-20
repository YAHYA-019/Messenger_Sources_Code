package com.facebook.mcrypto.mem;

import X.C0il;
import com.facebook.simplejni.NativeHolder;

/* loaded from: OutgoingMessage.class */
public class OutgoingMessage {
    public final NativeHolder mNativeHolder;

    static {
        C0il.A0B("mcryptojni");
    }

    public OutgoingMessage(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static native NativeHolder initNativeHolder(PlaintextApplicationPayload plaintextApplicationPayload, EnvelopeProperties envelopeProperties);

    private native boolean nativeEquals(Object obj);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof OutgoingMessage)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native EnvelopeProperties getEnvelopeProperties();

    public native PlaintextApplicationPayload getPlaintextApplicationPayload();

    public native int hashCode();

    public native String toString();
}
