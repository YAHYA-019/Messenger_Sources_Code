package X;

/* renamed from: X.4h8, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4h8.class */
public final class C06554h8 implements 2EW {
    public final /* synthetic */ C04504b6 A00;
    public final /* synthetic */ 2FC A01;

    public C06554h8(C04504b6 c04504b6, 2FC r303) {
        this.A01 = r303;
        this.A00 = c04504b6;
    }

    public void Cci(Object obj) {
        boolean z;
        2EU A01;
        2Dg r0;
        2FC r02 = this.A01;
        C04504b6 c04504b6 = this.A00;
        synchronized (r02) {
            int i = c04504b6.A01;
            boolean z2 = false;
            if (i > 0) {
                z2 = true;
            }
            C0By.A04(z2);
            int i2 = i - 1;
            c04504b6.A01 = i2;
            if (c04504b6.A03 || i2 != 0) {
                z = false;
            } else {
                r02.A03.A06(c04504b6.A06, c04504b6);
                z = true;
            }
            A01 = 2FC.A01(c04504b6, r02);
        }
        2EU.A04(A01);
        if (z && (r0 = c04504b6.A05) != null) {
            r0.Bww(c04504b6.A06, true);
        }
        2FC.A06(r02);
        2FC.A05(r02);
    }
}
