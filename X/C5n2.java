package X;

import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.5n2, reason: invalid class name */
/* loaded from: 5n2.class */
public final class C5n2 implements C5mp {
    public final 1Br A00;
    public final 1CO A01;
    public final C5n1 A02;

    public C5n2() {
        this((C5n1) null);
    }

    public C5n2(int i) {
    }

    public C5n2(C5n1 c5n1) {
        this.A02 = c5n1;
        this.A01 = (1CO) 1Bi.A03(16387);
        this.A00 = 1Bq.A00(49865);
    }

    @Override // X.C5mp
    public C5fv CZN(C5j5 c5j5, Capabilities capabilities, C5fv c5fv) {
        boolean z;
        String str;
        11T.A0F(c5fv, 0);
        11T.A0F(c5j5, 1);
        11T.A0F(capabilities, 2);
        if (!capabilities.A00.get(45) && ((!C5ul.A02(c5fv) || !this.A01.AZk(72341147778814407L)) && (((z = c5fv instanceof C5n8)) || (c5fv instanceof 5gC)))) {
            if (c5fv instanceof 5gC) {
                str = ((5gC) c5fv).A03;
            } else if (z) {
                str = ((C5n8) c5fv).A09;
            }
            return (C5fv) C5uk.A00(C5ua.A00(new C84o(this, c5j5, c5fv, str, 0), ZonePolicy.A0F), 0S2.A0F);
        }
        return c5fv;
    }
}
