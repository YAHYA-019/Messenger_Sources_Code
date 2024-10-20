package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* loaded from: Dxg.class */
public final class Dxg extends C1rj {
    public EzJ A00;
    public EKe A01;
    public FEG A02;
    public Eho A03;
    public Ehp A04;
    public RXy A05;
    public DgA A06;
    public 1Im A07;
    public String A08;

    public Dxg() {
        super("FDSInstantFeedbackComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A07, this.A08, this.A06, this.A00, this.A02, this.A05, this.A04, this.A01};
    }

    public boolean A0o() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v172, types: [X.23P, java.lang.Object] */
    @Override // X.C1rj
    public 1LI A0z(1Iw r302, int i, int i2) {
        C1rs c1rs;
        2cM A01;
        C1rs A0f;
        C1ti c1ti;
        29K r0;
        1Im r02;
        C1rs ACp;
        EzJ ezJ = this.A00;
        DgA dgA = this.A06;
        EKe eKe = this.A01;
        String str = this.A08;
        FEG feg = this.A02;
        RXy rXy = this.A05;
        Ehp ehp = this.A04;
        CharSequence charSequence = dgA.A02;
        charSequence.getClass();
        EvK A02 = ezJ.A02();
        A02.A02 = ELb.A04;
        2Me r306 = A02.A03;
        if (r306 == null) {
            r306 = 5YG.A03(7zL.A0A(A02.A06));
        }
        A02.A03 = r306.A02();
        EzJ A00 = A02.A00();
        if (feg != null) {
            GKV gkv = feg.A00;
            gkv.BcJ(C26z.END, 12.0f);
            gkv.A7v(C1ro.CENTER);
            c1rs = gkv.ACp(A00);
        } else {
            c1rs = null;
        }
        C2152Dfg A04 = AbstractC2178Dg6.A04(r302, 0);
        A04.A05 = charSequence;
        A04.A03 = EP4.A06;
        A04.A0L(charSequence);
        FAa A002 = FAa.A00();
        A002.A06(2MR.A1j);
        A002.A01 = dgA.A00;
        AbstractC2178Dg6.A0G(A04, A002);
        A04.A0W(C1ro.CENTER);
        A04.A0h(C26z.END, 12.0f);
        C1rs ACp2 = A04.ACp(A00);
        if (c1rs != null) {
            C1rq A012 = C1rg.A01(r302, null, 0);
            A012.A2e(c1rs);
            A012.A2e(ACp2);
            ACp2 = A012;
        }
        1LI A2V = (rXy == null || (ACp = rXy.A00.ACp(A00)) == null) ? null : ACp.A2V();
        if (ehp != null && A2V != null && (c1ti = ((C1rj) A2V).A00) != null && (r0 = c1ti.A08) != null && (r02 = r0.A0I) != null) {
            1Im r03 = new 3vS(new G7O(ehp, r02, 1), r02.A03, r02.A01);
            2dD A0p = 7zM.A0p(A2V, r302);
            A0p.A2T(r03);
            A2V = A0p.A2W();
        }
        EKe eKe2 = EKe.A02;
        boolean z = false;
        if (eKe == eKe2 && A2V != null) {
            ?? obj = new Object();
            2cM A0f2 = AbH.A0f(r302, 0);
            A0f2.A2c();
            A0f2.A2g(C1ro.FLEX_END);
            A0f2.A0S();
            A0f2.A0R();
            A0f2.A0q(25.0f);
            7zL.A0V(A0f2, A2V).A0c(r302, (C23P) obj, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (obj.A01 >= View.MeasureSpec.getSize(i) * 0.25f) {
                z = true;
            }
        }
        String A003 = JQw.A00(226);
        if (eKe == eKe2 && z) {
            A01 = 2cK.A01(r302, str, 0);
            A01.A2f(C1ro.FLEX_START);
            A01.A0R();
            A01.A1B(16.0f);
            A01.A1C(F0a.A00(EPJ.A0o, r302));
            if (ACp2 == null) {
                ACp2 = null;
            } else {
                ACp2.A0R();
            }
            A01.A2d(ACp2);
            C1rq A013 = C1rg.A01(r302, null, 0);
            A013.A2i(C1rp.FLEX_END);
            A013.A2h(C1ro.FLEX_END);
            A013.A0S();
            A013.A0R();
            A013.A19(16.0f);
            A013.A2f(A2V);
            A01.A2d(A013);
        } else {
            A01 = C1rg.A01(r302, str, 0);
            A01.A0r(52.0f);
            A01.A2g(C1ro.FLEX_START);
            A01.A0R();
            A01.A1B(16.0f);
            A01.A1C(F0a.A00(EPJ.A0o, r302));
            if (ACp2 == null) {
                ACp2 = null;
            } else {
                ACp2.A0R();
            }
            A01.A2e(ACp2);
            if (rXy == null) {
                A0f = null;
            } else {
                A0f = AbH.A0f(r302, 0);
                A0f.A2c();
                A0f.A2g(C1ro.FLEX_END);
                A0f.A0S();
                A0f.A0R();
                A0f.A0q(25.0f);
                A0f.A2e(A2V);
            }
            A01.A2e(A0f);
        }
        C5be c5be = new C5be();
        c5be.setColor(A00.A00(2MR.A0S));
        c5be.setCornerRadius(A00.A04.A02(EPF.A0Q, r302));
        A01.A0D(c5be);
        A01.A1r(1LI.A03(r302, Dxg.class, "FDSInstantFeedbackComponent"));
        A01.A2S(charSequence);
        A01.A2Q(true);
        A01.A0F(A003);
        7zN.A1D(A01, r302, Dxg.class, "FDSInstantFeedbackComponent", -1755229903);
        11T.A0F(r302, 0);
        A01.A0w(ENv.A02.releasedElevationDip);
        A01.A1g(new 8CJ(C0A8.A00(7zL.A0A(r302), 8.0f), 0));
        return A01.A2V();
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [X.3xC, java.lang.Object] */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1755229903) {
            if (i == -1048037474) {
                1LI.A0J(r302, obj);
                return null;
            }
            if (i != 466811311) {
                return null;
            }
            F5R f5r = (F5R) obj;
            1Iw r0 = r302.A00.A00;
            View view = f5r.A00;
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = f5r.A02;
            f5r.A01.A0a(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.A0C(true);
            0Oe r02 = 0Oe.A08;
            accessibilityNodeInfoCompat.A05(new 0Oe(16, r0.A0D(2131955713)));
            return null;
        }
        1Iv r03 = r302.A00;
        1Is r04 = r03.A01;
        1Iw r05 = r03.A00;
        View view2 = ((3xC) obj).A00;
        Dxg dxg = (Dxg) r04;
        Eho eho = dxg.A03;
        1Im r06 = dxg.A07;
        if (r06 != null) {
            ?? obj2 = new Object();
            ((3xC) obj2).A00 = view2;
            r06.A00((Object) obj2);
        }
        if (eho == null || !AnonymousClass524.A00(r05.A0D)) {
            return null;
        }
        eho.A01.A00();
        return null;
    }
}
