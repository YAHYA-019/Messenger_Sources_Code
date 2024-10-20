package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;

/* loaded from: B94.class */
public final class B94 extends BJB {
    public static final String __redex_internal_original_name = "ColorFilterSettingFragment";
    public C00i A00;
    public C00i A01;
    public C00i A02;
    public C00i A03;
    public By5 A04;
    public final REU A05 = new REU(this);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        FbUserSession A01 = 1BM.A01(this);
        this.A02 = AbM.A0O(this, A01, 66300);
        this.A03 = AbM.A0O(this, A01, 67986);
        this.A00 = AbM.A0O(this, A01, 82588);
        this.A01 = AbM.A0O(this, A01, 66299);
        C9bw c9bw = new C9bw();
        c9bw.A01 = 2131954316;
        this.A04 = c9bw.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1a() {
        7zR.A14(this);
        C00i c00i = this.A01;
        if (c00i == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        Integer A00 = ((C1p5) c00i.get()).A00();
        C00i c00i2 = this.A00;
        if (c00i2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        CCY ccy = (CCY) c00i2.get();
        11T.A0F(A00, 0);
        1UG A08 = 1BK.A08(1Br.A02(ccy.A00), 1BJ.A00(1809));
        if (A08.isSampled()) {
            A08.A7R("msgr_setting_accessibility_session_id", ccy.A01);
            A08.A7R("msgr_setting_accessibilty_subsection_session_id", "");
            4YU.A1I(A08, "accessibility_type", 0);
            int intValue = A00.intValue();
            int i = 3;
            if (intValue == 0) {
                i = 0;
            } else if (intValue == 2) {
                i = 2;
            } else if (intValue == 1) {
                i = 1;
            }
            4YU.A1I(A08, "setting_value", i);
            A08.BZL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        Context context;
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView == null || (context = getContext()) == null) {
            return;
        }
        1Iw A0G = BJB.A0G(context, this);
        C00i c00i = this.A01;
        if (c00i == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        Integer A00 = ((C1p5) c00i.get()).A00();
        C00i c00i2 = this.A02;
        if (c00i2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        C1933Awy c1933Awy = new C1933Awy(this.A05, ((C1or) c00i2.get()).A00(), C1p6.A00(A00));
        By5 by5 = this.A04;
        if (by5 != null) {
            BJB.A0I(c1933Awy, A0G, lithoView, this, by5);
        } else {
            11T.A0L("titleBarParams");
            throw 0Q8.createAndThrow();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 2143038478);
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(658063729, A04);
        return A0J;
    }
}
