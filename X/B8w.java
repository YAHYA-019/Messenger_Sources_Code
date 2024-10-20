package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;

/* loaded from: B8w.class */
public final class B8w extends BJB {
    public static final String __redex_internal_original_name = "PhotosAndMediaPreferenceFragment";
    public CPi A00;
    public final 1Br A01 = 1Bu.A02(this, 1005);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = AbJ.A0J(this.A01).A0k(requireActivity());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 953099600);
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(1370211702, A04);
        return A0J;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(2013988176);
        CPi cPi = this.A00;
        if (cPi == null) {
            11T.A0L("controller");
            throw 0Q8.createAndThrow();
        }
        ((2Pl) 1Br.A0B(cPi.A09)).A00("Leave current preference ", 0S2.A0j);
        super/*X.DZJ*/.onDestroy();
        0FI.A08(1521922031, A02);
    }
}
