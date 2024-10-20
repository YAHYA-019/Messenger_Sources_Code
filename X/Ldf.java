package X;

import java.nio.charset.Charset;
import java.util.List;

/* loaded from: Ldf.class */
public final class Ldf implements MLI {
    public final K7H A00;

    public Ldf(K7H k7h) {
        Charset charset = LC1.A02;
        this.A00 = k7h;
        k7h.A01 = this;
    }

    public static K7H A00(Ldf ldf, int i) {
        K7H k7h = ldf.A00;
        k7h.A0H(i, 2);
        return k7h;
    }

    public static Ldf A01(K7H k7h) {
        Ldf ldf = k7h.A01;
        if (ldf == null) {
            ldf = new Ldf(k7h);
        }
        return ldf;
    }

    public final void DBt(int i, int i2) {
        this.A00.A0I(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void DBu(List list, int i, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                K7H k7h = this.A00;
                int A0G = DKE.A0G(list, i2);
                k7h.A0I(i, (A0G >> 31) ^ (A0G + A0G));
                i2++;
            }
            return;
        }
        K7H A00 = A00(this, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int A0G2 = DKE.A0G(list, i4);
            i3 += K7H.A00((A0G2 >> 31) ^ (A0G2 + A0G2));
        }
        A00.A0E(i3);
        while (i2 < list.size()) {
            int A0G3 = DKE.A0G(list, i2);
            A00.A0E((A0G3 >> 31) ^ (A0G3 + A0G3));
            i2++;
        }
    }

    public final void DBv(int i, long j) {
        this.A00.A0K(i, (j >> 63) ^ (j + j));
    }

    public final void DBw(List list, int i, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                K7H k7h = this.A00;
                long A08 = AbK.A08(list, i2);
                k7h.A0K(i, (A08 >> 63) ^ (A08 + A08));
                i2++;
            }
            return;
        }
        K7H A00 = A00(this, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long A082 = AbK.A08(list, i4);
            i3 += K7H.A01((A082 >> 63) ^ (A082 + A082));
        }
        A00.A0E(i3);
        while (i2 < list.size()) {
            long A083 = AbK.A08(list, i2);
            A00.A0O((A083 >> 63) ^ (A083 + A083));
            i2++;
        }
    }

    public final void DBx(int i) {
        this.A00.A0H(i, 3);
    }

    public final void DBy(int i, String str) {
        this.A00.A0L(i, str);
    }

    public final void DBz(List list, int i) {
        int i2 = 0;
        if (!(list instanceof MRJ)) {
            while (i2 < list.size()) {
                this.A00.A0L(i, 1BK.A14(list, i2));
                i2++;
            }
            return;
        }
        MRJ mrj = (MRJ) list;
        while (i2 < list.size()) {
            Object DCl = mrj.DCl(i2);
            boolean z = DCl instanceof String;
            K7H k7h = this.A00;
            if (z) {
                k7h.A0L(i, (String) DCl);
            } else {
                k7h.A0P((Lj6) DCl, i);
            }
            i2++;
        }
    }

    public final void DC0(int i, int i2) {
        this.A00.A0I(i, i2);
    }

    public final void DC1(List list, int i, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.A00.A0I(i, DKE.A0G(list, i2));
                i2++;
            }
            return;
        }
        K7H A00 = A00(this, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += K7H.A00(DKE.A0G(list, i4));
        }
        A00.A0E(i3);
        while (i2 < list.size()) {
            A00.A0E(DKE.A0G(list, i2));
            i2++;
        }
    }

    public final void DC2(int i, long j) {
        this.A00.A0K(i, j);
    }

    public final void DC3(List list, int i, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.A00.A0K(i, AbK.A08(list, i2));
                i2++;
            }
            return;
        }
        K7H A00 = A00(this, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += K7H.A01(AbK.A08(list, i4));
        }
        A00.A0E(i3);
        while (i2 < list.size()) {
            A00.A0O(AbK.A08(list, i2));
            i2++;
        }
    }

    public final void DCM(int i, boolean z) {
        this.A00.A0M(i, z);
    }

    public final void DCU(List list, int i, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.A00.A0M(i, AnonymousClass001.A1V(list.get(i2)));
                i2++;
            }
            return;
        }
        K7H A00 = A00(this, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3++;
        }
        A00.A0E(i3);
        while (i2 < list.size()) {
            A00.A0B(AnonymousClass001.A1V(list.get(i2)) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public final void DCa(Lj6 lj6, int i) {
        this.A00.A0P(lj6, i);
    }

    public final void DCi(List list, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= list.size()) {
                return;
            }
            this.A00.A0P((Lj6) list.get(i3), i);
            i2 = i3 + 1;
        }
    }

    public final void DCm(int i, double d) {
        this.A00.A0J(i, Double.doubleToRawLongBits(d));
    }

    public final void DCv(List list, int i, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.A00.A0J(i, JR0.A0W(list.get(i2)));
                i2++;
            }
            return;
        }
        K7H A00 = A00(this, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3 += 8;
        }
        A00.A0E(i3);
        while (i2 < list.size()) {
            A00.A0N(JR0.A0W(list.get(i2)));
            i2++;
        }
    }

    public final void DCy(int i) {
        this.A00.A0H(i, 4);
    }

    public final void DD3(int i, int i2) {
        this.A00.A0G(i, i2);
    }

    public final void DD9(List list, int i, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.A00.A0G(i, DKE.A0G(list, i2));
                i2++;
            }
            return;
        }
        K7H A00 = A00(this, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += K7H.A01(DKE.A0G(list, i4));
        }
        A00.A0E(i3);
        while (i2 < list.size()) {
            A00.A0D(DKE.A0G(list, i2));
            i2++;
        }
    }

    public final void DDB(int i, int i2) {
        this.A00.A0F(i, i2);
    }

    public final void DDF(List list, int i, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.A00.A0F(i, DKE.A0G(list, i2));
                i2++;
            }
            return;
        }
        K7H A00 = A00(this, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3 += 4;
        }
        A00.A0E(i3);
        while (i2 < list.size()) {
            A00.A0C(DKE.A0G(list, i2));
            i2++;
        }
    }

    public final void DDH(int i, long j) {
        this.A00.A0J(i, j);
    }

    public final void DDI(List list, int i, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.A00.A0J(i, AbK.A08(list, i2));
                i2++;
            }
            return;
        }
        K7H A00 = A00(this, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3 += 8;
        }
        A00.A0E(i3);
        while (i2 < list.size()) {
            A00.A0N(AbK.A08(list, i2));
            i2++;
        }
    }

    public final void DDK(int i, float f) {
        this.A00.A0F(i, Float.floatToRawIntBits(f));
    }

    public final void DDL(List list, int i, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.A00.A0F(i, Float.floatToRawIntBits(GOp.A00(list, i2)));
                i2++;
            }
            return;
        }
        K7H A00 = A00(this, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3 += 4;
        }
        A00.A0E(i3);
        while (i2 < list.size()) {
            A00.A0C(Float.floatToRawIntBits(GOp.A00(list, i2)));
            i2++;
        }
    }

    public final void DDM(MKz mKz, Object obj, int i) {
        K7H k7h = this.A00;
        k7h.A0H(i, 3);
        mKz.DD5(k7h.A01, obj);
        k7h.A0H(i, 4);
    }

    public final void DDN(int i, int i2) {
        this.A00.A0G(i, i2);
    }

    public final void DDO(List list, int i, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.A00.A0G(i, DKE.A0G(list, i2));
                i2++;
            }
            return;
        }
        K7H A00 = A00(this, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += K7H.A01(DKE.A0G(list, i4));
        }
        A00.A0E(i3);
        while (i2 < list.size()) {
            A00.A0D(DKE.A0G(list, i2));
            i2++;
        }
    }

    public final void DDP(int i, long j) {
        this.A00.A0K(i, j);
    }

    public final void DDQ(List list, int i, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.A00.A0K(i, AbK.A08(list, i2));
                i2++;
            }
            return;
        }
        K7H A00 = A00(this, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += K7H.A01(AbK.A08(list, i4));
        }
        A00.A0E(i3);
        while (i2 < list.size()) {
            A00.A0O(AbK.A08(list, i2));
            i2++;
        }
    }

    public final void DDS(MKz mKz, Object obj, int i) {
        MQk mQk = (MQk) obj;
        K7H k7h = this.A00;
        k7h.A0E((i << 3) | 2);
        k7h.A0E(((Lda) mQk).A0L(mKz));
        mKz.DD5(k7h.A01, mQk);
    }

    public final void DDT(int i, int i2) {
        this.A00.A0F(i, i2);
    }

    public final void DDU(List list, int i, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.A00.A0F(i, DKE.A0G(list, i2));
                i2++;
            }
            return;
        }
        K7H A00 = A00(this, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3 += 4;
        }
        A00.A0E(i3);
        while (i2 < list.size()) {
            A00.A0C(DKE.A0G(list, i2));
            i2++;
        }
    }

    public final void DDW(int i, long j) {
        this.A00.A0J(i, j);
    }

    public final void DDX(List list, int i, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.A00.A0J(i, AbK.A08(list, i2));
                i2++;
            }
            return;
        }
        K7H A00 = A00(this, i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3 += 8;
        }
        A00.A0E(i3);
        while (i2 < list.size()) {
            A00.A0N(AbK.A08(list, i2));
            i2++;
        }
    }
}
