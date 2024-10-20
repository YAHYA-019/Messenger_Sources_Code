package X;

import com.facebook.messaging.inbox.units.StaticUnitConfig;
import com.google.common.base.Objects;

/* renamed from: X.2gt, reason: invalid class name */
/* loaded from: 2gt.class */
public final class C2gt extends 2UP {
    public final Integer A00;
    public final String A01;

    public C2gt(StaticUnitConfig staticUnitConfig, Integer num, String str) {
        super(C2gu.A04, staticUnitConfig);
        this.A00 = num;
        this.A01 = str;
    }

    public 2hJ AsW() {
        return 2hJ.A0T;
    }

    public String BKC() {
        return "MORE_THREADS";
    }

    public boolean BMu() {
        return false;
    }

    public boolean BVb(2UR r302) {
        boolean z = false;
        if (r302.getClass() == C2gt.class) {
            C2gt c2gt = (C2gt) r302;
            if (this.A00 == c2gt.A00 && Objects.equal(this.A01, c2gt.A01)) {
                z = true;
            }
        }
        return z;
    }
}
