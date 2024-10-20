package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.2wn, reason: invalid class name */
/* loaded from: 2wn.class */
public final class C2wn {
    public ListenableFuture A00;
    public final 1Br A01;
    public final 1Br A02;
    public final java.util.Map A03;
    public final 1De A04;

    public C2wn(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A04 = r303;
        this.A02 = 1Bq.A00(16467);
        this.A01 = 1Lm.A03(fbUserSession, r303.A00, 33201);
        this.A03 = new HashMap();
    }

    public static final java.util.Map A00(final C2wn c2wn, List list) {
        java.util.Map map = c2wn.A03;
        if (!(!map.isEmpty())) {
            03W r0 = 03W.A00;
            11T.A0I(r0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            return r0;
        }
        int A00 = 02J.A00(C1A3.A1D(list, 10));
        if (A00 < 16) {
            A00 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A00);
        for (Object obj : list) {
            Object obj2 = map.get(Long.valueOf(((Number) obj).longValue()));
            if (obj2 == null) {
                throw 1BK.A0e();
            }
            linkedHashMap.put(obj, obj2);
        }
        if (c2wn.A00 == null) {
            final ImmutableMap copyOf = ImmutableMap.copyOf(map);
            map.clear();
            0fH.A0d("msysStoriesDataAccess.loadMontageBucketPreviewByUserIds", Integer.valueOf(copyOf.size()), "LoadingThrottle", "called %s with %d users to load.");
            2TB r02 = (2TB) c2wn.A01.A00.get();
            ImmutableList copyOf2 = ImmutableList.copyOf((Collection) copyOf.keySet());
            11T.A0A(copyOf2);
            ListenableFuture BYk = r02.BYk(copyOf2);
            c2wn.A00 = BYk;
            1Kd.A0F(new 1K9(c2wn) { // from class: X.2wt
                public final /* synthetic */ C2wn A00;

                {
                    this.A00 = c2wn;
                }

                public void onFailure(Throwable th) {
                    11T.A0F(th, 0);
                    Iterator it = copyOf.entrySet().iterator();
                    while (it.hasNext()) {
                        ((1FX) AnonymousClass001.A0z(it).getValue()).setException(th);
                    }
                    C2wn c2wn2 = this.A00;
                    synchronized (c2wn2.A03) {
                        c2wn2.A00 = null;
                        C2wn.A00(c2wn2, C0ty.A00);
                    }
                }

                public /* bridge */ /* synthetic */ void onSuccess(Object obj3) {
                    ImmutableMap immutableMap = (ImmutableMap) obj3;
                    Iterator it = copyOf.entrySet().iterator();
                    while (true) {
                        Object obj4 = null;
                        if (!it.hasNext()) {
                            C2wn c2wn2 = this.A00;
                            synchronized (c2wn2.A03) {
                                c2wn2.A00 = null;
                                C2wn.A00(c2wn2, C0ty.A00);
                            }
                            return;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (immutableMap != null) {
                            obj4 = immutableMap.get(entry.getKey());
                        }
                        ((1FX) entry.getValue()).set(obj4);
                    }
                }
            }, BYk, (Executor) c2wn.A02.A00.get());
        }
        return linkedHashMap;
    }
}
