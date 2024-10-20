package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: Flc.class */
public final class Flc implements GKs {
    public final Er4 A00;
    public final Flg A01;

    public Flc() {
        Flg flg = (Flg) 1Bn.A0B(99053);
        this.A00 = DKG.A0e();
        this.A01 = flg;
    }

    @Override // X.GKs
    public /* bridge */ /* synthetic */ Object CWh(24X r302, String str) {
        ImmutableList.Builder A0h = 4YU.A0h();
        Iterator it = r302.iterator();
        while (it.hasNext()) {
            24X A0j = DKC.A0j(it);
            DKF.A1T(A0j, "identifier");
            Quq A00 = Quq.A00(AbK.A18(A0j, "identifier"));
            A0h.m11011add(A00.ordinal() != 5 ? this.A01.A00(A00, A0j, str) : DKF.A0W(this.A00.A0K).CWh(A0j, str));
        }
        return A0h.build();
    }
}
