package X;

import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.4Gh, reason: invalid class name */
/* loaded from: 4Gh.class */
public final class C4Gh implements C4Gf {
    @Override // X.C4Gf
    public C4Gy A8f(C4Gc c4Gc, 44I r303) {
        InterstitialTrigger interstitialTrigger;
        11T.A0F(r303, 0);
        11T.A0F(c4Gc, 1);
        4GR r0 = c4Gc.A09;
        ImmutableSet immutableSet = c4Gc.A0H;
        return (immutableSet.size() != 1 || (interstitialTrigger = (InterstitialTrigger) immutableSet.iterator().next()) == null) ? C4Gx.A03("Eligibility context has no or multiple triggers") : r0.A00.D8u(interstitialTrigger, r303.A00);
    }

    @Override // X.C4Gf
    public String DAM() {
        return "post_client_definition_content";
    }
}
