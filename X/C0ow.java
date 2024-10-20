package X;

import android.content.Context;
import com.facebook.common.lyra.LyraManager;

/* renamed from: X.0ow, reason: invalid class name */
/* loaded from: 0ow.class */
public final class C0ow implements C0ha {
    @Override // X.C0ha
    public Integer Ayi() {
        return 0S2.A0S;
    }

    @Override // X.C0ha
    public Integer BKe() {
        return 0S2.A0C;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [X.0dF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [X.0dF, java.lang.Object] */
    @Override // X.C0ha
    public void BOm(C0hg c0hg) {
        int i;
        0T9.A02("Lyra.init", 883386750);
        try {
            Context applicationContext = c0hg.A0K.getApplicationContext();
            if (LyraManager.initialized.compareAndSet(false, true)) {
                System.getProperty("fb.running_e2e");
                ?? obj = new Object();
                ((0dF) obj).A00 = applicationContext;
                boolean z = true;
                if (C0k2.A00(obj, "android_crash_lyra_hook_cxa_throw", 1) != 1) {
                    z = false;
                }
                ?? obj2 = new Object();
                ((0dF) obj2).A00 = applicationContext;
                boolean z2 = true;
                if (C0k2.A00(obj2, "android_crash_lyra_enable_backtraces", 1) != 1) {
                    z2 = false;
                }
                if (z) {
                    try {
                        if (!LyraManager.nativeInstallLyraHook(z2)) {
                            0fH.A0k("LyraManager", "Installing lyra hook failed.");
                        }
                    } catch (Exception e) {
                        0fH.A0r("LyraManager", "Exception thrown during installing Lyra hook", e);
                    }
                }
            }
            0fH.A0j("lacrima", "Lyra installed successfully");
            i = -1017651932;
        } catch (Throwable th) {
            try {
                0G9.A01(C0iy.A02("lacrima", "Unable to install Lyra", th), 0S2.A0S, th);
                i = 185939245;
            } catch (Throwable th2) {
                0T9.A00(566502493);
                throw th2;
            }
        }
        0T9.A00(i);
    }
}
