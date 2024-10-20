package X;

import com.facebook.rsys.screenshare.gen.ScreenShareApi;

/* loaded from: Ix0.class */
public final class Ix0 implements Runnable {
    public static final String __redex_internal_original_name = "ScreenSharingLauncherControllerRsysImpl$enableScreenShare$1";
    public final /* synthetic */ ScreenShareApi A00;
    public final /* synthetic */ boolean A01;

    public Ix0(ScreenShareApi screenShareApi, boolean z) {
        this.A00 = screenShareApi;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.enableScreenShare(this.A01, 0);
    }
}
