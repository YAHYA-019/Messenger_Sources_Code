package com.facebook.common.network;

import X.0BR;
import X.0BS;
import X.0Pz;
import X.0fH;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Bn;
import X.1CO;
import X.1HH;
import X.1Hv;
import X.1JF;
import X.1Uo;
import X.1Up;
import X.1Ut;
import X.5GV;
import X.C00i;
import X.C0dr;
import X.C1Ur;
import X.C41t;
import X.Lke;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import com.facebook.inject.FbInjector;
import com.google.common.base.Absent;
import com.google.common.base.Optional;
import com.google.common.base.Present;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: FbNetworkManager.class */
public final class FbNetworkManager implements 1Uo {
    public long A00;
    public NetworkInfo A01;
    public ActivityLifecycleListener A02;
    public Boolean A03;
    public Boolean A04;
    public String A05;
    public String A06;
    public String A07;
    public long A08;
    public final 1Up A09;
    public final C00i A0A;
    public final C00i A0B;
    public final C00i A0C;
    public final C00i A0D;
    public final C00i A0E;
    public final C00i A0F;
    public final C00i A0G;
    public final C00i A0H;
    public final C00i A0I;
    public final C00i A0J;
    public final C00i A0K;
    public final C00i A0L;
    public final Object A0M;
    public final Object A0N;
    public final Object A0O;
    public final Context A0P;
    public final C00i A0Q;
    public final C00i A0R;
    public final C00i A0S;
    public final Object A0T;
    public final AtomicInteger A0U;
    public final AtomicInteger A0V;
    public volatile long A0W;
    public volatile long A0X;
    public volatile 5GV A0Y;
    public volatile String A0Z;
    public volatile boolean A0a;
    public volatile Boolean A0b;
    public volatile boolean A0c;

    /* loaded from: FbNetworkManager$ActivityLifecycleListener.class */
    public final class ActivityLifecycleListener implements Application.ActivityLifecycleCallbacks {
        public ActivityLifecycleListener() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            1BK.A1E(FbNetworkManager.this.A0E).execute(new Lke(this));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public FbNetworkManager() {
        Context A00 = FbInjector.A00();
        this.A0P = A00;
        this.A0I = new 1HH(A00, 100179);
        this.A0J = new 1HH(A00, 100178);
        this.A0L = new 1HH(A00, 100180);
        this.A0S = new 1BQ(131106);
        this.A0C = new 1BQ(84488);
        this.A0G = new 1HH(A00, 65729);
        this.A0H = new 1HH(A00, 65728);
        this.A0R = new 1BQ(16511);
        this.A0D = FbInjector.A00;
        this.A0Q = new 1BQ(16692);
        this.A0T = new Object();
        this.A0E = new 1BQ(16449);
        this.A0A = new 1BQ(33136);
        this.A0K = new 1BQ(16458);
        this.A0B = new 1BV(16454);
        this.A0F = new 1BV(16463);
        this.A08 = Long.MIN_VALUE;
        this.A0V = new AtomicInteger(0);
        this.A0U = new AtomicInteger(0);
        this.A0M = new Object();
        this.A00 = 0L;
        this.A0N = new Object();
        this.A0O = new Object();
        this.A09 = new 1Up(10);
    }

    private NetworkInfo A00() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) 1Hv.A02((Context) 1Bn.A0A(83719), 100170);
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            this.A0V.incrementAndGet();
            return activeNetworkInfo;
        } catch (SecurityException e) {
            A06(e);
            return null;
        } catch (RuntimeException e2) {
            0fH.A0u("FbNetworkManager", "getConnectivityManagerNetworkInfo caught Exception", e2);
            return null;
        }
    }

    public static NetworkInfo A01(FbNetworkManager fbNetworkManager, Long l, boolean z) {
        if (fbNetworkManager.A0c) {
            return null;
        }
        if (z) {
            return A02(fbNetworkManager, true);
        }
        long longValue = l != null ? l.longValue() : C1Ur.A00((1CO) 1Bi.A03(16385), 300, 36592451347219205L) * 1000;
        synchronized (fbNetworkManager.A0M) {
            long now = ((C0dr) fbNetworkManager.A0C.get()).now();
            boolean z2 = false;
            if (now - fbNetworkManager.A00 > longValue) {
                z2 = true;
            }
            NetworkInfo networkInfo = fbNetworkManager.A01;
            if (z2) {
                fbNetworkManager.A00 = now;
                ((ExecutorService) fbNetworkManager.A0E.get()).execute(new 1Ut(fbNetworkManager));
            } else if (networkInfo == null) {
                NetworkInfo A00 = fbNetworkManager.A00();
                A04(A00, fbNetworkManager);
                return A00;
            }
            return networkInfo;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0106, code lost:
    
        if (r0.getType() == r0.getType()) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.net.NetworkInfo A02(com.facebook.common.network.FbNetworkManager r301, boolean r302) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.network.FbNetworkManager.A02(com.facebook.common.network.FbNetworkManager, boolean):android.net.NetworkInfo");
    }

    public static String A03(FbNetworkManager fbNetworkManager) {
        ConnectivityManager connectivityManager;
        fbNetworkManager.A0Q.get();
        String str = "unknown";
        try {
            connectivityManager = (ConnectivityManager) 1Hv.A02((Context) 1Bn.A0A(83719), 100170);
        } catch (Exception unused) {
        }
        if (connectivityManager != null && !connectivityManager.isActiveNetworkMetered()) {
            return "unmetered";
        }
        int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
        if (restrictBackgroundStatus == 1) {
            return "disabled";
        }
        if (restrictBackgroundStatus == 2) {
            return "whitelisted";
        }
        if (restrictBackgroundStatus == 3) {
            str = "enabled";
        }
        return str;
    }

    public static void A04(NetworkInfo networkInfo, FbNetworkManager fbNetworkManager) {
        Object obj = fbNetworkManager.A0M;
        synchronized (obj) {
            fbNetworkManager.A01 = networkInfo;
            C00i c00i = fbNetworkManager.A0D;
            boolean z = c00i.get() instanceof Application;
            Object obj2 = c00i.get();
            if (!z) {
                if (((Context) obj2).getApplicationContext() instanceof Application) {
                    obj2 = 1BK.A04(c00i).getApplicationContext();
                }
                obj.notifyAll();
            }
            Application application = (Application) obj2;
            if (application != null && networkInfo != null) {
                boolean z2 = false;
                if (networkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) {
                    z2 = true;
                }
                if (z2) {
                    if (fbNetworkManager.A02 == null) {
                        0fH.A0j("FbNetworkManager", "Registered activity lifecycle callback");
                        ActivityLifecycleListener activityLifecycleListener = new ActivityLifecycleListener();
                        fbNetworkManager.A02 = activityLifecycleListener;
                        application.registerActivityLifecycleCallbacks(activityLifecycleListener);
                    }
                } else if (fbNetworkManager.A02 != null) {
                    0fH.A0j("FbNetworkManager", "Unregistered activity lifecycle callback");
                    application.unregisterActivityLifecycleCallbacks(fbNetworkManager.A02);
                    fbNetworkManager.A02 = null;
                }
            }
            obj.notifyAll();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r0.isConnected() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A05(com.facebook.common.network.FbNetworkManager r301) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.network.FbNetworkManager.A05(com.facebook.common.network.FbNetworkManager):void");
    }

    private void A06(SecurityException securityException) {
        int incrementAndGet = this.A0U.incrementAndGet();
        if (incrementAndGet % 64 == 1) {
            0BS A01 = 0BR.A01("FbNetworkManager", 0Pz.A0C(this.A0V.get(), incrementAndGet, "success: ", " failures: "));
            A01.A04 = securityException;
            A01.A05 = true;
            1BK.A09(this.A0R).D0u(new 0BR(A01));
        }
    }

    private boolean A07() {
        try {
            return ((ConnectivityManager) 1Hv.A02((Context) 1Bn.A0A(83719), 100170)).isActiveNetworkMetered();
        } catch (SecurityException e) {
            A06(e);
            return true;
        } catch (RuntimeException e2) {
            0fH.A0u("FbNetworkManager", "isActiveNetworkMeteredSync caught Exception", e2);
            return true;
        }
    }

    public int A08() {
        WifiInfo A01 = ((C41t) this.A0S.get()).A01("FbNetworkManager");
        return A01 != null ? A01.getRssi() : (-1) << (-1);
    }

    public long A09() {
        String str;
        int i;
        int i2;
        NetworkInfo A01 = A01(this, null, false);
        WifiInfo A012 = ((C41t) this.A0S.get()).A01("FbNetworkManager");
        NetworkInfo.State state = NetworkInfo.State.DISCONNECTED;
        str = "";
        if (A01 != null) {
            str = A012 != null ? A012.getSSID() : "";
            i = A01.getType();
            i2 = A01.getSubtype();
            state = A01.getState();
            0fH.A0f(A01.getSubtypeName(), A01.getState().toString(), "FbNetworkManager", A01.getTypeName());
        } else {
            i = 0;
            i2 = 0;
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), state, str});
    }

    public NetworkInfo A0A() {
        NetworkInfo A01 = A01(this, null, false);
        if (A01 == null || !A01.isConnected()) {
            A01 = null;
        }
        return A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0.isConnected() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.net.wifi.WifiInfo A0B() {
        /*
            r301 = this;
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = 0
            r2 = 0
            android.net.NetworkInfo r0 = A01(r0, r1, r2)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L18
            r0 = r303
            boolean r0 = r0.isConnected()
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L1c
        L18:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L1c:
            r0 = r302
            if (r0 == 0) goto L3f
            r0 = r301
            X.00i r0 = r0.A0S     // Catch: java.lang.Exception -> L3e
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L3e
            r305 = r0
            r0 = r305
            X.41t r0 = (X.C41t) r0     // Catch: java.lang.Exception -> L3e
            r305 = r0
            java.lang.String r0 = "FbNetworkManager"
            r303 = r0
            r0 = r305
            r1 = r303
            android.net.wifi.WifiInfo r0 = r0.A01(r1)     // Catch: java.lang.Exception -> L3e
            return r0
        L3e:
        L3f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.network.FbNetworkManager.A0B():android.net.wifi.WifiInfo");
    }

    public Optional A0C() {
        Absent absent;
        synchronized (this.A0T) {
            if (this.A08 == Long.MIN_VALUE) {
                absent = Absent.INSTANCE;
            } else {
                Long valueOf = Long.valueOf(((C0dr) this.A0C.get()).now() - this.A08);
                valueOf.getClass();
                new Present(valueOf);
            }
        }
        return absent;
    }

    public String A0D() {
        synchronized (this.A0M) {
            NetworkInfo A0A = A0A();
            if (A0A != null) {
                NetworkInfo.State state = A0A.getState();
                if (state != NetworkInfo.State.DISCONNECTED && state != NetworkInfo.State.DISCONNECTING) {
                    int type = A0A.getType();
                    if (type == 0) {
                        return 0Pz.A0j(A0A.getSubtypeName(), "/", ((TelephonyManager) this.A0J.get()).getNetworkOperatorName());
                    }
                    if (type != 1) {
                        return 0Pz.A0j(A0A.getTypeName(), "/", A0A.getSubtypeName());
                    }
                    WifiInfo A0B = A0B();
                    if (A0B != null) {
                        return 0Pz.A0W("WIFI/", A0B.getSSID());
                    }
                    return 0Pz.A0j(A0A.getTypeName(), "/", A0A.getSubtypeName());
                }
            }
            return null;
        }
    }

    public String A0E() {
        String str;
        synchronized (this.A0M) {
            str = this.A05;
            if (str == null) {
                str = 0Pz.A0j(A0H(), "-", A0G());
                this.A05 = str;
            }
        }
        return str;
    }

    public String A0F() {
        NetworkInfo A0A = A0A();
        return A0A != null ? 0Pz.A0j(A0A.getTypeName(), "_", A0A.getSubtypeName()) : "disconnected";
    }

    public String A0G() {
        String str;
        synchronized (this.A0M) {
            str = this.A06;
            if (str == null) {
                NetworkInfo A0A = A0A();
                str = (A0A == null || 1JF.A0B(A0A.getSubtypeName())) ? "none" : A0A.getSubtypeName().toLowerCase(Locale.US);
                this.A06 = str;
            }
        }
        return str;
    }

    public String A0H() {
        String str;
        synchronized (this.A0M) {
            str = this.A07;
            if (str == null) {
                NetworkInfo A0A = A0A();
                str = (A0A == null || 1JF.A0B(A0A.getTypeName())) ? "none" : A0A.getTypeName().toLowerCase(Locale.US);
                this.A07 = str;
            }
        }
        return str;
    }

    public String A0I() {
        NetworkInfo.DetailedState detailedState;
        NetworkInfo A0A = A0A();
        String name = (A0A == null || (detailedState = A0A.getDetailedState()) == null) ? null : detailedState.name();
        if (1JF.A0B(name)) {
            name = "none";
        }
        return name;
    }

    public void A0J(long j) {
        C00i c00i = this.A0C;
        long A09 = 1BL.A09(c00i) + j;
        Object obj = this.A0M;
        synchronized (obj) {
            for (long A092 = A09 - 1BL.A09(c00i); A092 > 0; A092 = A09 - 1BL.A09(c00i)) {
                NetworkInfo A01 = A01(this, null, false);
                if (A01 != null && A01.isConnected()) {
                    break;
                }
                obj.wait(A092);
            }
        }
    }

    public boolean A0K() {
        NetworkInfo A0A = A0A();
        boolean z = false;
        if (A0A != null && A0A.getType() == 1) {
            z = true;
        }
        return z;
    }

    public boolean A0L() {
        Boolean valueOf;
        if (this.A0b != null) {
            valueOf = this.A0b;
        } else {
            valueOf = Boolean.valueOf(A07());
            this.A0b = valueOf;
        }
        return valueOf.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0.isConnected() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0M() {
        /*
            r301 = this;
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r301
            r1 = 0
            r2 = 0
            android.net.NetworkInfo r0 = A01(r0, r1, r2)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L1a
            r0 = r304
            boolean r0 = r0.isConnected()
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L1e
        L1a:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L1e:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.network.FbNetworkManager.A0M():boolean");
    }

    public boolean A0N() {
        NetworkInfo A0A = A0A();
        boolean z = false;
        if (A0A != null && A0A.getType() == 0) {
            z = true;
        }
        return z;
    }

    public boolean A0O() {
        NetworkInfo A0A = A0A();
        if (A0A == null) {
            return false;
        }
        int type = A0A.getType();
        int subtype = A0A.getSubtype();
        if (type == 1 || type != 0) {
            return false;
        }
        return subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0.isConnected() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0P() {
        /*
            r301 = this;
            r0 = 1
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r301
            r1 = 0
            r2 = r302
            android.net.NetworkInfo r0 = A01(r0, r1, r2)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L1a
            r0 = r304
            boolean r0 = r0.isConnected()
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L1e
        L1a:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L1e:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.network.FbNetworkManager.A0P():boolean");
    }

    public boolean A0Q() {
        boolean booleanValue;
        synchronized (this.A0N) {
            Boolean bool = this.A03;
            if (bool == null) {
                bool = Boolean.valueOf(((PowerManager) this.A0I.get()).isDeviceIdleMode());
                this.A03 = bool;
            }
            booleanValue = bool.booleanValue();
        }
        return booleanValue;
    }

    public boolean A0R() {
        boolean booleanValue;
        synchronized (this.A0O) {
            Boolean bool = this.A04;
            if (bool == null) {
                bool = Boolean.valueOf(((PowerManager) this.A0I.get()).isPowerSaveMode());
                this.A04 = bool;
            }
            booleanValue = bool.booleanValue();
        }
        return booleanValue;
    }

    public List Ak4() {
        return this.A09.A03();
    }

    public void enterLameDuckMode() {
        this.A0c = true;
        A05(this);
    }

    public void exitLameDuckMode() {
        this.A0c = false;
        A05(this);
    }
}
