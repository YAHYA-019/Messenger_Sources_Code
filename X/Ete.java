package X;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;
import com.facebook.widget.RoundedCornersFrameLayout;

/* loaded from: Ete.class */
public final class Ete {
    public static final CallerContext A02 = CallerContext.A0B("MarketplaceBannerBottomSheet");
    public Context A00;
    public EAX A01;

    public void A00(1LI r302, int i) {
        Context context = this.A00;
        LithoView lithoView = new LithoView(context, (AttributeSet) null);
        1Iw r0 = lithoView.A09;
        C5be A00 = 8AV.A00();
        A00.setShape(0);
        Context context2 = this.A00;
        2MR r02 = 2MR.A07;
        2Mg r03 = 2Me.A02;
        A00.setColor(r03.A03(context2, r02));
        A00.setSize(EVV.A00(context2, 40.0f), EVV.A00(context2, 4.0f));
        A00.setCornerRadius(EVV.A00(context2, 2.0f));
        2cM A01 = 2cK.A01(r0, (String) null, 0);
        C2152Dfg A0f = AbstractC2178Dg6.A04(r0, 0).A0f(i);
        FAa A05 = AbstractC2178Dg6.A05(A0f, EP4.A0G);
        A05.A04();
        A05.A01 = 1;
        A05.A03();
        AbstractC2178Dg6.A0G(A0f, A05);
        C26z c26z = C26z.VERTICAL;
        EPJ epj = EPJ.A0o;
        A0f.A0h(c26z, F0a.A01(epj, r0));
        AbstractC2178Dg6.A07(A02, A0f, A01);
        C26z c26z2 = C26z.HORIZONTAL;
        A01.A25(c26z2, 32.0f);
        A01.A24(c26z2, F0a.A01(epj, r0));
        A01.A2b();
        C6nh A0R = 7zO.A0R(r0, 0);
        C26z c26z3 = C26z.BOTTOM;
        A0R.A08(c26z3, r03.A03(this.A00, 2MR.A0p));
        A0R.A07(c26z3, 0.5f);
        A01.A1h(A0R.A01());
        2cL r04 = A01.A00;
        2cM A012 = 2cK.A01(r0, (String) null, 0);
        C2cq A0u = 7zM.A0u(A00, r0, 0);
        A0u.A19(8.0f);
        A0u.A0k(0.0f);
        7zN.A1B(A012, A0u);
        A012.A2e(r04);
        2cL A0V = 7zL.A0V(A012, r302);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        lithoView.setLayoutParams(layoutParams);
        lithoView.A0x(A0V);
        AbH.A1K(lithoView, r03.A00(context));
        RoundedCornersFrameLayout roundedCornersFrameLayout = new RoundedCornersFrameLayout(context);
        float A002 = EVV.A00(context, 16.0f);
        roundedCornersFrameLayout.A0V(A002, A002, 0.0f, 0.0f);
        int A003 = r03.A00(context);
        Paint paint = roundedCornersFrameLayout.A01;
        if (paint != null) {
            paint.setColor(A003);
        }
        roundedCornersFrameLayout.addView(lithoView, layoutParams);
        EAX eax = new EAX(this.A00);
        this.A01 = eax;
        eax.setContentView(roundedCornersFrameLayout, new ViewGroup.LayoutParams(-1, -2));
        this.A01.show();
    }
}
