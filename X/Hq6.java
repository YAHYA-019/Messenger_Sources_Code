package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.HashSet;

/* loaded from: Hq6.class */
public final class Hq6 {
    public String A02;
    public boolean A03;
    public final C00i A06 = 1BQ.A02(68759);
    public final C00i A05 = AbH.A0a();
    public int A01 = 1;
    public int A00 = 0;
    public final HashSet A04 = AnonymousClass001.A0v();

    public String A00() {
        1Ql edit;
        if (this.A02 != null) {
            C00i c00i = this.A06;
            FbSharedPreferences A00 = 53I.A00((53I) c00i.get());
            1G2 r0 = 4LQ.A0e;
            long A0A = 1BL.A0A(A00, r0);
            long A08 = 1BL.A08(this.A05);
            if (A08 - A0A > 3600000) {
                this.A02 = 1BK.A0t();
                this.A03 = false;
                edit = 53I.A00((53I) c00i.get()).edit();
                edit.CaH(r0, A08);
            }
            return this.A02;
        }
        this.A02 = 1BK.A0t();
        this.A03 = false;
        53I r02 = (53I) this.A06.get();
        long A082 = 1BL.A08(this.A05);
        edit = 53I.A00(r02).edit();
        edit.CaH(4LQ.A0e, A082);
        edit.commit();
        return this.A02;
    }
}
