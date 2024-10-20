package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8uz, reason: invalid class name */
/* loaded from: 8uz.class */
public final class C8uz extends BJB {
    public static final String __redex_internal_original_name = "ThirdPartyAppsSettingsFragment";
    public 1pI A00;
    public AWl A01;
    public 3Jr A02;
    public boolean A03;
    public final 1Br A04 = 1Bu.A00(67527);
    public final C01i A05;

    public C8uz() {
        AQb A00 = AQb.A00(this, 18);
        C01i A002 = C01g.A00(C03i.A02, AQb.A00(AQb.A00(this, 6), 7));
        this.A05 = 7zU.A0F(AQb.A00(A002, 8), A00, AQt.A01(null, A002, 31), 7zL.A18(8DJ.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1B(Bundle bundle) {
        super/*X.1pK*/.A1B(bundle);
        AJd.A03(this, 7zO.A0J(this), 11);
        AJd.A03(this, 7zO.A0J(this), 13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        LithoView lithoView = ((BJB) this).A00;
        Context context = getContext();
        if (lithoView == null || context == null || this.A01 == null) {
            return;
        }
        A1b();
        MigColorScheme migColorScheme = ((BJB) this).A01;
        11T.A0A(migColorScheme);
        AWl aWl = this.A01;
        if (aWl == null) {
            11T.A0L("screen");
            throw 0Q8.createAndThrow();
        }
        AQb A00 = AQb.A00(this, 11);
        AQb A002 = AQb.A00(this, 12);
        AV4 A003 = AV4.A00(this, 4);
        AW4 aw4 = new AW4(this, 4);
        lithoView.A0x(new 8eY(aWl, migColorScheme, A00, A002, AQb.A00(this, 13), AQb.A00(this, 14), AQb.A00(this, 15), AQb.A00(this, 16), AQb.A00(this, 17), AQb.A00(this, 9), AQb.A00(this, 10), A003, AV4.A00(this, 3), aw4));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 1352179570);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(-1280693245, A04);
        return A0J;
    }
}
