package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: B8u.class */
public final class B8u extends BJB {
    public static final String __redex_internal_original_name = "AccessibilitySettingFragment";
    public By5 A00;
    public C00i A01;

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A01 = AbM.A0O(this, 1BM.A01(this), 82588);
        C9bw c9bw = new C9bw();
        c9bw.A01 = 2131952165;
        this.A00 = c9bw.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1a() {
        7zR.A14(this);
        C00i c00i = this.A01;
        if (c00i == null) {
            throw 1BK.A0h();
        }
        CCY ccy = (CCY) c00i.get();
        MigColorScheme migColorScheme = ((BJB) this).A01;
        11T.A0A(migColorScheme);
        1UG A08 = 1BK.A08(1Br.A02(ccy.A00), 1BJ.A00(1806));
        if (A08.isSampled()) {
            A08.A7R("msgr_setting_accessibility_session_id", ccy.A01);
            A08.A7R("msgr_setting_accessibilty_subsection_session_id", "");
            4YU.A1I(A08, "accessibility_type", 0);
            4YU.A1I(A08, "setting_value", CCY.A00(migColorScheme));
            A08.BZL();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -770220554);
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(1010296373, A04);
        return A0J;
    }
}
