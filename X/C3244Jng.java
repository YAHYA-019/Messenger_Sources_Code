package X;

import android.os.Bundle;
import com.facebook.iabeventlogging.model.IABHistoryEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;

/* renamed from: X.Jng, reason: case insensitive filesystem */
/* loaded from: Jng.class */
public final class C3244Jng extends L5Y implements MNr, MNt, MNs, MNq {
    public L0T A00;
    public LDF A01 = LDF.A00();
    public final 0rI A02;

    public C3244Jng() {
        0rI r0 = 0rI.A00;
        11T.A0A(r0);
        this.A02 = r0;
    }

    public static final void A00(C3244Jng c3244Jng) {
        L11 l11;
        L0T l0t = c3244Jng.A00;
        if (l0t != null) {
            String[] strArr = (String[]) l0t.A04.toArray(new String[0]);
            JgX jgX = ((L5Y) c3244Jng).A03;
            if (jgX != null && (l11 = jgX.A0c) != null) {
                Long l = l0t.A02;
                Long l2 = l0t.A01;
                Long l3 = l0t.A00;
                boolean z = l0t.A03;
                long A00 = L11.A00(l11);
                IABHistoryEvent iABHistoryEvent = new IABHistoryEvent(l, l2, l3, l11.A0U, strArr, A00, A00, z);
                if (!l0t.A04.isEmpty()) {
                    Bundle bundle = jgX.A09;
                    ZonePolicy zonePolicy = jgX.A0d;
                    if (zonePolicy == null) {
                        zonePolicy = ZonePolicy.A03;
                    }
                    LDF A002 = LDF.A00();
                    LDF.A02(new JmP(bundle, A002, iABHistoryEvent, zonePolicy), A002);
                }
            }
            c3244Jng.A00 = null;
        }
    }

    public void destroy() {
        A00(this);
        super.destroy();
    }
}
