package X;

import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.4bB, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4bB.class */
public final class C04544bB {
    public final 1Br A01;
    public final boolean A02;
    public final 1Br A03 = 1Bq.A00(16705);
    public final long A00 = A00(this).generateFlowId(70323856, 0);

    public C04544bB() {
        1Br A00 = 1Bq.A00(16385);
        this.A01 = A00;
        this.A02 = ((2yD) A00.A00.get()).AZk(36325652273582971L);
    }

    public static final UserFlowLogger A00(C04544bB c04544bB) {
        return (UserFlowLogger) c04544bB.A03.A00.get();
    }

    public static final void A01(C04544bB c04544bB, String str, String str2) {
        UserFlowLogger A00 = A00(c04544bB);
        long j = c04544bB.A00;
        if (!A00.isOngoingFlow(j) || str == null || str2 == null) {
            return;
        }
        A00(c04544bB).flowAnnotate(j, str, str2);
    }

    public final void A02(C82d c82d, String str) {
        11T.A0F(c82d, 0);
        11T.A0F(str, 1);
        A01(this, c82d.A00, str);
    }

    public final void A03(C82l c82l) {
        11T.A0F(c82l, 0);
        UserFlowLogger A00 = A00(this);
        long j = this.A00;
        if (A00.isOngoingFlow(j)) {
            A00(this).flowMarkPoint(j, c82l.A02);
            A00(this).flowAnnotateWithCrucialData(j, "lc", "4");
            A00(this).flowEndSuccess(j);
        }
    }

    public final void A04(C82l c82l) {
        11T.A0F(c82l, 0);
        UserFlowLogger A00 = A00(this);
        long j = this.A00;
        if (A00.isOngoingFlow(j)) {
            A00(this).flowMarkPoint(j, c82l.A02);
            A00(this).flowAnnotateWithCrucialData(j, "lc", c82l.A01);
        }
    }
}
