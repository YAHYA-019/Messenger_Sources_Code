package X;

import android.util.SparseArray;
import com.facebook.litho.LithoView;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: Ew5.class */
public final class Ew5 {
    public final /* synthetic */ DZV A00;

    public Ew5(DZV dzv) {
        this.A00 = dzv;
    }

    public void A00(DkU dkU) {
        1Iw r0;
        DkW A0u;
        DkV A0u2;
        DhA A0u3;
        String A0r;
        DZV dzv = this.A00;
        if (dzv.A07 || !((FHN) 1Br.A0B(dzv.A0D)).A09(dzv.A05) || (r0 = dzv.A01) == null) {
            return;
        }
        1Bn.A0A(147803);
        LithoView lithoView = dzv.A02;
        if (lithoView != null) {
            DkT A0u4 = dkU.A0u();
            lithoView.A0x((A0u4 == null || (A0u = A0u4.A0u()) == null || (A0u2 = A0u.A0u()) == null || (A0u3 = A0u2.A0u()) == null || (A0r = A0u3.A0r(1502950793)) == null) ? 2cK.A00(r0).A00 : new DvE((SparseArray) null, (GE8) null, A0r, (java.util.Map) null));
        }
    }

    public void A01(C2250Di6 c2250Di6) {
        11T.A0F(c2250Di6, 0);
        DZV dzv = this.A00;
        List list = dzv.A0E;
        ImmutableList A0b = c2250Di6.A0b(-1451644407, C2248Di4.class);
        11T.A0A(A0b);
        list.addAll(A0b);
        DZV.A03(dzv, false);
    }
}
