package X;

import com.facebook.common.classmarkers.ClassMarkerLoader;
import com.facebook.messenger.warmup.ClassPreloader;
import com.facebook.messenger.warmup.TLTVClassPreloader;

/* renamed from: X.3fb, reason: invalid class name */
/* loaded from: 3fb.class */
public final class C3fb implements Runnable {
    public static final String __redex_internal_original_name = "WarmupHelper$1";
    public final /* synthetic */ C3Ve A00;

    public C3fb(C3Ve c3Ve) {
        this.A00 = c3Ve;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        C00j.A05("preloadClasses", -787699449);
        try {
            ClassMarkerLoader.loadIsClassPreloadRunMarker();
            ClassPreloader.preloadClasses();
            TLTVClassPreloader.preloadClasses();
            C3Ve c3Ve = this.A00;
            2jC r0 = (2jC) c3Ve.A02.get();
            if (1Br.A06(r0.A00).AZk(36318393781662247L) || 1uZ.A00((1uZ) 1Br.A0B(r0.A01)).AZk(36321348718182669L)) {
                ((2jD) c3Ve.A03.get()).A01();
            }
            i = -29667666;
        } catch (Throwable th) {
            try {
                1BK.A09(this.A00.A00).softReport(C3Ve.__redex_internal_original_name, "preloadClassesInWorkerThread failed", th);
                i = -256106687;
            } catch (Throwable th2) {
                C00j.A01(1826481706);
                throw th2;
            }
        }
        C00j.A01(i);
    }
}
