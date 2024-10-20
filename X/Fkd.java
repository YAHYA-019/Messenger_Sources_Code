package X;

/* loaded from: Fkd.class */
public final class Fkd implements GFG {
    public final /* synthetic */ FyG A00;

    public Fkd(FyG fyG) {
        this.A00 = fyG;
    }

    public boolean DA0(GL7 gl7) {
        F7l f7l = FJ3.A03(this.A00).A01;
        FJ5.A08(((FwU) gl7).A01);
        String A04 = GL7.A04(gl7);
        if (A04 != null) {
            f7l.A02.remove(A04);
        }
        int Acj = gl7.Acj();
        if (Acj <= 0) {
            return false;
        }
        f7l.A01.remove(Acj);
        return false;
    }
}
