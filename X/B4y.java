package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.expandablecomponent.ExpandableBottomSheetContainer;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.widget.CustomFrameLayout;
import com.google.common.base.Objects;

/* loaded from: B4y.class */
public final class B4y extends H4B {
    public C00i A00;
    public C00i A01;
    public MigColorScheme A02;
    public C15h A03;
    public final DEI A04;
    public final BIb A05;
    public final C00i A06;
    public final LithoView A07;
    public final LithoView A08;
    public final Ra3 A09;

    /* JADX WARN: Multi-variable type inference failed */
    public B4y(Context context) {
        super(context);
        this.A04 = new CnA(this, 2);
        DBS dbs = new DBS(context, this, 10);
        this.A03 = dbs;
        this.A01 = 1BV.A00(83956);
        this.A00 = 7zL.A0R(context, 83960);
        this.A02 = ((ThreadViewColorScheme) dbs.get()).A0F;
        Context context2 = getContext();
        this.A06 = 7zL.A0R(context2, 83958);
        CustomFrameLayout customFrameLayout = new CustomFrameLayout(context);
        ((BIb) customFrameLayout).A00 = 7zL.A0R(customFrameLayout.getContext(), 980);
        ((BIb) customFrameLayout).A05 = DBe.A00(customFrameLayout, 74);
        customFrameLayout.A0U(2132541640);
        ((BIb) customFrameLayout).A01 = (LithoView) C09s.A01(customFrameLayout, 2131362705);
        C15h c15h = ((BIb) customFrameLayout).A05;
        c15h.getClass();
        ((BIb) customFrameLayout).A04 = ((ThreadViewColorScheme) c15h.get()).A0F;
        C6R A0h = ((AbR) 4YU.A0p(((BIb) customFrameLayout).A00)).A0h(((BIb) customFrameLayout).A01, ((BIb) customFrameLayout).A04, "keyboard", true, false);
        ((BIb) customFrameLayout).A03 = A0h;
        this.A05 = customFrameLayout;
        BfT bfT = new BfT(this);
        if (((BIb) customFrameLayout).A01 != null) {
            A0h.A01 = bfT;
        }
        View findViewById = customFrameLayout.findViewById(2131362706);
        findViewById.getClass();
        LithoView lithoView = (LithoView) findViewById;
        this.A07 = lithoView;
        View findViewById2 = customFrameLayout.findViewById(2131362704);
        findViewById2.getClass();
        LithoView lithoView2 = (LithoView) findViewById2;
        this.A08 = lithoView2;
        context2.getClass();
        FbUserSession A0D = 4YV.A0D(context);
        this.A09 = new Ra3(lithoView2, ((CIk) this.A00.get()).A01(A0D).isEmpty() ? 0 : context2.getResources().getDimensionPixelSize(2132279310));
        ((CIk) this.A00.get()).A02(A0D, this.A04);
        A02(A0D, this);
        A03(A0D, this);
        A0c(customFrameLayout, lithoView);
        CkT ckT = new CkT(this, 0);
        ExpandableBottomSheetContainer expandableBottomSheetContainer = super.A03;
        if (expandableBottomSheetContainer != null) {
            expandableBottomSheetContainer.A02 = ckT;
        }
    }

    public static void A00(View view, B4y b4y) {
        ((C7V) b4y.A06.get()).A01("keyboard", false);
        CCA.A00(view, (CCA) b4y.A01.get(), "keyboard", (String) null);
    }

    public static void A01(FbUserSession fbUserSession, B4y b4y) {
        ((C7V) b4y.A06.get()).A00("keyboard", ((CIk) b4y.A00.get()).A01(fbUserSession).size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A02(FbUserSession fbUserSession, B4y b4y) {
        C5z2 c5z2;
        LithoView lithoView = b4y.A07;
        C5yw A0b = 7zN.A0b(lithoView.A09, false);
        A0b.A2b(b4y.A02);
        A0b.A2a(2131953233);
        A0b.A2c(2MG.A04);
        CxE.A01(A0b, b4y, 67);
        if (((CIk) b4y.A00.get()).A01(fbUserSession).isEmpty()) {
            c5z2 = null;
        } else {
            C9lC A00 = C9lC.A00();
            A00.A04(b4y.getContext().getString(2131953232));
            MigColorScheme migColorScheme = b4y.A02;
            11T.A0F(migColorScheme, 0);
            A00.A01 = migColorScheme;
            c5z2 = Cx1.A00(A00, b4y, 25);
        }
        A0b.A2e(c5z2);
        A0b.A2i(true);
        AbH.A1R(lithoView, A0b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(FbUserSession fbUserSession, B4y b4y) {
        C8nl A2W;
        LithoView lithoView = b4y.A08;
        1Iw r0 = lithoView.A09;
        2cM A0N = AbK.A0N(r0);
        A0N.A0S();
        A0N.A2g(C1ro.FLEX_END);
        C00i c00i = b4y.A00;
        if (((CIk) c00i.get()).A01(fbUserSession).isEmpty()) {
            A2W = null;
        } else {
            8TX A00 = C8nl.A00(r0);
            Context context = b4y.getContext();
            A00.A1L(context.getResources().getDimensionPixelSize(2132279310));
            A00.A2a(context.getString(2131953232));
            A00.A2Z(b4y.A02);
            A00.A2Y(CZF.A00(b4y, 9));
            A2W = A00.A2W();
        }
        AbH.A1P(A0N, A2W, lithoView);
        Ra3 ra3 = b4y.A09;
        if (ra3 != null) {
            int dimensionPixelSize = ((CIk) c00i.get()).A01(fbUserSession).isEmpty() ? 0 : b4y.getContext().getResources().getDimensionPixelSize(2132279310);
            boolean A0j = b4y.A0j();
            if (dimensionPixelSize != ra3.A00) {
                ra3.A00 = dimensionPixelSize;
                if (!A0j) {
                    dimensionPixelSize = 0;
                }
                Ra3.A00(ra3, dimensionPixelSize);
            }
        }
    }

    @Override // X.H4B
    public void A0a(float f) {
        super.A0a(f);
        Ra3 ra3 = this.A09;
        if (ra3 != null) {
            Ra3.A00(ra3, (int) ((1.0f - f) * ra3.A00));
        }
    }

    @Override // X.H4B
    public void A0e(DF2 df2, boolean z) {
        super.A0e(df2, z);
        Ra3 ra3 = this.A09;
        if (ra3 != null) {
            ra3.A01(!z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.H4B
    public void A0f(MigColorScheme migColorScheme) {
        C6R c6r;
        super.A0f(migColorScheme);
        if (Objects.equal(this.A02, migColorScheme)) {
            return;
        }
        this.A02 = migColorScheme;
        FbUserSession A0C = 4YV.A0C(getContext());
        A02(A0C, this);
        A03(A0C, this);
        BIb bIb = this.A05;
        if (bIb == null || Objects.equal(bIb.A04, migColorScheme)) {
            return;
        }
        bIb.A04 = migColorScheme;
        if (bIb.A01 == null || (c6r = bIb.A03) == null || 11T.A0O(c6r.A02, migColorScheme)) {
            return;
        }
        c6r.A02 = migColorScheme;
        c6r.A00();
    }

    @Override // X.H4B
    public void A0g(boolean z) {
        C6R c6r = this.A05.A03;
        if (c6r == null || c6r.A04 == z) {
            return;
        }
        c6r.A04 = z;
        c6r.A00();
    }
}
