package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: D4j.class */
public final class D4j implements 1K9 {
    public final /* synthetic */ BOi A00;
    public final /* synthetic */ DK4 A01;
    public final /* synthetic */ CE4 A02;
    public final /* synthetic */ ImmutableList A03;
    public final /* synthetic */ ImmutableMap A04;
    public final /* synthetic */ ImmutableMap A05;
    public final /* synthetic */ SettableFuture A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public D4j(BOi bOi, DK4 dk4, CE4 ce4, ImmutableList immutableList, ImmutableMap immutableMap, ImmutableMap immutableMap2, SettableFuture settableFuture, String str, String str2) {
        this.A02 = ce4;
        this.A07 = str;
        this.A00 = bOi;
        this.A08 = str2;
        this.A01 = dk4;
        this.A04 = immutableMap;
        this.A05 = immutableMap2;
        this.A03 = immutableList;
        this.A06 = settableFuture;
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        this.A06.setException(th);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ImmutableCollection immutableCollection = (ImmutableCollection) obj;
        HashMap A0u = AnonymousClass001.A0u();
        HashSet A0v = AnonymousClass001.A0v();
        if (immutableCollection != null) {
            1Du it = immutableCollection.iterator();
            while (it.hasNext()) {
                ThreadSummary A0j = AbF.A0j(it);
                ThreadKey A0f = AbF.A0f(A0j);
                A0u.put(A0f, ((C8v) 1Br.A0B(this.A02.A01)).A00(this.A00, A0j, this.A01, this.A04, this.A05, this.A07, this.A08));
                A0v.add(A0f);
            }
        }
        1Du it2 = this.A03.iterator();
        while (it2.hasNext()) {
            ThreadKey A0k = AbG.A0k(it2);
            if (!A0v.contains(A0k) && A0k.A1K()) {
                try {
                    User user = (User) ((AnonymousClass472) 1Br.A0B(this.A02.A03)).A00(1BK.A0X(4YU.A0z(A0k))).A00().get();
                    BOi bOi = this.A00;
                    String str = this.A07;
                    String str2 = this.A08;
                    ImmutableMap immutableMap = this.A04;
                    String A0w = 1BK.A0w(A0k);
                    2Vb r0 = (2Vb) immutableMap.get(A0w);
                    Float valueOf = r0 != null ? Float.valueOf(r0.A00) : null;
                    DK4 dk4 = this.A01;
                    53N r315 = (53N) this.A05.get(A0w);
                    if (r315 == null) {
                        r315 = 53N.A0R;
                    }
                    A0u.put(A0k, new Csw(bOi, A0k, r315, dk4, user, valueOf, str, str2));
                } catch (Exception e) {
                    0fH.A0r("RealTimeRankingResultsFetcher", "Failed to fetch BroadcastFlowUserModel", e);
                }
            }
        }
        this.A06.set(A0u);
    }
}
