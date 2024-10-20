package X;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.view.Surface;

/* loaded from: I5d.class */
public final class I5d {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public volatile float A03;
    public volatile int A04;
    public volatile int A05;
    public volatile int A06;
    public volatile int A07;
    public volatile int A08;
    public volatile int A09;
    public volatile int A0A;
    public volatile int A0B;
    public volatile SurfaceTexture A0C;
    public volatile Integer A0D;
    public volatile boolean A0E;
    public volatile boolean A0F;
    public volatile boolean A0G;
    public volatile int A0H;
    public volatile Surface A0I;

    public I5d(SurfaceTexture surfaceTexture, boolean z, boolean z2) {
        this.A08 = 0;
        this.A0C = surfaceTexture;
        this.A02 = z;
        this.A01 = true;
        this.A0E = true;
        this.A0F = false;
        this.A0G = false;
        this.A00 = z2;
        this.A0D = surfaceTexture != null ? 1BK.A0j(surfaceTexture) : null;
    }

    public I5d(Surface surface, boolean z) {
        this.A08 = 0;
        this.A0I = surface;
        this.A02 = false;
        this.A01 = z;
        this.A0E = true;
        this.A0F = false;
        this.A0G = false;
        this.A00 = false;
        this.A0D = 1BK.A0j(surface);
    }

    public Surface A00() {
        Surface surface;
        synchronized (this) {
            SurfaceTexture surfaceTexture = this.A0C;
            if (this.A0I == null && surfaceTexture != null) {
                this.A0I = new Surface(surfaceTexture);
            }
            surface = this.A0I;
        }
        return surface;
    }

    public void A01() {
        synchronized (this) {
            Surface surface = this.A0I;
            if (surface != null && this.A01) {
                surface.release();
                this.A0I = null;
            }
            SurfaceTexture surfaceTexture = this.A0C;
            if (surfaceTexture != null && this.A02) {
                surfaceTexture.release();
                this.A0C = null;
            }
            this.A0D = null;
            this.A05 = 0;
            this.A04 = 0;
            this.A0B = 0;
            this.A06 = 0;
            this.A0G = false;
        }
    }

    public void A02(int i, int i2, int i3, boolean z) {
        synchronized (this) {
            SurfaceTexture surfaceTexture = this.A0C;
            if (surfaceTexture != null && (this.A05 != i || this.A04 != i2 || this.A0H != i3)) {
                surfaceTexture.setDefaultBufferSize(i, i2);
                this.A05 = i;
                this.A04 = i2;
                this.A0H = i3;
                boolean z2 = false;
                int i4 = i;
                if (i3 % 180 != 0) {
                    z2 = true;
                    i4 = i2;
                }
                this.A0B = i4;
                if (!z2) {
                    i = i2;
                }
                this.A06 = i;
                this.A0G = z;
            }
        }
    }

    public void A03(float[] fArr) {
        if (this.A03 != 0.0f) {
            Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
            Matrix.rotateM(fArr, 0, this.A03, 0.0f, 0.0f, -1.0f);
            Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r301.A0C != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04() {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            boolean r0 = r0.A0E     // Catch: java.lang.Throwable -> L2d
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L20
            r0 = r301
            android.view.Surface r0 = r0.A0I     // Catch: java.lang.Throwable -> L2d
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L27
            r0 = r301
            android.graphics.SurfaceTexture r0 = r0.A0C     // Catch: java.lang.Throwable -> L2d
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L20
            goto L27
        L20:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
            goto L29
        L27:
            r0 = 1
            r302 = r0
        L29:
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            return r0
        L2d:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I5d.A04():boolean");
    }
}
