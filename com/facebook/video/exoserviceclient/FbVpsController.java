package com.facebook.video.exoserviceclient;

import X.03W;
import X.03Y;
import X.04R;
import X.0QD;
import X.0S2;
import X.11T;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1FP;
import X.1G0;
import X.1G2;
import X.1Hv;
import X.1I7;
import X.1P9;
import X.1R8;
import X.1Wg;
import X.2Cz;
import X.2EI;
import X.2EK;
import X.2yD;
import X.3Ds;
import X.4qL;
import X.4qM;
import X.4qN;
import X.4qP;
import X.4qS;
import X.4qV;
import X.5J6;
import X.5KH;
import X.5Kt;
import X.5Kw;
import X.5L1;
import X.5L3;
import X.5L4;
import X.5LT;
import X.5NA;
import X.5NK;
import X.5NM;
import X.5NO;
import X.5NQ;
import X.5NY;
import X.5NZ;
import X.5Na;
import X.5Nb;
import X.5Nc;
import X.5Nd;
import X.5Ne;
import X.5Nf;
import X.6Cj;
import X.6Ck;
import X.6Cn;
import X.6Co;
import X.A37;
import X.AbstractC05764eu;
import X.AnonymousClass046;
import X.C00i;
import X.C00j;
import X.C00y;
import X.C01g;
import X.C01i;
import X.C09494qR;
import X.C0ft;
import X.C1fj;
import X.C51a;
import X.C7to;
import X.C82y;
import X.EqT;
import X.G12;
import X.G13;
import X.GPP;
import X.HHL;
import X.HlN;
import X.Hzo;
import X.I7E;
import X.I7n;
import X.IR4;
import X.IhP;
import X.Itp;
import X.J5i;
import X.KyY;
import android.content.Context;
import android.os.Build;
import android.os.PerformanceHintManager;
import android.os.Process;
import android.util.ArrayMap;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.video.exoserviceclient.FbVpsController;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: FbVpsController.class */
public final class FbVpsController {
    public static final String A0T = FbVpsController.class.getName();
    public Integer A00;
    public final Context A01;
    public final C00i A02;
    public final C00i A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final C09494qR A0J;
    public final AtomicBoolean A0K;
    public final C01i A0L;
    public final C01i A0M;
    public final C00i A0N;
    public final C00i A0O;
    public final C00i A0P;
    public final 1Br A0Q;
    public final 1Br A0R;
    public volatile 5L4 A0S;

    /* JADX WARN: Type inference failed for: r0v64, types: [X.4qR, java.lang.Object] */
    public FbVpsController() {
        2EI r305;
        Integer num;
        Runnable gpp;
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A01 = A00;
        this.A09 = 1Bq.A00(115830);
        this.A0R = 1Bq.A00(115835);
        this.A0C = 1Bq.A00(33053);
        this.A0F = 1Bq.A00(16464);
        this.A0L = C01g.A01(4qL.A00);
        this.A0M = C01g.A01(new C82y(this, 46));
        this.A0Q = 1Bu.A00(32974);
        this.A06 = 1Bq.A00(16754);
        this.A0N = new C00y(4qM.A00);
        this.A0O = new C00y(4qN.A00);
        this.A0A = 1Bq.A00(16687);
        this.A0B = 1Bq.A00(33013);
        this.A07 = 1Bq.A00(32888);
        this.A05 = 1Bq.A00(99410);
        this.A0P = new C00y(4qP.A00);
        this.A04 = 1Bq.A00(67765);
        this.A0G = 1Bu.A00(16669);
        this.A0H = 1Bq.A00(49694);
        this.A0J = new Object();
        this.A0I = 1Bq.A00(116128);
        this.A08 = 1Bq.A00(98487);
        this.A0D = 1Bq.A00(16943);
        this.A02 = new C00y(4qS.A00);
        this.A03 = new C00y(new J5i(this, 5));
        this.A0E = 1Bq.A00(98498);
        this.A0K = new AtomicBoolean(false);
        if (4qV.A00(A00(this)).AZk(36324724561039347L)) {
            C0ft.A04(new IR4(this), false);
        }
        if (4qV.A00(A00(this)).AZk(36311646422502607L)) {
            r305 = (2EI) this.A0L.getValue();
            num = 0S2.A00;
            gpp = new Runnable() { // from class: X.3fx
                public static final String __redex_internal_original_name = "FbVpsController$2";

                @Override // java.lang.Runnable
                public final void run() {
                    FbVpsController fbVpsController = FbVpsController.this;
                    int convert = FbVpsController.A00(fbVpsController).A09 == 0 ? 90000 : (int) TimeUnit.SECONDS.convert(90000L, TimeUnit.MICROSECONDS);
                    C1hi c1hi = new C1hi();
                    c1hi.A00 = convert;
                    c1hi.A02 = 3;
                    try {
                        ((C1fP) fbVpsController.A0M.getValue()).A01(c1hi, 0).A03((Integer) null, 0);
                    } catch (Exception e) {
                        0fH.A0k(FbVpsController.A0T, 0Pz.A1B("boostThreadAffinity: failed with exception: ", e));
                    }
                }
            };
        } else {
            if (!4qV.A00(A00(this)).AZk(36311646422568144L)) {
                return;
            }
            r305 = (2EI) this.A0L.getValue();
            num = 0S2.A00;
            gpp = new GPP(this);
        }
        ((2EK) r305).A00(num, gpp);
    }

    public static final 4qV A00(FbVpsController fbVpsController) {
        return (4qV) fbVpsController.A0R.A00.get();
    }

    public static final HeroPlayerSetting A01(FbVpsController fbVpsController) {
        return (HeroPlayerSetting) fbVpsController.A0Q.A00.get();
    }

    public static final void A02(FbVpsController fbVpsController) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(Process.myPid()));
        Integer num = fbVpsController.A00;
        int i = -1;
        if (num == null || num.intValue() == -1) {
            num = Integer.valueOf(5J6.A00());
        }
        fbVpsController.A00 = num;
        if (num != null) {
            i = num.intValue();
        }
        Integer valueOf = Integer.valueOf(i);
        if (i == -1 || valueOf == null) {
            return;
        }
        arrayList.add(valueOf);
        int[] A0n = 0QD.A0n(arrayList);
        if (Build.VERSION.SDK_INT >= 31) {
            PerformanceHintManager performanceHintManager = (PerformanceHintManager) fbVpsController.A01.getSystemService(PerformanceHintManager.class);
            int i2 = A00(fbVpsController).A09;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long convert = i2 == 0 ? timeUnit.convert(90000L, TimeUnit.MICROSECONDS) : timeUnit.toNanos(A00(fbVpsController).A09);
            if (performanceHintManager != null) {
                performanceHintManager.createHintSession(A0n, convert);
            }
        }
    }

    public static final void A03(FbVpsController fbVpsController) {
        if (fbVpsController.A0S == null || A01(fbVpsController).cache == null || !A01(fbVpsController).cache.delayInitCache) {
            return;
        }
        ((1FP) 1Br.A0B(fbVpsController.A04)).D3D(3Ds.A02, 0S2.A01, new Itp(fbVpsController), "DelayedVideoCacheInit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r307v0, types: [X.Hr0] */
    /* JADX WARN: Type inference failed for: r307v1 */
    /* JADX WARN: Type inference failed for: r307v7, types: [X.I7n] */
    public static final void A04(FbVpsController fbVpsController) {
        ?? r307;
        boolean z;
        5L4 A00;
        if (A00(fbVpsController).A0O) {
            r307 = I7E.A04;
            synchronized (r307) {
                try {
                    z = I7E.A03;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                r307.A01(fbVpsController.A01, new Hzo((5L1) fbVpsController.A02.get(), (5L3) fbVpsController.A03.get(), A01(fbVpsController), new 5Kw((C1fj) 1Br.A0B(fbVpsController.A06), (5Kt) 1Br.A0B(fbVpsController.A0H)), (HashMap) 1Bn.A0A(32975), (1R8) 1Br.A0B(fbVpsController.A0C), (ScheduledExecutorService) 1Br.A0B(fbVpsController.A0F), false));
            }
            A00 = I7E.A00(r307.A00());
        } else {
            HashMap hashMap = (HashMap) 1Bn.A0A(32975);
            A00 = 5L4.A02(fbVpsController.A01, (5L1) fbVpsController.A02.get(), (5L3) fbVpsController.A03.get(), A01(fbVpsController), new 5Kw((C1fj) fbVpsController.A06.A00.get(), (5Kt) fbVpsController.A0H.A00.get()), hashMap, (1R8) fbVpsController.A0C.A00.get(), (ScheduledExecutorService) fbVpsController.A0F.A00.get());
        }
        fbVpsController.A0S = A00;
        5L4 r0 = fbVpsController.A0S;
        if (r0 != null) {
            ((2Cz) fbVpsController.A0D.A00.get()).CcR(r0);
            A03(fbVpsController);
            A05(fbVpsController);
            AbstractC05764eu.A00(FbVpsController.class);
            r0.A0U.set(fbVpsController.A0P.get());
            r0.A0R.set(new 5NO((5NK) fbVpsController.A0N.get(), r0.A04, (5NM) fbVpsController.A0O.get()));
            if (A01(fbVpsController).reportExceptionAsMME) {
                C7to.A02.A01 = new IhP((AnonymousClass046) fbVpsController.A0G.A00.get());
            }
            boolean AZn = ((FbSharedPreferences) fbVpsController.A0B.A00.get()).AZn((1G2) 1G0.A04.A0D("video_data_saver_enabled"), false);
            5NA.A03("datasaver changed to: %s", new Object[]{String.valueOf(AZn)});
            5LT r02 = r0.A05;
            if (r02 != null) {
                r02.A02 = AZn;
            }
        }
        if (A01(fbVpsController).enablePlaybackMLPrediction) {
            C00i c00i = fbVpsController.A0E.A00;
            EqT eqT = (EqT) c00i.get();
            ((ScheduledExecutorService) eqT.A02.A00.get()).scheduleAtFixedRate(new G12(eqT), 0L, (int) ((2yD) eqT.A03.A00.get()).Auy(36597978970525539L), TimeUnit.SECONDS);
            HlN hlN = I7n.A0G;
            I7n A002 = hlN.A00();
            int i = A01(fbVpsController).playbackMLEvaluationCyclePeriod_s;
            int i2 = A01(fbVpsController).playbackMLEvaluationExpirePeriod_s;
            A01(fbVpsController);
            A01(fbVpsController);
            A01(fbVpsController);
            boolean z2 = A01(fbVpsController).enableVodPlaybackMLPrediction;
            synchronized (A002) {
                I7n.A0E = true;
                I7n.A0C = i;
                I7n.A0D = i2;
                I7n.A0F = z2;
            }
            r307 = hlN.A00();
            EqT eqT2 = (EqT) c00i.get();
            synchronized (r307) {
                r307.A04 = eqT2;
            }
        }
        if (A01(fbVpsController).enableAudioDubbingSupport) {
            KyY kyY = KyY.A02;
            C82y c82y = new C82y(fbVpsController, 41);
            synchronized (kyY) {
                KyY.A01 = c82y;
            }
            C82y c82y2 = new C82y(fbVpsController, 42);
            synchronized (kyY) {
                KyY.A00 = c82y2;
            }
        }
        5NQ.A0A = new C82y(fbVpsController, 43);
        5NQ.A0C = new C82y(fbVpsController, 44);
        5NQ.A08 = 5Nb.A00;
        5NQ.A0B = 5Nc.A00;
        5NQ.A09 = new C82y(fbVpsController, 45);
        03W A0G = 04R.A0G();
        5NY r03 = 5NY.A03;
        11T.A0F(A0G, 2);
        5NZ r04 = 5NZ.A0E;
        LinkedHashMap A09 = 04R.A09(new 03Y[]{new 03Y(5Nd.A07, Integer.valueOf((int) A01(fbVpsController).gen.smart_player_memory_red_watermark_ms)), new 03Y(5Nd.A08, Integer.valueOf((int) A01(fbVpsController).gen.smart_player_memory_yellow_watermark_ms)), new 03Y(5Nd.A0A, Integer.valueOf((int) A01(fbVpsController).gen.smart_player_severe_thermal_watermark_ms)), new 03Y(5Nd.A03, Integer.valueOf((int) A01(fbVpsController).gen.smart_player_low_battery_threshold_percent)), new 03Y(5Nd.A05, Integer.valueOf((int) A01(fbVpsController).gen.smart_player_low_battery_watermark_ms))});
        11T.A0F(A09, 0);
        5NQ.A06 = new 5Na(r03, r04, A09);
        5Ne r05 = 5Ne.A00;
        String str = A01(fbVpsController).gen.dav1d_smart_player_config_json;
        11T.A09(str);
        5NQ.A02 = r05.A00(str);
        String str2 = A01(fbVpsController).gen.dav1d_smart_player_latency_config_json;
        11T.A09(str2);
        5NQ.A01 = r05.A00(str2);
        String str3 = A01(fbVpsController).gen.dynamic_player_pool_size_json_config;
        11T.A09(str3);
        5NQ.A03 = r05.A00(str3);
        String str4 = A01(fbVpsController).gen.hero_thread_priority_json_config;
        11T.A09(str4);
        5NQ.A05 = r05.A00(str4);
        String str5 = A01(fbVpsController).gen.prefetch_thread_priority_json_config;
        11T.A09(str5);
        5NQ.A07 = r05.A00(str5);
        5Nf r06 = 5Nf.A06;
        5Nf.A01 = A01(fbVpsController).gen.smart_player_action_runnable_delay_ms;
        5Nf.A05 = A01(fbVpsController).gen.enable_product_config_pool_resize;
        5Nf.A00 = A01(fbVpsController).gen.product_config_pool_resize_min_interval;
        r06.A00();
        A37 a37 = new A37(fbVpsController, 13);
        1P9 r07 = new 1P9((1I7) 1Hv.A02(fbVpsController.A01, 65728));
        r07.A05(a37, "com.facebook.common.connectionstatus.FbDataConnectionManager.DATA_CONNECTION_STATE_CHANGE");
        r07.A02().A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
    
        if (((java.lang.String) r0.first).equals(r0) != false) goto L35;
     */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, X.5NB] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A05(com.facebook.video.exoserviceclient.FbVpsController r301) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.exoserviceclient.FbVpsController.A05(com.facebook.video.exoserviceclient.FbVpsController):void");
    }

    public static final void A06(final FbVpsController fbVpsController) {
        A00(fbVpsController);
        if (C51a.A06) {
            return;
        }
        ((Executor) fbVpsController.A0F.A00.get()).execute(new Runnable() { // from class: X.51b
            public static final String __redex_internal_original_name = "FbVpsController$startHeroKeepAliveServiceIfNeeded$1";

            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v7 ??, still in use, count: 2, list:
                  (r306v7 ??) from 0x004a: PHI (r306v1 ??) = (r306v0 ??), (r306v7 ??) binds: [B:14:0x002e, B:22:0x0047] A[DONT_GENERATE, DONT_INLINE]
                  (r306v7 ?? I:X.51a) from 0x0047: SPUT (r306v7 ?? I:X.51a) A[Catch: all -> 0x010e] X.51a.A05 X.51a
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
                	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
                	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
                	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
                	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
                	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
                	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instructions count: 280
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C51b.run():void");
            }
        });
    }

    public static final void A07(FbVpsController fbVpsController, 6Ck r302) {
        6Cj r0;
        String str;
        if (!4qV.A00(A00(fbVpsController)).AZk(36310950630131237L)) {
            if (6Cn.A07) {
                6Cn.A07 = false;
                6Co r02 = 6Cn.A05;
                if (r02.A05) {
                    r02.A05 = false;
                    r02.A04.execute(new G13(r02));
                    return;
                }
                return;
            }
            return;
        }
        if (!6Cn.A07) {
            6Cn.A07 = true;
            6Cn.A05.A05 = true;
        }
        1Wg.A09(r302, A01(fbVpsController));
        ArrayMap arrayMap = new ArrayMap();
        if (11T.A0O(r302.A0T, "GlobalPrefetch") && (str = (r0 = r302.A0E).A0C) != null) {
            String str2 = r0.A0B;
            11T.A09(str2);
            arrayMap.put("FB_PRODUCT", HHL.A00(str2, str));
        }
        arrayMap.put("IS_STARTUP_PREFETCH", true);
        arrayMap.put("IS_PREFETCH_ON_APPCHOREOGRAPHER", true);
        if (arrayMap.isEmpty()) {
            return;
        }
        6Cn.A01(arrayMap, r302.A0E.A0F, String.valueOf(r302.A0L));
    }

    public final 5L4 A08() {
        if (this.A0S != null) {
            A06(this);
        } else {
            synchronized (this) {
                if (this.A0S == null) {
                    A06(this);
                    A04(this);
                }
            }
        }
        return this.A0S;
    }

    public final void A09() {
        if (this.A0S == null) {
            ((Executor) this.A0F.A00.get()).execute(new 5KH(this));
        }
    }

    public final void A0A() {
        synchronized (this) {
            5L1 r0 = (5L1) this.A02.get();
            if (r0 != null) {
                r0.A00("video_service_started_by_warmup");
            }
            C00j.A05("FbVpsController.warmupExoPlayerService", -965087097);
            C00j.A01(509687386);
        }
    }
}
