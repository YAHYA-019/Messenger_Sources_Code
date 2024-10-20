package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2B7, reason: invalid class name */
/* loaded from: 2B7.class */
public final class C2B7 {
    public static final Object A01 = new Object();
    public static volatile C2B7 A02;
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public static C2B7 A00() {
        if (A02 == null) {
            synchronized (A01) {
                if (A02 == null) {
                    A02 = new C2B7();
                }
            }
        }
        C2B7 c2b7 = A02;
        AbstractC00481b7.A02(c2b7);
        return c2b7;
    }

    public static final boolean A01(Context context, Intent intent, ServiceConnection serviceConnection, C2B7 c2b7, String str, int i) {
        boolean bindService;
        ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                if ((C26H.A00(context).A00.getPackageManager().getApplicationInfo(component.getPackageName(), 0).flags & 2097152) != 0) {
                    android.util.Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof 2Bn) {
            bindService = context.bindService(intent, serviceConnection, i);
        } else {
            ConcurrentHashMap concurrentHashMap = c2b7.A00;
            Object putIfAbsent = concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
            if (putIfAbsent != null && serviceConnection != putIfAbsent) {
                android.util.Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                bindService = context.bindService(intent, serviceConnection, i);
                if (!bindService) {
                    concurrentHashMap.remove(serviceConnection, serviceConnection);
                    return false;
                }
            } catch (Throwable th) {
                concurrentHashMap.remove(serviceConnection, serviceConnection);
                throw th;
            }
        }
        return bindService;
    }

    public void A02(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof 2Bn)) {
            ConcurrentHashMap concurrentHashMap = this.A00;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public boolean A03(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return A01(context, intent, serviceConnection, this, context.getClass().getName(), i);
    }
}
