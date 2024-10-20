package X;

import java.util.HashSet;
import java.util.List;

/* renamed from: X.5i8, reason: invalid class name */
/* loaded from: 5i8.class */
public final class C5i8 extends C5hy {
    public 5XS A01;
    public final int A05;
    public final 5XP A06;
    public final List A07;
    public final 2XX A08;
    public final HashSet A09 = new HashSet();
    public int A00 = 0;
    public int A04 = 0;
    public boolean A02 = false;
    public boolean A03 = false;

    public C5i8(List list, int i) {
        this.A05 = i;
        this.A07 = list;
        if (list.isEmpty()) {
            throw AnonymousClass001.A0L("Empty binding parallel");
        }
        this.A06 = new 5XP() { // from class: X.674
            public void Bn1(C5hy c5hy) {
                C5i8.A00(c5hy, C5i8.this);
            }

            public void Bye(C5hy c5hy) {
                C5i8.A00(c5hy, C5i8.this);
            }

            public void CIr(C5hy c5hy) {
            }

            public void CVA(C5hy c5hy) {
            }

            public boolean Cyp(C5hy c5hy) {
                return true;
            }
        };
        this.A08 = i == 0 ? null : new 2XX() { // from class: X.80m
            public void A01(long j) {
                C5i8 c5i8 = C5i8.this;
                if (c5i8.A03) {
                    C5i8.A01(c5i8);
                }
            }
        };
    }

    public static void A00(C5hy c5hy, C5i8 c5i8) {
        HashSet hashSet = c5i8.A09;
        if (hashSet.contains(c5hy)) {
            throw AnonymousClass001.A0T("Binding unexpectedly completed twice");
        }
        hashSet.add(c5hy);
        c5i8.A04++;
        c5hy.A01.remove(c5i8.A06);
        if (c5i8.A04 >= c5i8.A07.size()) {
            c5i8.A03 = false;
            c5i8.A03();
        }
    }

    public static void A01(C5i8 c5i8) {
        List list = c5i8.A07;
        ((C5hy) list.get(c5i8.A00)).A09(c5i8.A01);
        int i = c5i8.A00 + 1;
        c5i8.A00 = i;
        if (i < list.size()) {
            C5i1.A02.A02(c5i8.A08, c5i8.A05);
        }
    }
}
