package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.acra.constants.ActionId;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Akq, reason: case insensitive filesystem */
/* loaded from: Akq.class */
public final class C1537Akq extends 1pK {
    public static final int A02 = View.generateViewId();
    public static final String __redex_internal_original_name = "PrivacyBundleUpsellNuxFragment";
    public 1pI A00;
    public LithoView A01;

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = 0FI.A02(-995003296);
        Context requireContext = requireContext();
        this.A01 = 7zO.A0V(requireContext);
        1Iw A0W = 7zL.A0W(requireContext);
        LithoView lithoView = this.A01;
        if (lithoView != null) {
            AbN.A1A(A0W, lithoView);
        }
        FrameLayout frameLayout = new FrameLayout(requireContext);
        AbJ.A1G(frameLayout, A02);
        frameLayout.addView(this.A01);
        0FI.A08(-1471625486, A022);
        return frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A022 = 0FI.A02(-548428203);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        this.A01 = null;
        0FI.A08(-861708973, A022);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        1BV A0K = AbJ.A0K(this, 16979);
        CxE A00 = CxE.A00(this, 49);
        CZD A002 = CZD.A00(this, ActionId.HEADER_DATA_LOADED);
        LithoView lithoView = this.A01;
        if (lithoView != null) {
            lithoView.A0x(new QGR(A002, (MigColorScheme) A0K.get(), A00));
        }
        this.A00 = 1vD.A00(view);
    }
}
