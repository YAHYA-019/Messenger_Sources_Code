package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.call.gen.CallModel;
import java.util.Iterator;
import java.util.Set;

/* loaded from: I3q.class */
public final class I3q {
    public int A00;
    public boolean A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final IY8 A05;
    public final Set A06;
    public final 1De A07;

    public I3q(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A07 = r303;
        this.A06 = GOn.A1J();
        1BY r0 = r303.A00;
        this.A04 = 1Lm.A03(fbUserSession, r0, 33088);
        this.A03 = 1Lm.A03(fbUserSession, r0, 33089);
        this.A02 = 1Lm.A03(fbUserSession, r0, 114856);
        this.A05 = IY8.A01(this, 48);
    }

    public static final void A00(I3q i3q, 2JS r302) {
        CallModel A0j = GOq.A0j(r302);
        int A00 = A0j != null ? IFr.A00(A0j) : 0;
        boolean z = false;
        if (!GOq.A1S(i3q.A03)) {
            IYp A0b = GOq.A0b(i3q.A02);
            int i = A0b.A06;
            int i2 = A0b.A0L;
            int i3 = 11;
            if (i == i2) {
                i3 = i2 + 1;
            }
            if (A00 >= i3) {
                z = true;
            }
        }
        if (z != i3q.A01) {
            i3q.A01 = z;
            Iterator it = i3q.A06.iterator();
            while (it.hasNext()) {
                ((JIh) it.next()).CLK();
            }
        }
        if (i3q.A00 != A00) {
            i3q.A00 = A00;
            Iterator it2 = i3q.A06.iterator();
            while (it2.hasNext()) {
                ((JIh) it2.next()).Bhe();
            }
        }
    }

    public void A01(JIh jIh) {
        11T.A0F(jIh, 0);
        Set set = this.A06;
        if (set.isEmpty()) {
            C00i c00i = this.A04.A00;
            GOo.A0R(c00i).A03(this.A05, 02H.A02(new HAp[]{HAp.A0H, HAp.A0G}));
            A00(this, GOq.A0o(c00i));
        }
        set.add(jIh);
    }

    public void A02(JIh jIh) {
        11T.A0F(jIh, 0);
        if (GOo.A1Y(jIh, this.A06)) {
            GOp.A0O(this.A04).A02(this.A05);
        }
    }
}
