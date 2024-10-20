package X;

import android.content.Context;
import java.util.List;

/* loaded from: C2k.class */
public final class C2k {
    public final /* synthetic */ 1Iw A00;
    public final /* synthetic */ CNU A01;

    public C2k(1Iw r302, CNU cnu) {
        this.A01 = cnu;
        this.A00 = r302;
    }

    public final void A00(C1706Aqc c1706Aqc, String str, List list, boolean z) {
        BpQ bpQ = this.A01.A08;
        bpQ.A00 = c1706Aqc;
        bpQ.A02 = list;
        bpQ.A01 = str;
        1Iw r0 = this.A00;
        Context context = r0.A0D;
        if (r0.A02 != null) {
            r0.A0G(new C2l4(new Object[]{context, c1706Aqc, list, str, Boolean.valueOf(z)}, 0), "updateState:CoplayPrivacyContentTextComponent.updatePermissions");
        }
    }
}
