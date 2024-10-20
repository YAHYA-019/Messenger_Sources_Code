package X;

import android.content.Context;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.5mx, reason: invalid class name */
/* loaded from: 5mx.class */
public final class C5mx extends C5mo {
    public final 1Br A00;
    public final 1Br A01 = 1Bq.A00(66067);
    public final 1Br A02 = 1Bq.A00(67196);
    public final C5mw A03;

    public C5mx(Context context, C5mw c5mw) {
        this.A03 = c5mw;
        this.A00 = 1Bu.A01(context, 67778);
    }

    @Override // X.C5mp
    public C5fv CZN(C5j5 c5j5, Capabilities capabilities, C5fv c5fv) {
        11T.A0F(c5fv, 0);
        11T.A0F(c5j5, 1);
        if (c5fv instanceof 5gC) {
            c5fv = (C5fv) C5uk.A00(C5ua.A00(new C84p(2, this, c5j5, c5fv), ZonePolicy.A0F), 0S2.A0F);
        }
        return c5fv;
    }
}
