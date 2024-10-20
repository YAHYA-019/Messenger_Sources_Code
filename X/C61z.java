package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.61z, reason: invalid class name */
/* loaded from: 61z.class */
public final class C61z {
    public final 1Br A00;
    public final 1De A01;
    public final 1Br A02 = 1Bq.A00(33013);

    public C61z(1De r302) {
        this.A01 = r302;
        1Br A03 = 1Bu.A03(r302.A00, 16428);
        this.A00 = A03;
        FbUserSession A04 = 1Fw.A04((1EZ) A03.A00.get());
        A02(A04, AnonymousClass620.A05, AnonymousClass621.A0I);
        A02(A04, AnonymousClass620.A03, AnonymousClass621.A0E);
        A02(A04, AnonymousClass620.A02, AnonymousClass621.A0D);
        A02(A04, AnonymousClass620.A06, AnonymousClass621.A0K);
        1G2 r0 = AnonymousClass620.A04;
        1G9 r02 = AnonymousClass621.A0H;
        if (A00(this).BNM(r0)) {
            A05(r02, 1BL.A0A(A00(this), r0));
            4YV.A1J(A00(this), r0);
        }
        1G2 r03 = AnonymousClass620.A00;
        1G9 r04 = AnonymousClass621.A08;
        if (A00(this).BNM(r03)) {
            A05(r04, 1BL.A0A(A00(this), r03));
            4YV.A1J(A00(this), r03);
        }
    }

    public static final FbSharedPreferences A00(C61z c61z) {
        return (FbSharedPreferences) c61z.A02.A00.get();
    }

    public static final 1G9 A01(FbUserSession fbUserSession, 1G9 r302) {
        return 1G9.A05(r302, ((1G1) fbUserSession).A02);
    }

    private final void A02(FbUserSession fbUserSession, 1G2 r303, 1G9 r304) {
        if (A00(this).BNM(r303)) {
            A03(fbUserSession, r304, A00(this).AZn(r303, false));
            4YV.A1J(A00(this), r303);
        }
    }

    public final void A03(FbUserSession fbUserSession, 1G9 r303, boolean z) {
        11T.A0F(fbUserSession, 0);
        1Ql.A01(A00(this).edit(), A01(fbUserSession, r303), z);
    }

    public final void A04(1G9 r302, int i) {
        FbUserSession A04 = 1Fw.A04((1EZ) this.A00.A00.get());
        1Ql edit = A00(this).edit();
        edit.CaE(A01(A04, r302), i);
        edit.commit();
    }

    public final void A05(1G9 r302, long j) {
        FbUserSession A04 = 1Fw.A04((1EZ) this.A00.A00.get());
        1Ql edit = A00(this).edit();
        edit.CaH(A01(A04, r302), j);
        edit.commit();
    }

    public final boolean A06(FbUserSession fbUserSession, 1G9 r303) {
        11T.A0F(fbUserSession, 0);
        return A00(this).AZn(A01(fbUserSession, r303), false);
    }
}
