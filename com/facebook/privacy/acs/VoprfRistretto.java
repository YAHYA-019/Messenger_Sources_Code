package com.facebook.privacy.acs;

import X.C0il;
import X.C4Ci;

/* loaded from: VoprfRistretto.class */
public class VoprfRistretto implements C4Ci {
    static {
        C0il.A0B("voprf-ristretto");
        if (sodiumInit() == -1) {
            System.err.println("sodiumInit() failed.");
        }
    }

    public static native int sodiumInit();

    @Override // X.C4Ci
    public native int blind(byte[] bArr, byte[] bArr2, byte[] bArr3);

    @Override // X.C4Ci
    public native int computeSharedSecret(byte[] bArr, byte[] bArr2, byte[] bArr3);

    @Override // X.C4Ci
    public native int getCurveBytes();

    public native int getCurveScalarBytes();

    @Override // X.C4Ci
    public native int unblind(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z, byte[] bArr5, byte[] bArr6, byte[] bArr7);
}
