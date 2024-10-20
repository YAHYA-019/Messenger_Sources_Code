package X;

import java.text.BreakIterator;

/* renamed from: X.JeB, reason: case insensitive filesystem */
/* loaded from: JeB.class */
public final class C2946JeB extends LPZ {
    public static C2946JeB A01;
    public BreakIterator A00;

    public int[] ATU(int i) {
        int A012 = LPZ.A01(this);
        if (A012 <= 0 || i >= A012) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.A00;
            if (breakIterator != null) {
                boolean isBoundary = breakIterator.isBoundary(i);
                BreakIterator breakIterator2 = this.A00;
                if (isBoundary) {
                    if (breakIterator2 != null) {
                        int following = breakIterator2.following(i);
                        if (following != -1) {
                            return A03(i, following);
                        }
                        return null;
                    }
                } else if (breakIterator2 != null) {
                    i = breakIterator2.following(i);
                }
            }
            11T.A0L("impl");
            throw 0Q8.createAndThrow();
        } while (i != -1);
        return null;
    }

    public int[] CYJ(int i) {
        int A012 = LPZ.A01(this);
        if (A012 <= 0 || i <= 0) {
            return null;
        }
        if (i > A012) {
            i = A012;
        }
        do {
            BreakIterator breakIterator = this.A00;
            if (breakIterator != null) {
                boolean isBoundary = breakIterator.isBoundary(i);
                BreakIterator breakIterator2 = this.A00;
                if (isBoundary) {
                    if (breakIterator2 != null) {
                        int preceding = breakIterator2.preceding(i);
                        if (preceding != -1) {
                            return A03(preceding, i);
                        }
                        return null;
                    }
                } else if (breakIterator2 != null) {
                    i = breakIterator2.preceding(i);
                }
            }
            11T.A0L("impl");
            throw 0Q8.createAndThrow();
        } while (i != -1);
        return null;
    }
}
