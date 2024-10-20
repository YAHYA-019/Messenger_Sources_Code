package com.facebook.common.dextricksdi;

import X.0GT;
import X.0Pz;
import X.0fH;
import X.1BQ;
import X.1BV;
import X.24X;
import X.2DM;
import X.2Jy;
import X.4YU;
import X.5GL;
import X.5GM;
import X.7kS;
import X.8ER;
import X.AnonymousClass001;
import X.AnonymousClass259;
import X.C00i;
import X.C03353xs;
import X.C1kw;
import X.C26T;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.common.dextricks.DexErrorRecoveryInfo;
import com.facebook.common.dextricks.DexLibLoader;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.common.dextricks.DexOptimizationJobService;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.common.dextricks.OptimizationConfiguration;
import com.facebook.common.dextricksdi.DexOptimizationKickoffThing;
import com.facebook.inject.FbInjector;

/* loaded from: DexOptimizationKickoffThing.class */
public final class DexOptimizationKickoffThing {
    public final 5GL A01 = new 5GL(this);
    public final 5GM A02 = new 5GM(this);
    public final C00i A04 = FbInjector.A00;
    public final C00i A00 = new 1BQ(16772);
    public final C00i A03 = new 1BV(16435);

    public static 2DM A00(Throwable th) {
        C26T c26t = C26T.A00;
        2DM A0g = 4YU.A0g(c26t);
        A0g.A0o("excls", AnonymousClass001.A0Y(th));
        A0g.A0o("msg", th.getMessage());
        StackTraceElement[] stackTrace = th.getStackTrace();
        C03353xs c03353xs = new C03353xs(c26t);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= stackTrace.length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            2DM A0g2 = 4YU.A0g(c26t);
            A0g2.A0o("cls", stackTraceElement.getClassName());
            A0g2.A0o("method", stackTraceElement.getMethodName());
            A0g2.A0i("ln", stackTraceElement.getLineNumber());
            c03353xs.A0d(A0g2);
            i = i2 + 1;
        }
        A0g.A0e(c03353xs, "stack");
        Throwable cause = th.getCause();
        if (cause != null) {
            A0g.A0e(A00(cause), "cause");
        }
        return A0g;
    }

    public static void A01(Context context, int i) {
        0GT A00 = 0GT.A00(context);
        DexStore mainDexStore = DexLibLoader.getMainDexStore();
        if (mainDexStore == null) {
            0fH.A0E(DexOptimizationKickoffThing.class, "mainDexStore is null, skipping optimization");
            return;
        }
        if (A00 != null && A00.A2E && (i & 1048576) != 0) {
            0fH.A0C(DexOptimizationKickoffThing.class, "scheduling optimization for PGO recompiliation using DexOptimizationJobService");
            DexOptimizationJobService.Client.schedule(context, mainDexStore, A00.A2C, A00.A2D, A00.A0a);
        } else {
            0fH.A08(DexOptimizationKickoffThing.class, Integer.valueOf(Build.VERSION.SDK_INT), "scheduling optimization using DexOptimization.Service for API %d");
            DexOptimization.Client.startBackgroundOptimization(context, mainDexStore);
            0fH.A0C(DexOptimizationKickoffThing.class, "cancelling optimization with DexOptimizationJobService");
            DexOptimizationJobService.Client.cancel(context);
        }
    }

    public void A02() {
        2DM A0f;
        0fH.A0C(DexOptimizationKickoffThing.class, "delegating :optsvc invoke to delegate class");
        final Context context = (Context) this.A04.get();
        final 5GL r0 = this.A01;
        5GM r02 = this.A02;
        Looper looper = (Looper) this.A03.get();
        DexErrorRecoveryInfo mainDexStoreLoadInformation = DexErrorRecoveryInfo.getMainDexStoreLoadInformation();
        final int i = mainDexStoreLoadInformation.loadResult;
        if ((i & 1) != 0) {
            if (r02 != null) {
                C1kw c1kw = (C1kw) r02.A00.A00.get();
                2Jy r03 = new 2Jy("main_dex_store_regen");
                int i2 = mainDexStoreLoadInformation.loadResult;
                if ((i2 & 16) != 0) {
                    r03.A0F("LOAD_RESULT_RECOVERED_FROM_CORRUPTION", true);
                }
                if ((i2 & 64) != 0) {
                    r03.A0F("LOAD_RESULT_RECOVERED_FROM_BAD_GEN", true);
                }
                if ((i2 & 32) != 0) {
                    r03.A0F("LOAD_RESULT_REGEN_FORCED", true);
                }
                Throwable th = mainDexStoreLoadInformation.regenRetryCause;
                if (th != null) {
                    r03.A08(A00(th), "regenRetryCause");
                }
                Throwable th2 = mainDexStoreLoadInformation.fallbackCause;
                if (th2 != null) {
                    r03.A08(A00(th2), "fallbackCause");
                }
                Throwable th3 = mainDexStoreLoadInformation.xdexFailureCause;
                if (th3 != null) {
                    r03.A08(A00(th3), "xdexFailureCause");
                }
                String str = mainDexStoreLoadInformation.odexSchemeName;
                if (str != null) {
                    r03.A0D("odexSchemeName", str);
                }
                8ER.A00(c1kw).A02(r03);
            }
            0fH.A0C(7kS.class, "logged dex store regenerated");
        }
        DexStore mainDexStore = DexLibLoader.getMainDexStore();
        if (mainDexStore == null) {
            0fH.A0E(7kS.class, "missing main dex store!");
            return;
        }
        try {
            DexStore.OptimizationLog andClearCompletedOptimizationLog = mainDexStore.getAndClearCompletedOptimizationLog();
            if (andClearCompletedOptimizationLog != null) {
                if (r02 != null) {
                    C1kw c1kw2 = (C1kw) r02.A00.A00.get();
                    2Jy r04 = new 2Jy("main_dex_store_optimization_complete");
                    boolean z = false;
                    if ((andClearCompletedOptimizationLog.flags & 2) != 0) {
                        z = true;
                    }
                    r04.A0F(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS, z);
                    r04.A0B("nrOptimizationsAttempted", andClearCompletedOptimizationLog.nrOptimizationsAttempted);
                    r04.A0B("nrOptimizationsFailed", andClearCompletedOptimizationLog.nrOptimizationsFailed);
                    int i3 = 0;
                    do {
                        String counterName = DexStore.OptimizationLog.getCounterName(i3);
                        String A0W = 0Pz.A0W(counterName, "_LAST_ATTEMPT");
                        r04.A0C(counterName, andClearCompletedOptimizationLog.counters[i3]);
                        r04.A0C(A0W, andClearCompletedOptimizationLog.lastAttemptCounters[i3]);
                        i3++;
                    } while (i3 < 4);
                    if (!"".equals(andClearCompletedOptimizationLog.lastFailureExceptionJson)) {
                        try {
                            A0f = (24X) new AnonymousClass259() { // from class: X.4xq
                                public static final long serialVersionUID = 255;

                                {
                                    this._objectCodec = new AnonymousClass244(this);
                                }
                            }.A05(andClearCompletedOptimizationLog.lastFailureExceptionJson).A1N();
                        } catch (Exception e) {
                            0fH.A0P(DexOptimizationKickoffThing.class, "failure to decode exception JSON!!!!", e, new Object[0]);
                            A0f = 4YU.A0f();
                            A0f.A0o("error", 0Pz.A0V("error reading error JSON: ", e));
                        }
                        r04.A08(A0f, "lastFailureExceptionJson");
                    }
                    8ER.A00(c1kw2).A02(r04);
                }
                0fH.A0C(7kS.class, "logged dex optimization completion");
            }
        } catch (Exception e2) {
            0fH.A0P(7kS.class, "error reading dex error log", e2, new Object[0]);
        }
        if ((i & 2) == 0) {
            0fH.A0C(DexOptimizationKickoffThing.class, "cancelling optimization with DexOptimizationJobService");
            DexOptimizationJobService.Client.cancel(context);
            return;
        }
        long max = Math.max(mainDexStore.getNextRecommendedOptimizationAttemptTime(new OptimizationConfiguration.Builder().build()) - System.currentTimeMillis(), 10000L);
        0fH.A08(7kS.class, Long.valueOf(max), "scheduling optimization start after %s ms");
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        final Looper looper2 = looper;
        new Handler(looper2) { // from class: X.32s
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                DexOptimizationKickoffThing.A01(context, i);
            }
        }.sendEmptyMessageDelayed(0, max);
    }
}
