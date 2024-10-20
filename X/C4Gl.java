package X;

import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.4Gl, reason: invalid class name */
/* loaded from: 4Gl.class */
public final class C4Gl implements C4Gf {
    @Override // X.C4Gf
    public C4Gy A8f(C4Gc c4Gc, final 44I r303) {
        4WA r309;
        String str;
        11T.A0F(r303, 0);
        11T.A0F(c4Gc, 1);
        if (c4Gc.A0J) {
            return C4Gx.A00();
        }
        Integer num = 0S2.A00;
        ImmutableSet<InterstitialTrigger> immutableSet = c4Gc.A0H;
        11T.A0F(immutableSet, 0);
        if (!immutableSet.isEmpty()) {
            for (InterstitialTrigger interstitialTrigger : immutableSet) {
                11T.A0F(interstitialTrigger, 0);
                if (interstitialTrigger.A00 == 116) {
                    r309 = new 4WA();
                    break;
                }
            }
        }
        if (r303.A00() || r303.A00.A01.contains(QuickPromotionDefinition.Attribute.A03)) {
            r309 = new C4H5() { // from class: X.4W9
                @Override // X.C4H5
                public ImmutableMap ACn() {
                    44I r0 = r303;
                    ImmutableMap of = ImmutableMap.of((Object) "isUncancelable", (Object) Boolean.toString(r0.A00()), (Object) "isByPassSurfaceDelay", (Object) Boolean.toString(r0.A00.A01.contains(QuickPromotionDefinition.Attribute.A03)));
                    11T.A0A(of);
                    return of;
                }
            };
            return C4Gx.A01(r309);
        }
        C4H8 c4h8 = new C4H8(new C4H7(c4Gc));
        long j = c4Gc.A00;
        4GK r0 = c4Gc.A0D;
        if (!C4H9.A00(c4h8, r0, num, j, c4Gc.A04)) {
            str = "dismiss_delay_not_met";
        } else {
            if (C4H9.A00(c4h8, r0, 0S2.A01, j, c4Gc.A02)) {
                return C4Gx.A01(c4h8);
            }
            str = "outside_eligibility_duration";
        }
        return C4Gx.A02(c4h8, str);
    }

    @Override // X.C4Gf
    public String DAM() {
        return "client_surface_delay";
    }
}
