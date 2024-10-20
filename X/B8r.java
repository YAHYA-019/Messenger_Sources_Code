package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;

/* loaded from: B8r.class */
public final class B8r extends BJB {
    public static final String __redex_internal_original_name = "MessengerMediaDownloadControlFragment";
    public CPi A00;
    public By5 A01;
    public final 1Br A02 = 1Bu.A02(this, 1005);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        C9bw c9bw;
        super.A1S(bundle);
        this.A00 = AbJ.A0J(this.A02).A0k(requireActivity());
        String string = requireArguments().getString("media_download_title_extra");
        if (string != null) {
            c9bw = new C9bw();
            c9bw.A04 = string;
        } else {
            0fH.A0j(__redex_internal_original_name, "Title is null");
            c9bw = new C9bw();
        }
        this.A01 = c9bw.A00();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 1133829117);
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(1508335167, A04);
        return A0J;
    }
}
