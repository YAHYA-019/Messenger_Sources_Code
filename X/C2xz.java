package X;

import com.facebook.messaging.montage.model.MontageCard;
import com.google.common.base.Absent;
import com.google.common.base.Present;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function1;

/* renamed from: X.2xz, reason: invalid class name */
/* loaded from: 2xz.class */
public final class C2xz extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2xz(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A02 = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                ImmutableCollection immutableCollection = (ImmutableCollection) obj;
                11T.A0F(immutableCollection, 0);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ImmutableCollection immutableCollection2 = (ImmutableCollection) this.A03;
                11T.A0D(immutableCollection2);
                linkedHashSet.addAll(immutableCollection2);
                1Du it = immutableCollection.iterator();
                while (it.hasNext()) {
                    MontageCard montageCard = (MontageCard) it.next();
                    String str = montageCard.A0E;
                    11T.A0A(str);
                    long parseLong = Long.parseLong(str);
                    ConcurrentMap concurrentMap = ((2TA) this.A04).A07;
                    11T.A0A(concurrentMap);
                    Long valueOf = Long.valueOf(parseLong);
                    concurrentMap.put(valueOf, new Present(montageCard));
                    linkedHashSet.remove(valueOf);
                    ((ImmutableList.Builder) this.A01).m11011add((Object) montageCard);
                }
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    long longValue = ((Number) it2.next()).longValue();
                    ConcurrentMap concurrentMap2 = ((2TA) this.A04).A07;
                    11T.A0A(concurrentMap2);
                    concurrentMap2.put(Long.valueOf(longValue), Absent.INSTANCE);
                }
                Function1 function1 = (Function1) this.A02;
                ImmutableList build = ((ImmutableList.Builder) this.A01).build();
                11T.A0A(build);
                function1.invoke(build);
                break;
            case 1:
                final 1Br r0 = (1Br) this.A03;
                C00i c00i = r0.A00;
                Long A01 = ((3vT) c00i.get()).A01();
                String str2 = null;
                final C2hc c2hc = (C2hc) this.A04;
                if (A01 != null) {
                    C2hc.A01(c2hc, A01.longValue());
                } else {
                    final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) 1Bi.A03(16465);
                    scheduledExecutorService.execute(new Runnable() { // from class: X.3ho
                        public static final String __redex_internal_original_name = "SearchBarMetaAiButton$render$1$2$1";

                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                C2hc c2hc2 = c2hc;
                                Object obj2 = ((3vT) 1Br.A0B(r0)).A00(scheduledExecutorService).get();
                                11T.A0A(obj2);
                                C2hc.A01(c2hc2, AnonymousClass001.A05(obj2));
                            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                                0fH.A0r("SearchBarMetaAiButton", "Failed to fetch Meta AI FBID", e);
                            }
                        }
                    });
                }
                if (1qI.A02((1qI) this.A01).AZk(36322796124129130L)) {
                    3vU r02 = (3vU) 1Br.A0B((1Br) this.A02);
                    Long A012 = ((3vT) c00i.get()).A01();
                    if (A012 != null) {
                        str2 = A012.toString();
                    }
                    3vU.A03((BOj) null, (EnumC03583yg) null, r02, (Boolean) null, "meta_ai", str2, 0, 14);
                    break;
                }
                break;
            default:
                C2ob c2ob = (C2ob) obj;
                11T.A0F(c2ob, 0);
                Object obj2 = this.A04;
                Object obj3 = this.A01;
                c2ob.A00(C2od.class, new AKW(obj3, obj2, 22));
                c2ob.A00(C2oe.class, new DCz(obj3, 23));
                c2ob.A00(C2of.class, new AQh(35, this.A03, obj3, this.A02));
                c2ob.A00(C2og.class, new DCz(obj3, 24));
                c2ob.A00(C2g3.class, new DCz(obj3, 25));
                c2ob.A02(C2oh.A00);
                break;
        }
        return 04S.A00;
    }
}
