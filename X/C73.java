package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;

/* loaded from: C73.class */
public final class C73 {
    public final 1Ih A00 = (1Ih) 7zM.A19();
    public final 2Ph A01 = (2Ph) 1Bn.A0B(17010);

    public String A00(ThreadKey threadKey) {
        2Ph r0 = this.A01;
        if (r0.A0B(threadKey)) {
            return null;
        }
        return r0.A0A(threadKey.A06) ? this.A00.getString(2131960033) : r0.A05(r0.A02(threadKey));
    }

    public String A01(User user, boolean z) {
        1Ih r304;
        int i;
        if (z) {
            r304 = this.A00;
            i = 2131960035;
        } else {
            if (user != null) {
                return 4YU.A0u(this.A00, AbF.A1B(user), 2131960037);
            }
            r304 = this.A00;
            i = 2131960036;
        }
        return r304.getString(i);
    }
}
