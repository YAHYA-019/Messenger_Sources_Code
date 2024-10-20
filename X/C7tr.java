package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7tr, reason: invalid class name */
/* loaded from: 7tr.class */
public final class C7tr {
    public static int A03;
    public 6On A00;
    public 6On A01;
    public ArrayList A02;

    public static long A00(7Z2 r301, C7tr c7tr, long j) {
        6On r0 = r301.A05;
        if (r0 instanceof C7aw) {
            return j;
        }
        List list = r301.A07;
        int size = list.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            7Z2 r02 = (6Oo) list.get(i);
            if (r02 instanceof 7Z2) {
                7Z2 r03 = r02;
                if (r03.A05 != r0) {
                    j2 = Math.min(j2, A00(r03, c7tr, r03.A00 + j));
                }
            }
        }
        if (r301 == r0.A03) {
            long A09 = r0.A09();
            7Z2 r04 = r0.A04;
            long j3 = j - A09;
            j2 = Math.min(Math.min(j2, A00(r04, c7tr, j3)), j3 - r04.A00);
        }
        return j2;
    }

    public static long A01(7Z2 r301, C7tr c7tr, long j) {
        6On r0 = r301.A05;
        if (r0 instanceof C7aw) {
            return j;
        }
        List list = r301.A07;
        int size = list.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            7Z2 r02 = (6Oo) list.get(i);
            if (r02 instanceof 7Z2) {
                7Z2 r03 = r02;
                if (r03.A05 != r0) {
                    j2 = Math.max(j2, A01(r03, c7tr, r03.A00 + j));
                }
            }
        }
        if (r301 == r0.A04) {
            long A09 = r0.A09();
            7Z2 r04 = r0.A03;
            long j3 = j + A09;
            j2 = Math.max(Math.max(j2, A01(r04, c7tr, j3)), j3 - r04.A00);
        }
        return j2;
    }
}
