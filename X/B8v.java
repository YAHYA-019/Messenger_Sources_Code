package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: B8v.class */
public final class B8v extends BJB {
    public static final String __redex_internal_original_name = "XmaPreviewPreferenceFragment";
    public final 1Br A00 = 1Bq.A00(68750);
    public final C5ww A01 = Cvn.A00(this, 9);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        LithoView lithoView = ((BJB) this).A00;
        Context context = getContext();
        if (lithoView == null || context == null) {
            return;
        }
        1Iw A0G = BJB.A0G(context, this);
        C9bw c9bw = new C9bw();
        c9bw.A01 = 2131963818;
        By5 A00 = c9bw.A00();
        MigColorScheme migColorScheme = ((BJB) this).A01;
        11T.A0A(migColorScheme);
        BJB.A0I(new QFf(this.A01, migColorScheme), A0G, lithoView, this, A00);
    }

    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super/*X.1pK*/.onAttach(context);
        A1c();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -703306891);
        LithoView A1Y = A1Y(layoutInflater, viewGroup);
        0FI.A08(1841062845, A04);
        return A1Y;
    }
}
