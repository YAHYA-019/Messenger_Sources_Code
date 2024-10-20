package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.2cs, reason: invalid class name */
/* loaded from: 2cs.class */
public final class C2cs {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1De A07;

    public C2cs(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A07 = r303;
        this.A00 = 1Bq.A00(99390);
        this.A01 = 1Bq.A00(66258);
        this.A02 = 1Bq.A00(33013);
        this.A04 = 1Bq.A00(66572);
        1BY r0 = r303.A00;
        this.A05 = 1Lm.A03(fbUserSession, r0, 67218);
        this.A06 = 1Bu.A03(r0, 65998);
        this.A03 = 1Lm.A03(fbUserSession, r0, 84165);
    }

    public void A00(boolean z) {
        1Ql edit = ((FbSharedPreferences) this.A02.A00.get()).edit();
        1G9 r0 = 1NK.A4c;
        11T.A0F(this.A06.A00.get(), 1);
        edit.putBoolean(C1wg.A02(r0), z).commitImmediately();
        ((C2ct) this.A03.A00.get()).A00(new AnonymousClass303(0), 2, z);
    }
}
