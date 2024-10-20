package X;

import com.facebook.messaging.inbox.units.StaticUnitConfig;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.2gw, reason: invalid class name */
/* loaded from: 2gw.class */
public abstract class C2gw {
    public static final C2gv A00() {
        C2gy c2gy;
        C2gx c2gx = (C2gx) 1Bn.A0A(66728);
        StaticUnitConfig staticUnitConfig = C2gv.A06;
        if (c2gx.A01()) {
            11T.A0F(staticUnitConfig, 0);
            c2gy = new C2gy(null, staticUnitConfig, null);
        } else {
            c2gy = null;
        }
        HeterogeneousMap heterogeneousMap = HeterogeneousMap.A02;
        11T.A0I(heterogeneousMap, "null cannot be cast to non-null type com.facebook.xapp.messaging.map.HeterogeneousMap<T of com.facebook.xapp.messaging.map.HeterogeneousMap.Companion.empty>");
        return new C2gv(staticUnitConfig, null, c2gy, heterogeneousMap, null, null, null);
    }
}
