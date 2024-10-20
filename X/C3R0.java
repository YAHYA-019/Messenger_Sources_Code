package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.messaging.inbox.units.StaticUnitConfig;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.3R0, reason: invalid class name */
/* loaded from: 3R0.class */
public final class C3R0 {
    public static final StaticUnitConfig A06 = new StaticUnitConfig(0S2.A0j, "1674434246165228", null, false);
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 2V5 A05;

    public C3R0(Context context, FbUserSession fbUserSession) {
        1Br A00 = 1Bu.A00(17160);
        this.A04 = A00;
        this.A03 = 1Bu.A00(66667);
        this.A01 = 1Bq.A00(83605);
        this.A02 = 1Bu.A00(83142);
        this.A05 = ((C2xd) 1Br.A0B(A00)).A0I(context, fbUserSession, 2SI.A0C);
        this.A00 = context;
    }

    public final ImmutableList A00(AbU abU, ImmutableList immutableList, ImmutableSet immutableSet) {
        11T.A0F(abU, 1);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        StaticUnitConfig staticUnitConfig = A06;
        37Q r0 = new 37Q(staticUnitConfig, ((C4K) 1Br.A0B(this.A02)).A00(this.A00));
        if (!AnonymousClass001.A1V(1Br.A0B(this.A01))) {
            builder.m11011add((Object) r0);
        }
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            ThreadSummary threadSummary = (ThreadSummary) it.next();
            11T.A0D(threadSummary);
            TriState triState = immutableSet == null ? TriState.UNSET : immutableSet.contains(threadSummary.A0n) ? TriState.YES : TriState.NO;
            2V5 r02 = this.A05;
            HeterogeneousMap heterogeneousMap = HeterogeneousMap.A02;
            11T.A0I(heterogeneousMap, "null cannot be cast to non-null type com.facebook.xapp.messaging.map.HeterogeneousMap<T of com.facebook.xapp.messaging.map.HeterogeneousMap.Companion.empty>");
            builder.m11011add((Object) r02.A02(triState, staticUnitConfig, threadSummary, heterogeneousMap));
        }
        C2gt A00 = ((C2gs) 1Br.A0B(this.A03)).A00(staticUnitConfig, abU);
        if (A00 != null) {
            builder.m11011add((Object) A00);
        }
        return 1Fj.A01(builder);
    }
}
