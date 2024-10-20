package X;

import com.facebook.user.model.UserKey;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* renamed from: X.5ni, reason: invalid class name */
/* loaded from: 5ni.class */
public abstract class C5ni {
    public boolean A00(5Cz r302, UserKey userKey) {
        7Nf r0;
        1Iw r02;
        if (this instanceof C5nh) {
            11T.A0F(userKey, 0);
            11T.A0F(r302, 1);
            C07654kb c07654kb = (C07654kb) ((C5nh) this).A00.get();
            if (c07654kb == null) {
                return false;
            }
            java.util.Map map = c07654kb.A04;
            map.remove(userKey);
            map.put(userKey, r302);
            C07654kb.A01(c07654kb);
            return true;
        }
        if (this instanceof 6NH) {
            11T.A0F(userKey, 0);
            11T.A0F(r302, 1);
            6NG r03 = (6NG) ((6NH) this).A00.get();
            if (r03 == null) {
                return false;
            }
            r03.A03(r302, userKey);
            return true;
        }
        if (this instanceof AnonymousClass663) {
            WeakReference weakReference = ((AnonymousClass663) this).A00.A00;
            if (weakReference == null || (r02 = (1Iw) weakReference.get()) == null) {
                return false;
            }
            if (r02.A02 == null) {
                return true;
            }
            r02.A0G(new C2l4(new Object[0], 0), "updateState:SenderTile.onPresenceChanged");
            return true;
        }
        11T.A0F(userKey, 0);
        11T.A0F(r302, 1);
        7Ng r04 = ((7Ni) this).A00;
        C6mg c6mg = r04.A00;
        if (c6mg == null) {
            return false;
        }
        boolean A00 = r302.A00(c6mg.A00);
        C6mg c6mg2 = r04.A00;
        if (c6mg2 == null || (r0 = r04.A01) == null) {
            return true;
        }
        C6mg c6mg3 = new C6mg(c6mg2.A00, c6mg2.A01, c6mg2.A02, userKey, new HashSet(c6mg2.A04), c6mg2.A05, A00);
        r04.A00 = c6mg3;
        if (c6mg3.A00 != r0.A00.A01) {
            return true;
        }
        r0.A01.A02(c6mg3);
        return true;
    }
}
