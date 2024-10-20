package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.WorkSource;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: L7p.class */
public final class L7p {
    public static ScheduledExecutorService A0A;
    public int A00;
    public WorkSource A01;
    public AtomicInteger A02;
    public boolean A03;
    public final Context A04;
    public final PowerManager.WakeLock A05;
    public final Object A06;
    public final String A07;
    public final java.util.Map A08;
    public final Set A09;

    /* JADX WARN: Type inference failed for: r0v51, types: [X.MCu, java.lang.Object] */
    public L7p(Context context) {
        Object[] objArr;
        String packageName = context.getPackageName();
        WorkSource workSource = null;
        this.A06 = this;
        this.A03 = true;
        this.A08 = AnonymousClass001.A0u();
        this.A09 = Collections.synchronizedSet(AnonymousClass001.A0v());
        this.A02 = GOn.A1K(0);
        AbstractC00481b7.A06("Analytics WakeLock", "WakeLock: wakeLockName must not be empty");
        Context applicationContext = context.getApplicationContext();
        this.A04 = applicationContext;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.A07 = "Analytics WakeLock";
        } else {
            this.A07 = JQy.A0s("*gcore*:", "Analytics WakeLock");
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "Analytics WakeLock");
        0Ew.A02(newWakeLock, "Analytics WakeLock");
        this.A05 = newWakeLock;
        if (L7I.A00(context)) {
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfo = C26H.A00(context).A00.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        JQx.A1P("Could not get applicationInfo from package: ", packageName, "WorkSourceUtil");
                    } else {
                        int i = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method = L7I.A02;
                        try {
                            if (method != null) {
                                objArr = new Object[]{Integer.valueOf(i), packageName};
                            } else {
                                method = L7I.A01;
                                objArr = method != null ? new Object[]{Integer.valueOf(i)} : objArr;
                            }
                            method.invoke(workSource, objArr);
                        } catch (Exception e) {
                            android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    JQx.A1P("Could not find package: ", packageName, "WorkSourceUtil");
                }
            }
            this.A01 = workSource;
            if (workSource != null && L7I.A00(applicationContext)) {
                WorkSource workSource2 = this.A01;
                if (workSource2 != null) {
                    workSource2.add(workSource);
                } else {
                    this.A01 = workSource;
                }
                try {
                    newWakeLock.setWorkSource(this.A01);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused2) {
                    android.util.Log.wtf("WakeLock", newWakeLock.toString());
                }
            }
        }
        if (A0A == null) {
            synchronized (Kat.class) {
                if (Kat.A00 == null) {
                    Kat.A00 = new Object();
                }
            }
            A0A = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
        }
    }

    public static final void A00(L7p l7p) {
        Method method;
        WorkSource workSource = l7p.A01;
        Boolean bool = L7I.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        if (workSource == null || (method = L7I.A03) == null) {
            return;
        }
        try {
            Object A0S = AnonymousClass001.A0S(workSource, method);
            AbstractC00481b7.A02(A0S);
            int A09 = GOn.A09(A0S);
            if (A09 != 0) {
                for (int i = 0; i < A09; i++) {
                    Method method2 = L7I.A04;
                    if (method2 != null) {
                        try {
                            String str = (String) method2.invoke(workSource, Integer.valueOf(i));
                            if (str != null && !str.trim().isEmpty()) {
                                A0s.add(str);
                            }
                        } catch (Exception e) {
                            android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
        }
    }

    public static final void A01(L7p l7p) {
        PowerManager.WakeLock wakeLock = l7p.A05;
        if (wakeLock.isHeld()) {
            try {
                0Iz.A01(wakeLock);
            } catch (RuntimeException e) {
                if (!e.getClass().equals(RuntimeException.class)) {
                    throw e;
                }
                android.util.Log.e("WakeLock", String.valueOf(l7p.A07).concat(" was already released!"), e);
            }
            wakeLock.isHeld();
        }
    }
}
