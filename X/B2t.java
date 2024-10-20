package X;

import android.os.Bundle;
import java.util.BitSet;
import java.util.HashMap;

/* loaded from: B2t.class */
public final class B2t extends B2y {
    public static final String __redex_internal_original_name = "AccountLoginRecSecurityFragment";
    public final C00i A01 = AbI.A0N();
    public final C00i A00 = AbH.A0M();
    public final REY A02 = new REY(this);

    public static void A08(B2t b2t, BMG bmg) {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("contact_point", AlJ.A07(b2t));
        AbF.A0V(b2t.A01).A0O(bmg, A0u);
    }

    public void A1K() {
        super/*X.1pK*/.A1K();
        1BK.A0U(this.A00).markerEnd(725092849, (short) 2);
    }

    public 1iF A1R() {
        return AbK.A0F();
    }

    @Override // X.B2y
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        A08(this, BMG.A2F);
    }

    @Override // X.B2z
    public 1LI A1c(C7xz c7xz, 1Iw r303) {
        AtZ atZ = new AtZ(r303, new B0Z());
        CHq A06 = AlJ.A06();
        B0Z b0z = atZ.A01;
        b0z.A02 = A06;
        BitSet bitSet = atZ.A02;
        bitSet.set(0);
        b0z.A00 = c7xz;
        b0z.A01 = this.A02;
        C1rs.A01(bitSet, atZ.A03);
        atZ.A0J();
        return b0z;
    }
}
