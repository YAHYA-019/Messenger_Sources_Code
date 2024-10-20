package X;

import java.io.InputStream;

/* renamed from: X.4by, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4by.class */
public final class C04784by {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final 2Fg A07;

    public C04784by(2Fg r302) {
        r302.getClass();
        this.A07 = r302;
        this.A02 = 0;
        this.A03 = 0;
        this.A04 = 0;
        this.A00 = 0;
        this.A01 = 0;
        this.A05 = 0;
    }

    public static void A00(InputStream inputStream, long j) {
        boolean z = false;
        if (j >= 0) {
            z = true;
        }
        C0By.A02(Boolean.valueOf(z));
        while (j > 0) {
            long skip = inputStream.skip(j);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    return;
                } else {
                    skip = 1;
                }
            }
            j -= skip;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x019a, code lost:
    
        if (r0 == 255) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ac, code lost:
    
        if (r0 == 216) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0161, code lost:
    
        if (r0 != 216) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A01(X.2Ds r302) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04784by.A01(X.2Ds):boolean");
    }
}
