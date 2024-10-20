package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.8lp, reason: invalid class name */
/* loaded from: 8lp.class */
public final class C8lp extends C1rj {
    public int A00;
    public List A01;

    public C8lp() {
        super("SpacedColumn");
        this.A01 = Collections.emptyList();
    }

    public static 8OG A00(1Iw r301) {
        C8lp c8lp = new C8lp();
        C1rs c1rs = new C1rs(c8lp, r301, 0, 0);
        ((8OG) c1rs).A01 = c8lp;
        ((8OG) c1rs).A00 = r301;
        return c1rs;
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        List list = this.A01;
        int i = this.A00;
        11T.A0F(r302, 0);
        if (list == null || list.isEmpty()) {
            return null;
        }
        2cM A00 = 2cK.A00(r302);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            1LI r0 = (1LI) list.get(i2);
            if (i2 != 0) {
                2dD A0p = 7zM.A0p(r0, r302);
                A0p.A2A(C26z.TOP, i);
                A00.A2d(A0p);
            } else {
                A00.A2e(r0);
            }
        }
        return A00.A00;
    }
}
