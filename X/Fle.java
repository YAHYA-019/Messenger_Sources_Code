package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: Fle.class */
public final class Fle implements GKs {
    public 1BY A00;
    public final Er4 A01 = DKG.A0e();
    public final Flc A02 = (Flc) 1Bn.A0B(99056);

    public Fle(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.GKs
    public /* bridge */ /* synthetic */ Object CWh(24X r302, String str) {
        C00i c00i;
        Object CWh;
        ImmutableList.Builder A0h = 4YU.A0h();
        Iterator it = r302.iterator();
        while (it.hasNext()) {
            24X A0j = DKC.A0j(it);
            DKF.A1T(A0j, "identifier");
            Quq A00 = Quq.A00(AbK.A18(A0j, "identifier"));
            int ordinal = A00.ordinal();
            if (ordinal == 4) {
                c00i = this.A01.A0O;
            } else if (ordinal != 12) {
                Flc flc = this.A02;
                CWh = ordinal != 5 ? flc.A01.A00(A00, A0j, str) : DKF.A0W(flc.A00.A0K).CWh(A0j, str);
                A0h.m11011add(CWh);
            } else {
                c00i = this.A01.A0Q;
            }
            CWh = DKF.A0W(c00i).CWh(A0j, str);
            A0h.m11011add(CWh);
        }
        return A0h.build();
    }
}
