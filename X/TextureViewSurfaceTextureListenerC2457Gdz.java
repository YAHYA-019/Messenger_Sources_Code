package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: X.Gdz, reason: case insensitive filesystem */
/* loaded from: Gdz.class */
public final class TextureViewSurfaceTextureListenerC2457Gdz extends IOr implements TextureView.SurfaceTextureListener {
    public H9r A00;
    public HB9 A01 = HB9.A05;
    public Surface A02;
    public JHx A03;
    public final TextureView.SurfaceTextureListener A04;
    public final TextureView A05;
    public volatile boolean A06;

    public TextureViewSurfaceTextureListenerC2457Gdz(TextureView textureView) {
        this.A05 = textureView;
        this.A04 = textureView.getSurfaceTextureListener();
        this.A02 = textureView.isAvailable() ? new Surface(textureView.getSurfaceTexture()) : null;
        textureView.setSurfaceTextureListener(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        if (r0.isValid() == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ADY() {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            boolean r0 = super.ADY()     // Catch: java.lang.Throwable -> L27
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1f
            r0 = r301
            android.view.Surface r0 = r0.A02     // Catch: java.lang.Throwable -> L27
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1f
            r0 = r303
            boolean r0 = r0.isValid()     // Catch: java.lang.Throwable -> L27
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L23
        L1f:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L23:
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            return r0
        L27:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TextureViewSurfaceTextureListenerC2457Gdz.ADY():boolean");
    }

    public H9r Aqv() {
        return this.A00;
    }

    public String Aui() {
        return "TextureViewOutput";
    }

    public HB9 BJV() {
        return this.A01;
    }

    public void BOk(JHx jHx, JEM jem) {
        synchronized (this) {
            this.A03 = jHx;
            if (this.A02 == null) {
                TextureView textureView = this.A05;
                if (textureView.isAvailable()) {
                    this.A02 = new Surface(textureView.getSurfaceTexture());
                }
            }
            Surface surface = this.A02;
            if (surface != null) {
                JHx jHx2 = this.A03;
                if (jHx2 != null) {
                    jHx2.D3i(surface, this);
                }
            }
        }
    }

    public boolean BcE() {
        boolean BcE;
        synchronized (this) {
            BcE = super.BcE();
            if (this.A06) {
                this.A06 = false;
                D3m();
            }
        }
        return BcE;
    }

    public void destroy() {
        synchronized (this) {
            release();
            this.A05.setSurfaceTextureListener(this.A04);
        }
    }

    public int getHeight() {
        int height;
        synchronized (this) {
            height = super.getHeight();
            if (height <= 0) {
                height = this.A05.getHeight();
            }
        }
        return height;
    }

    public int getWidth() {
        int width;
        synchronized (this) {
            width = super.getWidth();
            if (width <= 0) {
                width = this.A05.getWidth();
            }
        }
        return width;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (this) {
            Surface surface = this.A02;
            if (surface != null) {
                surface.release();
            }
            Surface surface2 = new Surface(surfaceTexture);
            this.A02 = surface2;
            JHx jHx = this.A03;
            if (jHx != null) {
                jHx.D3i(surface2, this);
            }
            TextureView.SurfaceTextureListener surfaceTextureListener = this.A04;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        JHx jHx;
        if (this.A02 != null && (jHx = this.A03) != null) {
            jHx.D3j(this);
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A04;
        if (surfaceTextureListener == null) {
            return true;
        }
        surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A06 = true;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A04;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A04;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public void release() {
        synchronized (this) {
            Surface surface = this.A02;
            if (surface != null) {
                surface.release();
                this.A02 = null;
            }
            super.release();
            this.A03 = null;
        }
    }
}
