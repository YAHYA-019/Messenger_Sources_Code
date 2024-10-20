package X;

import java.util.List;

/* loaded from: E3l.class */
public final class E3l extends FIJ {
    public final Ra7 A00;
    public final GL7 A01;

    public E3l(GL7 gl7, FyG fyG) {
        super(gl7, fyG);
        this.A01 = gl7;
        Object A07 = FJ3.A07(gl7, fyG);
        A07.getClass();
        this.A00 = (Ra7) A07;
    }

    public void A08(FyG fyG) {
        GL7 gl7 = this.A01;
        Object BI5 = gl7.BI5(36);
        List A0A = GL7.A0A(gl7);
        GL7 Ay2 = gl7.Ay2(35);
        GL7 A00 = this.A00.A00(Ay2, fyG, BI5, A0A);
        if (A00 != null) {
            Ay2 = A00;
        } else if (Ay2 == null) {
            return;
        }
        FJ9.A0A(Ay2, fyG);
    }
}
