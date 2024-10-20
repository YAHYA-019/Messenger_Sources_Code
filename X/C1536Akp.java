package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;

/* renamed from: X.Akp, reason: case insensitive filesystem */
/* loaded from: Akp.class */
public final class C1536Akp extends 1pK {
    public static final String __redex_internal_original_name = "ToolsTabFragment";
    public FbUserSession A00;
    public LithoView A01;
    public final 1Br A02 = 7zN.A0I(this);
    public final DFS A03 = new CnH(this);

    public static final void A03(C1536Akp c1536Akp) {
        String str;
        LithoView lithoView = c1536Akp.A01;
        if (lithoView == null) {
            str = "lithoView";
        } else {
            FbUserSession fbUserSession = c1536Akp.A00;
            if (fbUserSession != null) {
                lithoView.A0y(new AxT(fbUserSession, AbF.A0U(lithoView), c1536Akp.A03, 7zQ.A0m(c1536Akp.A02)));
                return;
            }
            str = "fbUserSession";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(189594732);
        this.A00 = 1BM.A01(this);
        LithoView A0M = 7zR.A0M(this);
        this.A01 = A0M;
        0FI.A08(-60089233, A02);
        return A0M;
    }

    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        A03(this);
    }
}
