package X;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: Iux.class */
public final /* synthetic */ class Iux implements Runnable {
    public static final String __redex_internal_original_name = "EglBase10Impl$EglConnection$$ExternalSyntheticLambda1";
    public final /* synthetic */ J6E A00;

    @Override // java.lang.Runnable
    public final void run() {
        EGL10 egl10;
        EGLDisplay eGLDisplay;
        J6E j6e = this.A00;
        synchronized (JOR.A00) {
            egl10 = j6e.A00;
            eGLDisplay = j6e.A03;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        }
        egl10.eglDestroyContext(eGLDisplay, j6e.A02);
        egl10.eglTerminate(eGLDisplay);
    }
}
