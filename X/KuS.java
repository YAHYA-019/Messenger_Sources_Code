package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: KuS.class */
public final class KuS {
    public final int A00 = C04I.A00().hashCode();
    public final C11454wj A01;
    public final C11474wl A02;

    public KuS(C11474wl c11474wl) {
        this.A02 = c11474wl;
        this.A01 = c11474wl.A02;
    }

    public final void A00() {
        this.A01.A02(Integer.valueOf(this.A00), null, "check_cache_start", 772815129);
    }

    public final void A01(Integer num, Integer num2, String str) {
        this.A01.A00(null, 772815129, this.A00);
        A02(04R.A09(new 03Y[]{1BK.A1G("iab_session_id", this.A02.A00.A08.A05), 1BK.A1G(4YT.A00(1392), str), 1BK.A1G("prompt_type", num.intValue() != 0 ? "save" : "usage"), 1BK.A1G("autofill_type", num2.intValue() != 0 ? "PAYMENT_AUTOFILL" : "CONTACT_AUTOFILL"), 1BK.A1G("cache_ttl", String.valueOf(86400L))}));
    }

    public final void A02(java.util.Map map) {
        C11454wj c11454wj = this.A01;
        int i = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!c11454wj.A00.A00.AZk(36311839668243983L) || valueOf == null) {
            return;
        }
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            c11454wj.A01.markerAnnotate(772815129, i, AnonymousClass001.A0j(A0z), 1BK.A16(A0z));
        }
    }

    public final void A03(Set set) {
        11T.A0F(set, 0);
        this.A01.A02(Integer.valueOf(this.A00), null, "check_cache_end", 772815129);
        A02(4YW.A0A(4YT.A00(916), 0Pz.A0L(4YV.A0t(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, set, (Function1) null), '[', ']'), 1BK.A1G(4YT.A00(1150), String.valueOf(!set.isEmpty()))));
    }

    public final void A04(boolean z) {
        A02(1BK.A1D("was_prompt_shown", String.valueOf(z)));
        this.A01.A01(Integer.valueOf(this.A00), null, 772815129);
    }
}
