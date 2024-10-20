package X;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.SystemClock;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.dextricks.DexStore;
import com.facebook.errorreporting.lacrima.common.asl.aslnative.AppStateLoggerNative;
import com.facebook.errorreporting.lacrima.detector.lifecycle.ApplicationLifecycleDetector$ActivityCallbacks;
import com.facebook.errorreporting.lacrima.detector.lifecycle.ApplicationLifecycleDetector$ActivityCallbacksApi29;
import com.facebook.perf.background.BackgroundStartupDetector;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0hr, reason: invalid class name */
/* loaded from: 0hr.class */
public final class C0hr implements C0iO, C0gj {
    public static final Object A0Q = new Object();
    public C0pu A00;
    public 0hJ A01;
    public boolean A03;
    public boolean A04;
    public WeakReference A05;
    public final Application A06;
    public final 0W9 A07;
    public final C0ql A08;
    public final 0gK A09;
    public final C0pf A0C;
    public final 0pX A0D;
    public final C0my A0E;
    public final C0l0 A0F;
    public final 0jH A0J;
    public final C0jQ A0K;
    public final boolean A0N;
    public final 0WC A0P;
    public final C0gn A0B = new C0gn() { // from class: X.0i4
        @Override // X.C0gn
        public void CB0(18H r302) {
            C0hr c0hr = C0hr.this;
            C0pf c0pf = c0hr.A0C;
            if (c0pf == null || !r302.ATy()) {
                return;
            }
            Activity activity = ((0tZ) r302).A00;
            boolean z = r302.A03;
            int A02 = c0hr.A07.A02();
            synchronized (c0pf) {
                Integer num = z ? 0S2.A05 : 0S2.A06;
                char c = ' ';
                0WC r0 = c0pf.A0A;
                if (r0 != null && activity != null) {
                    c = r0.A00(0W9.A01(activity));
                }
                if (A02 > 127) {
                    A02 = 127;
                }
                byte[] bArr = new byte[2];
                bArr[0] = (byte) c;
                bArr[1] = (byte) A02;
                C0pf.A02(c0pf, num, bArr);
            }
        }

        @Override // X.C0gn
        public void CB2(18H r302) {
            C0hr c0hr = C0hr.this;
            C0pf c0pf = c0hr.A0C;
            if (c0pf == null || !r302.ATy()) {
                return;
            }
            Activity activity = ((0tZ) r302).A00;
            boolean z = r302.A03;
            int A02 = c0hr.A07.A02();
            synchronized (c0pf) {
                Integer num = z ? 0S2.A03 : 0S2.A04;
                char c = ' ';
                0WC r0 = c0pf.A0A;
                if (r0 != null && activity != null) {
                    c = r0.A00(0W9.A01(activity));
                }
                if (A02 > 127) {
                    A02 = 127;
                }
                byte[] bArr = new byte[2];
                bArr[0] = (byte) c;
                bArr[1] = (byte) A02;
                C0pf.A02(c0pf, num, bArr);
            }
        }
    };
    public final C0gi A0A = new C0gi() { // from class: X.0i1
        @Override // X.C0gi
        public void CDz() {
            C0pf c0pf = C0hr.this.A0C;
            if (c0pf != null) {
                synchronized (c0pf) {
                    AnonymousClass001.A14(c0pf, 0S2.A09);
                }
            }
        }

        @Override // X.C0gi
        public void CE0() {
            C0pf c0pf = C0hr.this.A0C;
            if (c0pf != null) {
                synchronized (c0pf) {
                    AnonymousClass001.A14(c0pf, 0S2.A0A);
                }
            }
        }

        @Override // X.C0gi
        public void CLa() {
            C0pf c0pf = C0hr.this.A0C;
            if (c0pf != null) {
                synchronized (c0pf) {
                    AnonymousClass001.A14(c0pf, 0S2.A08);
                }
            }
        }

        @Override // X.C0gi
        public void onSigquit() {
            C0pf c0pf = C0hr.this.A0C;
            if (c0pf != null) {
                synchronized (c0pf) {
                    AnonymousClass001.A14(c0pf, 0S2.A07);
                }
            }
        }
    };
    public Integer A02 = 0S2.A01;
    public final Object A0L = AnonymousClass001.A0R();
    public final Object A0M = AnonymousClass001.A0R();
    public final C0i0 A0G = new C0i0(this);
    public final C0hz A0H = new Object() { // from class: X.0hz
    };
    public final C0hw A0I = new Object() { // from class: X.0hw
    };
    public final boolean A0O = true;

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0hz] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0hw] */
    public C0hr(Application application, 0W9 r303, 0WC r304, C0ql c0ql, 0gK r306, 0hJ r307, 0hK r308, 0pX r309, C0my c0my, C0l0 c0l0, 0jH r312, C0jQ c0jQ, int i, boolean z) {
        this.A06 = application;
        this.A0J = r312;
        this.A09 = r306;
        this.A07 = r303;
        this.A0P = r304;
        this.A01 = r307;
        this.A08 = c0ql;
        this.A0K = c0jQ;
        this.A0E = c0my;
        this.A0N = z;
        this.A0D = r309;
        this.A0F = c0l0;
        File file = r312.A05;
        0RZ.A02(file);
        this.A0C = new C0pf(r304, r308, c0jQ, file, i);
    }

    public static void A00() {
        synchronized (A0Q) {
        }
    }

    public static void A01(Activity activity, C0hr c0hr) {
        if (c0hr.A03) {
            return;
        }
        if (activity != null) {
            File file = c0hr.A0J.A05;
            0RZ.A02(file);
            try {
                FileWriter fileWriter = new FileWriter(AnonymousClass001.A0D(file, "first_intent.txt"), false);
                try {
                    fileWriter.write(activity.getIntent().toString());
                    fileWriter.close();
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        C0pu c0pu = c0hr.A00;
        if (c0pu != null) {
            long uptimeMillis = SystemClock.uptimeMillis() - c0hr.A0J.A01;
            synchronized (c0pu.A02) {
                C0pu.A04(c0pu, Long.toString(uptimeMillis), ActionId.ASYNC_ACTION_SUCCESS, 10);
                c0pu.A01.A00.put(178, (byte) 48);
                C0pu.A02(c0pu);
            }
            0pX r0 = c0hr.A0D;
            if (r0 != null) {
                r0.A01(2);
            }
        }
        c0hr.A03 = true;
    }

    public static void A02(0gG r301, 0gK r302, C0gq c0gq) {
        C0iO A07 = r302.A07(C0hr.class);
        if (A07 != null) {
            r302.A08(r301, c0gq, A07);
            return;
        }
        C0iy.A00().Bwu("ApplicationLifecycleDetector.addExtraCollector", AnonymousClass001.A0T("Unable to add extra collector to ApplicationLifecycleDetector"), 0gG.A00(r301, c0gq));
        0fH.A0n("lacrima", "Cannot find registered detector");
    }

    public static void A03(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) scheduledExecutorService).setRemoveOnCancelPolicy(true);
        }
    }

    public static boolean A04(Activity activity) {
        return activity.isInMultiWindowMode();
    }

    public static boolean A05(Activity activity) {
        return activity.isInPictureInPictureMode();
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [X.0Dn, java.lang.Object] */
    public void A06(Activity activity, Integer num, String str, boolean z) {
        0W9 r0;
        ?? obj;
        boolean z2;
        boolean z3;
        boolean z4;
        char c;
        int i;
        0WC r02;
        if (this.A00 == null) {
            0fH.A0n("lacrima", "ApplicationLifecycleDetector.start() wasn't called?");
            return;
        }
        0gK r03 = this.A09;
        C0gq c0gq = C0gq.CRITICAL_REPORT;
        if (r03.A0E) {
            return;
        }
        C0gq c0gq2 = C0gq.LARGE_REPORT;
        if (r03.A0F) {
            return;
        }
        if (this.A0E != null && AppStateLoggerNative.sAppStateLoggerNativeInited && AppStateLoggerNative.isShuttingDownNative()) {
            return;
        }
        synchronized (this) {
            r0 = this.A07;
            synchronized (r0) {
                Integer num2 = r0.A04 ? 0S2.A0u : 0S2.A1J;
                obj = new Object();
                ((0Dn) obj).A00 = num2;
                ((0Dn) obj).A02 = null;
                ((0Dn) obj).A04 = false;
                ((0Dn) obj).A03 = false;
                ((0Dn) obj).A01 = null;
                WeakReference weakReference = r0.A03;
                if (weakReference != null) {
                    Object obj2 = weakReference.get();
                    if (obj2 != null) {
                        0Dn r04 = (0Dn) r0.A08.get(obj2);
                        if (r04 != null) {
                            ((0Dn) obj).A01 = obj2;
                            ((0Dn) obj).A00 = r04.A00;
                            ((0Dn) obj).A02 = 0W9.A01(obj2);
                            ((0Dn) obj).A04 = r04.A04;
                            ((0Dn) obj).A03 = r04.A03;
                        }
                    }
                }
                for (Map.Entry entry : r0.A08.entrySet()) {
                    if (((0Dn) entry.getValue()).A00.compareTo(((0Dn) obj).A00) < 0) {
                        ((0Dn) obj).A01 = entry.getKey();
                        ((0Dn) obj).A00 = ((0Dn) entry.getValue()).A00;
                        ((0Dn) obj).A02 = 0W9.A01(((0Dn) obj).A01);
                        ((0Dn) obj).A04 = ((0Dn) entry.getValue()).A04;
                        ((0Dn) obj).A03 = ((0Dn) entry.getValue()).A03;
                    }
                }
            }
        }
        String str2 = ((0Dn) obj).A02;
        char A00 = (str2 == null || (r02 = this.A0P) == null) ? ' ' : r02.A00(str2);
        this.A05 = new WeakReference(((0Dn) obj).A01);
        if (activity != null) {
            z4 = A04(activity);
            z2 = A05(activity);
            z3 = true;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
        }
        C0pu c0pu = this.A00;
        Integer num3 = ((0Dn) obj).A00;
        switch (num.intValue()) {
            case 0:
                c = '0';
                break;
            case 1:
                c = '1';
                break;
            case 2:
                c = '2';
                break;
            default:
                c = '3';
                break;
        }
        synchronized (r0) {
            i = r0.A00;
        }
        C0pu.A03(c0pu, num3, Integer.valueOf(i), Integer.valueOf(r0.A02()), str, A00, c, z, false, z3, z4, z2);
        if (Build.VERSION.SDK_INT < 29 || num.equals(0S2.A01) || num.equals(0S2.A00)) {
            boolean A002 = C0gy.A00(0WD.A00(((0Dn) obj).A00));
            C0pf c0pf = this.A0C;
            if (c0pf != null) {
                c0pf.BzS(A002);
            }
            0hJ r05 = this.A01;
            if (r05 != null) {
                r05.BzS(A002);
            }
        }
        C0qh c0qh = new C0qh(null);
        r03.A0A(c0qh, c0gq, this);
        r03.A0A(c0qh, c0gq2, this);
    }

    @Override // X.C0gj
    public void CE2(int i) {
        C0pf c0pf = this.A0C;
        if (c0pf != null) {
            synchronized (c0pf) {
                if (i > 126) {
                    i = 127;
                }
                Integer num = 0S2.A0B;
                byte[] bArr = new byte[1];
                bArr[0] = (byte) i;
                C0pf.A02(c0pf, num, bArr);
            }
        }
    }

    @Override // X.C0iO
    public int getHealthEventSamplingRate() {
        return DexStore.MS_IN_NS;
    }

    @Override // X.C0iO
    public C0l0 getLimiter() {
        return this.A0F;
    }

    @Override // X.C0iO
    public 0iP getName() {
        return 0iP.A05;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [X.0hv] */
    @Override // X.C0iO
    public void start() {
        synchronized (this.A0M) {
            if (this.A04) {
                return;
            }
            this.A04 = true;
            C0pu c0pu = this.A0J.A03;
            0RZ.A02(c0pu);
            this.A00 = c0pu;
            c0pu.A0B(C0h0.A0A);
            C0pf c0pf = this.A0C;
            if (c0pf != null) {
                synchronized (c0pf) {
                    0hR r0 = c0pf.A04;
                    if (r0 != null && !c0pf.A09) {
                        c0pf.A09 = true;
                        c0pf.A08 = true;
                        try {
                            c0pf.A03 = r0.A0A();
                        } catch (Exception e) {
                            C0iy.A00().Bwu("AppLiftcycleStart", e, null);
                            C0pf.A01(c0pf, e, "Exception on start");
                        }
                        short s = c0pf.A0G;
                        if (s > 0) {
                            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                            c0pf.A06 = newSingleThreadScheduledExecutor;
                            A03(newSingleThreadScheduledExecutor);
                            ScheduledExecutorService scheduledExecutorService = c0pf.A06;
                            Runnable runnable = c0pf.A0F;
                            long j = s;
                            c0pf.A07 = scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j, TimeUnit.MILLISECONDS);
                        }
                        C0jQ c0jQ = c0pf.A0E;
                        C0pj c0pj = c0pf.A0B;
                        synchronized (c0jQ.A03) {
                            c0jQ.A01 = c0pj;
                        }
                        C0vv.A04.add(c0pf.A0C);
                    }
                }
            }
            Application.ActivityLifecycleCallbacks applicationLifecycleDetector$ActivityCallbacksApi29 = Build.VERSION.SDK_INT >= 29 ? new ApplicationLifecycleDetector$ActivityCallbacksApi29(this) : new ApplicationLifecycleDetector$ActivityCallbacks(this);
            ?? r02 = new Object() { // from class: X.0hv
            };
            this.A06.registerActivityLifecycleCallbacks(applicationLifecycleDetector$ActivityCallbacksApi29);
            synchronized (0WB.A02) {
                0WB.A00 = r02;
            }
            C0ql c0ql = this.A08;
            if (c0ql != null && this.A00 != null) {
                int i = BackgroundStartupDetector.A0F;
                Integer num = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0S2.A0Y : 0S2.A0j : 0S2.A0C : 0S2.A0N : 0S2.A01;
                this.A02 = num;
                this.A00.A06(C0fj.A00(num));
                Integer num2 = this.A02;
                if (num2 == 0S2.A01 || num2 == 0S2.A0Y || num2 == 0S2.A0C) {
                    C0i0 c0i0 = this.A0G;
                    synchronized (c0ql) {
                        if (c0i0 == null) {
                            if (c0ql.A00 != null) {
                                BackgroundStartupDetector.A0E.remove(c0ql);
                            }
                            c0i0 = null;
                        } else if (c0ql.A00 == null) {
                            BackgroundStartupDetector.A0D.A03(c0ql);
                        }
                        c0ql.A00 = c0i0;
                    }
                }
            }
            if (this.A0O) {
                0W9 r03 = this.A07;
                C0hw c0hw = this.A0I;
                synchronized (r03.A06) {
                    r03.A02 = c0hw;
                }
            }
            0W9 r04 = this.A07;
            C0hz c0hz = this.A0H;
            synchronized (r04.A06) {
                r04.A01 = c0hz;
            }
        }
    }
}
