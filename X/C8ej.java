package X;

import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8ej, reason: invalid class name */
/* loaded from: 8ej.class */
public final class C8ej extends 1LH {
    public final C9bp A00;
    public final 9N0 A01;
    public final C0Bf A02;
    public final C0Bh A03;
    public final boolean A04;
    public final 2NI A05;
    public final 2kG A06;
    public final 2O4 A07;
    public final 2lO A08;
    public final 3xS A09;
    public final 9QL A0A;
    public final 9cG A0B;
    public final C2lu A0C;
    public final C2lu A0D;
    public final C2lu A0E;
    public final C2lu A0F;
    public final C2lu A0G;
    public final Boolean A0H;
    public final Boolean A0I;
    public final Boolean A0J;
    public final Integer A0K;
    public final List A0L;
    public final C00m A0M;
    public final C00m A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public C8ej(2NI r302, 2kG r303, 2O4 r304, 2lO r305, 3xS r306, 9QL r307, C9bp c9bp, 9cG r309, 9N0 r310, C2lu c2lu, C2lu c2lu2, C2lu c2lu3, C2lu c2lu4, C2lu c2lu5, Boolean bool, Boolean bool2, Boolean bool3, Integer num, List list, C00m c00m, C00m c00m2, C0Bf c0Bf, C0Bh c0Bh, boolean z) {
        11T.A0F(c9bp, 37);
        this.A0A = r307;
        this.A05 = r302;
        this.A06 = r303;
        this.A0I = bool;
        this.A0H = bool2;
        this.A0F = c2lu;
        this.A0D = c2lu2;
        this.A0G = c2lu3;
        this.A0C = c2lu4;
        this.A0J = bool3;
        this.A0K = num;
        this.A09 = r306;
        this.A08 = r305;
        this.A02 = c0Bf;
        this.A0M = c00m;
        this.A0N = c00m2;
        this.A01 = r310;
        this.A07 = r304;
        this.A0L = list;
        this.A0B = r309;
        this.A03 = c0Bh;
        this.A04 = true;
        this.A0P = true;
        this.A0Q = true;
        this.A0R = z;
        this.A0O = true;
        this.A0E = c2lu5;
        this.A00 = c9bp;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean z = false;
        1Iw A0X = 7zL.A0X(c2k5);
        7zL.A1K(A0X);
        Object obj = C2lc.A00(c2k5, AL7.A00).A02;
        AWF awf = new AWF(obj, this, 0);
        AWG awg = new AWG(this, obj, 0);
        C8qc c8qc = new C8qc();
        c8qc.A02 = new DKU(this, 31);
        C00m c00m = this.A0M;
        if (c00m != null) {
            c8qc.A00 = c00m;
        }
        c8qc.A03 = awf;
        C00m c00m2 = this.A0N;
        c8qc.A01 = c00m2;
        c8qc.A04 = awg;
        8OS r0 = new 8OS(A0X, new C8nc());
        C8nc c8nc = r0.A01;
        c8nc.A07 = c8qc;
        BitSet bitSet = r0.A02;
        bitSet.set(0);
        9QL r02 = this.A0A;
        c8nc.A08 = r02.A00;
        c8nc.A05 = this.A05;
        c8nc.A06 = this.A06;
        c8nc.A0G = r02.A01;
        c8nc.A0C = this.A0I;
        c8nc.A0B = this.A0H;
        C2lu c2lu = this.A0F;
        c8nc.A03 = c2lu != null ? 7zN.A03(c2k5, c2lu.A00) : 0;
        C2lu c2lu2 = this.A0D;
        c8nc.A01 = c2lu2 != null ? 7zN.A03(c2k5, c2lu2.A00) : 0;
        C2lu c2lu3 = this.A0G;
        c8nc.A04 = c2lu3 != null ? 7zN.A03(c2k5, c2lu3.A00) : 0;
        C2lu c2lu4 = this.A0C;
        c8nc.A00 = c2lu4 != null ? 7zN.A03(c2k5, c2lu4.A00) : 0;
        if (c00m2 != null) {
            z = true;
        }
        c8nc.A0M = z;
        c8nc.A0D = this.A0J;
        c8nc.A0E = this.A0K;
        c8nc.A09 = this.A09;
        r0.A1w(null);
        2O4 r03 = this.A07;
        if (r03 != null) {
            List list = c8nc.A0F;
            if (list == Collections.EMPTY_LIST) {
                list = AnonymousClass001.A0s();
                c8nc.A0F = list;
            }
            list.add(r03);
        }
        List list2 = this.A0L;
        if (list2 != null) {
            if (c8nc.A0F.isEmpty()) {
                c8nc.A0F = list2;
            } else {
                c8nc.A0F.addAll(list2);
            }
        }
        c8nc.A0A = this.A0B;
        C2lu c2lu5 = this.A0E;
        if (c2lu5 != null) {
            int A03 = 7zO.A03(c2k5, c2lu5.A00);
            if (Integer.valueOf(A03) != null && A03 > 0) {
                c8nc.A02 = A03;
                if (r02.A02) {
                    c8nc.A0N = true;
                } else {
                    c8nc.A0H = true;
                }
                c8nc.A0J = this.A0P;
                c8nc.A0K = this.A0Q;
                c8nc.A0L = this.A0R;
                c8nc.A0I = this.A0O;
            }
        }
        C5z7.A00(r0, this.A08);
        C1rs.A01(bitSet, r0.A03);
        r0.A0J();
        return c8nc;
    }
}
