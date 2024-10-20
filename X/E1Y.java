package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: E1Y.class */
public final class E1Y extends IFM {
    public LithoView A00;
    public String A01;
    public String A02;
    public final HrC A03;
    public final Context A04;
    public final C5bb A05;
    public final C00i A06;
    public final C00i A07;

    public E1Y(ViewGroup viewGroup, Hrw hrw, HrC hrC, C6x1 c6x1, String str, String str2) {
        super(viewGroup, hrw, c6x1);
        Context context = ((IFM) this).A05.getContext();
        this.A04 = context;
        this.A07 = 1BV.A00(115935);
        1BV A0W = DKD.A0W(context);
        this.A06 = A0W;
        this.A02 = "";
        this.A01 = "";
        this.A05 = new C5bb(((MigColorScheme) A0W.get()).AWT());
        hrC.getClass();
        this.A03 = hrC;
        this.A02 = str;
        this.A01 = str2;
    }

    public View A0A(ViewGroup viewGroup) {
        Context context = this.A04;
        LithoView A0V = 7zO.A0V(context);
        this.A00 = A0V;
        FXr.A03(A0V, this, 93);
        this.A00.setContentDescription(this.A01);
        C2rp.A01(this.A00);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int A03 = DKE.A03(context);
        marginLayoutParams.setMargins(0, 0, A03, A03);
        this.A00.setLayoutParams(marginLayoutParams);
        this.A05.Cte(64.0f);
        return this.A00;
    }

    public void A0I(View view) {
        this.A03.A00();
    }

    public void A0J(C6x1 c6x1, I4q i4q) {
        LithoView lithoView;
        if (A09() == null || (lithoView = this.A00) == null) {
            return;
        }
        lithoView.setVisibility(0);
        LithoView lithoView2 = this.A00;
        2KD A01 = 2K3.A01(lithoView2.A09, 0);
        A01.A2z(this.A02);
        A01.A2h();
        A01.A2w(C1u7.A03);
        A01.A2x(AbF.A0p(this.A06));
        A01.A2T(7zO.A0U(new G7P(this, 6)));
        A01.A0D(this.A05);
        A01.A2X();
        A01.A2v(2K4.A03);
        A01.A1W(2132279345);
        A01.A1M(2132279326);
        lithoView2.A0y(A01.A2W());
    }

    public void A0Q(C6x1 c6x1, I4q i4q, boolean z) {
        LithoView lithoView;
        A0O(c6x1, i4q);
        if (A09() == null || (lithoView = this.A00) == null) {
            return;
        }
        int i = 0;
        if (z) {
            i = 8;
        }
        lithoView.setVisibility(i);
    }

    public boolean A0Y(C6x1 c6x1, I4q i4q) {
        C6x1 c6x12 = ((IFM) this).A07;
        C6r6 c6r6 = ((IFM) this).A06.A01.A0A;
        this.A07.get();
        boolean z = false;
        if (c6x12 == c6x1) {
            11T.A0F(c6r6, 0);
            z = C6x9.A03(c6r6);
        }
        return z;
    }
}
