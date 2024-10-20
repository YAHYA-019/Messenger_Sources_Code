package X;

import com.facebook.messaging.inbox.units.StaticUnitConfig;

/* renamed from: X.37U, reason: invalid class name */
/* loaded from: 37U.class */
public final class C37U extends 2UP {
    public final long A00;
    public final long A01;
    public final boolean A02;
    public final StaticUnitConfig A03;

    public C37U(StaticUnitConfig staticUnitConfig, long j, long j2, boolean z) {
        super((C2gu) null, staticUnitConfig);
        this.A00 = j;
        this.A01 = j2;
        this.A02 = z;
        this.A03 = staticUnitConfig;
    }

    public 2hJ AsW() {
        return 2hJ.A0C;
    }

    public String BKC() {
        return "COMMUNITY_CREATE_OR_SUGGEST_CHAT_ENTRY_POINT";
    }

    public boolean BVb(2UR r302) {
        11T.A0F(r302, 0);
        return equals(r302);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C37U)) {
                return false;
            }
            C37U c37u = (C37U) obj;
            if (this.A00 != c37u.A00 || this.A01 != c37u.A01 || this.A02 != c37u.A02 || !11T.A0O(this.A03, c37u.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A03, (AnonymousClass002.A02(this.A01, AnonymousClass002.A01(this.A00)) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31);
    }
}
