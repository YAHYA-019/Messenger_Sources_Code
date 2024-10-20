package X;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.litho.LithoView;
import com.facebook.widget.RoundedCornersFrameLayout;

/* loaded from: G0k.class */
public final class G0k implements Runnable {
    public static final String __redex_internal_original_name = "InstantGamesCustomShareNTViewController$renderNTorBKView$1";
    public final /* synthetic */ EzV A00;

    public G0k(EzV ezV) {
        this.A00 = ezV;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EzV ezV = this.A00;
        1Br.A0C(ezV.A07);
        DQi dQi = ezV.A0C;
        FHq.A00(dQi, (GGC) null);
        RoundedCornersFrameLayout roundedCornersFrameLayout = dQi.A03;
        ViewGroup.LayoutParams layoutParams = null;
        if (roundedCornersFrameLayout != null) {
            layoutParams = roundedCornersFrameLayout.getLayoutParams();
        }
        11T.A0I(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.addRule(13);
        if (roundedCornersFrameLayout != null) {
            roundedCornersFrameLayout.setLayoutParams(layoutParams2);
        }
        LithoView lithoView = dQi.A01;
        if (lithoView != null) {
            1Iw r0 = lithoView.A09;
            C1rq A00 = C1rg.A00(r0);
            A00.A2c();
            A00.A0e();
            A00.A0r(190.0f);
            7DF A002 = 7DD.A00(r0);
            A002.A2W(40.0f);
            A00.A2e(A002);
            lithoView.A0x(A00.A00);
        }
    }
}
