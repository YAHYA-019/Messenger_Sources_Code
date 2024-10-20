package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.location.foreground.ForegroundLocationFrameworkController;
import com.facebook.location.providers.FbLocationStatusMonitor;

/* loaded from: Lkq.class */
public final class Lkq implements Runnable {
    public static final String __redex_internal_original_name = "ForegroundLocationFrameworkController$onUserEnteredApp$1";
    public final /* synthetic */ ForegroundLocationFrameworkController A00;

    public Lkq(ForegroundLocationFrameworkController foregroundLocationFrameworkController) {
        this.A00 = foregroundLocationFrameworkController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ForegroundLocationFrameworkController foregroundLocationFrameworkController = this.A00;
        Context A0A = 7zM.A0A();
        synchronized (foregroundLocationFrameworkController) {
            if (!foregroundLocationFrameworkController.A08) {
                foregroundLocationFrameworkController.A08 = true;
                foregroundLocationFrameworkController.A06 = false;
                foregroundLocationFrameworkController.A07 = false;
                foregroundLocationFrameworkController.A01 = 0L;
                C00i c00i = foregroundLocationFrameworkController.A0M.A00;
                foregroundLocationFrameworkController.A00 = GOq.A0I(c00i);
                1Br.A0C(foregroundLocationFrameworkController.A0R);
                foregroundLocationFrameworkController.A05 = String.valueOf(0Mt.A00());
                long max = Math.max(0L, Math.max((foregroundLocationFrameworkController.A02 + ForegroundLocationFrameworkController.A00(foregroundLocationFrameworkController)) - GOq.A0I(c00i), 0L));
                LD9 ld9 = (LD9) 1Br.A0B(foregroundLocationFrameworkController.A0A);
                try {
                    LD9.A04(ld9, false);
                    LD9.A02(ld9, false);
                    LD9.A03(ld9, false);
                    LD9.A05(ld9, false);
                    ld9.A09 = ld9.A0B.now();
                    ld9.A00 = 0;
                    ld9.A01 = 0;
                    ld9.A02 = 0;
                    ld9.A03 = 0;
                    ld9.A04 = 0;
                    ld9.A05 = 0;
                    ld9.A06 = 0;
                    AbstractC01593ro A00 = LD9.A00(ld9, "fgl_app_foreground");
                    if (A00 != null) {
                        A00.A05("next_request_delay_ms", max);
                        A00.A0A();
                    }
                } catch (IllegalStateException unused) {
                    0fH.A0g("fgl_app_foreground", "ForegroundLocationFrameworkAnalyticsLogger", "Invalid state triggered from action: %s");
                }
                ForegroundLocationFrameworkController.A03(A0A, foregroundLocationFrameworkController, max);
                ((1EC) 1Br.A0B(foregroundLocationFrameworkController.A0N)).execute(new Lkp(foregroundLocationFrameworkController));
                if (max > 0) {
                    L05.A00((L05) 1Br.A0B(foregroundLocationFrameworkController.A0Q), "FOREGROUND_LOCATION_CHECK_SKIPPED");
                }
                if (foregroundLocationFrameworkController.A03 == null) {
                    1P9 r0 = new 1P9((1I7) 1Br.A0B(foregroundLocationFrameworkController.A0K));
                    r0.A04((Handler) 1Br.A0B(foregroundLocationFrameworkController.A0O));
                    r0.A05(new Ju2(foregroundLocationFrameworkController), FbLocationStatusMonitor.A09);
                    LYO.A00(r0, foregroundLocationFrameworkController, RXn.A04, 2);
                    1PA A02 = r0.A02();
                    foregroundLocationFrameworkController.A03 = A02;
                    A02.A00();
                }
                1P9 r02 = new 1P9((1I7) 1Br.A0B(foregroundLocationFrameworkController.A0J));
                r02.A05(new Ju3(foregroundLocationFrameworkController), "android.net.wifi.WIFI_STATE_CHANGED");
                1PA A022 = r02.A02();
                foregroundLocationFrameworkController.A04 = A022;
                A022.A00();
            }
        }
    }
}
