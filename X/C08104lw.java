package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4lw, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4lw.class */
public final class C08104lw implements 1Xc {
    public Context A00;
    public ScheduledFuture A01;
    public Integer A02;
    public Integer A03;
    public ScheduledFuture A04;
    public ScheduledFuture A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08;
    public final C00i A0C;
    public final Runnable A0D;
    public final 1I7 A0F;
    public final C00i A0G;
    public final Runnable A0H;
    public final Runnable A0I;
    public final ScheduledExecutorService A0E = (ScheduledExecutorService) 1Bn.A0A(67235);
    public final Set A0J = 1Bi.A06(ActionId.RTMP_PACKET_RECEIVED);
    public final C00i A0B = new 1BQ(99390);
    public final 1Od A09 = (1Od) 1Bi.A03(16616);
    public final C08124ly A0A = (C08124ly) 1Bi.A03(49232);

    public C08104lw() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A0F = (1I7) 1Hv.A02(A00, 65728);
        this.A08 = (Handler) 1Bi.A03(32826);
        this.A0C = new 1BQ(49233);
        this.A0G = new 1BQ(16385);
        Integer num = 0S2.A0C;
        this.A02 = num;
        this.A03 = num;
        this.A07 = false;
        this.A0H = new AbstractRunnableC00191ad() { // from class: X.4m3
            public static final String __redex_internal_original_name = "MqttClientStateManager$1";

            {
                super("MqttClientStateManager", "appStopped");
            }

            @Override // java.lang.Runnable
            public void run() {
                C08104lw.A02(C08104lw.this, getRunnableName());
            }
        };
        this.A0I = new AbstractRunnableC00191ad() { // from class: X.4m4
            public static final String __redex_internal_original_name = "MqttClientStateManager$2";

            {
                super("MqttClientStateManager", "deviceStopped");
            }

            @Override // java.lang.Runnable
            public void run() {
                C08104lw.A02(C08104lw.this, getRunnableName());
            }
        };
        this.A0D = new AbstractRunnableC00191ad() { // from class: X.4m5
            public static final String __redex_internal_original_name = "MqttClientStateManager$3";

            {
                super("MqttClientStateManager", "appStateCheck");
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
            
                if (r0 <= 0) goto L20;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 296
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C4m5.run():void");
            }
        };
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ACTIVE";
            case 1:
                return "PAUSED";
            default:
                return GOm.A00(45);
        }
    }

    private HashSet A01() {
        HashSet hashSet = new HashSet(this.A0J);
        FbUserSession A04 = ((1Fv) 1Bi.A03(66351)).A04();
        Integer num = 1Lo.A05;
        hashSet.addAll(1Lo.A0B(FbInjector.A00(), A04, (1BY) null, 313));
        return hashSet;
    }

    public static void A02(C08104lw c08104lw, String str) {
        Integer num = c08104lw.A02;
        Integer num2 = c08104lw.A03;
        1Od r0 = c08104lw.A09;
        c08104lw.A02 = r0.A0G() ? 0S2.A00 : r0.A06() < 120000 ? 0S2.A01 : 0S2.A0C;
        long now = ((C0dp) c08104lw.A0B.get()).now();
        C08124ly c08124ly = c08104lw.A0A;
        Integer num3 = c08124ly.A02.A03() ? 0S2.A00 : now - c08124ly.A05 < 120000 ? 0S2.A01 : 0S2.A0C;
        c08104lw.A03 = num3;
        StringBuilder sb = new StringBuilder();
        sb.append(A00(c08104lw.A02));
        sb.append(" ");
        sb.append(A00(num));
        sb.append(" ");
        sb.append(A00(num3));
        sb.append(" ");
        sb.append(A00(num2));
        sb.append(" ");
        sb.append(c08104lw.A04);
        0fH.A0g(sb, "MqttClientStateManager", "updateState %s");
        if ("com.facebook.common.appstate.AppStateManager.USER_ENTERED_APP".equals(str)) {
            Integer num4 = c08104lw.A02;
            Integer num5 = 0S2.A00;
            if (num4 != num5) {
                c08104lw.A02 = num5;
            }
        }
        Integer num6 = c08104lw.A02;
        Integer num7 = 0S2.A00;
        if (num6 == num7) {
            c08104lw.A03 = num7;
        }
        Integer num8 = c08104lw.A03;
        Integer num9 = 0S2.A0C;
        if (num8 == num9) {
            c08104lw.A02 = num9;
            num6 = num9;
        }
        boolean z = false;
        if (num6 != num) {
            z = true;
        }
        boolean z2 = false;
        if (num8 != num2) {
            z2 = true;
        }
        if (!z && !z2) {
            if (c08104lw.A07) {
                return;
            } else {
                z2 = true;
            }
        }
        c08104lw.A07 = true;
        if (num8 == num7 && z2) {
            ScheduledFuture scheduledFuture = c08104lw.A05;
            if (scheduledFuture != null) {
                try {
                    scheduledFuture.cancel(false);
                } catch (NullPointerException unused) {
                } catch (Throwable th) {
                    c08104lw.A05 = null;
                    throw th;
                }
                c08104lw.A05 = null;
            }
            0fH.A0j("MqttClientStateManager", "trigger onDeviceActive");
            Iterator it = c08104lw.A01().iterator();
            while (it.hasNext()) {
                ((1Xa) it.next()).onDeviceActive();
            }
        }
        if (c08104lw.A02 == num7 && z) {
            ScheduledFuture scheduledFuture2 = c08104lw.A04;
            if (scheduledFuture2 != null) {
                try {
                    scheduledFuture2.cancel(false);
                } catch (NullPointerException unused2) {
                } catch (Throwable th2) {
                    c08104lw.A04 = null;
                    throw th2;
                }
                c08104lw.A04 = null;
            }
            0fH.A0j("MqttClientStateManager", "trigger onAppActive");
            Iterator it2 = c08104lw.A01().iterator();
            while (it2.hasNext()) {
                ((1Xa) it2.next()).onAppActive();
            }
        }
        Integer num10 = c08104lw.A02;
        Integer num11 = 0S2.A01;
        if (num10 == num11 && z) {
            if (c08104lw.A04 == null) {
                try {
                    c08104lw.A04 = c08104lw.A0E.schedule(c08104lw.A0H, 120000L, TimeUnit.MILLISECONDS);
                } catch (NullPointerException unused3) {
                }
            }
            0fH.A0j("MqttClientStateManager", "trigger onAppPaused");
            Iterator it3 = c08104lw.A01().iterator();
            while (it3.hasNext()) {
                ((1Xa) it3.next()).onAppPaused();
            }
        }
        if (c08104lw.A03 == num11 && z2 && c08104lw.A05 == null) {
            try {
                c08104lw.A05 = c08104lw.A0E.schedule(c08104lw.A0I, 120000L, TimeUnit.MILLISECONDS);
            } catch (NullPointerException unused4) {
            }
        }
        if (c08104lw.A02 == num9 && z) {
            c08104lw.A04 = null;
            0fH.A0j("MqttClientStateManager", "trigger onAppStopped");
            Iterator it4 = c08104lw.A01().iterator();
            while (it4.hasNext()) {
                ((1Xa) it4.next()).onAppStopped();
            }
        }
        if (c08104lw.A03 == num9 && z2) {
            c08104lw.A05 = null;
            0fH.A0j("MqttClientStateManager", "trigger onDeviceStopped");
            Iterator it5 = c08104lw.A01().iterator();
            while (it5.hasNext()) {
                ((1Xa) it5.next()).onDeviceStopped();
            }
        }
    }

    public String BB2() {
        return "MqttClientStateManager";
    }

    public void init() {
        int i;
        synchronized (this) {
            int A03 = 0FI.A03(-2067109336);
            if (this.A06) {
                i = 546601552;
            } else {
                this.A06 = true;
                1P9 r0 = new 1P9(this.A0F);
                ImmutableSet A02 = ImmutableSet.A02(C08124ly.A06, C08124ly.A07);
                ImmutableSet A022 = ImmutableSet.A02("com.facebook.common.appstate.AppStateManager.USER_ENTERED_APP", "com.facebook.common.appstate.AppStateManager.USER_LEFT_APP");
                D0R d0r = new D0R(this, 18);
                1Du it = A02.iterator();
                while (it.hasNext()) {
                    r0.A05(d0r, (String) it.next());
                }
                1Du it2 = A022.iterator();
                while (it2.hasNext()) {
                    r0.A05(d0r, (String) it2.next());
                }
                Handler handler = this.A08;
                r0.A04(handler);
                r0.A02().A00();
                handler.post(new Runnable() { // from class: X.4m6
                    public static final String __redex_internal_original_name = "MqttClientStateManager$6";

                    @Override // java.lang.Runnable
                    public void run() {
                        C08104lw.A02(C08104lw.this, "init");
                    }
                });
                if (((1CO) this.A0G.get()).AZk(36315005049643378L)) {
                    ((C08134lz) this.A0C.get()).A00(handler, new C3Vy(this, 2));
                }
                i = 444762810;
            }
            0FI.A09(i, A03);
        }
    }
}
