package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: B5U.class */
public final class B5U extends B5W {
    public static final String __redex_internal_original_name = "AddressPickerLocationSearchResultsWrapperFragment";
    public LithoView A00;
    public RF2 A01;
    public View A02;
    public boolean A03;
    public final 1Br A04 = 7zN.A0I(this);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.B5W, X.AbstractC2385Gbm
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A03 = AbN.A1V(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC2385Gbm
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = 0FI.A02(486356876);
        11T.A0F(layoutInflater, 0);
        LithoView A0M = 7zR.A0M(this);
        this.A00 = A0M;
        A0M.setTag("online_location_view");
        this.A02 = 7zM.A0G(layoutInflater, viewGroup, 2132543123, false);
        float f = NestedScrollView.A0T;
        NestedScrollView nestedScrollView = new NestedScrollView(requireContext());
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setOrientation(1);
        7zR.A11(linearLayout);
        LithoView lithoView = this.A00;
        if (lithoView == null) {
            str = "lithoView";
        } else {
            linearLayout.addView(lithoView);
            View view = this.A02;
            if (view != null) {
                linearLayout.addView(view);
                nestedScrollView.addView(linearLayout);
                0FI.A08(1942170530, A02);
                return nestedScrollView;
            }
            str = "searchResultsView";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.AbstractC2385Gbm
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        LithoView lithoView = this.A00;
        if (lithoView == null) {
            str = "lithoView";
        } else {
            MigColorScheme A0m = 7zQ.A0m(this.A04);
            boolean z = this.A03;
            RF2 rf2 = this.A01;
            if (rf2 == null) {
                str = "onlineLocationComponentListener";
            } else {
                lithoView.A0y(new QGK(rf2, A0m, z));
                View view2 = this.A02;
                if (view2 != null) {
                    super.onViewCreated(view2, bundle);
                    return;
                }
                str = "searchResultsView";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
