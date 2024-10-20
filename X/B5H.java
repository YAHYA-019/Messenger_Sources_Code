package X;

import com.facebook.messaging.inbox.units.StaticUnitConfig;
import java.util.List;

/* loaded from: B5H.class */
public final class B5H extends 2UP {
    public final long A00;
    public final String A01;
    public final List A02;
    public final 2hJ A03;
    public final StaticUnitConfig A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5H(StaticUnitConfig staticUnitConfig, String str, List list, long j) {
        super((C2gu) null, staticUnitConfig);
        11T.A0F(list, 1);
        this.A02 = list;
        this.A04 = staticUnitConfig;
        this.A00 = j;
        this.A01 = str;
        this.A03 = 2hJ.A0B;
    }

    public 2hJ AsW() {
        return this.A03;
    }

    public String BKC() {
        return "COMMUNITY_ADMIN_SUGGESTED_ACTIONS";
    }

    public boolean BVb(2UR r302) {
        return false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof B5H)) {
                return false;
            }
            B5H b5h = (B5H) obj;
            if (!11T.A0O(this.A02, b5h.A02) || !11T.A0O(this.A04, b5h.A04) || this.A00 != b5h.A00 || !11T.A0O(this.A01, b5h.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, AnonymousClass002.A05(this.A04, 1BL.A03(this.A02))) + 1BL.A05(this.A01);
    }
}
