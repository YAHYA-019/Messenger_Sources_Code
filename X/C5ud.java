package X;

import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;

/* renamed from: X.5ud, reason: invalid class name */
/* loaded from: 5ud.class */
public final class C5ud implements C5ue {
    public static final C5ud A00 = new Object();

    @Override // X.C5ue
    public C5ui Ciw(C5uZ c5uZ, ZonePolicy zonePolicy, String str) {
        try {
            return new C5uh(new ZonedValue(zonePolicy, c5uZ.get(), str));
        } catch (Exception e) {
            return new C7gb(e);
        }
    }

    @Override // X.C5ue
    public C5ui D6K(ZonedValue zonedValue) {
        return new C5uh(zonedValue.A01);
    }

    @Override // X.C5ue
    public Object D6M(ZonedValue zonedValue, Integer num) {
        return zonedValue.A01;
    }

    @Override // X.C5ue
    public boolean isEnabled() {
        return false;
    }
}
