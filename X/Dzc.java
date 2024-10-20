package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.BaseMountingView;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.LithoScrollView;

/* loaded from: Dzc.class */
public final class Dzc extends C1rj {
    public int A00;
    public int A01;
    public C7xz A02;
    public 1LI A03;
    public GEy A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public Dzc() {
        super("VerticalScroll");
        this.A09 = true;
    }

    private ComponentTree A00(1Iw r302) {
        String A0C = r302.A0C();
        EwM ewM = new EwM(A0C, this.A06);
        ComponentTree componentTree = (ComponentTree) r302.A0B(ewM, A0C, 0);
        if (componentTree == null) {
            boolean z = this.A06;
            C1s0 A02 = ComponentTree.A02(r302);
            A02.A01(z);
            componentTree = A02.A00();
            r302.A0I(ewM, componentTree, A0C, 0);
        }
        return componentTree;
    }

    public static Dud A01(1Iw r301) {
        return new Dud(r301, new Dzc());
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        Dzc dzc = (Dzc) super.A0l();
        dzc.A03 = 4YV.A0J(dzc.A03);
        return dzc;
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        return AbG.A08(LayoutInflater.from(context), (ViewGroup) null, 2132542428);
    }

    public boolean A0o() {
        return true;
    }

    public boolean A0p() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00af, code lost:
    
        if (r309.booleanValue() == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0r(X.1LI r302, X.1LI r303, X.2Yv r304, X.2Yv r305) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dzc.A0r(X.1LI, X.1LI, X.2Yv, X.2Yv):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.274, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ AnonymousClass274 A10() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003f, code lost:
    
        if (r304 != null) goto L6;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1H(X.1Iw r302, X.AnonymousClass274 r303, X.C23P r304, X.C27G r305, int r306, int r307) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dzc.A1H(X.1Iw, X.274, X.23P, X.27G, int, int):void");
    }

    @Override // X.C1rj
    public void A1I(1Iw r302, AnonymousClass274 anonymousClass274, C27G c27g) {
        1LI r305 = this.A03;
        boolean z = this.A05;
        ComponentTree A00 = A00(r302);
        Fig fig = (Fig) anonymousClass274;
        Integer num = fig.A01;
        Integer num2 = fig.A00;
        int A05 = (c27g.A05() - c27g.A02()) - c27g.A03();
        int A002 = (c27g.A00() - c27g.A04()) - c27g.A01();
        if (num != null && num.intValue() == A05) {
            if (!z) {
                return;
            }
            if (num2 != null && num2.intValue() == A002) {
                return;
            }
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(A05, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(A002, 1073741824);
        if (A00.BVK()) {
            return;
        }
        if (z) {
            2dD A0p = 7zM.A0p(r305, r302);
            A0p.A1S(View.MeasureSpec.getSize(makeMeasureSpec2));
            r305 = A0p.A2W();
        }
        A00.A0Q(r305, null, makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        FYI fyi;
        Dzs dzs = (Dzs) 4YU.A0P(r302);
        LithoScrollView lithoScrollView = (LithoScrollView) obj;
        boolean z = this.A08;
        boolean z2 = this.A09;
        boolean z3 = this.A07;
        boolean z4 = this.A0A;
        int i = this.A00;
        C7xz c7xz = this.A02;
        GEy gEy = this.A04;
        ComponentTree A00 = A00(r302);
        Evt evt = dzs.A00;
        BaseMountingView baseMountingView = lithoScrollView.A05;
        if (!(baseMountingView instanceof LithoView)) {
            throw AnonymousClass001.A0q("API can only be invoked from Vertical Scroll Spec");
        }
        1LI A0G = A00.A0G();
        lithoScrollView.A04 = A0G != null ? A0G.A0a() : "null";
        lithoScrollView.A03 = A00.A0V.A03.A01.A08;
        ((LithoView) baseMountingView).A10(A00, true);
        lithoScrollView.A02 = evt;
        if (C02A.useOneShotPreDrawListener) {
            fyi = 0SG.A00(lithoScrollView, new G2D(evt, lithoScrollView));
        } else {
            fyi = new FYI(evt, lithoScrollView, 1);
            lithoScrollView.getViewTreeObserver().addOnPreDrawListener(fyi);
        }
        lithoScrollView.A00 = fyi;
        lithoScrollView.setScrollbarFadingEnabled(z2);
        lithoScrollView.setNestedScrollingEnabled(z3);
        lithoScrollView.setVerticalFadingEdgeEnabled(z4);
        lithoScrollView.setFadingEdgeLength(i);
        lithoScrollView.setVerticalScrollBarEnabled(z);
        lithoScrollView.A0B = c7xz;
        lithoScrollView.A01 = gEy;
        lithoScrollView.setOverScrollMode(1);
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        LithoScrollView lithoScrollView = (LithoScrollView) obj;
        lithoScrollView.A0B = null;
        lithoScrollView.A01 = null;
        BaseMountingView baseMountingView = lithoScrollView.A05;
        if (!(baseMountingView instanceof LithoView)) {
            throw AnonymousClass001.A0q("API can only be invoked from Vertical Scroll Spec");
        }
        ((LithoView) baseMountingView).A10(null, false);
        lithoScrollView.A02 = null;
        lithoScrollView.getViewTreeObserver().removeOnPreDrawListener(lithoScrollView.A00);
        lithoScrollView.A00 = null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        int i = this.A01;
        Evt evt = new Evt();
        evt.A00 = i;
        ((Dzs) r303).A00 = evt;
    }

    @Override // X.C1rj
    public void A1O(AnonymousClass274 anonymousClass274, AnonymousClass274 anonymousClass2742) {
        Fig fig = (Fig) anonymousClass274;
        Fig fig2 = (Fig) anonymousClass2742;
        fig.A00 = fig2.A00;
        fig.A01 = fig2.A01;
    }

    @Override // X.C1rj
    public boolean A1S() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            Dzc dzc = (Dzc) r302;
            1LI r0 = this.A03;
            1LI r02 = dzc.A03;
            if (r0 != null) {
                if (!C4Cv.A05(r0, r02, z)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            if (this.A00 != dzc.A00 || this.A05 != dzc.A05 || this.A06 != dzc.A06 || this.A01 != dzc.A01 || this.A07 != dzc.A07) {
                return false;
            }
            GEy gEy = this.A04;
            GEy gEy2 = dzc.A04;
            if (gEy != null) {
                if (!gEy.equals(gEy2)) {
                    return false;
                }
            } else if (gEy2 != null) {
                return false;
            }
            C7xz c7xz = this.A02;
            C7xz c7xz2 = dzc.A02;
            if (c7xz != null) {
                if (!c7xz.equals(c7xz2)) {
                    return false;
                }
            } else if (c7xz2 != null) {
                return false;
            }
            if (this.A08 != dzc.A08 || this.A09 != dzc.A09 || z || this.A0A != dzc.A0A) {
                return false;
            }
        }
        return true;
    }
}
