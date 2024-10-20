package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.litho.LithoView;

/* loaded from: B8o.class */
public final class B8o extends BJB {
    public static final String __redex_internal_original_name = "M4DataSaverPreferenceFragment";
    public final 1Br A00 = 1Bu.A02(this, 82145);
    public final C5ww A01 = Cvn.A00(this, 49);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Bps bps = (Bps) 1Br.A0B(this.A00);
            Intent intent = activity.getIntent();
            if (intent == null || !intent.getBooleanExtra(AbstractC00603o4.A00(342), false)) {
                return;
            }
            1Br.A0C(bps.A01);
            ((66K) bps.A00.get()).A00(true);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -1019511821);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        LithoView A1Y = A1Y(layoutInflater, viewGroup);
        0FI.A08(-252159293, A04);
        return A1Y;
    }
}
