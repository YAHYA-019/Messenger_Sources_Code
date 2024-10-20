package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: Dyb.class */
public final class Dyb extends C1rj {
    public FbUserSession A00;
    public 2JX A01;
    public EiP A02;
    public MigColorScheme A03;

    public Dyb() {
        super("FxCalGroupBasedFragmentLayout");
    }

    public static final boolean A00(2JX r301) {
        ImmutableList A28 = r301.A28();
        boolean z = false;
        if (!A28.isEmpty()) {
            if (!(A28 instanceof Collection) || !A28.isEmpty()) {
                Iterator it = A28.iterator();
                while (it.hasNext()) {
                    if (!((TreeJNI) it.next()).getBooleanValue(-1609594047)) {
                        return false;
                    }
                }
            }
            z = true;
        }
        return z;
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A01, this.A00, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        QJ0 qj0;
        String A0r;
        55J A02;
        2JX A10;
        2JX A0L;
        int i;
        int i2;
        String str;
        2JX A0L2;
        int i3;
        FbUserSession fbUserSession = this.A00;
        MigColorScheme migColorScheme = this.A03;
        EiP eiP = this.A02;
        2JX r0 = this.A01;
        boolean A1X = 1BL.A1X(r302, fbUserSession);
        11T.A0F(migColorScheme, 2);
        1BV A00 = 1BV.A00(83250);
        Context A0A = 7zL.A0A(r302);
        1BV A0R = 7zL.A0R(A0A, 100011);
        1BV A002 = 1BV.A00(147565);
        1BV A0R2 = 7zL.A0R(A0A, 99817);
        2cM A0M = 7zN.A0M(r302, (String) null);
        7zM.A1O(A0M, migColorScheme);
        if (r0 != null) {
            A002.get();
            Erq erq = (Erq) A0R2.get();
            Object obj = A0R.get();
            CQY A003 = ((C1i) A00.get()).A00(r302, migColorScheme);
            2JX A01 = FJ2.A01(r0);
            if (A01 != null) {
                ImmutableList A28 = A01.A28();
                if (A28.size() < 2) {
                    QFN qfn = new QFN(r302, new QJ0());
                    String A0h = A01.A0h();
                    if (A0h == null) {
                        throw 1BK.A0h();
                    }
                    qfn.A2Z(A0h);
                    qfn.A2a(RhP.A01(r0));
                    qfn.A2Y(migColorScheme);
                    qfn.A2X(new RFY(r302));
                    qfn.A2b(A01.getBooleanValue(-603179898));
                    qj0 = qfn.A2W();
                    11T.A0A(qj0);
                } else if (A28.size() == 2) {
                    0Dc A0P = 7zP.A0P(A0A);
                    String A0h2 = A01.A0h();
                    if (A0h2 == null) {
                        throw 1BK.A0h();
                    }
                    A0P.A02(A0h2);
                    2JY A0B = 1BK.A0B(A01, 2JX.class, 506921565, 1415998328);
                    if (A0B != null) {
                        String A0i = A0B.A0i();
                        String A0m = A0B.A0m();
                        if (A0i != null && A0i.length() != 0 && A0m != null && A0m.length() != 0) {
                            A0P.A02(" ");
                            A0P.A04(new C1357Aez(r302, obj, migColorScheme, A0m, 3), 33);
                            A0P.A02(A0i);
                            A0P.A00();
                        }
                    }
                    int i4 = 9GF.A00;
                    int i5 = 9GF.A01;
                    LightColorScheme.A00();
                    SpannableString A0E = 7zM.A0E(A0P);
                    long j = -1;
                    A003.A0L(new C55g(C1u7.A0A, migColorScheme, 2KE.A04, A0E, i4, i5, i5, j, A1X));
                    2JY A0Y = A01.A0Y(2JX.class, "FXCALSettingsGroupBasedService", 211318907, 1171239528);
                    if (A0Y == null || (A0r = A0Y.A0r(800617829)) == null) {
                        throw AnonymousClass001.A0N("Service settings is missing required information.");
                    }
                    CQY.A03(A003, new Fk2(A01, eiP, 6), "", A0r, A00(A01));
                    1Du it = A28.iterator();
                    while (it.hasNext()) {
                        2JX r02 = (2JX) it.next();
                        11T.A0D(r02);
                        boolean booleanValue = A01.getBooleanValue(1270507286);
                        String A004 = RhP.A00(r02);
                        String str2 = null;
                        if (A004.equals("INSTAGRAM")) {
                            RhP.A06(r02);
                            A10 = r02.A1V().A10();
                            A0L = 1BL.A0L(A10.A1E(), 1738742348, 942865504);
                            i = 1782764648;
                            i2 = 183074238;
                        } else {
                            if (!A004.equals("FACEBOOK")) {
                                throw 1BK.A0i("Unsupported account type: ", A004);
                            }
                            RhP.A05(r02);
                            A10 = r02.A1V().A10();
                            A0L = 1BL.A0L(A10.A1B(), -1066914450, -1429958140);
                            i = 1782764648;
                            i2 = 232718159;
                        }
                        2JY A0B2 = 1BK.A0B(A0L, 2JX.class, i, i2);
                        if (A0B2 != null) {
                            str2 = A0B2.A0l();
                        }
                        String A0r2 = DKF.A0r(A10);
                        if (A0r2 == null) {
                            throw AnonymousClass001.A0N("Account is missing required information.");
                        }
                        if (booleanValue) {
                            String A005 = RhP.A00(r02);
                            if (A005.equals("INSTAGRAM")) {
                                RhP.A06(r02);
                            } else {
                                if (!A005.equals("FACEBOOK")) {
                                    throw 1BK.A0i("Unsupported account type: ", A005);
                                }
                                RhP.A05(r02);
                            }
                            2JX A0L3 = 1BL.A0L(A10, -480160002, -1968405396);
                            str = A0L3 == null ? null : A0L3.A0q();
                        } else {
                            str = null;
                        }
                        55D A006 = erq.A00(fbUserSession, migColorScheme, str2, A0r2);
                        AnonymousClass557 anonymousClass557 = new AnonymousClass557();
                        String A03 = RhP.A03(r02);
                        if (A03 == null) {
                            throw 1BK.A0h();
                        }
                        anonymousClass557.A00 = Long.parseLong(A03);
                        String A007 = RhP.A00(r02);
                        if (A007.equals("INSTAGRAM")) {
                            RhP.A06(r02);
                            A0L2 = 1BL.A0L(A10.A1E(), 1738742348, 942865504);
                            i3 = -265713450;
                        } else {
                            if (!A007.equals("FACEBOOK")) {
                                throw 1BK.A0i("Unsupported account type: ", A007);
                            }
                            RhP.A05(r02);
                            A0L2 = 1BL.A0L(A10.A1B(), -1066914450, -1429958140);
                            i3 = 3373707;
                        }
                        anonymousClass557.A08(A0L2.A0r(i3));
                        Fk7.A00(A006, anonymousClass557, migColorScheme, A0r2, str);
                        DKG.A1P(A003, anonymousClass557, migColorScheme);
                    }
                    2JY A0B3 = 1BK.A0B(A01, 2JX.class, -609193586, -1166417093);
                    if (A0B3 != null) {
                        String A0r3 = A0B3.A0r(-1624294830);
                        if (!TextUtils.isEmpty(A0r3) && A0r3 != null && (A02 = 55J.A02(new Fk2(eiP, migColorScheme, 5), (String) null)) != null) {
                            LightColorScheme.A00();
                            A003.A0L(new 55L(new C55g(C1td.A05, migColorScheme, 2KE.A03, A0r3, i4, i5, i5, j, false), A02));
                        }
                    }
                }
            }
            qj0 = A003.A09();
            11T.A0A(qj0);
        } else {
            qj0 = null;
        }
        return 7zL.A0V(A0M, qj0);
    }
}
