package X;

import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Cl4.class */
public final class Cl4 implements DFA {
    public final /* synthetic */ AmL A00;

    public Cl4(AmL amL) {
        this.A00 = amL;
    }

    public void CPj(int i) {
        Long A0l;
        java.util.Map A1D;
        int i2;
        int i3;
        AmL amL = this.A00;
        amL.A00 = i;
        if (2oI.A07(amL.A07)) {
            C1306Adj A0W = AbJ.A0W();
            C60b c60b = (C60b) 1Bn.A0A(82380);
            int i4 = amL.A00;
            ThreadSummary threadSummary = amL.A07;
            if (i4 == 0) {
                if (threadSummary == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                A0l = 4YU.A0l(threadSummary.A0n);
                A1D = 1BK.A1D("is_admin", String.valueOf(c60b.A08(threadSummary)));
                i2 = 66;
                i3 = 38;
            } else {
                if (threadSummary == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                A0l = 4YU.A0l(threadSummary.A0n);
                A1D = 1BK.A1D("is_admin", String.valueOf(c60b.A08(threadSummary)));
                i2 = 66;
                i3 = 1;
            }
            C1306Adj.A0D(A0W, A0l, A1D, i2, i3, 9);
        }
        AmL.A08(amL);
    }
}
