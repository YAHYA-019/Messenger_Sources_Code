package X;

import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;

/* renamed from: X.AsL, reason: case insensitive filesystem */
/* loaded from: AsL.class */
public final class C1787AsL extends C04v {
    public static final C1787AsL A07;
    public final ThreadSummary A00;
    public final User A01;
    public final Capabilities A02;
    public final Capabilities A03;
    public final 2Sh A04;
    public final C1783AsH A05;
    public final ImmutableList A06;

    static {
        ImmutableList A0b = 1BK.A0b();
        Capabilities capabilities = 5Hr.A06;
        2Sh r0 = 2Sh.A01;
        11T.A0B(r0);
        A07 = new C1787AsL(null, null, capabilities, r0, C1783AsH.A02, A0b);
    }

    public C1787AsL(ThreadSummary threadSummary, User user, Capabilities capabilities, 2Sh r305, C1783AsH c1783AsH, ImmutableList immutableList) {
        7zP.A1L(capabilities, 4, c1783AsH);
        this.A00 = threadSummary;
        this.A01 = user;
        this.A06 = immutableList;
        this.A02 = capabilities;
        this.A04 = r305;
        this.A05 = c1783AsH;
        this.A03 = capabilities;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1787AsL)) {
                return false;
            }
            C1787AsL c1787AsL = (C1787AsL) obj;
            if (!11T.A0O(this.A00, c1787AsL.A00) || !11T.A0O(this.A01, c1787AsL.A01) || !11T.A0O(this.A06, c1787AsL.A06) || !11T.A0O(this.A02, c1787AsL.A02) || !11T.A0O(this.A04, c1787AsL.A04) || !11T.A0O(this.A05, c1787AsL.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A05, AnonymousClass002.A05(this.A04, AnonymousClass002.A05(this.A02, AnonymousClass002.A05(this.A06, ((AnonymousClass001.A02(this.A00) * 31) + 4YU.A03(this.A01)) * 31))));
    }
}
