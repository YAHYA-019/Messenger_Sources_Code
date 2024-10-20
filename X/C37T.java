package X;

import com.facebook.messaging.inbox.units.StaticUnitConfig;
import com.google.common.base.Objects;

/* renamed from: X.37T, reason: invalid class name */
/* loaded from: 37T.class */
public final class C37T extends 2UP {
    public final long A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37T(StaticUnitConfig staticUnitConfig, String str, long j) {
        super((C2gu) null, staticUnitConfig);
        1BL.A1F(staticUnitConfig, str);
        this.A01 = str;
        this.A00 = j;
    }

    public 2hJ AsW() {
        return 2hJ.A08;
    }

    public String BKC() {
        return "COMMUNITIES_CATEGORY";
    }

    public boolean BMu() {
        return false;
    }

    public boolean BVb(2UR r302) {
        boolean z = false;
        11T.A0F(r302, 0);
        if (11T.A0O(r302.getClass(), C37T.class)) {
            z = Objects.equal(this.A01, ((C37T) r302).A01);
        }
        return z;
    }
}
