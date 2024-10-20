package X;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.montage.composer.MontageComposerActivity;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.mig.scheme.schemes.BaseMigColorScheme;
import com.facebook.user.model.User;
import com.facebook.user.profilepic.PicSquare;
import java.util.BitSet;

/* renamed from: X.8o5, reason: invalid class name */
/* loaded from: 8o5.class */
public final class C8o5 extends C1rj {
    public static final Interpolator A03 = new DecelerateInterpolator();
    public int A00;
    public C9Jq A01;
    public String A02;

    public C8o5() {
        super("EndCardComponent");
    }

    public static 1Im A00(EQR eqr, 1Iw r302) {
        return 1LI.A0C(r302, C8o5.class, "EndCardComponent", new Object[]{eqr}, 1330061923);
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), this.A01, this.A02};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        boolean z = ((C8q4) 4YU.A0P(r302)).A00;
        C1u2 A0I = 4YV.A0I();
        BaseMigColorScheme baseMigColorScheme = (BaseMigColorScheme) 1Bi.A03(16815);
        User A0v = 7zQ.A0v();
        PicSquare A04 = A0v.A04();
        String A07 = A04 != null ? A04.A01(660).url : A0v.A07();
        2cM A0j = 7zM.A0j(r302, 0);
        C1rp c1rp = C1rp.FLEX_START;
        A0j.A2h(c1rp);
        A0j.A1H(-16777216);
        2dP r0 = 2dP.A02;
        A0j.A2H(r0);
        C1rq A01 = C1rg.A01(r302, null, 0);
        8Ov r02 = new 8Ov(r302, new 8nK());
        8nK r03 = r02.A01;
        r03.A03 = A07;
        BitSet bitSet = r02.A02;
        bitSet.set(1);
        r02.A0z(165.0f);
        r02.A0l(220.0f);
        r03.A00 = 0;
        r02.A16(48.0f);
        r03.A01 = 12;
        bitSet.set(0);
        r02.A1s(1LI.A09(r302, C8o5.class, "EndCardComponent", 1761129111));
        r02.A2T(A00(EQR.A02, r302));
        r03.A02 = baseMigColorScheme;
        bitSet.set(2);
        A01.A2e(r02);
        int BKg = baseMigColorScheme.BKg();
        int AZN = baseMigColorScheme.AZN();
        ShapeDrawable A0D = 7zR.A0D();
        Paint paint = A0D.getPaint();
        ShapeDrawable A0D2 = 7zR.A0D();
        Paint paint2 = A0D.getPaint();
        paint.setColor(BKg);
        paint2.setColor(BKg);
        C2cq A0u = 7zM.A0u(new LayerDrawable(new Drawable[]{A0D2, A0D, A0I.A08(C1u3.A52, AZN)}), r302, 0);
        A0u.A0c();
        A0u.A11(60.0f);
        A0u.A17(12.0f);
        7zN.A1S(A01, A0u);
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A0c();
        A012.A0M();
        A012.A2i(c1rp);
        2KD A013 = 2K3.A01(r302, 0);
        A013.A1H(251658240);
        A013.A2r(2131960895);
        A013.A2e();
        A013.A0c();
        A013.A2x(baseMigColorScheme);
        A013.A11(60.0f);
        A013.A1A(12.0f);
        A013.A0M();
        A013.A2n();
        A012.A2e(A013);
        2cM A0K = 7zN.A0K(A012, r302, A01);
        A0K.A1H(baseMigColorScheme.AZN());
        A0K.A0c();
        A0K.A16(48.0f);
        float f = 0.0f;
        if (z) {
            f = 0.2f;
        }
        A0K.A0B(f);
        A0K.A0z(165.0f);
        A0K.A0l(220.0f);
        A0K.A2L("press");
        A0K.A0d();
        8Tm A06 = 8Tm.A06(A0K, r302);
        A06.A00.A00 = baseMigColorScheme.BDl();
        A06.A2d(2132279327);
        A06.A2X();
        A06.A2a(baseMigColorScheme.BDl());
        C1rh A0d = 7zL.A0d(A06.A2W(), A01);
        C1rq A014 = C1rg.A01(r302, null, 0);
        A014.A2i(c1rp);
        A014.A0l(220.0f);
        A014.A17(180.0f);
        A014.A0c();
        C2cm A00 = C2cl.A00(r302);
        A00.A17(36.0f);
        A00.A11(192.0f);
        A00.A2a(2131230776);
        A00.A0c();
        A014.A2e(A00);
        C2cm A002 = C2cl.A00(r302);
        A002.A17(18.0f);
        A002.A11(20.0f);
        A002.A2a(2131230780);
        A002.A0c();
        A014.A2e(A002);
        A014.A2f(A0d);
        C2cm A003 = C2cl.A00(r302);
        A003.A11(180.0f);
        A003.A0M();
        A003.A2a(2131230779);
        A003.A0c();
        A014.A2e(A003);
        C2cm A004 = C2cl.A00(r302);
        A004.A1A(32.0f);
        A004.A0M();
        A004.A2a(2131230777);
        A004.A0c();
        A014.A2e(A004);
        7zL.A1I(A0j, A014);
        2KD A015 = 2K3.A01(r302, 0);
        A015.A2r(2131960770);
        A015.A2b();
        A015.A17(420.0f);
        A015.A2H(r0);
        A015.A1s(1LI.A07(r302, C8o5.class, "EndCardComponent"));
        A015.A2T(A00(null, r302));
        A015.A2x(baseMigColorScheme);
        A015.A2m();
        A0j.A2d(A015);
        2KD A016 = 2K3.A01(r302, 0);
        A016.A2r(2131960771);
        A016.A2X();
        A016.A16(20.0f);
        A016.A1s(1LI.A07(r302, C8o5.class, "EndCardComponent"));
        A016.A2T(A00(null, r302));
        A016.A2w(C1u7.A09);
        A016.A2x(baseMigColorScheme);
        A016.A2l();
        A0j.A2d(A016);
        8Th A005 = C8nq.A00(r302);
        A005.A0s(176.0f);
        A005.A0U();
        A005.A1s(1LI.A07(r302, C8o5.class, "EndCardComponent"));
        A005.A2T(A00(EQR.A01, r302));
        4YU.A1N(A005, 2RH.A06);
        A005.A2X(2131960769);
        A005.A2Z(baseMigColorScheme);
        return 7zL.A0U(A0j, A005);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        C9Jq c9Jq;
        switch (r302.A01) {
            case -1336101728:
                1Is r0 = r302.A00.A01;
                MotionEvent motionEvent = ((3xE) obj).A00;
                c9Jq = ((C8o5) r0).A01;
                11T.A0G(c9Jq, 1, motionEvent);
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        7zU.A1P(c9Jq.A00);
                    }
                    return 1BK.A0d();
                }
                break;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 1330061923:
                1Is r02 = r302.A00.A01;
                EQR eqr = (EQR) 7zN.A0o(r302);
                C8o5 c8o5 = (C8o5) r02;
                C9Jq c9Jq2 = c8o5.A01;
                int i = c8o5.A00;
                String str = c8o5.A02;
                7zR.A1N(c9Jq2, str);
                I5R i5r = (I5R) 1Bn.A0A(68403);
                8uN r03 = c9Jq2.A00;
                String str2 = r03.A04;
                C6r6 c6r6 = C6r6.A0P;
                MontageComposerFragmentParams A01 = 6zV.A01(r03.requireContext(), (5Q1) r03.A0A.get(), C6x1.A04, c6r6, str2);
                NavigationTrigger A032 = NavigationTrigger.A03(GOm.A00(72));
                if (r03.getContext() != null) {
                    r03.A04 = "composer_navigation";
                    0LS.A05(MontageComposerActivity.A12(r03.getContext(), A01, A032), r03, ActionId.ON_VIEW_CREATED_END);
                }
                i5r.A04(eqr, str, "non_gallery", i);
                return null;
            case 1761129111:
                1Iv r04 = r302.A00;
                1Is r05 = r04.A01;
                1Iw r06 = r04.A00;
                MotionEvent motionEvent2 = ((3xE) obj).A00;
                c9Jq = ((C8o5) r05).A01;
                11T.A0F(r06, 0);
                11T.A0G(c9Jq, 1, motionEvent2);
                int action2 = motionEvent2.getAction();
                if (action2 == 0) {
                    if (r06.A02 != null) {
                        r06.A0G(7zS.A0M(0, true), "updateState:EndCardComponent.updatePressedState");
                        break;
                    }
                } else {
                    if (action2 == 1 || action2 == 3) {
                        7zU.A1P(c9Jq.A00);
                        if (r06.A02 != null) {
                            r06.A0G(7zL.A0f(4YU.A1b(false), 0), "updateState:EndCardComponent.updatePressedState");
                        }
                    }
                    return 1BK.A0d();
                }
                break;
            default:
                return null;
        }
        8uN r07 = c9Jq.A00;
        r07.A04 = "long_press";
        r07.A1e();
        return 1BK.A0d();
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
