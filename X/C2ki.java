package X;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2ki, reason: invalid class name */
/* loaded from: 2ki.class */
public final class C2ki extends C1rs {
    public 1Iw A00;
    public C2kV A01;
    public final BitSet A02;
    public final String[] A03;

    public C2ki(1Iw r302, C2kV c2kV) {
        super(c2kV, r302, 0, 0);
        this.A03 = new String[]{"section"};
        BitSet bitSet = new BitSet(1);
        this.A02 = bitSet;
        this.A01 = c2kV;
        this.A00 = r302;
        bitSet.clear();
    }

    public C2kV A2W() {
        C1rs.A05(this.A02, this.A03, 1);
        C2kV c2kV = this.A01;
        C2ko c2ko = c2kV.A0I;
        if (c2ko == null) {
            c2ko = 1LI.A0D(c2kV, this.A00, -1505688212);
        }
        c2kV.A0I = c2ko;
        C2ko c2ko2 = c2kV.A0H;
        if (c2ko2 == null) {
            c2ko2 = 1LI.A0D(c2kV, this.A00, -238194236);
        }
        c2kV.A0H = c2ko2;
        C2ko c2ko3 = c2kV.A0G;
        if (c2ko3 == null) {
            c2ko3 = 1LI.A0D(c2kV, this.A00, -1017305181);
        }
        c2kV.A0G = c2ko3;
        A0J();
        return c2kV;
    }

    public void A2X(2NI r302) {
        this.A01.A09 = r302;
    }

    public void A2Y(2kG r302) {
        if (r302 != null) {
            C2kV c2kV = this.A01;
            List list = c2kV.A0T;
            if (list == Collections.EMPTY_LIST) {
                list = new ArrayList();
                c2kV.A0T = list;
            }
            list.add(r302);
        }
    }

    public void A2Z(2O4 r302) {
        if (r302 != null) {
            C2kV c2kV = this.A01;
            List list = c2kV.A0U;
            if (list == Collections.EMPTY_LIST) {
                list = new ArrayList();
                c2kV.A0U = list;
            }
            list.add(r302);
        }
    }

    public void A2a(1LI r302) {
        this.A01.A0B = r302 == null ? null : r302.A0l();
    }

    public void A2b(1LI r302) {
        this.A01.A0C = r302 == null ? null : r302.A0l();
    }

    public void A2c(1LI r302) {
        this.A01.A0D = r302 == null ? null : r302.A0l();
    }

    public void A2d(2Yf r302) {
        this.A01.A0L = r302;
        this.A02.set(0);
    }

    public void A2e(C2kx c2kx) {
        this.A01.A0M = c2kx;
    }

    public void A2f(C2kf c2kf) {
        this.A01.A0N = c2kf;
    }

    public void A2g(List list) {
        if (list != null) {
            C2kV c2kV = this.A01;
            if (c2kV.A0U.isEmpty()) {
                c2kV.A0U = list;
            } else {
                c2kV.A0U.addAll(list);
            }
        }
    }

    public void A2h(boolean z) {
        this.A01.A0W = z;
    }

    public void A2i(boolean z) {
        this.A01.A0Y = z;
    }

    public void A2j(boolean z) {
        this.A01.A0Z = z;
    }
}
