package X;

import java.util.ArrayList;

/* loaded from: Ipr.class */
public final class Ipr implements Runnable {
    public static final String __redex_internal_original_name = "ViewImpressionTracker$impressionTrackerIdleProcessor$1";
    public final /* synthetic */ I02 A00;

    public Ipr(I02 i02) {
        this.A00 = i02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I02 i02 = this.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        Htv htv = i02.A06;
        if (htv != null) {
            htv.A02(A0s);
        }
        C00p c00p = i02.A03;
        int A00 = c00p.A00();
        for (int i = 0; i < A00; i++) {
            Htv htv2 = (Htv) c00p.A04(i);
            if (htv2 != null) {
                htv2.A02(A0s);
            }
        }
        i02.A07.Bbs(A0s);
        if (htv != null) {
            htv.A00();
        }
        int A002 = c00p.A00();
        for (int i2 = 0; i2 < A002; i2++) {
            Htv htv3 = (Htv) c00p.A04(i2);
            if (htv3 != null) {
                htv3.A00();
            }
        }
        int A003 = c00p.A00() - 1;
        while (true) {
            int i3 = A003;
            if (-1 >= i3) {
                break;
            }
            c00p.A04(i3);
            A003 = i3 - 1;
        }
        0QO r0 = i02.A04;
        int size = r0.size() - 1;
        while (true) {
            int i4 = size;
            if (-1 >= i4) {
                return;
            }
            r0.A06(i4);
            size = i4 - 1;
        }
    }
}
