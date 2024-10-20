package X;

import java.util.List;

/* loaded from: Iyk.class */
public final class Iyk implements Runnable {
    public static final String __redex_internal_original_name = "VideoPlayerSessionLogger$reportVideoLoggingEvents$runnable$1";
    public final /* synthetic */ 6Ux A00;
    public final /* synthetic */ List A01;

    public Iyk(6Ux r302, List list) {
        this.A00 = r302;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6Ux r0 = this.A00;
        r0.videoLoggerHandler.Cgf(this.A01, r0.A00, 1L);
    }
}
