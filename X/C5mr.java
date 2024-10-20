package X;

import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.5mr, reason: invalid class name */
/* loaded from: 5mr.class */
public final class C5mr implements C5mp {
    public final 1Br A00 = 1Bq.A00(67196);

    @Override // X.C5mp
    public C5fv CZN(C5j5 c5j5, Capabilities capabilities, C5fv c5fv) {
        11T.A0F(c5fv, 0);
        11T.A0F(c5j5, 1);
        C5fr c5fr = ((C5fu) c5fv).A05;
        String str = c5fr.A0A;
        if (str == null) {
            str = c5fr.A07;
        }
        11T.A0D(str);
        return (C5fv) C5uk.A00(C5ua.A00(new C84o(this, c5j5, c5fv, str, 1), ZonePolicy.A0F), 0S2.A0F);
    }
}
