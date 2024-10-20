package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.Iterator;
import java.util.Set;

/* loaded from: I4i.class */
public final class I4i {
    public boolean A00;
    public final FbUserSession A01;
    public final 1De A02;
    public final 2QY A03;
    public final Set A04;

    public I4i(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        this.A01 = fbUserSession;
        this.A04 = GOn.A1J();
        this.A03 = Gys.A00(this, 9);
    }

    public static final void A00(I4i i4i) {
        boolean BQe = ((2QO) 4YU.A0n(i4i.A01, i4i.A02, 99977)).BQe(false);
        if (BQe != i4i.A00) {
            i4i.A00 = BQe;
            Iterator it = i4i.A04.iterator();
            while (it.hasNext()) {
                ((JFb) it.next()).BmK();
            }
        }
    }

    public final void A01(JFb jFb) {
        11T.A0F(jFb, 0);
        Set set = this.A04;
        set.add(jFb);
        if (set.size() == 1) {
            FbUserSession fbUserSession = this.A01;
            1BY r0 = this.A02.A00;
            2QT r02 = (2QT) 1Lm.A07(fbUserSession, r0, 99981);
            this.A00 = GOp.A0v(fbUserSession, r0).BQe(false);
            r02.A67(this.A03);
        }
    }

    public final void A02(JFb jFb) {
        11T.A0F(jFb, 0);
        if (GOo.A1Y(jFb, this.A04)) {
            ((2QT) 4YU.A0n(this.A01, this.A02, 99981)).CeZ(this.A03);
        }
    }

    public final boolean A03() {
        if (this.A04.isEmpty()) {
            this.A00 = ((2QO) 4YU.A0n(this.A01, this.A02, 99977)).BQe(false);
        }
        return this.A00;
    }
}
