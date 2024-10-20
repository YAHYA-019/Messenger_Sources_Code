package X;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

/* loaded from: Hua.class */
public final class Hua {
    public EGLSurface A00;
    public I5G A01;
    public I5d A02;
    public final float[] A03 = GOn.A1a();
    public final int[] A04 = GOn.A1b();
    public final Hp7 A05 = new Hp7();
    public final Object A06;

    public Hua(I5G i5g, I5d i5d, Object obj) {
        this.A00 = EGL14.EGL_NO_SURFACE;
        this.A06 = obj;
        this.A01 = i5g;
        this.A02 = i5d;
        if (AnonymousClass001.A1W(i5g.A02, EGL14.EGL_NO_DISPLAY) || i5g.A00 == null) {
            return;
        }
        int[] iArr = {12344};
        Surface A00 = i5d.A00();
        if (A00 != null) {
            synchronized (obj) {
                I5G i5g2 = this.A01;
                this.A00 = EGL14.eglCreateWindowSurface(i5g2.A02, i5g2.A00, A00, iArr, 0);
            }
        }
        if (this.A00 == null || EGL14.eglGetError() != 12288) {
            this.A00 = EGL14.EGL_NO_SURFACE;
        }
    }

    public int A00() {
        EGLSurface eGLSurface;
        I5G i5g = this.A01;
        if (i5g == null || AnonymousClass001.A1W(i5g.A02, EGL14.EGL_NO_DISPLAY) || (eGLSurface = this.A00) == EGL14.EGL_NO_SURFACE) {
            return 0;
        }
        EGLDisplay eGLDisplay = i5g.A02;
        int[] iArr = this.A04;
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12374, iArr, 1);
        return iArr[1];
    }

    public void A01() {
        I5G i5g = this.A01;
        if (i5g == null || AnonymousClass001.A1W(i5g.A02, EGL14.EGL_NO_DISPLAY) || this.A00 == EGL14.EGL_NO_SURFACE) {
            return;
        }
        synchronized (this.A06) {
            I5G i5g2 = this.A01;
            EGLDisplay eGLDisplay = i5g2.A02;
            EGLSurface eGLSurface = this.A00;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, i5g2.A01)) {
                throw AnonymousClass001.A0T("eglMakeCurrent failed");
            }
        }
    }

    public void A02() {
        I5G i5g = this.A01;
        if (i5g != null && !AnonymousClass001.A1W(i5g.A02, EGL14.EGL_NO_DISPLAY) && this.A00 != EGL14.EGL_NO_SURFACE) {
            synchronized (this.A06) {
                EGL14.eglDestroySurface(this.A01.A02, this.A00);
            }
        }
        I5d i5d = this.A02;
        if (i5d != null) {
            i5d.A01();
        }
        this.A01 = null;
        this.A02 = null;
        this.A00 = EGL14.EGL_NO_SURFACE;
    }

    public void A03() {
        I5G i5g = this.A01;
        if (i5g == null || AnonymousClass001.A1W(i5g.A02, EGL14.EGL_NO_DISPLAY) || this.A00 == EGL14.EGL_NO_SURFACE) {
            return;
        }
        synchronized (this.A06) {
            if (!EGL14.eglSwapBuffers(this.A01.A02, this.A00)) {
                android.util.Log.d("EglSurfaceOutput", "WARNING: swapBuffers() failed");
            }
        }
    }

    public void A04(long j) {
        I5d i5d;
        I5G i5g = this.A01;
        if (i5g == null || AnonymousClass001.A1W(i5g.A02, EGL14.EGL_NO_DISPLAY) || this.A00 == EGL14.EGL_NO_SURFACE || (i5d = this.A02) == null) {
            return;
        }
        int i = i5d.A0A;
        if (i != 0) {
            if (i != 1) {
                return;
            } else {
                j = this.A05.A00(j);
            }
        }
        synchronized (this.A06) {
            EGLExt.eglPresentationTimeANDROID(this.A01.A02, this.A00, j);
        }
    }
}
