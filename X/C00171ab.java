package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Process;
import com.facebook.acra.constants.ActionId;
import com.facebook.inject.FbInjector;
import com.facebook.mobileconfig.MobileConfigManagerParamsHolder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1ab, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1ab.class */
public final class C00171ab implements 1Xa, 1Xc {
    public Context A00;
    public ScheduledFuture A01;
    public boolean A02;
    public boolean A03;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;
    public final AtomicBoolean A0C;
    public final C00i A0D;
    public final C00i A0E;
    public final C00i A0F;
    public final C00i A0G;
    public final 1PB A0H;
    public final C00201ae A0I;
    public final Runnable A0J;
    public final Set A0L;
    public volatile boolean A0M;
    public final C00i A05 = FbInjector.A00;
    public final C00i A04 = new 1BQ(16616);
    public final C00i A0B = new 1BQ(68406);
    public final Set A0K = 1Bi.A06(ActionId.QUERY_READY);

    public C00171ab() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A06 = new 1HH(A00, 65728);
        this.A0A = new 1BV(67909);
        this.A0E = new 1BQ(16511);
        this.A08 = new 1BQ(32826);
        this.A0G = new 1BQ(16736);
        this.A09 = new 1HH(A00, 66157);
        this.A0F = new 1BV(67235);
        this.A07 = new 1BQ(16385);
        this.A0D = new 1BQ(16748);
        this.A0L = new HashSet();
        this.A0M = false;
        this.A0C = new AtomicBoolean(false);
        this.A0J = new AbstractRunnableC00191ad() { // from class: X.1ac
            public static final String __redex_internal_original_name = "MqttPushServiceManager$1";

            {
                super(C00171ab.class, "stopMqtt");
            }

            @Override // java.lang.Runnable
            public void run() {
                ((1dC) C00171ab.this.A09.get()).A01();
            }
        };
        this.A0I = new C00201ae(this);
        this.A0H = ((1P8) 1Bi.A03(16626)).A00("mqtt_instance");
        0fH.A08(C00171ab.class, this, "Create new PushServiceManager: %s");
    }

    private void A00() {
        synchronized (this) {
            ScheduledFuture scheduledFuture = this.A01;
            if (scheduledFuture != null) {
                if (!scheduledFuture.isDone()) {
                    this.A01.cancel(false);
                }
                this.A01 = null;
            }
        }
    }

    public static void A01(C00171ab c00171ab) {
        synchronized (c00171ab) {
            ScheduledFuture scheduledFuture = c00171ab.A01;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                C00i c00i = c00171ab.A07;
                long Auy = ((2yD) c00i.get()).Auy(36592292434412091L);
                long j = 60;
                0fH.A09(C00171ab.class, Long.valueOf(((Auy * j) * 1000) / 1000), "Stopping service in %d sec");
                try {
                    c00171ab.A01 = ((ScheduledExecutorService) c00171ab.A0F.get()).schedule(c00171ab.A0J, ((2yD) c00i.get()).Auy(36592292434412091L) * j * 1000, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    0fH.A0P(C00171ab.class, "Failed to schedule stopping service, trying to stop it now", th, AnonymousClass001.A1Z());
                    1BK.A09(c00171ab.A0E).D0u(new 0BR(0BR.A01("MqttPushServiceManager", AnonymousClass001.A0Z(th, "stopServiceDelayed got exception ", AnonymousClass001.A0k()))));
                    ((Handler) c00171ab.A08.get()).post(c00171ab.A0J);
                }
            } else {
                0fH.A0D(C00171ab.class, "Stopping service already scheduled");
            }
        }
    }

    public static void A02(C00171ab c00171ab, String str) {
        C00i c00i = c00171ab.A0B;
        if (((LightweightQuickPerformanceLogger) c00i.get()).isMarkerOn(5505203, true)) {
            Set set = c00171ab.A0L;
            if (set.contains(str)) {
                return;
            }
            set.add(str);
            ((LightweightQuickPerformanceLogger) c00i.get()).markerPoint(5505203, str);
        }
    }

    public static void A03(C00171ab c00171ab, String str) {
        0fH.A09(C00171ab.class, str, "===%s");
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        hashMap.put("pid", String.valueOf(Process.myPid()));
        if (str.equals("doInit")) {
            hashMap.put("persistent_level", (((2yD) c00171ab.A07.get()).AZk(36310817457571021L) ? C1cd.APP_USE : (C1cd) 1Bn.A0A(32825)).name());
        }
        c00171ab.A0H.BZT(MobileConfigManagerParamsHolder.SERVICE_MANAGER_NAME, hashMap);
    }

    public static void A04(C00171ab c00171ab, String str) {
        ((1dW) c00171ab.A0D.get()).A00(str);
        c00171ab.A00();
        C00i c00i = c00171ab.A0B;
        if (((LightweightQuickPerformanceLogger) c00i.get()).isMarkerOn(5505203, true)) {
            ((LightweightQuickPerformanceLogger) c00i.get()).markerEnd(5505203, (short) 2);
        }
        1dC r0 = (1dC) c00171ab.A09.get();
        0fH.A0j("MqttXplatServiceController", "Start mqtt service");
        r0.A01.set(true);
        1dC.A00(r0);
    }

    public static void A05(C00171ab c00171ab, boolean z) {
        if (((C0di) c00171ab.A0A.get()).A05()) {
            A06(c00171ab, z);
        } else {
            0fH.A07(C00171ab.class, Boolean.valueOf(z), "setEnabledIfInAllowedProcess(%b) ignored in non-allowed process");
        }
    }

    public static void A06(C00171ab c00171ab, boolean z) {
        synchronized (c00171ab) {
            Preconditions.checkState(((C0di) c00171ab.A0A.get()).A05());
            0fH.A07(C00171ab.class, Boolean.valueOf(z), "setEnabledForAllowedProcesses(%b)");
            boolean z2 = c00171ab.A02;
            if (z2 != z) {
                c00171ab.A02 = z;
                z2 = z;
            }
            if (z2) {
                c00171ab.A0M = false;
                1Fw.A04((1EZ) 1Bn.A0A(16428));
            }
            if (A07(c00171ab)) {
                A04(c00171ab, "setEnabledForAllowedProcesses");
            } else if (z) {
                A01(c00171ab);
            } else {
                c00171ab.A00();
                ((1dC) c00171ab.A09.get()).A01();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00db, code lost:
    
        if (((X.1Od) r0.get()).A0F() == false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A07(X.C00171ab r301) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C00171ab.A07(X.1ab):boolean");
    }

    public void A08() {
        boolean andSet;
        init();
        final C1d1 c1d1 = (C1d1) this.A0G.get();
        final C00201ae c00201ae = this.A0I;
        synchronized (c1d1) {
            final int i = c1d1.A00 + 1;
            c1d1.A00 = i;
            andSet = c1d1.A03.getAndSet(true);
            0fH.A0f(Integer.valueOf(i), Boolean.valueOf(andSet), "TemporaryMqttClientActiveCallback", "setActive (id = %d, prevState = %b)");
            ScheduledFuture scheduledFuture = c1d1.A01;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledExecutorService scheduledExecutorService = c1d1.A02;
            Runnable runnable = new Runnable() { // from class: X.1d6
                public static final String __redex_internal_original_name = "TemporaryMqttClientActiveCallback$1";

                @Override // java.lang.Runnable
                public void run() {
                    C1d1 c1d12 = c1d1;
                    int i2 = i;
                    final C00201ae c00201ae2 = c00201ae;
                    synchronized (c1d12) {
                        0fH.A0i(Integer.valueOf(i2), "TemporaryMqttClientActiveCallback", "clearActive (id = %d)");
                        if (i2 == c1d12.A00) {
                            c1d12.A03.set(false);
                            c1d12.A01 = null;
                            ((Handler) c00201ae2.A00.A08.get()).post(new Runnable() { // from class: X.4oj
                                public static final String __redex_internal_original_name = "MqttPushServiceManager$2$$ExternalSyntheticLambda0";

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C00201ae c00201ae3 = C00201ae.this;
                                    0fH.A0D(C00171ab.class, "onTemporaryTimeout");
                                    C00171ab c00171ab = c00201ae3.A00;
                                    if (C00171ab.A07(c00171ab)) {
                                        return;
                                    }
                                    C00171ab.A01(c00171ab);
                                }
                            });
                        }
                    }
                }
            };
            c00201ae.A00.A09.get();
            c1d1.A01 = scheduledExecutorService.schedule(runnable, 10, TimeUnit.SECONDS);
        }
        if (andSet) {
            return;
        }
        ((Handler) this.A08.get()).post(new Runnable() { // from class: X.1dK
            public static final String __redex_internal_original_name = "MqttPushServiceManager$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                C00171ab c00171ab = C00171ab.this;
                C00171ab.A03(c00171ab, "startOnDemand");
                if (C00171ab.A07(c00171ab)) {
                    C00171ab.A04(c00171ab, "startOnDemand");
                }
            }
        });
    }

    public String BB2() {
        return "MqttPushServiceManager";
    }

    public void init() {
        synchronized (this) {
            int A03 = 0FI.A03(1540512798);
            if (!this.A03) {
                this.A03 = true;
                Preconditions.checkState(((C0di) this.A0A.get()).A05());
                C00i c00i = this.A08;
                ((Handler) c00i.get()).post(new 1cH(this));
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.facebook.rti.mqtt.intent.ACTION_WAKEUP");
                AnonymousClass023.A02(new C01o(new 3cM(this, 28), "com.facebook.rti.mqtt.intent.ACTION_WAKEUP"), (Context) this.A05.get(), intentFilter, (Handler) c00i.get(), null, false);
                1P9 r0 = new 1P9((1I7) this.A06.get());
                r0.A05(new 3cM(this, 29), "ACTION_MQTT_FORCE_REBIND");
                r0.A05(new 3cM(this, 30), "com.facebook.rti.mqtt.intent.ACTION_WAKEUP");
                r0.A04((Handler) c00i.get());
                r0.A02().A00();
            }
            0FI.A09(-2135534346, A03);
        }
    }

    public void onAppActive() {
        A03(this, "onAppActive");
        A02(this, "appActive");
        this.A0C.set(true);
        if (A07(this)) {
            A04(this, "onAppActive");
        }
    }

    public void onAppPaused() {
    }

    public void onAppStopped() {
        A03(this, "onAppStopped");
        this.A0C.set(false);
        if (A07(this)) {
            return;
        }
        A01(this);
    }

    public void onDeviceActive() {
        A03(this, "onDeviceActive");
        if (A07(this)) {
            A04(this, "onDeviceActive");
        }
    }

    public void onDeviceStopped() {
        A03(this, "onDeviceStopped");
        if (A07(this)) {
            return;
        }
        A01(this);
    }
}
