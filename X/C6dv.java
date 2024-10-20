package X;

import android.content.Context;
import com.facebook.video.plugins.LoadingSpinnerPlugin;

/* renamed from: X.6dv, reason: invalid class name */
/* loaded from: 6dv.class */
public final class C6dv extends LoadingSpinnerPlugin {
    public 1CQ A00;
    public final boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6dv(Context context) {
        super(context, 2132542441);
        11T.A0F(context, 1);
        1CQ r0 = (1CQ) 1Bi.A03(131252);
        this.A00 = r0;
        this.A01 = r0.A09(29, false);
    }

    @Override // com.facebook.video.plugins.LoadingSpinnerPlugin, X.C6d6
    public void A0M() {
        ((LoadingSpinnerPlugin) this).A04.setVisibility(4);
    }

    @Override // com.facebook.video.plugins.LoadingSpinnerPlugin, X.C6d6
    public void A0e(6TI r302, boolean z) {
        ((LoadingSpinnerPlugin) this).A04.setVisibility(4);
    }
}
