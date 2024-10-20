package X;

import android.os.Build;
import android.view.SurfaceControl;

/* loaded from: I5V.class */
public final class I5V {
    public final I0c A02;
    public final SurfaceControl.Transaction A01 = new SurfaceControl.Transaction();
    public boolean A00 = true;

    public I5V(I0c i0c) {
        this.A02 = i0c;
    }

    public static final void A00(I5V i5v, Exception exc) {
        if (!(exc instanceof NullPointerException) && ((!(exc instanceof IllegalStateException) || !i5v.A02.A0F) && !i5v.A02.A0E)) {
            throw exc;
        }
        i5v.A00 = false;
    }

    public final void A01(SurfaceControl surfaceControl) {
        if (!this.A00 || !surfaceControl.isValid()) {
            this.A01.close();
            return;
        }
        try {
            this.A01.apply();
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.A01.close();
            throw th;
        }
        this.A01.close();
    }

    public final void A02(SurfaceControl surfaceControl) {
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                this.A01.setFrameRate(surfaceControl, 0.0f, 1, 0);
            }
        } catch (Exception e) {
            A00(this, e);
        }
    }

    public final void A03(SurfaceControl surfaceControl, int i, int i2) {
        try {
            this.A01.setBufferSize(surfaceControl, i, i2);
        } catch (Exception e) {
            A00(this, e);
        }
    }

    public final void A04(SurfaceControl surfaceControl, SurfaceControl surfaceControl2) {
        try {
            this.A01.reparent(surfaceControl, surfaceControl2);
        } catch (Exception e) {
            A00(this, e);
        }
    }

    public final void A05(SurfaceControl surfaceControl, boolean z) {
        try {
            this.A01.setVisibility(surfaceControl, z);
        } catch (Exception e) {
            A00(this, e);
        }
    }
}
