package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.1mA, reason: invalid class name */
/* loaded from: 1mA.class */
public final class C1mA {
    public final C0t9 A00;
    public final C0t9 A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A05;
    public final 1Br A06;
    public final 1BP A07 = FbInjector.A00;
    public final 1Br A04 = 1Bq.A00(83604);

    public C1mA() {
        Context context = FbInjector.A03;
        11T.A0A(context);
        this.A01 = 0Zi.A01(context);
        Context context2 = FbInjector.A03;
        11T.A0A(context2);
        this.A00 = 0Zi.A01(context2);
        this.A03 = 1Bq.A00(16385);
        this.A02 = 1Bq.A00(16884);
        this.A06 = 1Bu.A00(66786);
        this.A05 = 1Bq.A00(83870);
    }

    private final boolean A00() {
        boolean z;
        if (1Br.A0B(this.A04) == C0et.A0C) {
            z = ((C3Qw) 1Br.A0B(this.A05)).A01();
        } else {
            z = true;
            if (!1Br.A07(this.A03).AZk(36311204007315988L)) {
                C3Qw c3Qw = (C3Qw) ((1yK) 1Br.A0B(this.A02)).A00.get();
                C3Qw.A00(c3Qw);
                if (c3Qw.A02) {
                    return false;
                }
            }
        }
        return z;
    }

    public final boolean A01() {
        C00i c00i = this.A04.A00;
        Object obj = c00i.get();
        C0et c0et = C0et.A0P;
        if (obj == c0et && this.A01.A61) {
            return true;
        }
        if (c00i.get() == c0et && this.A01.A62) {
            return true;
        }
        this.A06.A00.get();
        return false;
    }

    public final boolean A02() {
        C00i c00i = this.A04.A00;
        if (c00i.get() == C0et.A0C && A00() && this.A00.A5e) {
            return true;
        }
        if (c00i.get() == C0et.A0P && this.A01.A61) {
            return true;
        }
        this.A06.A00.get();
        return false;
    }

    public final boolean A03() {
        C00i c00i = this.A04.A00;
        if (c00i.get() == C0et.A0C && A00() && this.A00.A5f) {
            return true;
        }
        return c00i.get() == C0et.A0P && this.A01.A62;
    }

    public final boolean A04() {
        C00i c00i = this.A04.A00;
        if (c00i.get() == C0et.A0C && A00() && this.A00.A5g) {
            return true;
        }
        return c00i.get() == C0et.A0P && this.A01.A63;
    }
}
