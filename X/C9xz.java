package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.9xz, reason: invalid class name */
/* loaded from: 9xz.class */
public final class C9xz implements AYG {
    public final /* synthetic */ 8DE A00;

    public C9xz(8DE r302) {
        this.A00 = r302;
    }

    public void CHg(List list) {
        Object value;
        ArrayList A0s;
        boolean z;
        Set set;
        11T.A0F(list, 0);
        0Xs r0 = this.A00.A03;
        do {
            value = r0.getValue();
            C87w c87w = (C87w) value;
            A0s = AnonymousClass001.A0s();
            for (Object obj : list) {
                if (((C1768As2) obj).A08 != null) {
                    A0s.add(obj);
                }
            }
            z = c87w.A01;
            set = (Set) c87w.A00;
            11T.A0F(set, 1);
        } while (!r0.AGt(value, new C87w(A0s, set, z)));
    }
}
