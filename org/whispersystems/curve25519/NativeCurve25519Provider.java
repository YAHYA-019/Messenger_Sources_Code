package org.whispersystems.curve25519;

import X.C0il;
import X.LxG;
import X.MDs;

/* loaded from: NativeCurve25519Provider.class */
public class NativeCurve25519Provider implements MDs {
    public static Throwable A00;
    public static boolean A01;

    static {
        try {
            C0il.A0B("curve25519");
            A01 = true;
        } catch (SecurityException | UnsatisfiedLinkError e) {
            A01 = false;
            A00 = e;
        }
    }

    public NativeCurve25519Provider() {
        if (!A01) {
            throw new LxG(A00);
        }
        try {
            smokeCheck(31337);
        } catch (UnsatisfiedLinkError e) {
            throw new LxG(e);
        }
    }

    private native boolean smokeCheck(int i);

    public native byte[] calculateAgreement(byte[] bArr, byte[] bArr2);

    public native byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] calculateVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] generatePrivateKey(byte[] bArr);

    public native byte[] generatePublicKey(byte[] bArr);

    public native boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] verifyVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);
}
