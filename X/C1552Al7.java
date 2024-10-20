package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.acra.constants.ActionId;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Al7, reason: case insensitive filesystem */
/* loaded from: Al7.class */
public final class C1552Al7 extends 1pK {
    public static final int A06 = View.generateViewId();
    public static final String __redex_internal_original_name = "ChatHistoryDeletionNuxFragment";
    public long A00;
    public 1pI A01;
    public LithoView A02;
    public final 1Br A04 = 1BK.A0E();
    public final 1Br A03 = 7zM.A0d();
    public final 1Br A05 = 7zM.A0T();

    public static final void A03(C1552Al7 c1552Al7) {
        1pI r0 = c1552Al7.A01;
        if (r0 != null) {
            if (!r0.BVa()) {
                return;
            }
            1pI r02 = c1552Al7.A01;
            if (r02 != null) {
                r02.CeH(__redex_internal_original_name);
                return;
            }
        }
        11T.A0L("contentViewManager");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(2049302639);
        Context requireContext = requireContext();
        this.A02 = 7zO.A0V(requireContext);
        1Iw A0W = 7zL.A0W(requireContext);
        LithoView lithoView = this.A02;
        if (lithoView != null) {
            AbN.A1A(A0W, lithoView);
        }
        FrameLayout frameLayout = new FrameLayout(requireContext);
        AbJ.A1G(frameLayout, A06);
        frameLayout.addView(this.A02);
        0FI.A08(1150180111, A02);
        return frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(-1761708978);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        this.A02 = null;
        0FI.A08(-282575841, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        C00i c00i = this.A05.A00;
        this.A00 = 7zN.A0c(c00i).generateNewFlowId(586026148);
        AbI.A1U(7zN.A0c(c00i), "bulk_thread_deletion_nux", this.A00, false);
        7zN.A0c(c00i).flowMarkPoint(this.A00, "nux_thread_impression");
        super.onViewCreated(view, bundle);
        1BV A0K = AbJ.A0K(this, 16979);
        CxE A00 = CxE.A00(this, 48);
        CZD A002 = CZD.A00(this, ActionId.RTMP_CONNECTION_INTERCEPTED);
        CZD A003 = CZD.A00(this, ActionId.VIDEO_SET_RENDERER_CONTEXT);
        LithoView lithoView = this.A02;
        if (lithoView != null) {
            lithoView.A0x(new QGq(A002, A003, (MigColorScheme) A0K.get(), A00));
        }
        this.A01 = 1vD.A00(view);
    }
}
