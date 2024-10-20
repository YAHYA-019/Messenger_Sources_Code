package X;

/* renamed from: X.67M, reason: invalid class name */
/* loaded from: 67M.class */
public final class C67M extends 67N {
    public final /* synthetic */ 67I A00;

    public C67M(67I r302) {
        this.A00 = r302;
    }

    public /* bridge */ /* synthetic */ void A05(6QK r302) {
        67O r0;
        Class cls;
        String str;
        C7v4 c7v4 = (C7v4) r302;
        67I r02 = this.A00;
        java.util.Map map = r02.A00;
        String str2 = c7v4.A03;
        67P r03 = (67P) map.get(str2);
        if (r03 == null || (r0 = r03.A01) == null) {
            return;
        }
        QoF qoF = c7v4.A01;
        int ordinal = qoF.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    0fH.A0V(67I.class, 67I.class, "%s unhandled event type: %s", qoF);
                    return;
                }
                06Z r04 = r03.A00;
                if (r04 == null) {
                    r0.Bml(c7v4.A02);
                    cls = 67I.class;
                    str = "dialogListener is null";
                } else if (!C0D1.A01(r04)) {
                    r0.Bml(c7v4.A02);
                    cls = 67I.class;
                    str = "FragmentManager can't commit transactions, skipping dialog";
                } else if (c7v4.A00.ordinal() == 2) {
                    ((C7y5) r02.A05.get()).Ahl(r03, c7v4.A02, str2).A0m(r03.A00, str2);
                }
                0fH.A0A(cls, str);
            }
            r0.Bml(c7v4.A02);
        } else {
            r0.BqY(c7v4.A02);
        }
        r02.A00 = null;
    }
}
