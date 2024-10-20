package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.mapbox.mapboxsdk.R;

/* loaded from: E7u.class */
public final class E7u extends DZF implements CallerContextable {
    public static final CallerContext A0B = CallerContext.A08(E7u.class, "messenger");
    public static final String __redex_internal_original_name = "NeueStyleQuickPromotionInterstitialFragment";
    public Button A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public C0qy A04;
    public 4gJ A05;
    public FbDraweeView A06;
    public final C00i A07 = 1Bi.A02(08O.class, (Class) null);
    public final Fce A0A = (Fce) 1Bi.A05(Fce.class, (Class) null);
    public final 2S2 A08 = (2S2) 1Bi.A05(2S2.class, (Class) null);
    public final C00i A09 = 1Bi.A02(1GS.class, (Class) null);

    public 1iF A1R() {
        return AbF.A0C(410344603372464L);
    }

    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A04 = (C0qy) 1Bi.A04(C0qy.class);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:118:0x02a7. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0370  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityCreated(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E7u.onActivityCreated(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(2004142120);
        View inflate = layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), 2132608313)).inflate(2132543181, viewGroup, false);
        this.A02 = AbG.A09(inflate, 2131366660);
        this.A00 = (Button) C09s.A01(inflate, 2131367201);
        this.A03 = AbG.A09(inflate, 2131368067);
        this.A01 = AbG.A09(inflate, 2131363332);
        this.A06 = DKC.A0M(inflate, R.id.image);
        this.A05 = new C2521Gg1(this, 10);
        this.A08.A01(inflate, this, "quick_promotion_interstitial");
        0FI.A08(1231974593, A02);
        return inflate;
    }
}
