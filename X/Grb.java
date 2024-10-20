package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Grb.class */
public final class Grb extends BJB {
    public static final String __redex_internal_original_name = "SecurityAlertsFragment";
    public FbUserSession A00;
    public 1GU A01;
    public HSV A02;
    public boolean A03;
    public final HSW A04;
    public final By5 A05;

    public Grb() {
        C9bw c9bw = new C9bw();
        c9bw.A01 = 2131963506;
        this.A05 = c9bw.A00();
        this.A04 = new HSW(this);
    }

    public 1iF A1R() {
        return AbF.A0C(548832966797589L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = 1BM.A01(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        LithoView lithoView;
        if (getContext() == null || (lithoView = ((BJB) this).A00) == null) {
            return;
        }
        A1b();
        1Iw A0T = 7zP.A0T(this);
        By5 by5 = this.A05;
        MigColorScheme migColorScheme = ((BJB) this).A01;
        11T.A0A(migColorScheme);
        lithoView.A0x(A1Z(new 8XM(new IaR(this, 1), migColorScheme, this.A03), A0T, by5));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 32798126);
        LithoView A1Y = A1Y(layoutInflater, viewGroup);
        11T.A0A(A1Y);
        0FI.A08(1771832664, A04);
        return A1Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        String str;
        int A02 = 0FI.A02(1397527003);
        super/*androidx.fragment.app.Fragment*/.onStart();
        this.A02 = (HSV) 1Bn.A0E(requireContext(), (1BY) null, 116342);
        this.A01 = 7zQ.A0Q();
        HSV hsv = this.A02;
        if (hsv == null) {
            str = "controller";
        } else {
            FbUserSession fbUserSession = this.A00;
            if (fbUserSession != null) {
                HSW hsw = this.A04;
                ((1xC) 4YU.A0o(fbUserSession, hsv.A00, 33148)).A02(new Iby(hsw, 12), AbE.A00(202), 7zP.A1X(hsw));
                A1c();
                0FI.A08(1979048978, A02);
                return;
            }
            str = "fbUserSession";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
