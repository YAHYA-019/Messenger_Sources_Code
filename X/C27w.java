package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import java.util.concurrent.Executor;

/* renamed from: X.27w, reason: invalid class name */
/* loaded from: 27w.class */
public abstract class C27w {
    public final int A00;
    public final Context A01;
    public final Looper A02;
    public final AnonymousClass289 A03;
    public final AnonymousClass286 A04;
    public final 28M A05;
    public final 28I A06;
    public final String A07;
    public final 28E A08;
    public final 28O A09;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C27w(android.app.Activity r302, X.AnonymousClass289 r303, X.AnonymousClass286 r304, X.28E r305) {
        /*
            r301 = this;
            r0 = r302
            r306 = r0
            r0 = r302
            android.os.Looper r0 = r0.getMainLooper()
            r307 = r0
            java.lang.String r0 = "Looper must not be null."
            r308 = r0
            r0 = r307
            r1 = r308
            X.AbstractC00481b7.A03(r0, r1)
            r0 = r307
            if (r0 != 0) goto L1e
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r307 = r0
        L1e:
            X.28B r0 = new X.28B
            r309 = r0
            r0 = r309
            r1 = r307
            r2 = r305
            r0.<init>(r1, r2)
            r0 = r301
            r307 = r0
            r0 = r301
            r1 = r306
            r2 = r302
            r3 = r303
            r4 = r304
            r5 = r309
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27w.<init>(android.app.Activity, X.289, X.286, X.28E):void");
    }

    public C27w(Activity activity, Context context, AnonymousClass289 anonymousClass289, AnonymousClass286 anonymousClass286, 28B r306) {
        AbstractC00481b7.A03(context, "Null context is not permitted.");
        AbstractC00481b7.A03(anonymousClass286, "Api must not be null.");
        AbstractC00481b7.A03(r306, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        AbstractC00481b7.A03(applicationContext, "The provided context did not have an application context.");
        this.A01 = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.A07 = attributionTag;
        this.A04 = anonymousClass286;
        this.A03 = anonymousClass289;
        this.A02 = r306.A00;
        28I r0 = new 28I(anonymousClass289, anonymousClass286, attributionTag);
        this.A06 = r0;
        this.A05 = new 28L(this);
        28O A01 = 28O.A01(applicationContext);
        this.A09 = A01;
        this.A00 = A01.A0B.getAndIncrement();
        this.A08 = r306.A01;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            MKC A00 = LifecycleCallback.A00(activity);
            C01043pj c01043pj = (C01043pj) A00.Ab0(C01043pj.class, "ConnectionlessLifecycleHelper");
            c01043pj = c01043pj == null ? new C01043pj(GoogleApiAvailability.A00, A01, A00) : c01043pj;
            c01043pj.A00.add(r0);
            A01.A06(c01043pj);
        }
        Handler handler = A01.A06;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    public C27w(Context context, AnonymousClass289 anonymousClass289, AnonymousClass286 anonymousClass286, 28B r305) {
        this(null, context, anonymousClass289, anonymousClass286, r305);
    }

    public static final C4Ez A00(C27w c27w, L7b l7b, int i) {
        long currentTimeMillis;
        long elapsedRealtime;
        4FE r0 = new 4FE();
        28E r02 = c27w.A08;
        28O r03 = c27w.A09;
        int i2 = l7b.A00;
        if (i2 != 0) {
            28I r04 = c27w.A06;
            if (r03.A07()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = C3rV.A00().A00;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.A03) {
                        boolean z = rootTelemetryConfiguration.A04;
                        2A2 r05 = (2A2) r03.A09.get(r04);
                        if (r05 != null) {
                            2AD r06 = r05.A04;
                            if (r06 instanceof 2AD) {
                                2AD r07 = r06;
                                if (r07.A0Q != null && !r07.BRJ()) {
                                    ConnectionTelemetryConfiguration A00 = 3dM.A00(r05, r07, i2);
                                    if (A00 != null) {
                                        r05.A00++;
                                        z = A00.A03;
                                    }
                                }
                            }
                        }
                        if (!z) {
                            currentTimeMillis = 0;
                            elapsedRealtime = 0;
                            C51o c51o = new 3dM(r04, r03, i2, currentTimeMillis, elapsedRealtime);
                            C4Ez c4Ez = r0.A00;
                            final Handler handler = r03.A06;
                            handler.getClass();
                            c4Ez.A09(c51o, new Executor() { // from class: X.3j0
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    handler.post(runnable);
                                }
                            });
                        }
                    }
                }
                currentTimeMillis = System.currentTimeMillis();
                elapsedRealtime = SystemClock.elapsedRealtime();
                C51o c51o2 = new 3dM(r04, r03, i2, currentTimeMillis, elapsedRealtime);
                C4Ez c4Ez2 = r0.A00;
                final Handler handler2 = r03.A06;
                handler2.getClass();
                c4Ez2.A09(c51o2, new Executor() { // from class: X.3j0
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handler2.post(runnable);
                    }
                });
            }
        }
        3M0 r08 = new 3M0(c27w, new K2l(r02, l7b, r0, i), r03.A0C.get());
        Handler handler3 = r03.A06;
        handler3.sendMessage(handler3.obtainMessage(4, r08));
        return r0.A00;
    }

    public static final void A01(C27w c27w, K4s k4s, int i) {
        k4s.A07();
        28O r0 = c27w.A09;
        1BK.A1I(r0.A06, new 3M0(c27w, new K2m(k4s, i), r0.A0C.get()), 4);
    }
}
