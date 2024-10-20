package X;

import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* renamed from: X.5ua, reason: invalid class name */
/* loaded from: 5ua.class */
public abstract class C5ua {
    public static final ZonedValue A00(C5uZ c5uZ, ZonePolicy zonePolicy) {
        C5ue c5ue = C5ub.A00;
        if (c5ue == null) {
            c5ue = C5ud.A00;
        }
        C5ui Ciw = c5ue.Ciw(c5uZ, zonePolicy, OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
        11T.A0A(Ciw);
        Object A00 = C5uj.A00(Ciw);
        11T.A0A(A00);
        return (ZonedValue) A00;
    }

    public static final Object A01(C5uZ c5uZ, ZonePolicy zonePolicy, Integer num) {
        C5ue c5ue = C5ub.A00;
        if (c5ue == null) {
            c5ue = C5ud.A00;
        }
        C5ui Ciw = c5ue.Ciw(c5uZ, zonePolicy, OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
        11T.A0A(Ciw);
        Object A00 = C5uj.A00(Ciw);
        11T.A0A(A00);
        return C5uk.A00((ZonedValue) A00, num);
    }

    public static final Object A02(ZonedValue zonedValue) {
        C5ue c5ue = C5ub.A00;
        if (c5ue == null) {
            c5ue = C5ud.A00;
        }
        return C5uj.A00(c5ue.D6K(zonedValue));
    }

    public static final void A03(C5uZ c5uZ, ZonePolicy zonePolicy, String str) {
        C5ue c5ue = C5ub.A00;
        if (c5ue == null) {
            c5ue = C5ud.A00;
        }
        11T.A0A(c5ue.Ciw(c5uZ, zonePolicy, str));
    }
}
