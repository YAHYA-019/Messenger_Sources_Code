package X;

import com.mapbox.mapboxsdk.R;

/* renamed from: X.8j8, reason: invalid class name */
/* loaded from: 8j8.class */
public final class C8j8 extends C1rj {
    public Dky A00;

    public C8j8() {
        super("InstantGamesFloatingTournamentIconComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Dky dky = this.A00;
        11T.A0H(r302, dky);
        C1rq A00 = C1rg.A00(r302);
        A00.A0d();
        A00.A2L("show_tournament_icon");
        A00.A2b();
        A00.A2c();
        A00.A1M(2132279321);
        A00.A2B(C26z.VERTICAL, R.dimen.mapbox_eight_dp);
        A00.A1X(R.dimen.mapbox_eight_dp);
        C1rq A002 = C1rg.A00(r302);
        DuS A003 = DzF.A00(r302);
        A003.A2X(dky);
        A003.A0V();
        A002.A2f(A003.A2W());
        A00.A2W(A002);
        1LI A2V = A00.A2V();
        11T.A0A(A2V);
        return A2V;
    }
}
