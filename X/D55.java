package X;

import com.facebook.messaging.communitymessaging.ephemeralstatusbadging.model.CommunityBadge;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.google.common.base.Objects;

/* loaded from: D55.class */
public final class D55 implements Comparable {
    public static final DAg A0C = new DAg();
    public final long A00;
    public final CommunityBadge A01;
    public final ThreadKey A02;
    public final C1zL A03;
    public final User A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public D55(CommunityBadge communityBadge, ThreadKey threadKey, C1zL c1zL, User user, Integer num, String str, String str2, String str3, long j, boolean z, boolean z2, boolean z3) {
        this.A04 = user;
        this.A06 = str;
        this.A03 = c1zL;
        this.A02 = threadKey;
        this.A05 = num;
        this.A07 = str2;
        this.A00 = j;
        this.A0A = z;
        this.A09 = z2;
        this.A01 = communityBadge;
        this.A08 = str3;
        this.A0B = z3;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        DAg dAg = A0C;
        User user = this.A04;
        User user2 = ((D55) obj).A04;
        String A13 = 7zL.A13(user);
        if (A13 == null) {
            A13 = "";
        }
        String A132 = 7zL.A13(user2);
        if (A132 == null) {
            A132 = "";
        }
        return dAg.A00.compare(A13, A132);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof D55)) {
            D55 d55 = (D55) obj;
            if (Objects.equal(this.A04, d55.A04) && Objects.equal(this.A06, d55.A06) && this.A03 == d55.A03 && Objects.equal(this.A05, d55.A05) && Objects.equal(this.A07, d55.A07) && Objects.equal(Long.valueOf(this.A00), Long.valueOf(d55.A00)) && Objects.equal(this.A02, d55.A02) && Objects.equal(Boolean.valueOf(this.A0A), Boolean.valueOf(d55.A0A))) {
                z = 4YV.A1Z(Boolean.valueOf(this.A09), Boolean.valueOf(d55.A09));
            }
        }
        return z;
    }

    public int hashCode() {
        return 0J6.A02(this.A04, this.A06, this.A03, this.A02);
    }
}
