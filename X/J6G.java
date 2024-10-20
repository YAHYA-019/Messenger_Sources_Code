package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Build;
import android.view.Surface;
import org.webrtc.EglBase$Context;

/* loaded from: J6G.class */
public final class J6G implements JOR {
    public static final int A02 = Build.VERSION.SDK_INT;
    public static final J6D A03 = new J6D();
    public EGLSurface A00;
    public J6D A01;

    private void A00() {
        if (this.A01 == A03) {
            throw AnonymousClass001.A0T("This object has been released");
        }
    }

    private void A01(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            throw AnonymousClass001.A0N("Input must be either a Surface or SurfaceTexture");
        }
        A00();
        if (this.A00 != EGL14.EGL_NO_SURFACE) {
            throw AnonymousClass001.A0T("Already has an EGLSurface");
        }
        J6D j6d = this.A01;
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(j6d.A02, j6d.A00, obj, new int[]{12344}, 0);
        this.A00 = eglCreateWindowSurface;
        if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
            throw AbstractC2326GOr.A0d("Failed to create window surface: 0x");
        }
    }

    public void AJf() {
        A00();
        if (this.A00 != EGL14.EGL_NO_SURFACE) {
            throw AnonymousClass001.A0T("Already has an EGLSurface");
        }
        J6D j6d = this.A01;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(j6d.A02, j6d.A00, new int[]{12375, 1, 12374, 1, 12344}, 0);
        this.A00 = eglCreatePbufferSurface;
        if (eglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
            throw AnonymousClass001.A0T(0Pz.A0x("Failed to create pixel buffer surface with size ", "x", ": 0x", Integer.toHexString(EGL14.eglGetError()), 1, 1));
        }
    }

    public void AL3(SurfaceTexture surfaceTexture) {
        A01(surfaceTexture);
    }

    public void AL4(Surface surface) {
        A01(surface);
    }

    public void AN4() {
        synchronized (JOR.A00) {
            EGLDisplay eGLDisplay = this.A01.A02;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                throw AbstractC2326GOr.A0d("eglDetachCurrent failed: 0x");
            }
        }
    }

    public /* bridge */ /* synthetic */ EglBase$Context Aj3() {
        return new J6C(this.A01.A01);
    }

    public boolean BNc() {
        return 1BK.A1V(this.A00, EGL14.EGL_NO_SURFACE);
    }

    public void BcD() {
        A00();
        if (this.A00 == EGL14.EGL_NO_SURFACE) {
            throw AnonymousClass001.A0T("No EGLSurface - can't make current");
        }
        synchronized (JOR.A00) {
            J6D j6d = this.A01;
            EGLDisplay eGLDisplay = j6d.A02;
            EGLSurface eGLSurface = this.A00;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, j6d.A01)) {
                throw AbstractC2326GOr.A0d("eglMakeCurrent failed: 0x");
            }
        }
    }

    public void Ccx() {
        EGLSurface eGLSurface = this.A00;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.A01.A02, eGLSurface);
            this.A00 = EGL14.EGL_NO_SURFACE;
        }
    }

    public int D3k() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.A01.A02, this.A00, 12374, iArr, 0);
        return iArr[0];
    }

    public int D3l() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.A01.A02, this.A00, 12375, iArr, 0);
        return iArr[0];
    }

    public void D3m() {
        A00();
        if (this.A00 == EGL14.EGL_NO_SURFACE) {
            throw AnonymousClass001.A0T("No EGLSurface - can't swap buffers");
        }
        synchronized (JOR.A00) {
            EGL14.eglSwapBuffers(this.A01.A02, this.A00);
        }
    }

    public void release() {
        A00();
        Ccx();
        this.A01.release();
        this.A01 = A03;
    }
}
