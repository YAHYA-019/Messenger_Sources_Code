package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;

/* loaded from: B8s.class */
public final class B8s extends BJB {
    public static final String __redex_internal_original_name = "AvatarUsabilitySettingFragment";
    public final 1Br A00 = 7zM.A0Y();
    public final C01i A02 = DCx.A00(this, 40);
    public final C01i A04 = DCx.A00(this, 42);
    public final C01i A03 = DCx.A00(this, 41);
    public final BcA A01 = new BcA(this);

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -668726269);
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(-164767366, A04);
        return A0J;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-2036502167);
        super/*X.DZJ*/.onDestroyView();
        AfW afW = (AfW) this.A04.getValue();
        BM0 bm0 = (BM0) afW.A01.getValue();
        if (bm0 == null) {
            bm0 = BM0.A05;
        }
        boolean A1V = 1BK.A1V(afW.A00, bm0);
        1UG A08 = 1BK.A08(4YV.A0B(), 1BJ.A00(1010));
        if (A08.isSampled()) {
            AbL.A0s(A08);
            A08.A5H("setting_updated", Boolean.valueOf(A1V));
            A08.A7R("setting_at_exit", C9l.A00(bm0));
            A08.BZL();
        }
        0FI.A08(744511333, A02);
    }
}
