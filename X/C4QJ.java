package X;

import com.google.common.base.Platform;

/* renamed from: X.4QJ, reason: invalid class name */
/* loaded from: 4QJ.class */
public final class C4QJ extends FIJ {
    public 1BY A00;
    public final 1RX A01;
    public final 1YY A02;
    public final C00i A03;
    public final GL7 A04;
    public final C00i A05;

    public C4QJ(1BO r302, GL7 gl7, FyG fyG) {
        super(gl7, fyG);
        this.A01 = (1RX) 1Bi.A03(67199);
        this.A03 = 1BQ.A02(99543);
        this.A02 = (1YY) 1Bi.A03(66401);
        this.A05 = 1BQ.A02(16477);
        this.A00 = new 1BY(r302);
        this.A04 = gl7;
    }

    public void A08(FyG fyG) {
        GL7 gl7 = this.A04;
        if (Platform.stringIsNullOrEmpty(gl7.BCx(36, ""))) {
            0fH.A0B(C4QJ.class, "Event is required for log action");
            FAo.A00(fyG, AnonymousClass001.A0N("Missing event name for log-event action"));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = gl7.getBoolean(50, true);
        Runnable runnable = new 4XM(EUX.A00(fyG), this, fyG, currentTimeMillis);
        if (z) {
            1BK.A1E(this.A05).execute(runnable);
        } else {
            runnable.run();
        }
    }
}
