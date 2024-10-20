package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: B8q.class */
public final class B8q extends BJB {
    public static final String __redex_internal_original_name = "KeyboardPreferenceFragment";
    public FbUserSession A00;
    public final 1Br A01 = 1Bu.A02(this, 82578);
    public final C5ww A02 = Cvn.A00(this, 35);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        LithoView lithoView = ((BJB) this).A00;
        Context context = getContext();
        if (lithoView == null || context == null) {
            return;
        }
        1Iw A0G = BJB.A0G(context, this);
        C9bw c9bw = new C9bw();
        c9bw.A01 = 2131958530;
        By5 A00 = c9bw.A00();
        MigColorScheme migColorScheme = ((BJB) this).A01;
        11T.A0A(migColorScheme);
        Bl0 bl0 = (Bl0) 1Br.A0B(this.A01);
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        BJB.A0I(new QGL(this.A02, migColorScheme, ((6kG) 1Br.A0B(bl0.A00)).A02(fbUserSession)), A0G, lithoView, this, A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 2051971465);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        this.A00 = 1BM.A01(this);
        LithoView A1Y = A1Y(layoutInflater, viewGroup);
        0FI.A08(1845143998, A04);
        return A1Y;
    }
}
