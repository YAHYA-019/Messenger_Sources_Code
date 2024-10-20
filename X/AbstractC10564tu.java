package X;

import com.facebook.interstitial.api.GraphQLInterstitialsResult;
import com.google.common.collect.ImmutableList;

/* renamed from: X.4tu, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4tu.class */
public abstract class AbstractC10564tu {
    /* JADX WARN: Type inference failed for: r0v37, types: [X.2x8, X.2JY, com.facebook.graphservice.tree.TreeJNI] */
    public static final ImmutableList A00(2JX r301, long j) {
        2JY A0L;
        2JX A0L2;
        ImmutableList A2K;
        ImmutableList immutableList = null;
        if (r301 != null && (A0L = r301.A0L(-816631278, 2JX.class, -375430191)) != null && (A0L2 = A0L.A0L(439334807, 2JX.class, -424790983)) != null && (A2K = A0L2.A2K(96356950, 378396520)) != null) {
            ImmutableList.Builder builder = ImmutableList.builder();
            1Du it = A2K.iterator();
            while (it.hasNext()) {
                ?? r0 = (C2x8) ((2JY) it.next()).A0L(3386882, C2x8.class, -832065796);
                if (r0 != 0) {
                    boolean z = false;
                    if (r0.A0r(-1034039159) != null) {
                        z = true;
                    }
                    builder.m11011add((Object) new GraphQLInterstitialsResult(r0, r0.A0r(-1034039159), null, r0.getIntValue(3492908), r0.getIntValue(-231897133), j, z));
                }
            }
            immutableList = builder.build();
        }
        return immutableList;
    }
}
