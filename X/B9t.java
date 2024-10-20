package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.service.model.FetchMoreThreadsParams;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.base.Function;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.json.JSONObject;

/* loaded from: B9t.class */
public final class B9t extends CP4 implements CallerContextable {
    public static final CallerContext A07 = CallerContext.A06(B9t.class);
    public static final String __redex_internal_original_name = "FetchGroupsRequestHandler";
    public long A00;
    public CEK A01;
    public List A02;
    public final C00i A05 = AbH.A0J();
    public final C00i A04 = 1BQ.A00();
    public final C00i A03 = AbH.A0U();
    public final C00i A06 = 1BQ.A02(16462);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.google.common.util.concurrent.ListenableFuture] */
    public ListenableFuture handleRequest(final Context context, Bwy bwy, JSONObject jSONObject, final FbUserSession fbUserSession) {
        Object A0j;
        if (jSONObject == null) {
            return CP4.A01("Invalid request", 7);
        }
        boolean z = false;
        final boolean optBoolean = jSONObject.optBoolean("fetch_marketplace_threads", false);
        final boolean optBoolean2 = jSONObject.optBoolean("is_paginated", false);
        final int optInt = jSONObject.optInt("batch_size", -1);
        final int optInt2 = jSONObject.optInt(GOm.A00(7), -1);
        final boolean optBoolean3 = jSONObject.optBoolean("fetch_group_participants", false);
        if (optBoolean2 && this.A02 != null) {
            z = true;
        }
        final CbG cbG = (CbG) 1Lo.A04(context, fbUserSession, (1BY) null, 84998);
        1Bn.A0A(148149);
        if (z) {
            A0j = 1Kd.A0A(this.A01);
        } else {
            Bqk bqk = new Bqk(context, fbUserSession);
            A0j = 4YU.A0j();
            BDG bdg = bqk.A02;
            1Um AQV = bdg.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0P = 1BK.A0P(AQV);
            Czj.A01(AQV, A0P, bdg, 94);
            A0P.addResultCallback(1BK.A1E(bqk.A01), Czf.A00(bqk, A0j, 29, bqk.A00.now()));
        }
        final boolean z2 = z;
        return 4YV.A0b(this.A05, new 2eF() { // from class: X.D3w
            /* JADX WARN: Multi-variable type inference failed */
            public final ListenableFuture A8b(Object obj) {
                ListenableFuture A0t;
                ListenableFuture A02;
                final B9t b9t = this;
                boolean z3 = z2;
                Context context2 = context;
                final FbUserSession fbUserSession2 = fbUserSession;
                final CbG cbG2 = cbG;
                final boolean z4 = optBoolean;
                final boolean z5 = optBoolean3;
                final boolean z6 = optBoolean2;
                final int i = optInt2;
                final int i2 = optInt;
                final CEK cek = (CEK) obj;
                if (z3) {
                    A02 = AbI.A0y();
                } else {
                    if (1PG.A02(b9t.A03)) {
                        A0t = AbI.A0y();
                    } else {
                        BlueServiceOperationFactory blueServiceOperationFactory = (BlueServiceOperationFactory) 1Bn.A0E(context2, (1BY) null, 33031);
                        Bundle A05 = 1BK.A05();
                        A05.putParcelable("fetchMoreThreadsParams", new FetchMoreThreadsParams(1F9.A0I, 1Hk.A08, -1, 0L));
                        A0t = AbJ.A0t(b9t.A05, new D3I(28), 4YU.A0M(A05, B9t.A07, blueServiceOperationFactory, 1BJ.A00(413), true));
                    }
                    A02 = 1Kd.A02(new ListenableFuture[]{A0t, ((C5y4) 1Lo.A04(context2, fbUserSession2, (1BY) null, 49879)).A01(-1, true)});
                }
                return 4YV.A0b(b9t.A05, new 2eF() { // from class: X.D3v
                    public final ListenableFuture A8b(Object obj2) {
                        final B9t b9t2 = b9t;
                        final CbG cbG3 = cbG2;
                        final FbUserSession fbUserSession3 = fbUserSession2;
                        final boolean z7 = z4;
                        final boolean z8 = z5;
                        final CEK cek2 = cek;
                        final boolean z9 = z6;
                        final int i3 = i;
                        final int i4 = i2;
                        final List list = (List) obj2;
                        2FT A01 = cbG3.A01(false, true);
                        return AbJ.A0t(b9t2.A05, new Function() { // from class: X.D34
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r0v104, types: [java.util.List] */
                            @Override // com.google.common.base.Function
                            public final Object apply(Object obj3) {
                                final B9t b9t3 = b9t2;
                                CbG cbG4 = cbG3;
                                FbUserSession fbUserSession4 = fbUserSession3;
                                boolean z10 = z7;
                                List list2 = list;
                                boolean z11 = z8;
                                CEK cek3 = cek2;
                                boolean z12 = z9;
                                int i5 = i3;
                                int i6 = i4;
                                java.util.Map map = (java.util.Map) obj3;
                                ArrayList A0s = AnonymousClass001.A0s();
                                List list3 = (List) list2.stream().flatMap(new DBL(0)).sorted(new DAj(6)).collect(Collectors.toList());
                                HashSet A0v = AnonymousClass001.A0v();
                                C00i c00i = b9t3.A04;
                                long Auy = 1BK.A0N(c00i).Auy(36594882319485276L);
                                long A00 = cbG4.A00();
                                Iterator it = list3.iterator();
                                int i7 = 0;
                                while (it.hasNext()) {
                                    ThreadSummary A0j2 = AbF.A0j(it);
                                    if (A0j2.A0r == null || z10) {
                                        ThreadKey threadKey = A0j2.A0n;
                                        0fH.A0A(B9t.class, threadKey.toString());
                                        if (threadKey.A0w() || threadKey.A1F()) {
                                            String l = threadKey.A0z() ? Long.toString(threadKey.A01) : 1BK.A0w(threadKey);
                                            if (!A0v.contains(l)) {
                                                A0v.add(l);
                                                C1498AjL c1498AjL = new C1498AjL(A0j2, b9t3, cek3);
                                                if (z11) {
                                                    0fH.A0A(B9t.class, "group participant on");
                                                    A0j2.A1L.forEach(new DBK(c1498AjL, (C28m) 1Lo.A06(fbUserSession4, 16908), b9t3));
                                                } else {
                                                    0fH.A0A(B9t.class, "group participant off");
                                                    1Du A12 = AbF.A12(A0j2);
                                                    while (true) {
                                                        if (!A12.hasNext()) {
                                                            break;
                                                        }
                                                        if (AbH.A0j(A12).A0I == 1Ks.A02) {
                                                            c1498AjL.isEpdRestricted = true;
                                                            break;
                                                        }
                                                    }
                                                }
                                                String str = c1498AjL.fullName;
                                                if (str != null && !2Pn.A00(str)) {
                                                    if (i7 < Auy && A0j2.A0N >= A00) {
                                                        c1498AjL.msgRank = Integer.valueOf(i7);
                                                        i7++;
                                                    }
                                                    if (map.containsKey(threadKey)) {
                                                        Integer num = (Integer) map.get(threadKey);
                                                        if (num.intValue() < Auy) {
                                                            c1498AjL.callRank = num;
                                                        }
                                                    }
                                                }
                                                A0s.add(c1498AjL);
                                            }
                                        }
                                    } else {
                                        0fH.A07(B9t.class, A0j2.A20, "Skipping marketplace thread sync: %s");
                                    }
                                }
                                if (z12) {
                                    if (!A0s.isEmpty()) {
                                        b9t3.A02 = A0s;
                                        b9t3.A01 = cek3;
                                        b9t3.A00 = System.currentTimeMillis();
                                        final long Auy2 = 1BK.A0N(c00i).Auy(36594577356294294L);
                                        ((ScheduledExecutorService) b9t3.A06.get()).schedule(new Runnable() { // from class: X.D8b
                                            public static final String __redex_internal_original_name = "FetchGroupsRequestHandler$$ExternalSyntheticLambda6";

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                B9t b9t4 = B9t.this;
                                                long j = Auy2;
                                                long A06 = 4YU.A06(System.currentTimeMillis() - b9t4.A00);
                                                0fH.A07(B9t.class, Long.valueOf(A06), "Running cache expiration check: %ds");
                                                if (A06 >= j) {
                                                    0fH.A0A(B9t.class, "Nulling out the cache so it can get GC'd");
                                                    b9t4.A02 = null;
                                                    b9t4.A01 = null;
                                                }
                                            }
                                        }, Auy2 + 1, TimeUnit.SECONDS);
                                    }
                                    List list4 = b9t3.A02;
                                    if (list4 != null) {
                                        A0s = R1L.A00(list4, i5, i6);
                                    }
                                }
                                try {
                                    String A0W = AnonymousClass243.A00().A0W(new C1504AjR(b9t3, A0s, i6, i5, z12));
                                    0fH.A08(B9t.class, Double.valueOf(A0W.getBytes(StandardCharsets.UTF_8).length / 1024.0d), "size:%f KB");
                                    0fH.A08(B9t.class, A0W, "%s");
                                    return CP4.success(A0W);
                                } catch (2LD e) {
                                    0fH.A0N(B9t.class, "Failed to serialize response", e, new Object[0]);
                                    return CP4.error(19, "Failed to serialize response");
                                }
                            }
                        }, A01);
                    }
                }, A02);
            }
        }, A0j);
    }
}
