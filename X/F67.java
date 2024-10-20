package X;

import android.view.View;

/* loaded from: F67.class */
public final class F67 {
    public View A00;
    public final FyG A01;
    public final C01i A02;
    public final C01i A03;
    public final C01i A04;

    public F67(FyG fyG, DLQ dlq) {
        this.A01 = fyG;
        C03i c03i = C03i.A02;
        this.A03 = C01g.A00(c03i, new JR4(dlq, 36));
        this.A02 = C01g.A00(c03i, new JR4(dlq, 35));
        this.A04 = C01g.A00(c03i, new JR6(this, dlq, 18));
    }

    public static final void A00(F67 f67, DLQ dlq, boolean z, boolean z2) {
        ((Eum) f67.A04.getValue()).A01 = true;
        GJj gJj = (GJj) f67.A03.getValue();
        DKM A00 = DKM.A00();
        A00.A0H(Boolean.valueOf(z));
        FAv.A01(dlq, f67.A01, DKM.A07(A00, Boolean.valueOf(z2), 1), gJj);
    }
}
