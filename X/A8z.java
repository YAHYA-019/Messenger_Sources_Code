package X;

/* loaded from: A8z.class */
public final class A8z implements 6nH {
    public final int A00;
    public final Object A01;

    public A8z(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    public void BhX(1Iw r302, String str, int i) {
        C2lh c2lh;
        AUS aus;
        switch (this.A00) {
            case 0:
                c2lh = (C2lh) this.A01;
                aus = ASC.A00;
                c2lh.A04(aus);
                return;
            case 1:
                C8dm c8dm = (C8dm) this.A01;
                9nH.A05(c8dm.A01, c8dm.A02);
                return;
            case 2:
                8gZ r0 = (8gZ) this.A01;
                long j = 8gZ.A05;
                r0.A00.A02(r0.A02, i);
                return;
            default:
                c2lh = (C2lh) this.A01;
                aus = AUS.A00;
                c2lh.A04(aus);
                return;
        }
    }
}
