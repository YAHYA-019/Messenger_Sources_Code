package X;

import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: Co4.class */
public final class Co4 implements AZV {
    public final int A00;
    public final Object A01;

    public Co4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C0p(ThreadSummary threadSummary) {
        if (this.A00 == 0) {
            AlS alS = (AlS) this.A01;
            int i = AlS.A0f;
            CZt cZt = alS.A05;
            if (cZt == null) {
                11T.A0L("viewDataModel");
                throw 0Q8.createAndThrow();
            }
            cZt.A0C(threadSummary);
            AlS.A0G(alS);
        }
    }

    public void CTC(User user) {
        switch (this.A00) {
            case 0:
                AlS.A0J((AlS) this.A01, (DK4) null, user, -1, -1);
                return;
            case 1:
                AlK.A08((AlK) this.A01, user);
                return;
            case 2:
                B7E b7e = (B7E) this.A01;
                5xF r0 = b7e.A05;
                String str = user.A13;
                r0.A05(53N.A02(user), (DK4) null, str, -1, -1);
                b7e.A06.A07(str);
                B7E.A0C(b7e, b7e.A0B, true);
                b7e.A06.A05();
                return;
            default:
                B7D b7d = (B7D) this.A01;
                5xF r02 = b7d.A0B;
                String str2 = user.A13;
                r02.A05(53N.A02(user), (DK4) null, str2, -1, -1);
                B7D.A0R(b7d, str2);
                B7D.A0O(b7d, b7d.A0K, true);
                B7D.A0K(b7d);
                return;
        }
    }
}
