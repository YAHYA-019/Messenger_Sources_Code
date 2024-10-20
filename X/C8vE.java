package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8vE, reason: invalid class name */
/* loaded from: 8vE.class */
public final class C8vE extends BJB implements 1pN {
    public static final String __redex_internal_original_name = "UgcCapabilitiesSelectionFragment";
    public 1pI A00;
    public FbUserSession A01;

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A01 = 1BM.A01(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView == null || getContext() == null) {
            return;
        }
        A1b();
        ComponentTree componentTree = lithoView.A00;
        if (componentTree != null) {
            1Iw r0 = lithoView.A09;
            C9bw c9bw = new C9bw();
            c9bw.A01 = 2131953834;
            By5 A00 = C9zj.A00(c9bw, this, 3);
            MigColorScheme migColorScheme = ((BJB) this).A01;
            11T.A0A(migColorScheme);
            componentTree.A0O(A1Z(new 8UA(migColorScheme), r0, A00));
        }
    }

    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super/*X.1pK*/.onAttach(context);
        A1c();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(442793142);
        11T.A0F(layoutInflater, 0);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        C1s0 c1s0 = new C1s0(A0J.A09);
        c1s0.A01(false);
        7zQ.A1I(c1s0, A0J);
        0FI.A08(-1444268385, A02);
        return A0J;
    }

    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super/*X.1pK*/.onViewCreated(view, bundle);
        this.A00 = 1vD.A00(view);
    }
}
