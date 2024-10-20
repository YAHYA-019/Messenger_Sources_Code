package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.account.recovery.common.model.AccountCandidateModel;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecBaseData;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: B14.class */
public final class B14 extends C1rj {
    public static final CallerContext A05 = CallerContext.A0B("AccountLoginRecSelectMethodRootComponentSpec");
    public static final MigColorScheme A06 = LightColorScheme.A00();
    public C7xz A00;
    public AccountCandidateModel A01;
    public REa A02;
    public CHq A03;
    public MigColorScheme A04;

    public B14() {
        super("AccountLoginRecSelectMethodRootComponent");
        this.A04 = A06;
    }

    public static 2K3 A00(1Iw r301, MigColorScheme migColorScheme, List list) {
        StringBuilder sb = new StringBuilder(1BK.A14(list, 0));
        if (list.size() > 1) {
            sb.append("\n");
            sb.append(1BK.A14(list, 1));
        }
        2KD A0i = AbK.A0i(r301, migColorScheme);
        7zQ.A1S(A0i, sb.toString());
        return A0i.A2W();
    }

    public static void A01(1Iw r301, int i) {
        if (r301.A02 != null) {
            r301.A0G(7zS.A0N(Integer.valueOf(i)), "updateState:AccountLoginRecSelectMethodRootComponent.setSelectedRecoveryType");
        }
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, this.A02, this.A03, this.A01, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    public boolean A0o() {
        return true;
    }

    @Override // X.C1rj
    public 1LI A0z(1Iw r302, int i, int i2) {
        C1rq A01;
        C1rq A012;
        B0n b0n;
        B2u b2u;
        BMG bmg;
        B1F A0P = 4YU.A0P(r302);
        CHq cHq = this.A03;
        AccountCandidateModel accountCandidateModel = this.A01;
        C7xz c7xz = this.A00;
        MigColorScheme migColorScheme = this.A04;
        REa rEa = this.A02;
        int i3 = A0P.A00;
        FIM fim = (FIM) 1Bn.A0A(100129);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 == 0) {
            if (!accountCandidateModel.A02().isEmpty()) {
                A01(r302, 1);
                if (rEa != null) {
                    b2u = rEa.A00;
                    ((AccountLoginSegueRecBaseData) ((AlJ) b2u).A01).A00 = 1;
                    bmg = BMG.A2P;
                    B2u.A08(b2u, bmg);
                }
            } else if (!accountCandidateModel.A00().isEmpty()) {
                A01(r302, 2);
                if (rEa != null) {
                    b2u = rEa.A00;
                    ((AccountLoginSegueRecBaseData) ((AlJ) b2u).A01).A00 = 2;
                    bmg = BMG.A2O;
                    B2u.A08(b2u, bmg);
                }
            }
        }
        Dud A013 = Dzc.A01(r302);
        A013.A01.A02 = c7xz;
        2RH r0 = 2RH.A04;
        int A00 = r0.A00();
        2cM A014 = 2cK.A01(r302, (String) null, 0);
        C26z c26z = C26z.TOP;
        2RH r02 = 2RH.A06;
        4YU.A1O(A014, r02, c26z);
        C26z c26z2 = C26z.BOTTOM;
        4YU.A1O(A014, r02, c26z2);
        4YU.A1L(A014, r02);
        A014.A1S(size);
        AwT A002 = C2030Azr.A00(r302);
        A002.A2Y(cHq);
        A002.A2X(2131952194);
        A014.A2e(A002.A2W());
        C1rq A015 = C1rg.A01(r302, null, 0);
        A015.A10(100.0f);
        7zO.A1M(A015, r02, c26z2);
        2cM A0e = AbG.A0e(r302);
        A0e.A0l(40.0f);
        A0e.A0z(40.0f);
        5BH A016 = 5BG.A01(r302);
        C07004ik A003 = 5BI.A00(C06974ih.A0Q);
        Context context = r302.A0D;
        ((C07014il) A003).A04 = 5BJ.A00(context.getResources().getDisplayMetrics().density * 40.0f);
        C06984ii.A01(A016, A003);
        Uri uri = null;
        try {
            uri = C0A2.A03(accountCandidateModel.profilePictureUri);
        } catch (SecurityException unused) {
        }
        A016.A2X(uri);
        A016.A2b(A05);
        A016.A0J();
        AbM.A1K(A0e, A016.A00, A015);
        float f = A00;
        2KD A0i = AbK.A0i(r302, migColorScheme);
        A0i.A33(new Object[]{accountCandidateModel.name}, 2131952193);
        A0i.A2l();
        A0i.A2d();
        A0i.A11(f);
        A0i.A2X();
        7zN.A1T(A015, A0i);
        7zL.A1I(A014, A015);
        if (accountCandidateModel.A02().isEmpty()) {
            A01 = C1rg.A01(r302, null, 0);
        } else {
            1Im A09 = 1LI.A09(r302, B14.class, "AccountLoginRecSelectMethodRootComponent", 1469135926);
            ImmutableList A02 = accountCandidateModel.A02();
            String string = context.getString(2131952219);
            int i4 = 2131952198;
            if (i3 == 1) {
                i4 = 2131952197;
            }
            String A0v = 1BK.A0v(context, string, i4);
            int i5 = 2132346762;
            if (i3 == 1) {
                i5 = 2132346763;
            }
            A01 = C1rg.A01(r302, null, 0);
            A01.A10(100.0f);
            A01.A0r(70.0f);
            A01.A24(c26z, 0.0f);
            A01.A24(c26z2, 0.0f);
            2cM A0e2 = AbG.A0e(r302);
            A0e2.A0m(100.0f);
            7zO.A1J(A0e2, r0);
            C2cm A004 = C2cl.A00(r302);
            A004.A2a(i5);
            A004.A0l(30.0f);
            A004.A0z(30.0f);
            A004.A2X(C98U.BLUE.colorInt);
            A004.A0k(0.0f);
            AbM.A1K(A0e2, 7zL.A0J(A004), A01);
            2cM A0e3 = AbG.A0e(r302);
            A0e3.A2c();
            A0e3.A0m(100.0f);
            2KD A0i2 = AbK.A0i(r302, migColorScheme);
            7zQ.A1W(A0i2, string);
            4YU.A1K(A0e3, A0i2);
            AbM.A1K(A0e3, A00(r302, migColorScheme, A02), A01);
            A01.A2T(A09);
            A01.A2K("sms_item");
            A01.A2S(A0v);
            AbK.A1L(A01, migColorScheme, 0.0f, 0);
        }
        7zL.A1I(A014, A01);
        if (accountCandidateModel.A00().isEmpty()) {
            A012 = C1rg.A01(r302, null, 0);
        } else {
            1Im A092 = 1LI.A09(r302, B14.class, "AccountLoginRecSelectMethodRootComponent", 1089119481);
            ImmutableList A005 = accountCandidateModel.A00();
            String string2 = context.getString(2131952218);
            int i6 = 2131952198;
            if (i3 == 2) {
                i6 = 2131952197;
            }
            String A0v2 = 1BK.A0v(context, string2, i6);
            int i7 = 2132346762;
            if (i3 == 2) {
                i7 = 2132346763;
            }
            A012 = C1rg.A01(r302, null, 0);
            A012.A10(100.0f);
            A012.A0r(70.0f);
            A012.A24(c26z, 0.0f);
            A012.A24(c26z2, 0.0f);
            2cM A0e4 = AbG.A0e(r302);
            A0e4.A0m(100.0f);
            7zO.A1J(A0e4, r0);
            C2cm A006 = C2cl.A00(r302);
            A006.A2a(i7);
            A006.A0l(30.0f);
            A006.A0z(30.0f);
            A006.A2X(C98U.BLUE.colorInt);
            A006.A0k(0.0f);
            AbM.A1K(A0e4, 7zL.A0J(A006), A012);
            2cM A0e5 = AbG.A0e(r302);
            A0e5.A2c();
            A0e5.A0m(100.0f);
            2KD A0i3 = AbK.A0i(r302, migColorScheme);
            7zQ.A1W(A0i3, string2);
            4YU.A1K(A0e5, A0i3);
            AbM.A1K(A0e5, A00(r302, migColorScheme, A005), A012);
            A012.A2T(A092);
            A012.A2K("email_item");
            A012.A2S(A0v2);
            AbK.A1L(A012, migColorScheme, 0.0f, 0);
        }
        AbL.A0z(A014, A012.A00, r302);
        C1913Awe A007 = B0n.A00(r302);
        A007.A2X(BLZ.A07);
        A007.A2W(2131952225);
        A007.A2K("continue_button");
        A007.A24(c26z, f);
        A007.A24(c26z2, 0.0f);
        C1913Awe.A07(A014, 1LI.A09(r302, B14.class, "AccountLoginRecSelectMethodRootComponent", -670330384), A007);
        if (fim.A05(EPg.A0j) == 1) {
            float A017 = 7zM.A01();
            C1913Awe A008 = B0n.A00(r302);
            A008.A2X(BLZ.A08);
            A008.A2W(2131952200);
            A008.A24(c26z, A017);
            A008.A24(c26z2, 0.0f);
            7zN.A1D(A008, r302, B14.class, "AccountLoginRecSelectMethodRootComponent", 316148272);
            A008.A0J();
            b0n = A008.A01;
        } else {
            b0n = null;
        }
        return 7zM.A0w(7zL.A0V(A014, b0n), A013);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        FragmentActivity activity;
        switch (r302.A01) {
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -670330384:
                REa rEa = ((B14) r302.A00.A01).A02;
                if (rEa == null) {
                    return null;
                }
                B2u b2u = rEa.A00;
                C00i c00i = b2u.A01;
                AbN.A17(c00i, 1BK.A0U(c00i), 725096125);
                b2u.A1f("action_recovery_send_code");
                B2u.A08(b2u, BMG.A2L);
                return null;
            case 316148272:
                REa rEa2 = ((B14) r302.A00.A01).A02;
                if (rEa2 == null || (activity = rEa2.A00.getActivity()) == null) {
                    return null;
                }
                activity.onBackPressed();
                return null;
            case 1089119481:
                1Iv r0 = r302.A00;
                1Is r02 = r0.A01;
                1Iw r03 = r0.A00;
                B14 b14 = (B14) r02;
                B1F A07 = r03.A07(4YU.A0P(r03));
                REa rEa3 = b14.A02;
                if (A07.A00 == 2) {
                    return null;
                }
                if (rEa3 != null) {
                    B2u b2u2 = rEa3.A00;
                    ((AccountLoginSegueRecBaseData) ((AlJ) b2u2).A01).A00 = 2;
                    B2u.A08(b2u2, BMG.A2O);
                }
                A01(r03, 2);
                return null;
            case 1469135926:
                1Iv r04 = r302.A00;
                1Is r05 = r04.A01;
                1Iw r06 = r04.A00;
                B14 b142 = (B14) r05;
                B1F A072 = r06.A07(4YU.A0P(r06));
                REa rEa4 = b142.A02;
                if (A072.A00 == 1) {
                    return null;
                }
                if (rEa4 != null) {
                    B2u b2u3 = rEa4.A00;
                    ((AccountLoginSegueRecBaseData) ((AlJ) b2u3).A01).A00 = 1;
                    B2u.A08(b2u3, BMG.A2P);
                }
                if (r06.A02 == null) {
                    return null;
                }
                r06.A0H(7zS.A0N(1), "updateState:AccountLoginRecSelectMethodRootComponent.setSelectedRecoveryType");
                return null;
            default:
                return null;
        }
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
