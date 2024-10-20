package X;

/* loaded from: Ci6.class */
public final class Ci6 implements DEl {
    public final /* synthetic */ B9H A00;

    public Ci6(B9H b9h) {
        this.A00 = b9h;
    }

    @Override // X.DEl
    public void ByK(boolean z, boolean z2, boolean z3) {
        B9H b9h = this.A00;
        if (b9h.A05) {
            return;
        }
        if (b9h.A03 == z && b9h.A04 == z2 && b9h.A02 == z3) {
            return;
        }
        B9H.A07(b9h, z, z2, z3);
        b9h.A1c();
    }
}
