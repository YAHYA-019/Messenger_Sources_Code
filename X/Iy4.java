package X;

import com.facebook.rtc.plugins.calllifecycle.rooms2live.Rooms2LiveCallLifecycle;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Iy4.class */
public final class Iy4 implements Runnable {
    public static final String __redex_internal_original_name = "WebrtcUiHandler$onDominantSpeakerUpdate$1";
    public final /* synthetic */ IRF A00;
    public final /* synthetic */ String A01;

    public Iy4(IRF irf, String str) {
        this.A00 = irf;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IRF irf = this.A00;
        if (irf.A1n.decrementAndGet() > 0 || irf.A1e.A0R) {
            return;
        }
        String str = this.A01;
        irf.A0t(str, false);
        IFg iFg = IRF.A04(irf).A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = iFg.A0q;
        r0.A08("com.facebook.rtc.plugins.interfaces.calllifecycle.CallLifecyclePluginInterfaceSpec", "rtc.calllifecycle.CallLifecyclePluginInterfaceSpec", "onDominantSpeakerUpdated", andIncrement);
        try {
            IFg.A00(iFg);
            if (IFg.A0D(iFg)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.rtc.plugins.calllifecycle.rooms2live.Rooms2LiveCallLifecycle", "rtc.calllifecycle.rooms2live.Rooms2LiveCallLifecycle", "com.facebook.rtc.plugins.interfaces.calllifecycle.CallLifecyclePluginInterfaceSpec", andIncrement2, "rtc.calllifecycle.CallLifecyclePluginInterfaceSpec", "com.facebook.rtc.plugins.calllifecycle.CalllifecycleKillSwitch", "onDominantSpeakerUpdated");
                    try {
                        Rooms2LiveCallLifecycle rooms2LiveCallLifecycle = iFg.A0L;
                        if (!str.equals(rooms2LiveCallLifecycle.A00)) {
                            GOp.A0u(rooms2LiveCallLifecycle.A07).B1U(str);
                            ((RQx) rooms2LiveCallLifecycle.A0C.getValue()).A00();
                            rooms2LiveCallLifecycle.A00 = str;
                        }
                        r0.A09("rtc.calllifecycle.rooms2live.Rooms2LiveCallLifecycle", "rtc.calllifecycle.CallLifecyclePluginInterfaceSpec", "onDominantSpeakerUpdated", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "rtc.calllifecycle.rooms2live.Rooms2LiveCallLifecycle", "rtc.calllifecycle.CallLifecyclePluginInterfaceSpec", "onDominantSpeakerUpdated", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "rtc.calllifecycle.CallLifecyclePluginInterfaceSpec", "onDominantSpeakerUpdated", andIncrement);
        } catch (Throwable th2) {
            r0.A02((Exception) null, "rtc.calllifecycle.CallLifecyclePluginInterfaceSpec", "onDominantSpeakerUpdated", andIncrement);
            throw th2;
        }
    }
}
