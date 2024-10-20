package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: L39.class */
public final class L39 {
    public 1BY A00;
    public final C00i A01 = 7zN.A0D(83719);
    public final java.util.Map A02 = new 0QO(0);
    public volatile boolean A03 = false;

    public L39(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static String A00(Rfu rfu, String str, String str2, boolean z) {
        Object obj;
        StringBuilder A0k = AnonymousClass001.A0k();
        boolean z2 = true;
        switch (rfu.A01.intValue()) {
            case 0:
                obj = "NEVER_FETCHED";
                break;
            case 1:
                obj = "SUCCESSFULLY_FETCHED";
                break;
            case 2:
                obj = "INITIAL_FETCH_FAILED";
                break;
            default:
                obj = "DESTROYED";
                break;
        }
        A0k.append(String.format("Location not found: %s in session %s status=%s chunks=[", str, str2, obj));
        Q5k q5k = rfu.A00;
        1Du it = (q5k == null ? ImmutableList.of() : q5k.A04).iterator();
        while (it.hasNext()) {
            RKm rKm = (RKm) it.next();
            if (z2) {
                z2 = false;
            } else {
                AnonymousClass001.A1H(A0k);
            }
            A0k.append((z ? rKm.A01 : rKm.A02).A01);
        }
        return AnonymousClass001.A0g(A0k, ']');
    }

    public KlR A01(L4I l4i, Qnp qnp) {
        synchronized (this) {
            Iterator A1B = 1BK.A1B(this.A02);
            while (A1B.hasNext()) {
                KlR klR = (KlR) A1B.next();
                if (klR.A01 == l4i && klR.A02 == qnp) {
                    return klR;
                }
            }
            return null;
        }
    }

    public void A02(String str) {
        synchronized (this) {
            java.util.Map map = this.A02;
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                KlR klR = (KlR) A0z.getKey();
                0fH.A03(LVb.class, klR.A05, klR.A04, klR.A02, str, "Canceling fetch (before=%s,  after=%s, order=%s) in session %s");
                2eS r0 = (2eS) A0z.getValue();
                if (r0 != null) {
                    r0.A00(true);
                }
            }
            map.clear();
        }
    }
}
