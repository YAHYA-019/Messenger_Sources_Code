package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.Gdx, reason: case insensitive filesystem */
/* loaded from: Gdx.class */
public final class C2455Gdx extends IOr {
    public SurfaceTexture A02;
    public Surface A03;
    public HsT A04;
    public int A01 = 1;
    public int A00 = 1;

    public Surface A00() {
        release();
        HsT hsT = new HsT(new I8U("OffscreenOutput"));
        this.A04 = hsT;
        int i = this.A01;
        int i2 = this.A00;
        hsT.A00(i, i2);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.A04.A00);
        this.A02 = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(i, i2);
        Surface surface = new Surface(this.A02);
        this.A03 = surface;
        return surface;
    }

    public boolean ADY() {
        return false;
    }

    public H9r Aqv() {
        return null;
    }

    public String Aui() {
        return "OffscreenOutput";
    }

    public HB9 BJV() {
        return HB9.A05;
    }

    public void BOk(JHx jHx, JEM jem) {
        jHx.D3i(A00(), this);
    }

    public void destroy() {
        release();
    }

    public int getHeight() {
        return this.A00;
    }

    public int getWidth() {
        return this.A01;
    }

    public void release() {
        Surface surface = this.A03;
        if (surface != null) {
            surface.release();
            this.A03 = null;
        }
        SurfaceTexture surfaceTexture = this.A02;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A02 = null;
        }
        HsT hsT = this.A04;
        if (hsT != null) {
            hsT.A01();
            this.A04 = null;
        }
        super.release();
    }
}
