package com.facebook.location.foreground;

import X.0S2;
import X.0fH;
import X.1Bi;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1EC;
import X.1EK;
import X.1HG;
import X.1PA;
import X.1UN;
import X.1UP;
import X.3Di;
import X.41S;
import X.AbstractC01593ro;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C02333uu;
import X.C0jy;
import X.C15h;
import X.JQw;
import X.Kqy;
import X.LD9;
import X.LVA;
import X.LpT;
import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.util.TriState;
import com.facebook.fury.context.ReqContextTypeResolver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: ForegroundLocationFrameworkController.class */
public final class ForegroundLocationFrameworkController implements 1UN {
    public long A00;
    public long A01;
    public long A02;
    public 1PA A03;
    public 1PA A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public ListenableFuture A09;
    public final 1Br A0A;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0M;
    public final 1Br A0N;
    public final 1Br A0P;
    public final 1Br A0Q;
    public final 1Br A0R;
    public final C15h A0S;
    public final Context A0T;
    public final 1Br A0U;
    public final 1Br A0L = 1Bq.A00(16385);
    public final 1Br A0O = 1Bq.A00(84339);
    public final 1Br A0B = 1Bq.A00(16616);

    public ForegroundLocationFrameworkController() {
        Context context = (Context) 1Bn.A0A(83719);
        this.A0T = context;
        this.A0K = 1HG.A00(context, 65728);
        this.A0J = 1HG.A00(context, 65729);
        this.A0M = 1Bq.A00(84489);
        this.A0D = 1Bq.A00(99390);
        this.A0G = 1Bq.A00(131080);
        this.A0U = 1Bq.A00(131150);
        this.A0P = 1Bu.A00(131151);
        this.A0A = 1Bq.A00(131149);
        this.A0Q = 1Bq.A00(131152);
        this.A0R = 1Bq.A00(Constants.LOAD_RESULT_PGO);
        this.A0E = 1Bu.A00(98559);
        this.A0N = 1Bu.A00(84341);
        this.A0F = 1Bq.A00(16511);
        this.A0S = new C15h() { // from class: X.3ou
            @Override // X.C15h
            public /* bridge */ /* synthetic */ Object get() {
                return 1Fw.A06(1Bn.A0A(16428));
            }
        };
        this.A0I = 1Bq.A00(33013);
        this.A0C = 1Bu.A00(82087);
        this.A0H = 1Bq.A00(131091);
        ((1UP) 1Bi.A03(66348)).A00(this);
    }

    public static final long A00(ForegroundLocationFrameworkController foregroundLocationFrameworkController) {
        long j;
        synchronized (foregroundLocationFrameworkController) {
            if (A06(foregroundLocationFrameworkController)) {
                j = 41S.A00(A01(foregroundLocationFrameworkController)).Auz(36592189355524594L, 0L);
            } else {
                A01(foregroundLocationFrameworkController);
                j = 90000;
            }
        }
        return j;
    }

    public static final 41S A01(ForegroundLocationFrameworkController foregroundLocationFrameworkController) {
        return (41S) foregroundLocationFrameworkController.A0U.A00.get();
    }

    private final void A02() {
        synchronized (this) {
            1PA r0 = this.A04;
            if (r0 != null) {
                if (r0.A03()) {
                    r0.A01();
                }
                this.A04 = null;
            }
            A04(this);
            ((LVA) this.A0P.A00.get()).A02();
            Kqy kqy = (Kqy) this.A0H.A00.get();
            synchronized (kqy) {
                kqy.A0D.clear();
            }
        }
    }

    public static final void A03(Context context, ForegroundLocationFrameworkController foregroundLocationFrameworkController, long j) {
        synchronized (foregroundLocationFrameworkController) {
            1EK.A09("ForegroundLocationFrameworkController", 562956621032230L);
            try {
                foregroundLocationFrameworkController.A09 = ((1EC) 1Br.A0B(foregroundLocationFrameworkController.A0N)).Cjg(C0jy.A02(new LpT(context, foregroundLocationFrameworkController), "ForegroundLocationFrameworkController_scheduleRequestLocationWithDelay", ReqContextTypeResolver.resolveName(AnonymousClass000.A00(ActionId.RTMP_CONNECTION_REQUESTED))), TimeUnit.MILLISECONDS, j);
            } finally {
                1EK.A03();
            }
        }
    }

    public static final void A04(ForegroundLocationFrameworkController foregroundLocationFrameworkController) {
        synchronized (foregroundLocationFrameworkController) {
            ListenableFuture listenableFuture = foregroundLocationFrameworkController.A09;
            if (listenableFuture != null) {
                listenableFuture.cancel(false);
                foregroundLocationFrameworkController.A09 = null;
            }
        }
    }

    public static final void A05(ForegroundLocationFrameworkController foregroundLocationFrameworkController) {
        synchronized (foregroundLocationFrameworkController) {
            if (foregroundLocationFrameworkController.A08) {
                foregroundLocationFrameworkController.A08 = false;
                foregroundLocationFrameworkController.A02();
                LD9 ld9 = (LD9) 1Br.A0B(foregroundLocationFrameworkController.A0A);
                try {
                    LD9.A04(ld9, true);
                    LD9.A02(ld9, false);
                    LD9.A03(ld9, false);
                    LD9.A05(ld9, false);
                    AbstractC01593ro A00 = LD9.A00(ld9, "fgl_app_background");
                    if (A00 != null) {
                        A00.A05("session_duration_ms", ld9.A0B.now() - ld9.A09);
                        A00.A04("session_request_count", ld9.A00);
                        A00.A04("session_scan_count", ld9.A01);
                        A00.A04("session_scan_fail_count", ld9.A02);
                        A00.A04("session_scan_success_count", ld9.A03);
                        A00.A04("session_write_count", ld9.A04);
                        A00.A04("session_write_fail_count", ld9.A05);
                        A00.A04("session_write_success_count", ld9.A06);
                        A00.A0A();
                    }
                    ld9.A09 = Long.MIN_VALUE;
                    int i = (-1) << (-1);
                    ld9.A00 = i;
                    ld9.A01 = i;
                    ld9.A02 = i;
                    ld9.A03 = i;
                    ld9.A04 = i;
                    ld9.A05 = i;
                    ld9.A06 = i;
                } catch (IllegalStateException unused) {
                    0fH.A0g("fgl_app_background", JQw.A00(ActionId.FAIL_FILE_TOO_LARGE), JQw.A00(ActionId.ASYNC_ACTION_FAIL));
                }
            }
        }
    }

    public static final boolean A06(ForegroundLocationFrameworkController foregroundLocationFrameworkController) {
        boolean z = false;
        if (41S.A00(A01(foregroundLocationFrameworkController)).Auz(36592189355524594L, 0L) > 0) {
            A01(foregroundLocationFrameworkController);
            1Br.A0C(A01(foregroundLocationFrameworkController).A01);
            TriState triState = TriState.NO;
            try {
                Enum.valueOf(3Di.class, "");
            } catch (Exception unused) {
            }
            if (triState.asBoolean(false)) {
                long A01 = 1Br.A01(foregroundLocationFrameworkController.A0M) - foregroundLocationFrameworkController.A00;
                A01(foregroundLocationFrameworkController);
                if (A01 < 120000) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (A08(r301) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A07(com.facebook.location.foreground.ForegroundLocationFrameworkController r301) {
        /*
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            X.1Br r0 = r0.A0B     // Catch: java.lang.Throwable -> L2d
            r302 = r0
            r0 = r302
            java.lang.Object r0 = X.1Br.A0B(r0)     // Catch: java.lang.Throwable -> L2d
            r302 = r0
            r0 = r302
            X.1Od r0 = (X.1Od) r0     // Catch: java.lang.Throwable -> L2d
            r302 = r0
            r0 = r302
            boolean r0 = r0.A0F()     // Catch: java.lang.Throwable -> L2d
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L25
            r0 = r301
            boolean r0 = A08(r0)     // Catch: java.lang.Throwable -> L2d
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L29
        L25:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L29:
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            return r0
        L2d:
            r302 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.location.foreground.ForegroundLocationFrameworkController.A07(com.facebook.location.foreground.ForegroundLocationFrameworkController):boolean");
    }

    public static final boolean A08(ForegroundLocationFrameworkController foregroundLocationFrameworkController) {
        boolean A1W;
        synchronized (foregroundLocationFrameworkController) {
            A1W = AnonymousClass001.A1W(((C02333uu) 1Br.A0B(foregroundLocationFrameworkController.A0G)).A03(), 0S2.A0N);
        }
        return A1W;
    }

    public void AFz() {
        A02();
    }
}
