package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.2cv, reason: invalid class name */
/* loaded from: 2cv.class */
public final class C2cv {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1De A09;

    public C2cv(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A09 = r303;
        this.A00 = 1Bq.A00(99390);
        this.A01 = 1Bq.A00(66258);
        this.A02 = 1Bq.A00(33013);
        1BY r0 = r303.A00;
        this.A03 = 1Lm.A03(fbUserSession, r0, 84165);
        this.A05 = 1Bq.A00(66572);
        this.A04 = 1Lm.A03(fbUserSession, r0, 67217);
        this.A06 = 1Lm.A03(fbUserSession, r0, 67218);
        this.A07 = 1Bu.A03(r0, 67219);
        this.A08 = 1Bu.A03(r0, 65998);
    }

    public static void A00(C2cv c2cv, long j) {
        1Ql A08 = 1Br.A08(c2cv.A02);
        A08.CaH(1Br.A0A(c2cv.A08, 1NK.A5K), j);
        A08.commitImmediately();
    }

    public static void A01(C2cv c2cv, long j) {
        1Ql A08 = 1Br.A08(c2cv.A02);
        A08.CaH(1Br.A0A(c2cv.A08, 1NK.A5M), j);
        A08.commitImmediately();
    }

    public void A02(boolean z) {
        1Ql edit = ((FbSharedPreferences) this.A02.A00.get()).edit();
        1G9 r0 = 1NK.A5L;
        11T.A0F(this.A08.A00.get(), 1);
        edit.putBoolean(C1wg.A02(r0), z).commitImmediately();
        ((C2ct) this.A03.A00.get()).A00(new AnonymousClass303(1), 1, z);
    }
}
