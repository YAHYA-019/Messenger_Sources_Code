package X;

import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.ReverseNaturalOrdering;
import java.util.Comparator;

/* loaded from: K1V.class */
public final class K1V extends C6b5 implements Comparable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x012f, code lost:
    
        if (r304 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public K1V(X.6YP r302, X.6XI r303, java.lang.String r304, int r305, int r306, int r307) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K1V.<init>(X.6YP, X.6XI, java.lang.String, int, int, int):void");
    }

    public static int A00(K1V k1v, K1V k1v2) {
        2xG A05 = 2xG.A00.A05(k1v.A08, k1v2.A08);
        Integer valueOf = Integer.valueOf(k1v.A00);
        Integer valueOf2 = Integer.valueOf(k1v2.A00);
        Comparator comparator = NaturalOrdering.A02;
        Comparator comparator2 = ReverseNaturalOrdering.A00;
        2xG A04 = A05.A04(valueOf, valueOf2, comparator2);
        int i = k1v.A01;
        2xG A02 = A04.A02(i, k1v2.A01);
        int i2 = k1v.A02;
        2xG A052 = A02.A02(i2, k1v2.A02).A05(k1v.A06, k1v2.A06);
        Boolean valueOf3 = Boolean.valueOf(k1v.A07);
        Boolean valueOf4 = Boolean.valueOf(k1v2.A07);
        if (i != 0) {
            comparator = comparator2;
        }
        2xG A022 = A052.A04(valueOf3, valueOf4, comparator).A02(k1v.A03, k1v2.A03);
        if (i2 == 0) {
            A022 = A022.A06(k1v.A05, k1v2.A05);
        }
        return A022.A01();
    }

    @Override // X.C6b5
    public int A01() {
        return this.A04;
    }

    @Override // X.C6b5
    public /* bridge */ /* synthetic */ boolean A02(C6b5 c6b5) {
        return false;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return A00(this, (K1V) obj);
    }
}
