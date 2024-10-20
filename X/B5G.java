package X;

import com.facebook.messaging.inbox.units.StaticUnitConfig;

/* loaded from: B5G.class */
public final class B5G extends 2UP {
    public final long A00;
    public final long A01;
    public final C1781AsF A02;
    public final StaticUnitConfig A03;

    public B5G(C1781AsF c1781AsF, StaticUnitConfig staticUnitConfig, long j, long j2) {
        super((C2gu) null, staticUnitConfig);
        this.A00 = j;
        this.A01 = j2;
        this.A02 = c1781AsF;
        this.A03 = staticUnitConfig;
    }

    public 2hJ AsW() {
        return 2hJ.A0G;
    }

    public String BKC() {
        return "COMMUNITY_INSIGHTS_DASHBOARD_ENTRY_POINT";
    }

    public boolean BVb(2UR r302) {
        11T.A0F(r302, 0);
        return equals(r302);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof B5G)) {
                return false;
            }
            B5G b5g = (B5G) obj;
            if (this.A00 != b5g.A00 || this.A01 != b5g.A01 || !11T.A0O(this.A02, b5g.A02) || !11T.A0O(this.A03, b5g.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        return 1BK.A03(this.A03, AnonymousClass002.A05(this.A02, AnonymousClass002.A02(this.A01, ((int) (j ^ (j >>> 32))) * 31)));
    }
}
