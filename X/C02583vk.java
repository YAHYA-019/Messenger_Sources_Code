package X;

import android.os.SystemClock;
import com.facebook.common.classmarkers.ClassMarkerLoader;
import com.facebook.common.dextricks.fallback.FallbackDexLoader;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;

/* renamed from: X.3vk, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3vk.class */
public final class C02583vk {
    public static volatile FallbackDexLoader A03;
    public final HashSet A00 = new HashSet();
    public final ExecutorService A01;
    public final boolean A02;

    public C02583vk(ExecutorService executorService, boolean z) {
        this.A02 = z;
        this.A01 = executorService;
    }

    public static void A00() {
        00R r0 = A03;
        if (r0 != null) {
            00R r02 = r0;
            synchronized (r02) {
                long id = Thread.currentThread().getId();
                if (!r02.A05.remove(Long.valueOf(id))) {
                    throw AnonymousClass001.A0N(0Pz.A0U("Not paused for thread ", id));
                }
            }
        }
    }

    public void A01(final InterfaceC02573vj interfaceC02573vj) {
        boolean z;
        if (0GO.A00 || !this.A02) {
            return;
        }
        HashSet hashSet = this.A00;
        synchronized (hashSet) {
            z = false;
            if (!hashSet.add(interfaceC02573vj.getClass())) {
                z = true;
            }
        }
        ClassMarkerLoader.loadIsClassPreloadRunMarker();
        if (z) {
            return;
        }
        this.A01.execute(new Runnable() { // from class: X.4Or
            public static final String __redex_internal_original_name = "ClassPreloadController$1";

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC02573vj interfaceC02573vj2 = interfaceC02573vj;
                String A00 = C1km.A00(interfaceC02573vj2.getClass());
                try {
                    SystemClock.elapsedRealtime();
                    C00j.A07("StartPreloading.%s", A00, 1708478000);
                    try {
                        00R r0 = C02583vk.A03;
                        if (r0 != null) {
                            00R r02 = r0;
                            synchronized (r02) {
                                long id = Thread.currentThread().getId();
                                if (!r02.A05.add(Long.valueOf(id))) {
                                    throw AnonymousClass001.A0N(0Pz.A0U("Already paused for thread ", id));
                                }
                            }
                        }
                        interfaceC02573vj2.preloadClasses();
                        C02583vk.A00();
                        C00j.A01(1282914044);
                    } catch (Throwable th) {
                        C02583vk.A00();
                        C00j.A01(197871819);
                        throw th;
                    }
                } catch (Exception | NoClassDefFoundError | UnsatisfiedLinkError unused) {
                }
            }
        });
    }
}
