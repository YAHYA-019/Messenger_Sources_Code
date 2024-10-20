package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.1do, reason: invalid class name */
/* loaded from: 1do.class */
public final class C1do extends 1Km {
    public final 1Br A00 = 1Bq.A00(99654);

    public C02S Au6() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        if (0Zi.A01(A00).A4W) {
            return new C02S(new int[]{5505032, 5505076, 5510864, 5520807}, null);
        }
        return null;
    }

    public void C5i(C03b c03b) {
        11T.A0F(c03b, 0);
        ((F69) 1Br.A0B(this.A00)).A03.remove(Integer.valueOf(c03b.BHz()));
    }

    public String getName() {
        return "plugin_insights_app_flow_listener";
    }
}
