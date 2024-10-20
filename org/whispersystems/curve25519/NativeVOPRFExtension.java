package org.whispersystems.curve25519;

/* loaded from: NativeVOPRFExtension.class */
public class NativeVOPRFExtension {
    private native byte[] nativeBlind(byte[] bArr, int i, byte[] bArr2, int i2);

    private native boolean nativeIsValid(byte[] bArr, int i);

    private native byte[] nativePcdBlind(byte[] bArr, int i, byte[] bArr2, int i2, boolean z);

    private native byte[] nativeUnBlind(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3);
}
