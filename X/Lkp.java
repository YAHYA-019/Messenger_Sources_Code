package X;

import com.facebook.location.foreground.ForegroundLocationFrameworkController;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.concurrent.TimeUnit;

/* loaded from: Lkp.class */
public final class Lkp implements Runnable {
    public static final String __redex_internal_original_name = "ForegroundLocationFrameworkController$onAppForeground$1";
    public final /* synthetic */ ForegroundLocationFrameworkController A00;

    public Lkp(ForegroundLocationFrameworkController foregroundLocationFrameworkController) {
        this.A00 = foregroundLocationFrameworkController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ForegroundLocationFrameworkController foregroundLocationFrameworkController = this.A00;
            C00i c00i = foregroundLocationFrameworkController.A0L.A00;
            if (((1CO) c00i.get()).AZk(36310714379928558L)) {
                C00i c00i2 = foregroundLocationFrameworkController.A0I.A00;
                FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) c00i2.get();
                1G2 r0 = RDJ.A00;
                long A0A = 1BL.A0A(fbSharedPreferences, r0);
                long seconds = TimeUnit.MILLISECONDS.toSeconds(1Br.A00(foregroundLocationFrameworkController.A0D));
                if (seconds - A0A >= ((1CO) c00i.get()).Auy(36592189356704246L)) {
                    1Ql A0U = 1BL.A0U(c00i2);
                    A0U.CaH(r0, seconds);
                    A0U.commit();
                    ((EvL) 1Br.A0B(foregroundLocationFrameworkController.A0E)).A00(R08.A00(((C02333uu) 1Br.A0B(foregroundLocationFrameworkController.A0G)).A01(0S2.A0C, false)));
                }
            }
        } catch (Exception unused) {
        }
    }
}
