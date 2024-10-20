package X;

import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;

/* loaded from: Huj.class */
public abstract class Huj {
    public IFI A01;
    public final IFI A02;
    public EGLSurface A00 = EGL14.EGL_NO_SURFACE;
    public final int[] A04 = new int[1];
    public final int[] A03 = new int[1];

    public Huj(IFI ifi) {
        this.A01 = ifi;
        this.A02 = ifi;
    }

    public int A00() {
        IFI ifi = this.A01;
        EGLSurface eGLSurface = this.A00;
        int[] iArr = this.A03;
        EGL14.eglQuerySurface(ifi.A04, eGLSurface, 12374, iArr, 0);
        return iArr[0];
    }

    public int A01() {
        IFI ifi = this.A01;
        EGLSurface eGLSurface = this.A00;
        int[] iArr = this.A04;
        EGL14.eglQuerySurface(ifi.A04, eGLSurface, 12375, iArr, 0);
        return iArr[0];
    }

    public void A02() {
        EGLSurface eGLSurface = this.A00;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.A01.A04, eGLSurface);
        }
        this.A00 = EGL14.EGL_NO_SURFACE;
    }

    public void A03() {
        IFI ifi = this.A01;
        EGLSurface eGLSurface = this.A00;
        Object obj = ifi.A07;
        if (obj == null) {
            EGL14.eglSwapBuffers(ifi.A04, eGLSurface);
        } else {
            synchronized (obj) {
                EGL14.eglSwapBuffers(ifi.A04, eGLSurface);
            }
        }
    }

    public void A04(long j) {
        IFI ifi = this.A01;
        EGLExt.eglPresentationTimeANDROID(ifi.A04, this.A00, j);
    }

    public boolean A05() {
        boolean A06;
        IFI ifi = this.A01;
        EGLSurface eGLSurface = this.A00;
        Object obj = ifi.A07;
        if (obj == null) {
            return IFI.A06(eGLSurface, eGLSurface, ifi);
        }
        synchronized (obj) {
            A06 = IFI.A06(eGLSurface, eGLSurface, ifi);
        }
        return A06;
    }
}
