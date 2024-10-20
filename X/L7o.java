package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* loaded from: L7o.class */
public final class L7o {
    public final float A00;
    public final float A01;
    public final int A02;
    public final LPl A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final int A07;

    public L7o(LPl lPl, int i, long j, boolean z) {
        boolean z2;
        this.A03 = lPl;
        this.A07 = i;
        if (Constraints.A03(j) != 0 || Constraints.A02(j) != 0) {
            throw AnonymousClass001.A0L("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList A0s = AnonymousClass001.A0s();
        List list = lPl.A01;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        while (i2 < size) {
            Kt9 kt9 = (Kt9) list.get(i2);
            LPm lPm = kt9.A02;
            int A01 = Constraints.A01(j);
            boolean A08 = Constraints.A08(j);
            int A00 = Constraints.A00(j);
            if (A08) {
                A00 -= (int) Math.ceil(f);
                if (A00 < 0) {
                    A00 = 0;
                }
            }
            long A02 = LCY.A02(0, A01, 0, A00);
            int i4 = this.A07 - i3;
            11T.A0I(lPm, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
            LPk lPk = new LPk(lPm, i4, A02, z);
            float Aov = f + lPk.Aov();
            LAI lai = lPk.A01;
            int i5 = i3 + lai.A05;
            A0s.add(new Kth(lPk, f, Aov, kt9.A01, kt9.A00, i3, i5));
            if (lai.A0A || (i5 == this.A07 && i2 != JQy.A0I(this.A03.A01))) {
                i3 = i5;
                f = Aov;
                z2 = true;
                break;
            } else {
                i2++;
                i3 = i5;
                f = Aov;
            }
        }
        z2 = false;
        this.A00 = f;
        this.A02 = i3;
        this.A06 = z2;
        this.A04 = A0s;
        this.A01 = Constraints.A01(j);
        ArrayList A10 = 1BL.A10(A0s);
        int size2 = A0s.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Kth kth = (Kth) A0s.get(i6);
            List list2 = kth.A06.A04;
            ArrayList A1B = AbJ.A1B(list2);
            int size3 = list2.size();
            int i7 = 0;
            while (true) {
                int i8 = i7;
                if (i8 < size3) {
                    L5L l5l = (L5L) list2.get(i8);
                    A1B.add(l5l != null ? l5l.A02(KvH.A00(0.0f, kth.A01)) : null);
                    i7 = i8 + 1;
                }
            }
            0QU.A0t(A1B, A10);
        }
        if (A10.size() < this.A03.A02.size()) {
            int size4 = this.A03.A02.size() - A10.size();
            ArrayList A0t = AnonymousClass001.A0t(size4);
            for (int i9 = 0; i9 < size4; i9++) {
                A0t.add(null);
            }
            A10 = 0QD.A0O(A0t, A10);
        }
        this.A05 = A10;
    }

    public static Kth A00(L5R l5r, int i) {
        int i2;
        L7o l7o = l5r.A03;
        A01(l7o, i);
        List list = l7o.A04;
        int size = list.size() - 1;
        int i3 = 0;
        while (true) {
            if (i3 > size) {
                i2 = -(i3 + 1);
                break;
            }
            i2 = (i3 + size) >>> 1;
            Kth kth = (Kth) list.get(i2);
            if (kth.A03 <= i) {
                if (kth.A02 > i) {
                    break;
                }
                i3 = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return (Kth) list.get(i2);
    }

    public static final void A01(L7o l7o, int i) {
        if (i < 0 || i >= l7o.A02) {
            throw JR1.A0l("lineIndex(", ") is out of bounds [0, ", i, l7o.A02);
        }
    }
}
