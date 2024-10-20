package com.facebook.common.hiddenapis2;

import X.07L;
import X.0Lc;
import X.0fH;
import X.C0il;
import android.os.Build;
import dalvik.system.VMRuntime;
import java.lang.reflect.Method;

/* loaded from: ApiExemption.class */
public class ApiExemption {
    public static final String[] EXEMPTIONS;
    public static volatile boolean sCalled;
    public static volatile boolean sResult;
    public static volatile boolean sUseUnsafeExemption;

    static {
        String[] strArr = new String[36];
        System.arraycopy(new String[]{"Landroid/app/ActivityThread", "Landroid/app/ActivityTaskManager", "Landroid/net/ConnectivityManager", "Landroid/location/LocationManager", "Landroid/os/storage/StorageManager", "Landroid/app/usage/StorageStatsManager", "Landroid/accounts/AccountManager", "Landroid/content/ClipboardManager", "Landroid/media/AudioManager", "Landroid/os/BatteryManager", "Landroid/app/JobSchedulerImpl", "Landroid/media/session/MediaSessionManager", "Landroid/app/ActivityClient", "Landroid/app/IActivityClientController", "Landroid/util/BoostFramework", "Lcom/mediatek/perfservice/", "Lcom/mediatek/powerhalmgr/", "Lcom/samsung/android/os/SemPerfManager", "Landroid/os/InputConstants", "Landroid/os/perfdebug/", "Landroid/os/Looper", "Landroid/os/Message", "Landroid/os/ILooper", "Landroid/app/QueuedWork", "Landroid/os/Binder", "Landroid/webkit/WebViewFactory", "Lcom/android/webview/chromium/WebViewChromiumFactoryProvider"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"Landroid/view/WindowManagerImpl", "Ldalvik/system/VMDebug", "Landroid/app/Activity", "Landroid/view/contentcapture/ContentCaptureManager", "Landroid/view/contentcapture/MainContentCaptureSession", "Landroid/app/OplusActivityManager", "Landroid/app/IOplusActivityManager", "Ldalvik/system/BaseDexClassLoader", "Landroid/app/Dialog"}, 0, strArr, 27, 9);
        EXEMPTIONS = strArr;
    }

    public static void enableUnsafeExemption() {
        synchronized (ApiExemption.class) {
            if (!sUseUnsafeExemption && !sResult) {
                sUseUnsafeExemption = true;
                if (sCalled) {
                    sCalled = false;
                }
            }
        }
    }

    public static native int nativeSetHiddenApiExemptions(int i, String[] strArr);

    public static boolean removeRestriction_DO_NOT_USE() {
        boolean z;
        boolean z2;
        synchronized (ApiExemption.class) {
            if (sCalled) {
                z2 = sResult;
            } else {
                int i = Build.VERSION.SDK_INT;
                if (i <= 29) {
                    String[] strArr = EXEMPTIONS;
                    try {
                        Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(VMRuntime.class, "setHiddenApiExemptions", new Class[]{String[].class});
                        if (method != null) {
                            method.invoke(VMRuntime.getRuntime(), strArr);
                            z = true;
                        }
                    } catch (Throwable th) {
                        0fH.A0r("ApiExemption", "Enable api exemption failed:", th);
                    }
                    z = false;
                } else {
                    if (i <= 35) {
                        String[] strArr2 = EXEMPTIONS;
                        z = false;
                        try {
                            C0il.A0B("hiddenapis2");
                            if (nativeSetHiddenApiExemptions(i, strArr2) == 1) {
                                z = true;
                            }
                        } catch (Throwable unused) {
                        }
                        if (!z && sUseUnsafeExemption) {
                            z = new 0Lc().A00();
                        }
                    }
                    z = false;
                }
                sResult = z;
                sCalled = true;
                07L.A00 = sResult;
                z2 = sResult;
            }
        }
        return z2;
    }
}
