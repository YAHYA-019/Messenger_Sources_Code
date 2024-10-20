package X;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.litho.LithoView;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import java.util.Set;

/* loaded from: E7n.class */
public final class E7n extends 2vS implements C7y4 {
    public E7n() {
        super((C2xd) 1Bn.A0A(17149));
    }

    public long A01() {
        return 0L;
    }

    public Intent A02(Context context) {
        return AbF.A05();
    }

    public String A04() {
        return "Tab Bar Extension";
    }

    public Set A05() {
        return AbF.A1E(11T.A03(QuickPromotionDefinition.TemplateType.A0L));
    }

    public boolean A09() {
        return true;
    }

    public String Arn() {
        return "9054";
    }

    public long BCc() {
        return 300000L;
    }

    @Override // X.C7y4
    public void CX6(Context context, InterstitialTrigger interstitialTrigger, Object obj) {
        11T.A0H(context, interstitialTrigger);
        if (obj != null && (obj instanceof ViewStub) && interstitialTrigger.A00 == 161) {
            A06(4YV.A0E(context), interstitialTrigger);
            QuickPromotionDefinition A02 = ((2vS) this).A00.A02();
            if (A02 != null) {
                View A0C = DKF.A0C((ViewStub) obj, 2132543191);
                11T.A0I(A0C, AbE.A00(189));
                ViewGroup viewGroup = (ViewGroup) A0C;
                LithoView lithoView = new LithoView(context, (AttributeSet) null);
                lithoView.setOnTouchListener(FYB.A00);
                Dua A00 = DzC.A00(lithoView.A09);
                A00.A2Y(A02);
                A00.A2a("9054");
                A00.A2X(interstitialTrigger);
                Runnable runnable = ((DwJ) lithoView).A01;
                if (runnable == null) {
                    throw 1BK.A0e();
                }
                A00.A2Z(runnable);
                A00.A01.A03 = ((DwJ) lithoView).A00;
                lithoView.A0x(A00.A2V());
                viewGroup.addView(lithoView);
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                11T.A0I(layoutParams, GOm.A00(0));
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.LayoutParams) marginLayoutParams).height = -2;
                marginLayoutParams.topMargin = (int) context.getResources().getDimension(2132279303);
                viewGroup.setLayoutParams(marginLayoutParams);
            }
        }
    }
}
