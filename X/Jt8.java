package X;

import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: Jt8.class */
public final class Jt8 extends C04v {
    public static final Jt8 A02 = new Jt8(ZonePolicy.A03, OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
    public final ZonePolicy A00;
    public final String A01;

    public Jt8(ZonePolicy zonePolicy, String str) {
        this.A00 = zonePolicy;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jt8)) {
                return false;
            }
            Jt8 jt8 = (Jt8) obj;
            if (this.A00 != jt8.A00 || !11T.A0O(this.A01, jt8.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, 1BL.A03(this.A00));
    }
}
