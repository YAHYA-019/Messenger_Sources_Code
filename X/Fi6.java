package X;

import com.facebook.common.util.TriState;
import com.facebook.zero.common.ZeroToken;
import com.facebook.zero.protocol.params.FetchZeroTokenRequestParams;
import com.google.common.collect.ImmutableList;

/* loaded from: Fi6.class */
public final class Fi6 implements 4qU {
    public final /* synthetic */ EmP A00;

    public Fi6(EmP emP) {
        this.A00 = emP;
    }

    public Iterable B0L() {
        EmP emP = this.A00;
        if (4YV.A1Y(emP.A02)) {
            return ImmutableList.of();
        }
        C00i c00i = emP.A00;
        2BR A0h = DKC.A0h(c00i);
        FetchZeroTokenRequestParams A02 = ((2BV) A0h.A0B.get()).A02(1QE.A02, "login");
        C00i c00i2 = emP.A01;
        1Ro A0S = DKC.A0S(c00i2);
        TriState triState = TriState.NO;
        C4r6 c4r6 = new C4r6(triState, A0S, A02, null, "fetchZeroToken");
        2BR A0h2 = DKC.A0h(c00i);
        return ImmutableList.of((Object) c4r6, (Object) new C4r6(triState, DKC.A0S(c00i2), ((2BV) A0h2.A0B.get()).A02(1QE.A01, "login"), null, "fetchZeroTokenForDialtone"));
    }

    public void CA9(java.util.Map map) {
        ZeroToken zeroToken = (ZeroToken) map.get("fetchZeroToken");
        if (zeroToken != null) {
            DKC.A0h(this.A00.A00).A0F(zeroToken, 1QE.A02);
        }
        ZeroToken zeroToken2 = (ZeroToken) map.get("fetchZeroTokenForDialtone");
        if (zeroToken2 != null) {
            DKC.A0h(this.A00.A00).A0F(zeroToken2, 1QE.A01);
        }
    }
}
