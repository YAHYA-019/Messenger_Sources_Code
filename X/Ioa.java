package X;

import android.os.Handler;

/* loaded from: Ioa.class */
public final class Ioa implements Runnable {
    public static final String __redex_internal_original_name = "MediaPipelineController$RenderManagerDelegateImpl$3";
    public final /* synthetic */ HOx A00;

    public Ioa(HOx hOx) {
        this.A00 = hOx;
    }

    @Override // java.lang.Runnable
    public void run() {
        IEE iee;
        HOw hOw = this.A00.A00.A03;
        if (hOw != null) {
            IFR ifr = hOw.A00;
            if (Hwv.A00(ifr.A0Q) || (iee = ifr.A0S) == null) {
                return;
            }
            iee.A09((JIk) null, (Handler) null);
        }
    }
}
