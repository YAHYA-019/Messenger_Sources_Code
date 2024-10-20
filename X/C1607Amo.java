package X;

/* renamed from: X.Amo, reason: case insensitive filesystem */
/* loaded from: Amo.class */
public final class C1607Amo extends 1RM {
    public final /* synthetic */ Bwr A00;
    public final /* synthetic */ String A01;

    public C1607Amo(Bwr bwr, String str) {
        this.A00 = bwr;
        this.A01 = str;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        7Lj r0;
        Bwr bwr = this.A00;
        ((C3S) bwr.A03.get()).A00();
        REp rEp = bwr.A00;
        if (rEp == null || (r0 = rEp.A00) == null) {
            return;
        }
        r0.AFG();
    }

    public void A03(Throwable th) {
        7Lj r0;
        Bwr bwr = this.A00;
        1BK.A09(bwr.A04).D0v(Bwr.class.getName(), 0Pz.A0v("admin_accept_appointment: ", this.A01, " ", th.getMessage()));
        AbN.A1Q(AbF.A0v(bwr.A05), 2131957335);
        REp rEp = bwr.A00;
        if (rEp == null || (r0 = rEp.A00) == null) {
            return;
        }
        r0.AFG();
    }
}
