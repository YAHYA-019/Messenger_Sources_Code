package X;

import androidx.fragment.app.Fragment;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: Cui.class */
public final class Cui implements 6HK {
    public final int A00;
    public final Object A01;

    public Cui(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bln(User user) {
        int i = this.A00;
        11T.A0F(user, 0);
        if (i != 0) {
            AmJ amJ = (AmJ) this.A01;
            7EN r0 = (7EN) 7zO.A0l(amJ, 50188);
            BNT bnt = BNT.A0Q;
            r0.A03(amJ.mFragmentManager, BOM.A01, amJ.A03, bnt, (C1ph) null, user);
            return;
        }
        Fragment fragment = (Fragment) this.A01;
        7EN r02 = (7EN) 7zO.A0l(fragment, 50188);
        BNT bnt2 = BNT.A0Q;
        r02.A03(fragment.mFragmentManager, BOM.A02, (ThreadSummary) null, bnt2, (C1ph) null, user);
    }

    public void C3O() {
    }

    public void C9x(User user) {
        if (this.A00 == 0 || user == null) {
            return;
        }
        AmJ.A06((AmJ) this.A01, user);
    }
}
