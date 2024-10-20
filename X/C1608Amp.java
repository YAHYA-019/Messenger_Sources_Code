package X;

/* renamed from: X.Amp, reason: case insensitive filesystem */
/* loaded from: Amp.class */
public final class C1608Amp extends 1RM {
    public final /* synthetic */ 1Br A00;
    public final /* synthetic */ Bsv A01;
    public final /* synthetic */ RJP A02;

    public C1608Amp(1Br r302, Bsv bsv, RJP rjp) {
        this.A02 = rjp;
        this.A00 = r302;
        this.A01 = bsv;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        2JY A0B;
        2JY r0 = (2JY) obj;
        AbN.A1Q(AbJ.A0k(this.A00), 2131964250);
        RJP rjp = this.A02;
        if (r0 != null && (A0B = 1BK.A0B(r0, 2JX.class, -16660799, 192379266)) != null) {
            A0B.A0r(1234304940);
        }
        7Lj r02 = rjp.A00;
        if (r02 != null) {
            r02.AFG();
        }
    }

    public void A03(Throwable th) {
        11T.A0F(th, 0);
        AbN.A1Q(AbJ.A0k(this.A00), 2131957335);
        1Br.A04(this.A01.A01).softReport("MessagingOffersMutator", "Create BIO from Offer mutation failed with exception: ", th);
        7Lj r0 = this.A02.A00;
        if (r0 != null) {
            r0.AFG();
        }
    }
}
