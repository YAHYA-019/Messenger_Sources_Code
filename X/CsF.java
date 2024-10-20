package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;

/* loaded from: CsF.class */
public final class CsF implements DFm {
    public final Context A00;
    public final C1V A01;

    public CsF(Context context, C1V c1v) {
        11T.A0F(c1v, 1);
        this.A01 = c1v;
        this.A00 = context;
    }

    @Override // X.DFm
    public void CJc(int i) {
        String A0u;
        Integer num;
        ImmutableList.Builder A0h = 4YU.A0h();
        if (i != 0) {
            if (i == 1) {
                A0u = 1BK.A0u(this.A00, 2131959901);
                num = 0S2.A0u;
            } else if (i == 2) {
                A0u = 1BK.A0u(this.A00, 2131959892);
                num = 0S2.A0j;
            }
            A0h.m11011add((Object) new BqX(num, A0u, true));
        } else {
            Context context = this.A00;
            A0h.m11011add((Object) new BqX(0S2.A0Y, 1BK.A0u(context, 2131959903), true));
            A0h.addAll(CB2.A00(context));
        }
        this.A01.A00(1Fj.A01(A0h), i);
    }
}
