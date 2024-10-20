package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;

/* loaded from: Icr.class */
public final class Icr implements JME {
    public JNx A00;
    public int A01;
    public final SurfaceTexture.OnFrameAvailableListener A02 = new IGg(this, 2);
    public volatile SurfaceTexture A03;
    public volatile JG1 A04;

    public void A00() {
        boolean z = true;
        if (this.A03 == null) {
            if (this.A01 == 0) {
                z = false;
            }
            02W.A04(z);
            0fH.A0k("ar-session", "regular surface used");
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.A01);
            surfaceTexture.setOnFrameAvailableListener(this.A02);
            this.A03 = surfaceTexture;
        }
    }

    public void A01() {
        SurfaceTexture surfaceTexture = this.A03;
        this.A03 = null;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public void A02(Handler handler) {
        02W.A04(AnonymousClass001.A1N(this.A01));
        0fH.A0k("ar-session", "regular surface used - attach");
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.detachFromGLContext();
            surfaceTexture.attachToGLContext(this.A01);
            surfaceTexture.setOnFrameAvailableListener(this.A02, handler);
            surfaceTexture.updateTexImage();
        }
    }

    public long BFt() {
        SurfaceTexture surfaceTexture = this.A03;
        surfaceTexture.getClass();
        return surfaceTexture.getTimestamp();
    }

    public void BGt(float[] fArr) {
        SurfaceTexture surfaceTexture = this.A03;
        surfaceTexture.getClass();
        surfaceTexture.getTransformMatrix(fArr);
    }

    public void CPz(int i) {
        this.A01 = i;
    }

    public void CQ0() {
        this.A01 = 0;
    }

    public void Crq(JG1 jg1) {
        this.A04 = jg1;
    }

    public void D8A() {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }
}
