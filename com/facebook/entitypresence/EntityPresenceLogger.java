package com.facebook.entitypresence;

import X.1BK;
import X.1BQ;
import X.1Bi;
import X.4YV;
import X.AbH;
import X.AnonymousClass001;
import X.C00i;
import X.C1m1;
import X.I3v;
import X.RR3;
import java.util.Map;

/* loaded from: EntityPresenceLogger.class */
public final class EntityPresenceLogger {
    public final C1m1 A02 = (C1m1) 1Bi.A03(16782);
    public final C00i A01 = 1BQ.A00();
    public final C00i A00 = AbH.A0N();
    public final Map A05 = AnonymousClass001.A0u();
    public final Map A03 = AnonymousClass001.A0u();
    public final Map A06 = AnonymousClass001.A0u();
    public final Map A04 = AnonymousClass001.A0u();

    public static long A00(EntityPresenceLogger entityPresenceLogger, I3v i3v) {
        Map map = entityPresenceLogger.A06;
        Number A0o = 1BK.A0o(i3v, map);
        if (A0o == null) {
            A0o = 4YV.A0j();
        }
        long longValue = A0o.longValue() + 1;
        AnonymousClass001.A18(i3v, longValue, map);
        return longValue;
    }

    public static RR3 A01(EntityPresenceLogger entityPresenceLogger, I3v i3v) {
        Map map = entityPresenceLogger.A04;
        RR3 rr3 = (RR3) map.get(i3v);
        if (rr3 == null) {
            rr3 = new RR3();
            map.put(i3v, rr3);
        }
        return rr3;
    }
}
