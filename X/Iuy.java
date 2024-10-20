package X;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;

/* loaded from: Iuy.class */
public final /* synthetic */ class Iuy implements Runnable {
    public static final String __redex_internal_original_name = "EglBase14Impl$EglConnection$$ExternalSyntheticLambda0";
    public final /* synthetic */ J6D A00;

    @Override // java.lang.Runnable
    public final void run() {
        EGLDisplay eGLDisplay;
        J6D j6d = this.A00;
        synchronized (JOR.A00) {
            eGLDisplay = j6d.A02;
            GOo.A1A(eGLDisplay);
            EGL14.eglDestroyContext(eGLDisplay, j6d.A01);
        }
        EGL14.eglReleaseThread();
        EGL14.eglTerminate(eGLDisplay);
    }
}
