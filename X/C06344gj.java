package X;

import android.app.ActivityManager;
import android.app.IActivityManager;
import android.os.IBinder;
import java.lang.reflect.Method;

/* renamed from: X.4gj, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4gj.class */
public final class C06344gj {
    public static final C06344gj A01 = new C06344gj();
    public final IActivityManager A00;

    public C06344gj() {
        IActivityManager iActivityManager = null;
        try {
            Method declaredMethod = ActivityManager.class.getDeclaredMethod("getService", new Class[0]);
            declaredMethod.setAccessible(true);
            iActivityManager = (IActivityManager) declaredMethod.invoke(null, new Object[0]);
        } catch (Throwable unused) {
        }
        this.A00 = iActivityManager;
    }

    public void A00(IBinder.DeathRecipient deathRecipient) {
        IActivityManager iActivityManager = this.A00;
        if (iActivityManager != null) {
            try {
                IBinder asBinder = iActivityManager.asBinder();
                if (asBinder != null) {
                    asBinder.linkToDeath(deathRecipient, 0);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
