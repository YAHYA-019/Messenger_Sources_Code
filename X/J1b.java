package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: J1b.class */
public final class J1b implements Runnable {
    public static final String __redex_internal_original_name = "GrootBaseTextureViewListenerImpl$onSurfaceTextureDestroyed$surfaceReleaseRunnable$1";
    public final /* synthetic */ SurfaceTexture A00;
    public final /* synthetic */ Surface A01;
    public final /* synthetic */ IJL A02;

    public J1b(SurfaceTexture surfaceTexture, Surface surface, IJL ijl) {
        this.A01 = surface;
        this.A02 = ijl;
        this.A00 = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Surface surface = this.A01;
        if (surface != null) {
            this.A02.A06.CPL(surface);
            surface.release();
        }
        JMW jmw = this.A02.A06;
        SurfaceTexture surfaceTexture = this.A00;
        jmw.CPS(surfaceTexture);
        surfaceTexture.release();
    }
}
