package X;

import java.util.Arrays;

/* renamed from: X.3Qr, reason: invalid class name */
/* loaded from: 3Qr.class */
public final class C3Qr {
    public final int A00;
    public final short A01;
    public final String[] A02;

    public C3Qr(String[] strArr, int i, short s) {
        this.A02 = strArr;
        this.A01 = s;
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e9, code lost:
    
        return new X.C3Qr(X.1BK.A1b(r0, r0.size()), r310 - r302, r308);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C3Qr A00(byte[] r301, int r302) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Qr.A00(byte[], int):X.3Qr");
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DnsQname{qname=");
        A0k.append(Arrays.toString(this.A02));
        A0k.append(", pointer=");
        A0k.append((int) this.A01);
        A0k.append(", numberOfBytes=");
        A0k.append(this.A00);
        return AnonymousClass001.A0f(A0k);
    }
}
