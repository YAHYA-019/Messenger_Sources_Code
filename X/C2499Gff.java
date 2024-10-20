package X;

import com.facebook.common.util.TriState;

/* renamed from: X.Gff, reason: case insensitive filesystem */
/* loaded from: Gff.class */
public final class C2499Gff extends 2rI {
    public final int A00;
    public final Object A01;

    public C2499Gff(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A02(1OW r302) {
    }

    public void A03(1OW r302) {
        if (this.A00 != 0) {
            if (GOp.A1V(r302)) {
                ((C2lh) this.A01).A02(7zR.A1X(r302.B7p()) ? TriState.YES : TriState.NO);
            }
        } else if (r302.BSj() && r302.BNS()) {
            ((6A3) this.A01).A00();
        }
    }
}
