package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.common.userinteraction.UserInteractionHistory;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4A4, reason: invalid class name */
/* loaded from: 4A4.class */
public final class C4A4 {
    public static final long A0Q;
    public static final long A0R;
    public static final long A0S;
    public int A00;
    public C4Ab A01;
    public 1Ex A02;
    public 1Od A03;
    public C01s A04;
    public C4A7 A05;
    public C0dp A06;
    public C0dr A07;
    public UserInteractionHistory A08;
    public 4AU A09;
    public C4Af A0A;
    public C4A5 A0B;
    public String A0C;
    public List A0D;
    public Set A0E;
    public Set A0F;
    public ExecutorService A0G;
    public List A0H;
    public final C1kw A0I;
    public final 1Fo A0J;
    public final C4Ae A0K;
    public final 4AZ A0L;
    public final C4Aa A0M;
    public final C00i A0N;
    public final 1CO A0O;
    public final java.util.Map A0P;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        A0S = timeUnit.toHours(3);
        A0Q = timeUnit.toMillis(6);
        A0R = timeUnit.toMillis(1L);
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [X.4Ab, X.2J3] */
    public C4A4() {
        1Od r0 = (1Od) 1Bi.A03(16616);
        C4A5 c4a5 = (C4A5) 1Bi.A03(32927);
        1Ex r02 = (1Ex) 1Bi.A03(83426);
        C4A7 c4a7 = (C4A7) 1Bi.A03(32928);
        C0dp c0dp = (C0dp) 1Bi.A03(99390);
        4AU r03 = (4AU) 1Bi.A03(32930);
        ExecutorService executorService = (ExecutorService) 1Bi.A03(16457);
        C01s c01s = (C01s) 1Bi.A03(16511);
        UserInteractionHistory userInteractionHistory = (UserInteractionHistory) 1Bi.A03(32931);
        C1kw c1kw = (C1kw) 1Bi.A03(16772);
        C0dr c0dr = (C0dr) 1Bi.A03(84488);
        1Fo r04 = (1Fo) 1Bi.A03(16501);
        4AZ r05 = (4AZ) 1Bi.A03(32934);
        C4Aa c4Aa = (C4Aa) 1Bi.A03(32935);
        1BQ r06 = new 1BQ(32928);
        1CO r07 = (1CO) 1Bi.A03(16385);
        this.A01 = new C2J3();
        this.A0P = new HashMap();
        this.A03 = r0;
        this.A0B = c4a5;
        this.A02 = r02;
        this.A05 = c4a7;
        Set A0I = 1Bn.A0I(69);
        Set A06 = 1Bi.A06(ActionId.VIDEO_SET_RENDERER_CONTEXT);
        FbUserSession A04 = ((1Fv) 1Bi.A03(66351)).A04();
        Integer num = 1Lo.A05;
        this.A0E = 1Kr.A00(new Set[]{A0I, A06, 1Lo.A0B(FbInjector.A00(), A04, (1BY) null, 740)});
        this.A06 = c0dp;
        this.A09 = r03;
        this.A0G = executorService;
        this.A04 = c01s;
        this.A08 = userInteractionHistory;
        this.A0I = c1kw;
        this.A07 = c0dr;
        this.A0J = r04;
        this.A0L = r05;
        this.A0M = c4Aa;
        this.A0N = r06;
        this.A0O = r07;
        this.A0K = new C4Ae(c0dr);
    }

    private long A00() {
        long j = Long.MAX_VALUE;
        if (!this.A0E.isEmpty()) {
            C0dp c0dp = this.A06;
            long now = c0dp.now();
            long min = Math.min(A03(this.A0F.iterator(), now), A03(this.A0H.iterator(), now));
            if (min < Long.MAX_VALUE) {
                j = Math.max(min - c0dp.now(), TimeUnit.SECONDS.toMillis(300L));
            }
        }
        return j;
    }

    private long A01(C4Ah c4Ah) {
        long j;
        long millis = TimeUnit.SECONDS.toMillis(300L);
        if (c4Ah.BH6().A00()) {
            try {
                j = c4Ah.Aro();
            } catch (Exception e) {
                0fH.A0H(C4A4.class, "getIntervalInMilliseconds", e);
                this.A04.softReport(0Pz.A0W("CWExecutor-Interval-", c4Ah.getFriendlyName()), e);
                j = A0S;
            }
            millis = Math.max(j, millis);
        }
        return millis;
    }

    private long A02(C4Ah c4Ah, long j) {
        long A01;
        4AU r0 = this.A09;
        1G2 A05 = r0.A01.A05(1G0.A0B, "conditionalWorker/", true);
        String friendlyName = c4Ah.getFriendlyName();
        1G2 A0D = A05.A0D(friendlyName);
        FbSharedPreferences fbSharedPreferences = r0.A00;
        long Av1 = fbSharedPreferences.Av1(A0D, 0L);
        int ArU = fbSharedPreferences.ArU((1G2) 4AU.A01(r0).A0D(friendlyName), 0);
        if (Av1 > j) {
            r0.A02(c4Ah, j);
        } else {
            j = Av1;
        }
        if (ArU > 0) {
            0fH.A0X(friendlyName, C4A4.class, "ConsecutiveFailureCount of %s: %d", Integer.valueOf(ArU));
            C00i c00i = this.A0L.A00;
            if (((2yD) c00i.get()).AZk(36310362192740543L)) {
                A01 = TimeUnit.SECONDS.toMillis(((long) ArU) < 1BK.A0N(c00i).Auy(36591837169320059L) ? 300L : 1BK.A0N(c00i).Auy(36591837169385596L));
            } else {
                A01 = Math.min(TimeUnit.MINUTES.toMillis((1 << (Math.min(ArU, 8) - 1)) * 5), !c4Ah.BH6().A00() ? A0R : A0Q);
            }
            if (c4Ah.BH6().A00()) {
                A01 = Math.min(A01, A01(c4Ah));
            }
        } else {
            A01 = A01(c4Ah);
        }
        return j + A01;
    }

    private long A03(Iterator it, long j) {
        long j2 = Long.MAX_VALUE;
        while (it.hasNext()) {
            C4Ah c4Ah = (C4Ah) it.next();
            if (4CA.A04.equals(c4Ah.BH6())) {
                4AU r0 = this.A09;
                if (!r0.A03(c4Ah)) {
                    if (r0.A00.ArU(4AU.A01(r0).A0D(c4Ah.getFriendlyName()), 0) <= 0) {
                    }
                }
            }
            if (c4Ah.BH6().A00()) {
                long A02 = A02(c4Ah, j);
                if (j < A02 && A07(c4Ah)) {
                    j2 = Math.min(A02, j2);
                }
            }
        }
        return j2;
    }

    private ArrayList A04() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A0D.iterator();
        while (it.hasNext()) {
            arrayList.add(new 4Yg(this.A07, (C4Ah) it.next(), this.A0K, this.A0A, this.A0O.AZk(36313385847101679L)));
        }
        return arrayList;
    }

    private void A05(C4Ah c4Ah, Throwable th, long j, boolean z) {
        4AU r310;
        String friendlyName;
        if (z) {
            if (4CA.A04.equals(c4Ah.BH6()) || 4CA.A03.equals(c4Ah.BH6())) {
                4AU r0 = this.A09;
                r0.A00.edit().putBoolean(4AU.A00(r0).A0D(c4Ah.getFriendlyName()), true).commit();
            }
            r310 = this.A09;
            1G2 A01 = 4AU.A01(r310);
            friendlyName = c4Ah.getFriendlyName();
            1G2 A0D = A01.A0D(friendlyName);
            1Ql edit = r310.A00.edit();
            edit.Cdj(A0D);
            edit.commit();
            0fH.A09(C4A4.class, friendlyName, "%s: result TRUE");
        } else {
            r310 = this.A09;
            1G2 A012 = 4AU.A01(r310);
            friendlyName = c4Ah.getFriendlyName();
            1G2 A0D2 = A012.A0D(friendlyName);
            FbSharedPreferences fbSharedPreferences = r310.A00;
            int ArU = fbSharedPreferences.ArU(A0D2, 0);
            1Ql edit2 = fbSharedPreferences.edit();
            edit2.CaE(A0D2, ArU + 1);
            edit2.commit();
            0fH.A09(C4A4.class, friendlyName, "%s: result FALSE");
            if (th != null) {
                this.A04.softReport(0Pz.A0W("CWExecutor-Execute-", friendlyName), th);
            }
        }
        long longValue = ((Number) this.A0P.get(friendlyName)).longValue();
        String str = this.A0C;
        C4Ab c4Ab = this.A01;
        c4Ab.A01(this.A0I.A00);
        AbstractC01593ro A3u = c4Ab.A00.A3u("conditional_worker_execution_info", false);
        if (A3u.A0B()) {
            A3u.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, friendlyName);
            A3u.A05("execution_time", j);
            A3u.A05("should_run_execution_time", longValue);
            A3u.A07(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS, z);
            A3u.A07("background", this.A03.A0E());
            A3u.A06("execution_reason", str);
            A3u.A06("charging_state", AbstractC08444my.A00(((C4A7) this.A0N.get()).A02()));
            A3u.A0A();
        }
        r310.A02(c4Ah, this.A06.now());
    }

    private void A06(String str, String str2, int i, long j, long j2) {
        C4Ab c4Ab = this.A01;
        c4Ab.A01(this.A0I.A00);
        AbstractC01593ro A3u = c4Ab.A00.A3u("conditional_worker_invocation", false);
        if (A3u.A0B()) {
            A3u.A06("execution_reason", str);
            A3u.A04("num_executed", i);
            A3u.A05("execution_time", j);
            A3u.A05("next_execution_delay", j2);
            A3u.A06("reason_for_deferral", str2);
            A3u.A0A();
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Number] */
    private boolean A07(C4Ah c4Ah) {
        C0dr c0dr = this.A07;
        long now = c0dr.now();
        boolean z = false;
        try {
            try {
                if (!4CA.A03.equals(c4Ah.BH6()) || !this.A09.A03(c4Ah)) {
                    z = c4Ah.Cxb();
                }
            } catch (Exception e) {
                this.A04.softReport(0Pz.A0W("CWExecutor-Should-", c4Ah.getFriendlyName()), e);
            }
            String friendlyName = c4Ah.getFriendlyName();
            long now2 = c0dr.now() - now;
            Long valueOf = Long.valueOf(now2);
            java.util.Map map = this.A0P;
            Long l = (Number) map.get(friendlyName);
            if (l == null) {
                l = valueOf;
            }
            map.put(friendlyName, Long.valueOf(Math.max(now2, l.longValue())));
            return z;
        } catch (Throwable th) {
            String friendlyName2 = c4Ah.getFriendlyName();
            long now3 = c0dr.now() - now;
            Long valueOf2 = Long.valueOf(now3);
            java.util.Map map2 = this.A0P;
            Long l2 = (Number) map2.get(friendlyName2);
            if (l2 == null) {
                l2 = valueOf2;
            }
            map2.put(friendlyName2, Long.valueOf(Math.max(now3, l2.longValue())));
            throw th;
        }
    }

    public void A08(Context context, String str) {
        Throwable th;
        C4A4 c4a4;
        C4Ah c4Ah;
        long j;
        boolean z;
        long now;
        boolean z2;
        String friendlyName;
        String str2;
        ConcurrentHashMap concurrentHashMap;
        boolean containsKey;
        long now2;
        1Ql edit;
        synchronized (this) {
            Set set = this.A0E;
            if (set.isEmpty()) {
                0fH.A0D(C4A4.class, "No ConditionalWorkerConditionInfoProviders");
            } else {
                this.A0C = str;
                C0dr c0dr = this.A07;
                long now3 = c0dr.now();
                int i = 0;
                this.A00 = 0;
                this.A0P.clear();
                C1cx.A00(context);
                this.A0A = new C4Af(this.A02, this.A03, this.A05, this.A08, this.A0B, this.A0M);
                HashSet hashSet = new HashSet(set);
                this.A0F = hashSet;
                this.A0D = new ArrayList(hashSet.size());
                this.A0H = new ArrayList(this.A0F.size());
                C00i c00i = this.A0L.A00;
                if (((2yD) c00i.get()).AZk(36310362191036606L) && ((1Fs) this.A0J.A00.get()).A03()) {
                    A06(str, "UserInteracting", 0, 0L, 0L);
                } else {
                    loop0: while (!this.A0F.isEmpty()) {
                        C4U8 A00 = this.A0A.A00();
                        0fH.A09(C4A4.class, A00, "CurrentStates: %s");
                        long now4 = this.A06.now();
                        Iterator it = this.A0F.iterator();
                        while (it.hasNext()) {
                            C4Ah c4Ah2 = (C4Ah) it.next();
                            if (c4Ah2 == null) {
                                0fH.A0B(C4A4.class, "ConditionalWorkerInfo is null");
                                this.A04.D0w("CWExecutor-CWInfoNull", 0Pz.A0x("ConditionalWorkerInfo is null. Remaining: ", " / ", ". Execution reason: ", this.A0C, this.A0F.size(), set.size()), 10);
                            } else {
                                C4Ao B7c = c4Ah2.B7c();
                                4CA BH6 = c4Ah2.BH6();
                                if (BH6.equals(4CA.A04) && !A00.A00.A01.containsAll(B7c.A00.A01)) {
                                    4AU r0 = this.A09;
                                    if (r0.A03(c4Ah2)) {
                                        edit = r0.A00.edit().putBoolean(4AU.A00(r0).A0D(c4Ah2.getFriendlyName()), false);
                                    } else {
                                        1G2 A0D = 4AU.A01(r0).A0D(c4Ah2.getFriendlyName());
                                        edit = r0.A00.edit();
                                        edit.Cdj(A0D);
                                    }
                                    edit.commit();
                                }
                                long A02 = A02(c4Ah2, now4);
                                if (0fH.A01.BTv(2)) {
                                    Object[] objArr = {c4Ah2.getFriendlyName(), BH6, B7c, C3Pi.A00(A01(c4Ah2)), A02 == now4 ? "now" : 0Pz.A0Y(C3Pi.A00(Math.abs(A02 - now4)), A02 > now4 ? "later" : "ago", ' ')};
                                    if (0fH.A01.BTv(2)) {
                                        0fH.A0D(C4A4.class, StringFormatUtil.formatStrLocaleSafe("%s - Trigger: %s, RequiredStates: %s, Interval: %s, Next execution at: %s", objArr));
                                    }
                                }
                                if (now4 >= A02) {
                                    C4Al c4Al = A00.A00;
                                    C4Al c4Al2 = B7c.A00;
                                    if (c4Al.A01.containsAll(c4Al2.A01) && !this.A09.A03(c4Ah2) && c4Al2.A00.intValue() >= c4Al.A00.intValue()) {
                                        if (A07(c4Ah2)) {
                                            1CO r02 = this.A0O;
                                            if (r02.AZk(36313385847101679L)) {
                                                C4Ae c4Ae = this.A0K;
                                                Class<?> cls = c4Ah2.getClass();
                                                synchronized (c4Ae) {
                                                    concurrentHashMap = c4Ae.A01;
                                                    containsKey = concurrentHashMap.containsKey(cls);
                                                }
                                                if (containsKey) {
                                                    C01s c01s = this.A04;
                                                    friendlyName = c4Ah2.getFriendlyName();
                                                    String A0W = 0Pz.A0W("CWExecutor-Registry-", friendlyName);
                                                    synchronized (c4Ae) {
                                                        Long l = (Long) concurrentHashMap.get(cls);
                                                        now2 = l == null ? -1 : c4Ae.A00.now() - l.longValue();
                                                    }
                                                    c01s.D0v(A0W, 0Pz.A0h("Worker is already running for ", "milliseconds", now2));
                                                    if (r02.AZk(36313385847036142L)) {
                                                        str2 = "%s should not be executed, since there is another copy already running";
                                                    }
                                                }
                                            }
                                            this.A0D.add(c4Ah2);
                                        } else {
                                            friendlyName = c4Ah2.getFriendlyName();
                                            str2 = "%s shouldn't be executed";
                                        }
                                        0fH.A09(C4A4.class, friendlyName, str2);
                                    }
                                } else {
                                    continue;
                                }
                            }
                            it.remove();
                        }
                        if (i >= 5 || this.A0D.isEmpty()) {
                            break;
                        }
                        try {
                            if (((2yD) c00i.get()).AZk(36310362192806080L)) {
                                ArrayList A04 = A04();
                                ArrayList A0t = AnonymousClass001.A0t(A04.size());
                                0fH.A0D(C4A4.class, "ConditionalWorkers execution STARTED");
                                long now5 = c0dr.now();
                                try {
                                    Iterator it2 = A04.iterator();
                                    while (it2.hasNext()) {
                                        A0t.add(this.A0G.submit((Callable) it2.next()));
                                    }
                                } catch (RejectedExecutionException e) {
                                    0fH.A0H(C4A4.class, "ExecutorService.submit()", e);
                                }
                                Iterator it3 = A0t.iterator();
                                int i2 = 0;
                                while (it3.hasNext()) {
                                    Future future = (Future) it3.next();
                                    4Z2 r315 = null;
                                    if (!future.isCancelled()) {
                                        try {
                                            now = c0dr.now() - now5;
                                            z2 = false;
                                        } catch (ExecutionException | Exception e2) {
                                            e = e2;
                                            0fH.A0H(C4A4.class, "getUninterruptibly", e);
                                        }
                                        try {
                                            long nanos = TimeUnit.MILLISECONDS.toNanos(now >= 0 ? 300000 - now : 300000L);
                                            while (true) {
                                                try {
                                                    break;
                                                } catch (InterruptedException unused) {
                                                    z2 = true;
                                                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                                                }
                                            }
                                            Object obj = future.get(nanos, TimeUnit.NANOSECONDS);
                                            if (z2) {
                                                AnonymousClass001.A13();
                                            }
                                            e = null;
                                            r315 = (4Z2) obj;
                                            this.A00++;
                                            if (r315 != null) {
                                                A05(r315.A01, null, r315.A00, r315.A02);
                                                i2++;
                                            }
                                        } catch (Throwable th2) {
                                            if (z2) {
                                                AnonymousClass001.A13();
                                            }
                                            throw th2;
                                            break loop0;
                                        }
                                    } else {
                                        e = null;
                                    }
                                    A05(((4Yg) A04.get(i2)).A01, e, 300000L, false);
                                    i2++;
                                }
                                0fH.A0D(C4A4.class, "ConditionalWorkers execution DONE");
                            } else {
                                ArrayList A042 = A04();
                                0fH.A0D(C4A4.class, "ConditionalWorkers execution STARTED");
                                try {
                                    int i3 = 0;
                                    for (Future future2 : this.A0G.invokeAll(A042, 300000L, TimeUnit.MILLISECONDS)) {
                                        4Z2 r319 = null;
                                        if (future2.isCancelled()) {
                                            e = null;
                                        } else {
                                            try {
                                                e = null;
                                                r319 = (4Z2) 1Yz.A00(future2);
                                            } catch (ExecutionException | Exception e3) {
                                                e = e3;
                                                0fH.A0H(C4A4.class, "getUninterruptibly", e);
                                            }
                                            this.A00++;
                                            if (r319 != null) {
                                                C4Ah c4Ah3 = r319.A01;
                                                boolean z3 = r319.A02;
                                                th = null;
                                                c4a4 = this;
                                                c4Ah = c4Ah3;
                                                j = r319.A00;
                                                z = z3;
                                                c4a4.A05(c4Ah, th, j, z);
                                                i3++;
                                            }
                                        }
                                        z = false;
                                        c4a4 = this;
                                        c4Ah = ((4Yg) A042.get(i3)).A01;
                                        th = e;
                                        j = 300000;
                                        c4a4.A05(c4Ah, th, j, z);
                                        i3++;
                                    }
                                    0fH.A0D(C4A4.class, "ConditionalWorkers execution DONE");
                                } catch (InterruptedException e4) {
                                    0fH.A0H(C4A4.class, "ExecutorService.invokeAll()", e4);
                                }
                            }
                            this.A0H.addAll(this.A0D);
                            this.A0D.clear();
                            i++;
                        } catch (RejectedExecutionException e5) {
                            0fH.A0H(C4A4.class, "executeConditionalWorkersAndStoreResult", e5);
                        }
                    }
                    0fH.A09(C4A4.class, Integer.valueOf(i), "Multiple execution pass count: %d");
                    if (i >= 5 && !this.A0D.isEmpty()) {
                        this.A0H.addAll(this.A0D);
                        C01s c01s2 = this.A04;
                        String simpleName = C4A4.class.getSimpleName();
                        StringBuilder A0k = AnonymousClass001.A0k();
                        A0k.append('[');
                        for (C4Ah c4Ah4 : this.A0D) {
                            if (A0k.length() > 1) {
                                A0k.append(", ");
                            }
                            A0k.append(c4Ah4.getFriendlyName());
                        }
                        c01s2.D0v(simpleName, 0Pz.A0W("Remaining executable ConditionalWorkerInfo after 5 execution passes: ", AnonymousClass001.A0g(A0k, ']')));
                    }
                    A06(str, "", this.A00, c0dr.now() - now3, A00());
                }
            }
            A00();
        }
    }
}
