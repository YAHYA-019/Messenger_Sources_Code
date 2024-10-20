package com.facebook.cloudseeder;

import X.0Qf;
import X.0S2;
import X.1BQ;
import X.1Km;
import X.1MG;
import X.1PU;
import X.1PX;
import X.AnonymousClass045;
import X.C00i;
import X.C02S;
import X.C03b;
import X.C3263JoT;
import X.C3264JoU;
import X.L3I;
import android.os.Process;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: TransientNetworkTraceLateInit.class */
public final class TransientNetworkTraceLateInit extends 1Km {
    public final C00i A00 = new 1BQ(16520);
    public final AtomicReference A02 = new AtomicReference();
    public final AtomicReference A01 = new AtomicReference(C02S.A03);

    public static 1PU A02(TransientNetworkTraceLateInit transientNetworkTraceLateInit) {
        1PX r0;
        AtomicReference atomicReference = transientNetworkTraceLateInit.A02;
        0Qf A00 = 0Qf.A00();
        synchronized (A00) {
            r0 = A00.A00;
        }
        1MG.A00(atomicReference, (Object) null, r0);
        return (1PU) atomicReference.get();
    }

    public C02S Au6() {
        return (C02S) this.A01.get();
    }

    public void C5Z(C03b c03b) {
        1PU A02 = A02(this);
        if (A02 != null) {
            String At1 = c03b.At1();
            String At2 = c03b.At2();
            C3264JoU c3264JoU = 1PU.A00(A02).A0H;
            if (c3264JoU.A0J.isEmpty() || At1 == null || At2 == null) {
                return;
            }
            int length = At1.length();
            int length2 = At2.length();
            if (length == 0 || length2 == 0 || length + length2 > 256) {
                return;
            }
            c3264JoU.A01.A07.A02(new L3I(0S2.A01, Integer.valueOf(Process.myTid()), Integer.valueOf(c03b.BHz()), Integer.valueOf(c03b.getMarkerId()), Integer.valueOf(c03b.Asy()), Long.valueOf(c03b.AtA()), Long.valueOf(1Km.A00(c03b) | c03b.Asy() | 281474976710656L), (String) null, At1, At2));
        }
    }

    public void C5e(AnonymousClass045 anonymousClass045, C03b c03b, String str, int i, long j, long j2, boolean z) {
        String str2;
        1PU A02 = A02(this);
        if (A02 != null) {
            C3264JoU c3264JoU = ((C3263JoT) A02.A01.get()).A0H;
            if (c3264JoU.A0J.isEmpty()) {
                return;
            }
            long j3 = 0;
            if (z) {
                j3 = j;
            }
            String str3 = null;
            if (anonymousClass045 != null) {
                str2 = anonymousClass045.toString();
                str3 = "QPL::data";
            } else {
                str2 = null;
            }
            c3264JoU.A01.A07.A02(new L3I(0S2.A0u, Integer.valueOf(Process.myTid()), Integer.valueOf(c03b.BHz()), Integer.valueOf(c03b.getMarkerId()), Integer.valueOf(c03b.Asy()), Long.valueOf(j3), Long.valueOf(1Km.A00(c03b) | ((i << 60) & (-1152921504606846976L))), str, str3, str2));
        }
    }

    public void C5i(C03b c03b) {
        1PU A02 = A02(this);
        if (A02 != null) {
            C3264JoU c3264JoU = 1PU.A00(A02).A0H;
            if (c3264JoU.A0J.isEmpty()) {
                return;
            }
            long A00 = 1Km.A00(c03b) | c03b.Asy();
            if (!c03b.BX4()) {
                A00 |= 281474976710656L;
            }
            String A002 = C3264JoU.A00(c03b);
            if (!A002.isEmpty()) {
                c3264JoU.A01.A07.A02(new L3I(0S2.A15, Integer.valueOf(Process.myTid()), Integer.valueOf(c03b.BHz()), Integer.valueOf(c03b.getMarkerId()), (Integer) null, Long.valueOf(c03b.AyF()), Long.valueOf(A00), (String) null, "TAGS", A002));
            }
            1Km.A01(c3264JoU.A01.A07, c03b, 0S2.A0N, A00);
        }
    }

    public String getName() {
        return "cloudseeder";
    }
}
