package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.8m6, reason: invalid class name */
/* loaded from: 8m6.class */
public final class C8m6 extends C1rj {
    public 2O4 A00;
    public C2kf A01;
    public List A02;
    public boolean A03;

    public C8m6() {
        super("MigListItemRecycler");
        this.A03 = true;
        this.A02 = Collections.emptyList();
    }

    public static 8OH A00(1Iw r301) {
        C8m6 c8m6 = new C8m6();
        C1rs c1rs = new C1rs(c8m6, r301, 0, 0);
        ((8OH) c1rs).A01 = c8m6;
        ((8OH) c1rs).A00 = r301;
        return c1rs;
    }

    public final Object[] A0k() {
        return new Object[]{4YU.A0k(), null, Boolean.valueOf(this.A03), this.A00, this.A01, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        List list = this.A02;
        2O4 r0 = this.A00;
        C2kf c2kf = this.A01;
        boolean z = this.A03;
        C2ki A00 = C2kV.A00(r302);
        7zL.A1K(r302);
        5P2 r02 = new 5P2();
        if (list != null) {
            if (r02.A00.isEmpty()) {
                r02.A00 = list;
            } else {
                r02.A00.addAll(list);
            }
        }
        A00.A2d(r02);
        A00.A2j(true);
        A00.A2Z(r0);
        A00.A2X(null);
        A00.A01.A0d = z;
        A00.A2K("mig_list");
        if (c2kf != null) {
            A00.A2f(c2kf);
        }
        return A00.A2W();
    }
}
