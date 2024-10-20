package X;

import java.util.List;

/* loaded from: E2z.class */
public final class E2z extends FIJ {
    public GL7 A00;

    public void A08(FyG fyG) {
        GL7 gl7 = this.A00;
        String A07 = GL7.A07(gl7);
        List Aty = gl7.Aty(35);
        Object BI5 = gl7.BI5(40);
        if (BI5 instanceof String) {
            java.util.Map A04 = FJ5.A04((String) BI5);
            if (!A04.isEmpty()) {
                BI5 = A04.get("__ntvalue__");
            }
        }
        R1e.A00(fyG, BI5, A07, Aty);
    }
}
