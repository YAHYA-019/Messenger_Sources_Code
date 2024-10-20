package X;

import java.util.List;

/* loaded from: Irv.class */
public final class Irv implements Runnable {
    public static final String __redex_internal_original_name = "MediaSyncReelsPlaybackPresenter$onReelScrolled$2";
    public final /* synthetic */ GrO A00;

    public Irv(GrO grO) {
        this.A00 = grO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GrO grO = this.A00;
        Object A0r = AbM.A0r(((GS2) grO).A01);
        11T.A0A(A0r);
        C2643Gjx c2643Gjx = (C2643Gjx) A0r;
        boolean z = c2643Gjx.A08;
        boolean z2 = c2643Gjx.A07;
        boolean z3 = c2643Gjx.A09;
        boolean z4 = c2643Gjx.A0A;
        boolean z5 = c2643Gjx.A0C;
        boolean z6 = c2643Gjx.A0B;
        List list = c2643Gjx.A05;
        GjV gjV = c2643Gjx.A01;
        String str = c2643Gjx.A02;
        HDc hDc = c2643Gjx.A00;
        String str2 = c2643Gjx.A03;
        String str3 = c2643Gjx.A04;
        7zP.A1N(list, 6, hDc);
        grO.A0Z(new C2643Gjx(hDc, gjV, str, str2, str3, list, z, z2, z3, z4, z5, z6, false));
    }
}
