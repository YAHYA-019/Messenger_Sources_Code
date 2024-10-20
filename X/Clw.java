package X;

import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.messaging.location.model.NearbyPlace;
import com.google.common.collect.ImmutableList;

/* loaded from: Clw.class */
public final class Clw implements MFU {
    public /* bridge */ /* synthetic */ ImmutableList D4p(L5D l5d, Object obj) {
        2JY A0B;
        ImmutableList A0b;
        2JY A0L;
        2JY A0J;
        2JY A0B2 = 1BK.A0B((2JY) obj, 2JX.class, -1368650173, -193652451);
        if (A0B2 == null || (A0B = 1BK.A0B(A0B2, 2JX.class, -934427458, 132997295)) == null || (A0b = A0B.A0b(-448960895, 2JX.class)) == null) {
            return ImmutableList.of();
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = A0b.iterator();
        while (it.hasNext()) {
            2JY A0P = 7zL.A0P(it);
            if (A0P != null && (A0L = AbM.A0L(A0P, 2JX.class, -1970243952)) != null && A0L.A0k() != null && A0L.A0j() != null && (A0J = AbF.A0J(A0L, 2JX.class, -1202186417)) != null && A0J.A0l() != null && A0L.A0L(1901043637, 2JX.class, -1505274153) != null) {
                String str = null;
                String str2 = null;
                2JY A0L2 = AbM.A0L(A0P, 2JX.class, -1970243952);
                String A0k = A0L2.A0k();
                String A0j = A0L2.A0j();
                String A0l = AbF.A0J(A0L2, 2JX.class, -1202186417).A0l();
                TreeJNI A0L3 = A0L2.A0L(1901043637, 2JX.class, -1505274153);
                Double valueOf = Double.valueOf(A0L3.getDoubleValue(-1439978388));
                Double valueOf2 = Double.valueOf(A0L3.getDoubleValue(137365935));
                String A0r = A0P.A0r(2144428955);
                if (!1JF.A0B(A0r)) {
                    str = A0r;
                }
                2JY A0B3 = 1BK.A0B(A0L2, 2JX.class, -1147692044, 15968635);
                if (A0B3 != null) {
                    String A0r2 = A0B3.A0r(21980740);
                    if (!1JF.A0B(A0r2)) {
                        str2 = A0r2;
                    }
                }
                builder.m11011add((Object) new NearbyPlace(null, valueOf, valueOf2, null, str, str2, A0k, A0j, A0l, false, false, false));
            }
        }
        return builder.build();
    }
}
