package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8vF, reason: invalid class name */
/* loaded from: 8vF.class */
public final class C8vF extends BJB implements 1pN {
    public static final String __redex_internal_original_name = "AiBotEmbodimentPipSettingFragment";
    public 1pI A01;
    public boolean A02;
    public final 1Br A03 = 1Bq.A00(66421);
    public final 1Br A04 = 1Bq.A00(68702);
    public long A00 = -1;

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
            c9bw.A01 = 2131967182;
            By5 A00 = C9zj.A00(c9bw, this, 12);
            final MigColorScheme migColorScheme = ((BJB) this).A01;
            11T.A0A(migColorScheme);
            final boolean z = !this.A02;
            final C9ye A01 = C9ye.A01(this, 7);
            componentTree.A0O(A1Z(new 1LH(A01, migColorScheme, z) { // from class: X.8Wk
                public final C5ww A00;
                public final MigColorScheme A01;
                public final boolean A02;

                {
                    this.A01 = migColorScheme;
                    this.A02 = z;
                    this.A00 = A01;
                }

                public 1LI A0s(C2k5 c2k5) {
                    11T.A0F(c2k5, 0);
                    CQY A002 = 7zU.A0T().A00(c2k5.A05, this.A01);
                    String A09 = 3yH.A09(c2k5, 2131967183);
                    boolean z2 = this.A02;
                    C5ww c5ww = this.A00;
                    c5ww.getClass();
                    CQY.A03(A002, c5ww, "", A09, z2);
                    return A002.A09();
                }
            }, r0, A00));
        }
    }

    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super/*X.1pK*/.onAttach(context);
        A1c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(419965378);
        11T.A0F(layoutInflater, 0);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        this.A00 = requireArguments().getLong("thread_ID");
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        C1s0 c1s0 = new C1s0(A0J.A09);
        c1s0.A01(false);
        7zQ.A1I(c1s0, A0J);
        0FI.A08(12018277, A02);
        return A0J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1435788427);
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.A02 = 7zP.A0Y(this.A03).A0D(String.valueOf(this.A00));
        A1c();
        0FI.A08(604289494, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.DZJ*/.onSaveInstanceState(bundle);
        bundle.putLong("thread_ID", this.A00);
    }

    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super/*X.1pK*/.onViewCreated(view, bundle);
        this.A01 = 1vD.A00(view);
    }
}
