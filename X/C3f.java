package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.user.model.User;

/* loaded from: C3f.class */
public final class C3f {
    public final 1Br A00 = 1BK.A0E();
    public final 1Br A01 = 1BK.A0D();
    public final 1Wa A02 = (1Wa) 1Bi.A03(66347);

    public final boolean A00() {
        boolean A00 = this.A02.A00();
        FbSharedPreferences A09 = 1Br.A09(this.A00);
        User A0v = 7zQ.A0v();
        return A09.AZn(1G9.A05(1G9.A04(1NK.A1C), A0v != null ? A0v.A13 : null), AnonymousClass001.A1N(A00 ? 1 : 0));
    }
}
