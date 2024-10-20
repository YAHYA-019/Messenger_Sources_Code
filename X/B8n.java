package X;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;

/* loaded from: B8n.class */
public final class B8n extends BJB {
    public static final String __redex_internal_original_name = "MessengerSupportInboxListFragment";
    public final C2kx A00 = new C2kx();

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView == null || getContext() == null) {
            return;
        }
        A1b();
        1Bn.A0A(148083);
        1Iw A0P = AbI.A0P(this);
        C1qb c1qb = new C1qb(getContext());
        C9bw c9bw = new C9bw();
        c9bw.A04 = getContext().getString(2131963569);
        By5 A00 = c9bw.A00();
        2cM A01 = 2cK.A01(A0P, (String) null, 0);
        C2ki A002 = C2kV.A00(A0P);
        A002.A2e(this.A00);
        8Sm A003 = C8nz.A00(c1qb);
        A003.A2X(2131957317);
        S7z s7z = new S7z(this);
        C8nz c8nz = A003.A01;
        c8nz.A03 = s7z;
        c8nz.A04 = true;
        c8nz.A00 = ((BJB) this).A01.B4i();
        c8nz.A01 = Layout.Alignment.ALIGN_NORMAL;
        A002.A2b(A003.A2W());
        B2H b2h = new B2H();
        b2h.A01 = ((BJB) this).A01;
        b2h.A00 = this;
        A002.A2d(b2h);
        A002.A2h(true);
        AbG.A1M(A01, A002);
        1LI A1Z = A1Z(A01.A00, A0P, A00);
        ComponentTree componentTree = lithoView.A00;
        if (componentTree == null) {
            AbN.A19(A1Z, A0P, lithoView);
        } else {
            componentTree.A0O(A1Z);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(372669795);
        LithoView A1Y = A1Y(layoutInflater, viewGroup);
        0FI.A08(-1369990344, A02);
        return A1Y;
    }
}
