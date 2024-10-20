package X;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* renamed from: X.Gdy, reason: case insensitive filesystem */
/* loaded from: Gdy.class */
public class SurfaceHolderCallbackC2456Gdy extends IOr implements SurfaceHolder.Callback {
    public JHx A00;
    public final SurfaceView A01;
    public final HB9 A02 = HB9.A05;
    public volatile Surface A03;

    public SurfaceHolderCallbackC2456Gdy(SurfaceView surfaceView) {
        this.A01 = surfaceView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r301.A03.isValid() == false) goto L14;
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
            boolean r0 = super.ADY()     // Catch: java.lang.Throwable -> L2c
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L24
            r0 = r301
            android.view.Surface r0 = r0.A03     // Catch: java.lang.Throwable -> L2c
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L24
            r0 = r301
            android.view.Surface r0 = r0.A03     // Catch: java.lang.Throwable -> L2c
            r303 = r0
            r0 = r303
            boolean r0 = r0.isValid()     // Catch: java.lang.Throwable -> L2c
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L28
        L24:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L28:
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            return r0
        L2c:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SurfaceHolderCallbackC2456Gdy.ADY():boolean");
    }

    public H9r Aqv() {
        return null;
    }

    public String Aui() {
        return this instanceof C2463Ge5 ? "OrientationLockedSurfaceOutput" : "SurfaceViewOutput";
    }

    public HB9 BJV() {
        return this instanceof C2463Ge5 ? HB9.A05 : this.A02;
    }

    public void BOk(JHx jHx, JEM jem) {
        synchronized (this) {
            this.A00 = jHx;
            SurfaceView surfaceView = this.A01;
            surfaceView.getHolder().addCallback(this);
            this.A03 = surfaceView.getHolder().getSurface();
            if (this.A03 != null && this.A03.isValid()) {
                this.A00.D3i(this.A03, this);
            }
        }
    }

    public void destroy() {
        synchronized (this) {
            release();
        }
    }

    public int getHeight() {
        int height;
        synchronized (this) {
            height = super.getHeight();
            if (height <= 0) {
                height = this.A01.getHeight();
            }
        }
        return height;
    }

    public int getWidth() {
        int width;
        synchronized (this) {
            width = super.getWidth();
            if (width <= 0) {
                width = this.A01.getWidth();
            }
        }
        return width;
    }

    public void release() {
        synchronized (this) {
            super.release();
            this.A00 = null;
            this.A03 = null;
            this.A01.getHolder().removeCallback(this);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        synchronized (this) {
            if (this.A03 != null) {
                JHx jHx = this.A00;
                if (jHx != null) {
                    jHx.D3j(this);
                }
            }
            this.A03 = surfaceHolder.getSurface();
            JHx jHx2 = this.A00;
            if (jHx2 != null) {
                jHx2.D3i(this.A03, this);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        synchronized (this) {
            JHx jHx = this.A00;
            if (jHx != null) {
                jHx.D3j(this);
            }
            Huj huj = ((IOr) this).A01;
            if (huj != null) {
                huj.A02();
                ((IOr) this).A01 = null;
            }
            this.A03 = null;
        }
    }
}
