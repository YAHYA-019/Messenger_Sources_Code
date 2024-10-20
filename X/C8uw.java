package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8uw, reason: invalid class name */
/* loaded from: 8uw.class */
public final class C8uw extends BJB {
    public static final String __redex_internal_original_name = "DmaFacebookConsentSettingFragment";
    public 9Nk A00;

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = new 9Nk(requireActivity(), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        Context context = getContext();
        if (context != null) {
            1Iw A0W = 7zL.A0W(context);
            MigColorScheme migColorScheme = ((BJB) this).A01;
            11T.A0A(migColorScheme);
            LithoView lithoView = ((BJB) this).A00;
            if (lithoView != null) {
                String A0D = A0W.A0D(2131955892);
                String A0D2 = A0W.A0D(2131955890);
                String A0D3 = A0W.A0D(2131955893);
                9Nk r0 = this.A00;
                if (r0 == null) {
                    11T.A0L("settingListener");
                    throw 0Q8.createAndThrow();
                }
                11T.A0D(A0D3);
                11T.A0D(A0D);
                11T.A0D(A0D2);
                lithoView.A0x(new 8VE(new 8Lq(r0, A0D3, A0D, A0D2), migColorScheme));
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -1443361191);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(1240993662, A04);
        return A0J;
    }
}
