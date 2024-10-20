package X;

/* renamed from: X.Ge5, reason: case insensitive filesystem */
/* loaded from: Ge5.class */
public final class C2463Ge5 extends SurfaceHolderCallbackC2456Gdy implements JOo {
    public int A00;

    public void A00(int i) {
        int i2 = 4;
        int i3 = (i + 4) % 4;
        if (i3 == 0) {
            i2 = 0;
        } else if (i3 != 1) {
            if (i3 == 2) {
                i2 = 8;
            } else if (i3 != 3) {
                return;
            } else {
                i2 = 16;
            }
        }
        this.A00 = i2;
    }

    @Override // X.JOo
    public Integer AnF() {
        return 0S2.A00;
    }

    @Override // X.JOo
    public int B8t() {
        return this.A00;
    }
}
