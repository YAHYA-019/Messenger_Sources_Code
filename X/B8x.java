package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;

/* loaded from: B8x.class */
public final class B8x extends BJB {
    public static final String __redex_internal_original_name = "DarkModeSettingFragment";
    public FbUserSession A00;
    public 1pI A01;
    public final Bc4 A02;
    public final By5 A03;

    public B8x() {
        C9bw c9bw = new C9bw();
        c9bw.A01 = 2131955445;
        this.A03 = BJB.A0H(c9bw, this, 8);
        this.A02 = new Bc4(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -1970997462);
        this.A00 = 1BM.A01(this);
        LithoView A1Y = A1Y(layoutInflater, viewGroup);
        0FI.A08(-1766145407, A04);
        return A1Y;
    }

    public void onStop() {
        int A02 = 0FI.A02(782283511);
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView != null) {
            lithoView.A0i();
        }
        super/*X.DZJ*/.onStop();
        0FI.A08(-242837826, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super/*X.1pK*/.onViewCreated(view, bundle);
        this.A01 = 1vD.A00(view);
    }
}
