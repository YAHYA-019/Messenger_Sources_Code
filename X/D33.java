package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.msys.core.MsysFetchThreadListOperation;
import com.facebook.messaging.service.model.FetchMoreThreadsResult;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.user.model.User;
import com.facebook.user.model.UserFbidIdentifier;
import com.facebook.user.model.UserIdentifier;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableCollection;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: D33.class */
public final class D33 implements Function {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ FbUserSession A03;
    public final /* synthetic */ B9p A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public D33(Context context, FbUserSession fbUserSession, B9p b9p, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A04 = b9p;
        this.A07 = z;
        this.A03 = fbUserSession;
        this.A02 = context;
        this.A05 = z2;
        this.A06 = z3;
        this.A01 = i;
        this.A00 = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v210, types: [com.google.common.util.concurrent.ListenableFuture[]] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.util.List] */
    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        String str;
        int i;
        FetchMoreThreadsResult A03;
        1FV A0A;
        String str2;
        ImmutableCollection immutableCollection = (ImmutableCollection) obj;
        0fH.A07(B9p.class, Boolean.valueOf(AnonymousClass001.A1U(immutableCollection)), "Is result null? %s");
        if (immutableCollection != null || this.A07) {
            try {
                try {
                    1G1 r0 = this.A03;
                    Context context = this.A02;
                    boolean z = this.A05;
                    ArrayList A0s = AnonymousClass001.A0s();
                    if (!this.A07) {
                        AnonymousClass243 A00 = AnonymousClass243.A00();
                        CbG cbG = (CbG) 1Lo.A04(context, r0, (1BY) null, 84998);
                        C00i c00i = cbG.A03;
                        RJi rJi = (RJi) c00i.get();
                        SettableFuture A0j = 4YU.A0j();
                        0fH.A0A(RJi.class, "Reading cutover threads");
                        long currentTimeMillis = System.currentTimeMillis();
                        BDF bdf = rJi.A01;
                        1Um A0O = 1BK.A0O(bdf, 0);
                        MailboxFutureImpl A0P = 1BK.A0P(A0O);
                        Czj.A01(A0O, A0P, bdf, 93);
                        A0P.A00(1BK.A1E(rJi.A00));
                        A0P.Cu4(new CzT(A0j, 1, currentTimeMillis));
                        RJi rJi2 = (RJi) c00i.get();
                        SettableFuture A0j2 = 4YU.A0j();
                        0fH.A0A(RJi.class, "Reading ACT threads");
                        long currentTimeMillis2 = System.currentTimeMillis();
                        BDF bdf2 = rJi2.A01;
                        1Um A0O2 = 1BK.A0O(bdf2, 0);
                        MailboxFutureImpl A0P2 = 1BK.A0P(A0O2);
                        Czj.A01(A0O2, A0P2, bdf2, 92);
                        A0P2.A00(1BK.A1E(rJi2.A00));
                        A0P2.Cu4(new CzT(A0j2, 2, currentTimeMillis2));
                        if (1BK.A0N(cbG.A04).AZk(36313102379980478L)) {
                            BuL buL = (BuL) cbG.A01.get();
                            1F9 r02 = 1F9.A0I;
                            CallerContext.A0B("StellaThreadsHelper");
                            A0A = 4YU.A0j();
                            22B r03 = (22B) 1Br.A0B(buL.A01);
                            String str3 = r02.dbName;
                            C00i c00i2 = buL.A02.A00;
                            r03.A02((Number) null, (Number) null, str3, (List) null, (List) null, 500, false, false, true, false, false, false, false, ((1Ux) c00i2.get()).A02(), ((1Ux) c00i2.get()).A03()).addResultCallback(4YV.A11(buL.A00), Czj.A00(A0A, buL, 49));
                        } else {
                            MsysFetchThreadListOperation A002 = ((1UL) 1Lo.A04((Context) null, cbG.A02, cbG.A00, 16682)).A00(1F9.A0I, 1Hb.A02);
                            if (A002 == null) {
                                A03 = FetchMoreThreadsResult.A07;
                            } else {
                                double d = 0.0d / 0.0d;
                                A03 = A002.A03(null, 500, Long.MAX_VALUE);
                            }
                            A0A = 1Kd.A0A(A03.A03.A01);
                        }
                        D3I d3i = new D3I(29);
                        Executor executor = cbG.A05;
                        CF8 cf8 = (CF8) 2FP.A02(new D2l(cbG, 1), 1Kd.A02((ListenableFuture[]) new ListenableFuture[]{A0j, A0j2, 2FP.A02(d3i, A0A, executor)}), executor).get();
                        java.util.Map map = (java.util.Map) cbG.A01(true, false).get();
                        HashSet hashSet = cf8.A03;
                        HashMap hashMap = cf8.A00;
                        HashMap hashMap2 = cf8.A01;
                        HashSet hashSet2 = cf8.A02;
                        C2xh A003 = ((2Tz) 1Bn.A0E(context, (1BY) null, 33205)).A00(2To.A07);
                        HashMap A0u = AnonymousClass001.A0u();
                        float f = 1.0f;
                        ImmutableCollection immutableCollection2 = (ImmutableCollection) A003.A01;
                        if (immutableCollection2 != null) {
                            0fH.A07(B9p.class, 1BK.A0k(immutableCollection2), "Found scores for %d contacts");
                            1Du it = immutableCollection2.iterator();
                            while (it.hasNext()) {
                                2Vb r04 = (2Vb) it.next();
                                String str4 = r04.A04;
                                float f2 = r04.A00;
                                A0u.put(str4, Float.valueOf(f2));
                                f = Math.max(f, f2);
                            }
                        }
                        0fH.A07(B9p.class, Float.valueOf(f), "Max score = %f");
                        0fH.A07(B9p.class, C4Bn.A00(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, hashSet), "The threads: %s");
                        0fH.A07(B9p.class, C4Bn.A00(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, hashSet2), "The act threads: %s");
                        1CO r05 = this.A04.A03;
                        long Auy = r05.Auy(36594882319485276L);
                        long parseLong = Long.parseLong(r0.A05);
                        boolean AZk = r05.AZk(2342156111594198725L);
                        1Du it2 = immutableCollection.iterator();
                        while (it2.hasNext()) {
                            User user = (User) it2.next();
                            if (user != null && user.A0X.A01() != null) {
                                UserIdentifier userIdentifier = user.A0i;
                                if (userIdentifier instanceof UserFbidIdentifier) {
                                    UserFbidIdentifier userFbidIdentifier = (UserFbidIdentifier) userIdentifier;
                                    if (userFbidIdentifier != null && userFbidIdentifier.A00 != null) {
                                        if (user.A0C()) {
                                            str2 = "User is AI character/bot; It is filtered out from the contactList";
                                        } else {
                                            if (r05.AZk(36313102380111551L)) {
                                                if (C7Ps.A02(user)) {
                                                    str2 = "User is unavailable. Likely deactivated";
                                                } else if (user.A02() != C1z1.NOT_BLOCKED) {
                                                    str2 = "User is blocked by viewer";
                                                }
                                            }
                                            A0s.add(new C1499AjM(A00, this, user, hashMap, A0u, hashMap2, hashSet, hashSet2, map, f, Auy, parseLong, z, AZk));
                                        }
                                        0fH.A0A(B9p.class, str2);
                                    }
                                }
                            }
                            str2 = "User or critical user information is null";
                            0fH.A0A(B9p.class, str2);
                        }
                    }
                    if (this.A06) {
                        if (!A0s.isEmpty()) {
                            B9p b9p = this.A04;
                            b9p.A01 = A0s;
                            b9p.A00 = System.currentTimeMillis();
                            final long Auy2 = b9p.A03.Auy(36594577356359831L);
                            b9p.A04.schedule(new Runnable() { // from class: X.D8a
                                public static final String __redex_internal_original_name = "FetchContactsRequestHandler$1$$ExternalSyntheticLambda0";

                                @Override // java.lang.Runnable
                                public final void run() {
                                    D33 d33 = D33.this;
                                    long j = Auy2;
                                    long currentTimeMillis3 = System.currentTimeMillis();
                                    B9p b9p2 = d33.A04;
                                    long A06 = 4YU.A06(currentTimeMillis3 - b9p2.A00);
                                    0fH.A07(B9p.class, Long.valueOf(A06), "Running cache expiration check: %ds");
                                    if (A06 >= j) {
                                        0fH.A0A(B9p.class, "Nulling out the cache so it can get GC'd");
                                        b9p2.A01 = null;
                                    }
                                }
                            }, Auy2 + 1, TimeUnit.SECONDS);
                        }
                        List list = this.A04.A01;
                        if (list != null) {
                            A0s = R1L.A00(list, this.A01, this.A00);
                        }
                    }
                    String A0W = AnonymousClass243.A00().A0W(new C1503AjQ(this, A0s));
                    0fH.A08(B9p.class, Double.valueOf(A0W.getBytes(StandardCharsets.UTF_8).length / 1024.0d), "size:%f KB");
                    0fH.A07(B9p.class, A0W, "%s");
                    return CP4.success(A0W);
                } catch (InterruptedException | ExecutionException e) {
                    str = "Async operation error";
                    0fH.A0N(B9p.class, str, e, new Object[0]);
                    i = 20;
                }
            } catch (2LD e2) {
                str = "Failed to serialize response";
                0fH.A0N(B9p.class, str, e2, new Object[0]);
                i = 19;
            }
        } else {
            str = "Failed to fetch contacts";
            0fH.A0B(B9p.class, str);
            i = 18;
        }
        return CP4.error(i, str);
    }
}
