package X;

import android.content.Context;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCriteria;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.service.model.FetchMessageParams;
import com.facebook.messaging.service.model.FetchThreadResult;
import com.facebook.messaging.sync.connection.MessagesSyncLoggedInUserFetcher;
import com.facebook.messaging.sync.delta.PrefetchedSyncData;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: D0f.class */
public final class D0f implements DGS {
    public 1BY A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A04;
    public final CPa A05;
    public final C4z1 A06;
    public final C4yz A07;
    public final 6ED A08;
    public final C00i A03 = 1BQ.A02(17066);
    public final C00i A09 = AbH.A0P();
    public final Bzm A0A = new Object();

    /* JADX WARN: Type inference failed for: r0v6, types: [X.Bzm, java.lang.Object] */
    public D0f(1BO r302, FbUserSession fbUserSession) {
        this.A00 = 7zL.A0Q(r302);
        1MV A0B = AbF.A0B(fbUserSession, (1BY) null, 84514);
        1BV A01 = 1BV.A01((1BY) null, 49670);
        C4yz A0U = AbM.A0U(fbUserSession, (1BY) null);
        6ED r0 = (6ED) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 50002);
        this.A06 = AbM.A0R(fbUserSession, (1BY) null);
        this.A05 = AbM.A0Q(fbUserSession);
        this.A04 = AbF.A0A(fbUserSession, (1BY) null, 67250);
        this.A07 = A0U;
        this.A02 = A0B;
        this.A08 = r0;
        this.A01 = A01;
    }

    private void A00(D0d d0d, BI8 bi8, ImmutableSet immutableSet, java.util.Map map, Set set, boolean z, boolean z2) {
        1Du it = immutableSet.iterator();
        while (it.hasNext()) {
            ThreadKey A0k = AbG.A0k(it);
            if (!map.containsKey(A0k) && !set.contains(A0k)) {
                ThreadCriteria A00 = ThreadCriteria.A02.A00(A0k);
                ThreadSummary A05 = this.A05.A05(A00);
                if (A05 == null) {
                    ((2fJ) this.A03.get()).A0C(A0k, "ensureThreadSummaryInCache", (String) null);
                    D4w BZK = ((1To) this.A04.get()).BZK((CallerContext) null, "ensureThreadSummaryInCache");
                    try {
                        FetchThreadResult A0I = this.A07.A0I(A00, 20);
                        if (A0I.A02.A08) {
                            A05 = A0I.A05;
                            if (1F9.A01.contains(A05.A0g)) {
                                this.A06.A0B(A0I, 20, false);
                                BZK.close();
                            }
                        }
                        BZK.close();
                        if (z) {
                            A05 = d0d.A0I(A0k, bi8);
                            if (A05 != null) {
                                map.put(A0k, A05);
                                z2 = false;
                            }
                        }
                        set.add(A0k);
                    } catch (Throwable th) {
                        try {
                            BZK.close();
                            throw th;
                        } catch (Throwable th2) {
                            7kF.A00(th, th2);
                            throw th;
                        }
                    }
                }
                if (A05.A0g == 1F9.A06) {
                    set.add(A0k);
                } else {
                    map.put(A0k, A05);
                    z2 = false;
                }
            }
        }
        if (z2) {
            A01(bi8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.Ag8, X.2J3] */
    private void A01(BI8 bi8) {
        C1kw A06 = 1BK.A06(this.A09);
        if (C1401Ag8.A00 == null) {
            synchronized (C1401Ag8.class) {
                if (C1401Ag8.A00 == null) {
                    C1401Ag8.A00 = new C2J3(A06);
                }
            }
        }
        AbstractC01593ro A0A = AbJ.A0A(C1401Ag8.A00, "delta_thread_fetch");
        if (A0A.A0B()) {
            A0A.A06("DELTA_TYPE", this.A0A.A00(bi8));
            A0A.A0A();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v92, types: [com.google.common.collect.ImmutableSet] */
    /* JADX WARN: Type inference failed for: r301v0, types: [X.D0f] */
    public /* bridge */ /* synthetic */ Object AQS(List list) {
        int size = list.size();
        HashMap hashMap = new HashMap(size);
        LinkedHashSet linkedHashSet = new LinkedHashSet(size);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(size);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C7a c7a = (C7a) it.next();
            6ED r0 = this.A08;
            Object obj = c7a.A02;
            BI8 bi8 = (BI8) obj;
            D0d A00 = r0.A00(bi8);
            if (A00.A0P(obj)) {
                z = true;
            }
            ImmutableSet A0L = A00.A0L(obj);
            if (A00.A0Q(obj)) {
                LinkedHashSet A15 = 7zL.A15();
                1Du A0i = 4YU.A0i(A00.A0J(bi8));
                while (A0i.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0i);
                    A15.add(new FetchMessageParams((ThreadKey) A0z.getKey(), 1BK.A16(A0z)));
                }
                linkedHashSet2.addAll(A15);
                Iterator it2 = A15.iterator();
                while (it2.hasNext()) {
                    A00(A00, bi8, AbF.A11(((FetchMessageParams) it2.next()).A00), hashMap, linkedHashSet, false, false);
                }
                A01(bi8);
                linkedHashSet.addAll(A0L);
            } else {
                A00(A00, bi8, A0L, hashMap, linkedHashSet, true, true);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        while (it3.hasNext()) {
            if (linkedHashSet.contains(((FetchMessageParams) it3.next()).A00)) {
                it3.remove();
            }
        }
        RegularImmutableSet regularImmutableSet = RegularImmutableSet.A05;
        ImmutableList of = ImmutableList.of();
        if (!linkedHashSet.isEmpty() || !linkedHashSet2.isEmpty()) {
            long j = ((C7a) list.get(list.size() - 1)).A00;
            ((2fJ) this.A03.get()).A0G("ensureDataForDeltas", -1, j);
            Cbg cbg = (Cbg) this.A02.get();
            F9D f9d = new F9D(new D0p(cbg, linkedHashSet, linkedHashSet2, j), ((C54h) cbg.A0B.get()).A00, 60000L, 1000L);
            1PA A01 = 1P9.A01(new 1P9((1I6) cbg.A0M.get()), new D0T(f9d, cbg, 1), 1BJ.A00(ActionId.ASYNC_ACTION_FAIL));
            A01.A00();
            try {
                Bqm bqm = (Bqm) f9d.A00();
                A01.A01();
                bqm.getClass();
                Exception exc = bqm.A02;
                if (exc != null) {
                    throw exc;
                }
                ImmutableMap immutableMap = bqm.A00;
                hashMap.putAll(immutableMap);
                of = immutableMap.keySet().asList();
                regularImmutableSet = bqm.A01;
            } catch (Throwable th) {
                A01.A01();
                throw th;
            }
        }
        if (z) {
            MessagesSyncLoggedInUserFetcher.A00((MessagesSyncLoggedInUserFetcher) this.A01.get(), false);
        }
        Parcelable.Creator creator = PrefetchedSyncData.CREATOR;
        return new PrefetchedSyncData(of, ImmutableMap.copyOf((java.util.Map) hashMap), regularImmutableSet);
    }
}
