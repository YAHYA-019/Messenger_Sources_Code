package X;

import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ReverseNaturalOrdering;

/* renamed from: X.6b4, reason: invalid class name */
/* loaded from: 6b4.class */
public final class C6b4 extends C6b5 implements Comparable {
    public final int A00;
    public final 6XI A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: Code restructure failed: missing block: B:117:0x018e, code lost:
    
        if (r304.apply(r0) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0104, code lost:
    
        if ((r0 & 1) != 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6b4(X.6YP r302, X.6XI r303, com.google.common.base.Predicate r304, int r305, int r306, int r307, boolean r308) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6b4.<init>(X.6YP, X.6XI, com.google.common.base.Predicate, int, int, int, boolean):void");
    }

    public static int A00(C6b4 c6b4, C6b4 c6b42) {
        C1zA c1zA;
        C1zA A03;
        boolean z = c6b4.A02;
        if (z && c6b4.A0H) {
            c1zA = 6XX.A07;
            A03 = c1zA;
        } else {
            c1zA = 6XX.A07;
            A03 = c1zA.A03();
        }
        2xG A05 = 2xG.A00.A05(c6b4.A0H, c6b42.A0H);
        Integer valueOf = Integer.valueOf(c6b4.A09);
        Integer valueOf2 = Integer.valueOf(c6b42.A09);
        ReverseNaturalOrdering reverseNaturalOrdering = ReverseNaturalOrdering.A00;
        2xG A04 = A05.A04(valueOf, valueOf2, reverseNaturalOrdering).A02(c6b4.A0A, c6b42.A0A).A02(c6b4.A0C, c6b42.A0C).A05(c6b4.A0G, c6b42.A0G).A05(c6b4.A0F, c6b42.A0F).A04(Integer.valueOf(c6b4.A07), Integer.valueOf(c6b42.A07), reverseNaturalOrdering).A02(c6b4.A08, c6b42.A08).A05(z, c6b42.A02).A04(Integer.valueOf(c6b4.A0B), Integer.valueOf(c6b42.A0B), reverseNaturalOrdering);
        Integer valueOf3 = Integer.valueOf(c6b4.A05);
        Integer valueOf4 = Integer.valueOf(c6b42.A05);
        2xG A042 = A04.A04(valueOf3, valueOf4, ((6XJ) c6b4.A01).A0O ? c1zA.A03() : 6XX.A08).A05(c6b4.A04, c6b42.A04).A05(c6b4.A03, c6b42.A03).A04(Integer.valueOf(c6b4.A06), Integer.valueOf(c6b42.A06), A03).A04(Integer.valueOf(c6b4.A0D), Integer.valueOf(c6b42.A0D), A03);
        if (!Util.A0P(c6b4.A0E, c6b42.A0E)) {
            A03 = 6XX.A08;
        }
        return A042.A04(valueOf3, valueOf4, A03).A01();
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return A00(this, (C6b4) obj);
    }
}
