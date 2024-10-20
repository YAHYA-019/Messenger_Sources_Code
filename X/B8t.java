package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;

/* loaded from: B8t.class */
public final class B8t extends BJB {
    public static final String __redex_internal_original_name = "M4AboutPreferenceFragment";
    public FbUserSession A00;
    public CCX A01;
    public String A02;
    public final 1Br A03 = 7zM.A0P();
    public final 1Br A04 = 1Bu.A00(987);
    public final 1Br A05 = 1Bu.A00(147500);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = 1BM.A01(this);
        C1F6 c1f6 = (C1F6) 1Br.A0B(this.A04);
        Context context = getContext();
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            CCX ccx = new CCX(context);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A01 = ccx;
            if (1Br.A07(BY9.A00).AZk(36317964282507224L)) {
                C3sa A0L = 7zM.A0L(7zL.A0M(), new 2Jf(2JX.class, (Class) null, "FxCalSettingsDeactivateMessengerSubtitle", (String) null, "fbandroid", 669710716, 0, 2534403014L, 2534403014L, false, true));
                FbUserSession fbUserSession = this.A00;
                if (fbUserSession == null) {
                    7zL.A1C();
                    throw 0Q8.createAndThrow();
                }
                C03713yu A03 = 1VX.A07(getContext(), fbUserSession).A03(A0L);
                11T.A0A(A03);
                1Br.A0D(this.A03, D4q.A00(this, 0), A03);
            }
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -606922316);
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(-90337444, A04);
        return A0J;
    }
}
