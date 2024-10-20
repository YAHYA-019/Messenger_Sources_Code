package X;

import android.graphics.SurfaceTexture;

/* loaded from: Id5.class */
public final class Id5 implements JG3, SurfaceTexture.OnFrameAvailableListener {
    public volatile SurfaceTexture A00;
    public final /* synthetic */ Gts A01;

    public Id5(Gts gts) {
        this.A01 = gts;
    }

    @Override // X.JG3
    public void CfS(Long l) {
        IGl iGl = this.A01.A0K;
        SurfaceTexture surfaceTexture = this.A00;
        if (iGl == null || surfaceTexture == null) {
            return;
        }
        iGl.onFrameAvailable(surfaceTexture);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A00 = surfaceTexture;
        JLq jLq = this.A01.A0J;
        if (jLq != null) {
            jLq.onFrameAvailable();
        }
    }
}
