package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.4uq, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4uq.class */
public final class C10834uq {
    public boolean A00;
    public final C10854us A02 = (C10854us) 1Bi.A03(115572);
    public final C10864ut A01 = (C10864ut) 1Hv.A02((Context) 1Bn.A0E((Context) null, (1BY) null, 83719), 49356);
    public final C10874uu A03 = new C10874uu(this);

    public void A00() {
        if (this.A00) {
            this.A01.A02(this.A02.A0A.size());
            return;
        }
        this.A00 = true;
        C10864ut c10864ut = this.A01;
        C10854us c10854us = this.A02;
        c10864ut.A02(c10854us.A0A.size());
        C10874uu c10874uu = this.A03;
        11T.A0F(c10874uu, 0);
        ArrayList arrayList = c10854us.A06;
        if (arrayList.contains(c10874uu)) {
            return;
        }
        arrayList.add(c10874uu);
    }

    public void A01() {
        if (this.A00) {
            C10854us c10854us = this.A02;
            C10874uu c10874uu = this.A03;
            11T.A0F(c10874uu, 0);
            c10854us.A06.remove(c10874uu);
            this.A01.A01();
            this.A00 = false;
        }
    }
}
