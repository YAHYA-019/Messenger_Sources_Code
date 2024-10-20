package X;

/* loaded from: B45.class */
public final class B45 extends C6W {
    public 1BY A00;
    public final C00i A02 = AbH.A0N();
    public final C00i A01 = new Cgz(this, 1);

    public B45(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A03(long j, String str) {
        1UG A08 = 1BK.A08(A01(), 1BJ.A00(1059));
        if (A08.isSampled()) {
            1UG.A02(A08, "biim");
            0DA r0 = new 0DA();
            r0.A07("suggestion_source", str);
            1UG.A01(r0, A08);
            A08.A6H("page_id", A02());
            A08.A7R("consumer_id", Long.toString(j));
            A08.A5c(BOI.A03, "suggestion_type");
            A08.BZL();
        }
    }
}
