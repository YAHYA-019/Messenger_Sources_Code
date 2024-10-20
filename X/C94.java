package X;

import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: C94.class */
public final class C94 {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06 = AbG.A0Y();

    public C94(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A02 = 1Bu.A03(r0, 66462);
        this.A04 = 1Bu.A03(r0, 83430);
        this.A01 = 1Bq.A00(66227);
        this.A03 = 1Bu.A03(r0, 82380);
        this.A05 = AbG.A0P();
    }

    public final boolean A00(ThreadSummary threadSummary, User user) {
        boolean A1V = AnonymousClass001.A1V(1De.A00(this.A00, 33058));
        if (1Br.A0B(this.A06) != C0et.A0P) {
            return false;
        }
        User A0n = AbJ.A0n(this.A04);
        if (11T.A0O(A0n != null ? A0n.A13 : null, user.A13) || !A1V || threadSummary == null || !2oI.A03(threadSummary) || user.A2C) {
            return false;
        }
        1Br.A0C(this.A02);
        return true;
    }

    public final boolean A01(User user) {
        User A0n;
        if (user.A29 || user.A0E() || (A0n = AbJ.A0n(this.A04)) == null || A0n.A29 || !((C1uz) 1Br.A0B(this.A01)).A02(40)) {
            return false;
        }
        1Br.A0C(this.A02);
        return (user.A1g || user.A0U == 1Kq.A04 || AbL.A1I(this.A05) || user.A05) ? false : true;
    }

    public final boolean A02(User user) {
        if (1Br.A0B(this.A06) != C0et.A0P) {
            return false;
        }
        C00i c00i = this.A04.A00;
        if (c00i.get() == null) {
            return false;
        }
        User user2 = (User) c00i.get();
        if (11T.A0O(user2 != null ? user2.A13 : null, user.A13) || !((C1uz) 1Br.A0B(this.A01)).A02(31) || user.A2C) {
            return false;
        }
        1Br.A0C(this.A02);
        return true;
    }
}
