package X;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.litho.LithoView;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* loaded from: E7r.class */
public final class E7r extends DZF {
    public static final String __redex_internal_original_name = "QuickPromotionNativeTemplateFragment";

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException A0N;
        int i;
        int A02 = 0FI.A02(1501473788);
        LithoView lithoView = new LithoView(getContext(), (AttributeSet) null);
        lithoView.setOnTouchListener(FYB.A00);
        ((DwJ) lithoView).A00 = new Fp7(this);
        ((DwJ) lithoView).A01 = new G0a(this);
        QuickPromotionDefinition quickPromotionDefinition = ((DZF) this).A03;
        if (quickPromotionDefinition != null) {
            String str = ((DZF) this).A06;
            if (str != null) {
                InterstitialTrigger interstitialTrigger = ((DZF) this).A01;
                if (interstitialTrigger != null) {
                    Dua A00 = DzC.A00(lithoView.A09);
                    A00.A2Y(quickPromotionDefinition);
                    A00.A2a(str);
                    A00.A2X(interstitialTrigger);
                    Runnable runnable = ((DwJ) lithoView).A01;
                    if (runnable == null) {
                        throw AnonymousClass001.A0L("Required value was null.");
                    }
                    A00.A2Z(runnable);
                    GG9 gg9 = ((DwJ) lithoView).A00;
                    DzC dzC = A00.A01;
                    dzC.A03 = gg9;
                    dzC.A06 = false;
                    lithoView.A0x(A00.A2V());
                    0FI.A08(-993942336, A02);
                    return lithoView;
                }
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = -877176185;
            } else {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = 1035659274;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 997847309;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    public void onResume() {
        int A02 = 0FI.A02(-137626269);
        super.onResume();
        0FI.A08(-1259796183, A02);
    }
}
