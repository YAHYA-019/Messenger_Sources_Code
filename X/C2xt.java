package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.montage.model.MontageCard;
import com.google.common.base.Absent;
import com.google.common.base.Present;
import com.google.common.collect.ImmutableCollection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.functions.Function1;

/* renamed from: X.2xt, reason: invalid class name */
/* loaded from: 2xt.class */
public final class C2xt extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2xt(Object obj, Object obj2, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                2lU r0 = (2lU) obj;
                11T.A0F(r0, 0);
                r0.A8l((C1ti) this.A01, (1Iw) this.A02);
                return 04S.A00;
            case 1:
                0D7 r02 = (0D7) obj;
                11T.A0F(r02, 0);
                0DA r03 = new 0DA();
                r03.A06("elapsed_time_ms", Long.valueOf(2R0.A01((2R0) this.A02)));
                r02.A0A(r03, "surface_info");
                return ((Function1) this.A01).invoke(r02);
            case 2:
                ImmutableCollection immutableCollection = (ImmutableCollection) obj;
                11T.A0F(immutableCollection, 0);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ImmutableCollection immutableCollection2 = (ImmutableCollection) this.A01;
                11T.A0D(immutableCollection2);
                linkedHashSet.addAll(immutableCollection2);
                1Du it = immutableCollection.iterator();
                while (it.hasNext()) {
                    MontageCard montageCard = (MontageCard) it.next();
                    String str = montageCard.A0E;
                    11T.A0A(str);
                    long parseLong = Long.parseLong(str);
                    ConcurrentMap concurrentMap = ((2TA) this.A02).A07;
                    11T.A0A(concurrentMap);
                    Long valueOf = Long.valueOf(parseLong);
                    concurrentMap.put(valueOf, new Present(montageCard));
                    linkedHashSet.remove(valueOf);
                }
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    long longValue = ((Number) it2.next()).longValue();
                    ConcurrentMap concurrentMap2 = ((2TA) this.A02).A07;
                    11T.A0A(concurrentMap2);
                    concurrentMap2.put(Long.valueOf(longValue), Absent.INSTANCE);
                }
                return 04S.A00;
            case 3:
                List list = (List) obj;
                11T.A0F(list, 0);
                ((C10774uk) 1Bu.A06((Context) this.A01, 49353)).A0B(((C2iV) this.A02).A00, CallerContext.A0B("MediaMessagePrefetcher"), 0S2.A0u, list);
                return 04S.A00;
            default:
                ((2bT) this.A02).A00.set(((Function1) this.A01).invoke(obj));
                return 04S.A00;
        }
    }
}
