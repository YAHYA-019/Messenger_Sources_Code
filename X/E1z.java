package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.litho.LithoView;

/* loaded from: E1z.class */
public abstract class E1z extends BJB {
    public static final String __redex_internal_original_name = "FxCalBaseFragment";
    public boolean A00;
    public 2Wo A01;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1d() {
        Window window;
        2Wo r0 = this.A01;
        if (r0 != null) {
            r0.A02();
            LithoView lithoView = ((BJB) this).A00;
            if (lithoView != null) {
                lithoView.setAlpha(1.0f);
            }
            this.A00 = false;
            FragmentActivity activity = getActivity();
            if (activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.clearFlags(16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1e() {
        Window window;
        2Wo r0 = this.A01;
        if (r0 != null) {
            r0.A03();
            LithoView lithoView = ((BJB) this).A00;
            if (lithoView != null) {
                lithoView.setAlpha(0.4f);
            }
            this.A00 = true;
            FragmentActivity activity = getActivity();
            if (activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.addFlags(16);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1616671266);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132542069, viewGroup, false);
        ((BJB) this).A00 = 7zL.A0b(inflate, 2131364275);
        View findViewById = inflate.findViewById(2131364276);
        11T.A0I(findViewById, 1BJ.A00(14));
        this.A01 = 2Wo.A00((ViewStub) findViewById);
        0FI.A08(650077448, A02);
        return inflate;
    }
}
