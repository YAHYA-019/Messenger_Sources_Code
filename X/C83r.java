package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* renamed from: X.83r, reason: invalid class name */
/* loaded from: 83r.class */
public final class C83r extends C1rs {
    public 1Iw A00;
    public C5yy A01;
    public final BitSet A02;
    public final String[] A03;

    public C83r(1Iw r302, C5yy c5yy) {
        super(c5yy, r302, 0, 0);
        this.A03 = 7zL.A1b();
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = c5yy;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C5yy A2V() {
        C1rs.A01(this.A02, this.A03);
        C5yy c5yy = this.A01;
        C2ko c2ko = c5yy.A05;
        if (c2ko == null) {
            c2ko = 1LI.A0D(c5yy, this.A00, -1671105658);
        }
        c5yy.A05 = c2ko;
        A0J();
        return c5yy;
    }

    public void A2X(1LI r302) {
        this.A01.A04 = 7zQ.A0T(r302);
    }

    public void A2Y(MigColorScheme migColorScheme) {
        this.A01.A07 = migColorScheme;
        this.A02.set(0);
    }

    public void A2Z(C5xv c5xv) {
        this.A01.A0A = c5xv;
    }

    public void A2a(C5yu c5yu) {
        C5yy c5yy = this.A01;
        List list = c5yy.A0B;
        if (list == Collections.EMPTY_LIST) {
            list = AnonymousClass001.A0s();
            c5yy.A0B = list;
        }
        list.add(c5yu);
    }

    public void A2b(List list) {
        if (list != null) {
            C5yy c5yy = this.A01;
            if (c5yy.A0B.isEmpty()) {
                c5yy.A0B = list;
            } else {
                c5yy.A0B.addAll(list);
            }
        }
    }
}
