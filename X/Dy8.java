package X;

import com.facebook.api.feedtype.FeedType;

/* loaded from: Dy8.class */
public final class Dy8 extends C1rj {
    public int A00;
    public 1LI A01;
    public 24X A02;

    public Dy8() {
        super("LoggingComponent");
        this.A00 = -2;
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, null, null, this.A02, null, null, Integer.valueOf(this.A00), 1BK.A0d()};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        Dy8 dy8 = (Dy8) super.A0l();
        dy8.A01 = 4YV.A0J(dy8.A01);
        return dy8;
    }

    @Override // X.C1rj
    public 1LI A0x() {
        return this.A01;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        E04 e04 = (E04) 4YU.A0P(r302);
        1LI r0 = this.A01;
        24X r02 = this.A02;
        24X r03 = e04.A01;
        3TI r04 = e04.A00;
        if (r04 != null && r03 != r02) {
            r04.A05(r02);
        }
        return 7zM.A0p(r0, r302).A2W();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        A00.A03(3TI.class, ((E04) 4YU.A0P(r302)).A00);
        A00.A03(FeedType.class, null);
        return A00;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        3TI r309;
        E04 e04 = (E04) r303;
        24X r0 = this.A02;
        3TI r02 = (3TI) r302.A09(3TI.class);
        3TI r307 = null;
        1Br A00 = 1Bu.A00(99707);
        if (r02 != null && r02.A00 != null) {
            r307 = r02;
        }
        if (r307 != null) {
            r309 = new 3TI(r307.A03, r307, r307.A00, "LC");
        } else {
            r309 = new 3TI(new 3IW((Ebh) A00.get()), (3TI) null, r0, "LC");
        }
        r309.A05(r0);
        if (r0 != null) {
            e04.A01 = r0;
        }
        e04.A00 = r309;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
