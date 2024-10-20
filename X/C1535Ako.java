package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Ako, reason: case insensitive filesystem */
/* loaded from: Ako.class */
public final class C1535Ako extends 1pK {
    public static final int A01 = View.generateViewId();
    public static final String __redex_internal_original_name = "ArmadilloPushMessagingNuxFragment";
    public LithoView A00;

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(525075114);
        Context requireContext = requireContext();
        this.A00 = 7zO.A0V(requireContext);
        1Iw A0W = 7zL.A0W(requireContext);
        LithoView lithoView = this.A00;
        if (lithoView != null) {
            AbN.A1A(A0W, lithoView);
            FrameLayout frameLayout = new FrameLayout(requireContext);
            AbJ.A1G(frameLayout, A01);
            LithoView lithoView2 = this.A00;
            if (lithoView2 != null) {
                frameLayout.addView(lithoView2);
                0FI.A08(878891709, A02);
                return frameLayout;
            }
        }
        11T.A0L("lithoView");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        1BV A0K = AbJ.A0K(this, 16979);
        CBw cBw = (CBw) 1Bi.A03(82554);
        CxE A00 = CxE.A00(this, 3);
        CZD A002 = CZD.A00(this, 24);
        String A02 = 2yD.A02(1Br.A06(cBw.A00), 36887360982025951L);
        CYm cYm = 0CU.A0O(A02) ? null : new CYm(A02, this, 0);
        LithoView lithoView = this.A00;
        if (lithoView == null) {
            AbF.A1G();
            throw 0Q8.createAndThrow();
        }
        lithoView.A0x(new QH3(A002, cYm, cBw, (MigColorScheme) A0K.get(), A00));
    }
}
