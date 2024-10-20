package X;

import android.os.Parcelable;
import com.facebook.messaging.memories.model.MemoryMessageContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.reactions.reactors.model.Reactor;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.ImmutableListMultimap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* loaded from: A9z.class */
public final class A9z implements 5oH {
    public final long A00;
    public final C9Je A01;
    public final List A02;

    public A9z(long j, List list) {
        11T.A0F(list, 2);
        this.A00 = j;
        this.A02 = list;
        this.A01 = new C9Je();
    }

    public C5o7 AWk() {
        return C5o7.A02;
    }

    public Capabilities Abd() {
        return Capabilities.A02;
    }

    public Throwable AkL() {
        return null;
    }

    public long AtN() {
        return 0L;
    }

    public 5nV AuM() {
        return new A9Y();
    }

    public int AuO() {
        return 2;
    }

    public HeterogeneousMap AxS() {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        return C1zz.A02();
    }

    /* JADX WARN: Type inference failed for: r0v53, types: [X.5fq, X.5qu] */
    public List B70() {
        C9Je c9Je = this.A01;
        long j = this.A00;
        List<MemoryMessageContext> list = this.A02;
        ArrayList A1E = C1A3.A1E(list);
        for (MemoryMessageContext memoryMessageContext : list) {
            ?? c5fq = new C5fq();
            c5fq.A02 = memoryMessageContext.A02;
            c5fq.A04(memoryMessageContext.A01);
            long j2 = memoryMessageContext.A00;
            c5fq.A0I = AnonymousClass001.A1O((j2 > j ? 1 : (j2 == j ? 0 : -1)));
            String str = memoryMessageContext.A04;
            if (str != null) {
                Iterable iterable = (Iterable) 5Yj.A03.A00(str, new 5cI(5ZL.A01));
                CompactHashMap compactHashMap = new CompactHashMap();
                for (Object obj : 0QD.A0R(iterable)) {
                    Reactor reactor = new Reactor("", "", "", false);
                    1Fg.A01(obj, reactor);
                    Collection collection = (Collection) compactHashMap.get(obj);
                    if (collection == null) {
                        collection = AnonymousClass001.A0s();
                        compactHashMap.put(obj, collection);
                    }
                    collection.add(reactor);
                }
                ImmutableListMultimap A04 = ImmutableListMultimap.A04(compactHashMap.entrySet());
                C1pq.A08("reactions", A04);
                c5fq.A02(C5lh.A00, new 5uV(A04, (Long) null, false));
            }
            HashSet A0v = AnonymousClass001.A0v();
            String str2 = "";
            String valueOf = String.valueOf(j2);
            C1pq.A08("authorId", valueOf);
            String str3 = memoryMessageContext.A03;
            if (str3 != null) {
                str2 = str3;
            }
            c5fq.A03(new C5fr(null, null, null, null, null, null, null, valueOf, "", null, str2, null, A0v, 0L, 0L, 0L));
            A1E.add(new 5gC((C5qu) c5fq));
        }
        List A0T = 0QD.A0T(A1E);
        11T.A0F(A0T, 0);
        ArrayList A1E2 = C1A3.A1E(A0T);
        int i = 0;
        for (Object obj2 : A0T) {
            int i2 = i + 1;
            if (i < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            C5fv c5fv = (C5fv) obj2;
            5vH A00 = C5v7.A00(((A8I) 1Br.A0B(c9Je.A00)).A00, A0T, i);
            Capabilities capabilities = Capabilities.A02;
            Parcelable.Creator creator = HeterogeneousMap.CREATOR;
            A1E2.add(7zS.A0r(capabilities, A00, c5fv));
            i = i2;
        }
        return A1E2;
    }

    public C07684ke B7A() {
        return null;
    }

    public ThreadKey BF7() {
        return null;
    }

    public C5o9 BFF() {
        return C5o8.A00;
    }
}
