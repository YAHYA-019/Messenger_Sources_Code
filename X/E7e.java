package X;

/* loaded from: E7e.class */
public final class E7e extends 9Ai {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public E7e(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public void A00() {
        GJN gjn;
        if (this.A00 != 0 || (gjn = ((EuZ) this.A01).A00) == null) {
            return;
        }
        gjn.BuK(this.A02);
    }

    public void A01() {
        if (this.A00 != 0) {
            6Je r0 = ((8H7) this.A01).A00;
            if (r0 != null) {
                r0.ANa((AXn) null, 0S2.A04);
                return;
            }
            return;
        }
        GJN gjn = ((EuZ) this.A01).A00;
        if (gjn != null) {
            gjn.CAA();
        }
    }

    public void A02() {
        6Je r0;
        if (this.A00 != 0) {
            if (this.A02 || (r0 = ((8H7) this.A01).A00) == null) {
                return;
            }
            r0.ANa((AXn) null, 0S2.A04);
            return;
        }
        GJN gjn = ((EuZ) this.A01).A00;
        if (gjn != null) {
            gjn.BuK(this.A02);
        }
    }

    public void A03() {
        GJN gjn;
        if (this.A00 != 0 || (gjn = ((EuZ) this.A01).A00) == null) {
            return;
        }
        gjn.CDv();
    }
}
