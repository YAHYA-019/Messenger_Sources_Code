package X;

import androidx.fragment.app.Fragment;

/* loaded from: LX8.class */
public final class LX8 implements C5xv {
    public final int A00;
    public final Object A01;

    public LX8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [androidx.fragment.app.Fragment, X.JuE] */
    @Override // X.C5xv
    public void CSR() {
        String str;
        if (this.A00 != 0) {
            ?? r0 = (JuE) this.A01;
            F4E f4e = (F4E) 1Br.A0B(r0.A04);
            C3025Jgo c3025Jgo = r0.A01;
            str = "contentViewModel";
            if (c3025Jgo != null) {
                F4E.A00(f4e, "unlink_accounts_screen_closed", c3025Jgo.A01, (String) null);
                C3025Jgo c3025Jgo2 = r0.A01;
                if (c3025Jgo2 != null) {
                    c3025Jgo2.A00 = null;
                    c3025Jgo2.A01 = "";
                    c3025Jgo2.A02 = "";
                    JR2.A0d((Fragment) r0);
                    return;
                }
            }
        } else {
            0fH.A0l(JuF.A0A, DKB.A00(283));
            JuF juF = (JuF) this.A01;
            F4E f4e2 = (F4E) 1Br.A0B(juF.A06);
            C3025Jgo c3025Jgo3 = juF.A01;
            if (c3025Jgo3 != null) {
                F4E.A00(f4e2, "unlink_disclosures_screen_navigate_back", c3025Jgo3.A01, (String) null);
                7zU.A15(juF);
                return;
            }
            str = "contentViewModel";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
