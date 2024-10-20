package org.webrtc.legacy;

import X.0Pz;
import X.1BK;
import X.AbJ;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.GOn;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build;
import android.view.Surface;
import org.webrtc.Logging;
import org.webrtc.legacy.EglBase;

/* loaded from: EglBase14.class */
public final class EglBase14 extends EglBase {
    public static final int CURRENT_SDK_VERSION = Build.VERSION.SDK_INT;
    public static final int EGLExt_SDK_VERSION = 18;
    public static final String TAG = "EglBase14";
    public EGLConfig eglConfig;
    public EGLContext eglContext;
    public EGLDisplay eglDisplay;
    public EGLSurface eglSurface;

    /* loaded from: EglBase14$Context.class */
    public class Context extends EglBase.Context {
        public final EGLContext egl14Context;

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
        }
    }

    public EglBase14(Context context) {
        this(context, EglBase.CONFIG_PIXEL_BUFFER);
    }

    public EglBase14(Context context, int[] iArr) {
        this.eglSurface = EGL14.EGL_NO_SURFACE;
        Logging.d(TAG, 0Pz.A0V("Constructing ", this));
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        EGLConfig eglConfig = getEglConfig(eglDisplay, iArr);
        this.eglConfig = eglConfig;
        this.eglContext = createEglContext(context, this.eglDisplay, eglConfig);
    }

    private void checkIsNotReleased() {
        if (isReleased()) {
            throw AnonymousClass001.A0T("This object has been released");
        }
    }

    public static EGLContext createEglContext(Context context, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eglCreateContext;
        if (context != null && context.egl14Context == EGL14.EGL_NO_CONTEXT) {
            throw AnonymousClass001.A0T("Invalid sharedContext");
        }
        int[] iArr = {12440, 2, 12344};
        EGLContext eGLContext = context == null ? EGL14.EGL_NO_CONTEXT : context.egl14Context;
        synchronized (EglBase.lock) {
            eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        }
        if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
            return eglCreateContext;
        }
        throw AbstractC2326GOr.A0d("Failed to create EGL context: 0x");
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            throw AnonymousClass001.A0N("Input must be either a Surface or SurfaceTexture");
        }
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            throw AnonymousClass001.A0T("Already has an EGLSurface");
        }
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344}, 0);
        this.eglSurface = eglCreateWindowSurface;
        if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
            throw AbstractC2326GOr.A0d("Failed to create window surface: 0x");
        }
    }

    public static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            throw AbstractC2326GOr.A0d("eglChooseConfig failed: 0x");
        }
        if (iArr2[0] <= 0) {
            throw AnonymousClass001.A0T("Unable to find any matching EGL config");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw AnonymousClass001.A0T("eglChooseConfig returned null");
    }

    public static EGLDisplay getEglDisplay() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw AbstractC2326GOr.A0d("Unable to get EGL14 display: 0x");
        }
        int[] A1b = GOn.A1b();
        if (EGL14.eglInitialize(eglGetDisplay, A1b, 0, A1b, 1)) {
            return eglGetDisplay;
        }
        throw AbstractC2326GOr.A0d("Unable to initialize EGL14: 0x");
    }

    public static boolean isEGL14Supported() {
        int i = CURRENT_SDK_VERSION;
        boolean z = true;
        Logging.d(TAG, 0Pz.A0f("SDK version: ", ". isEGL14Supported: ", i, AbJ.A1U(i, 18)));
        if (i < 18) {
            z = false;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r301.eglConfig == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isReleased() {
        /*
            r301 = this;
            r0 = r301
            android.opengl.EGLDisplay r0 = r0.eglDisplay
            r302 = r0
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L29
            r0 = r301
            android.opengl.EGLContext r0 = r0.eglContext
            r302 = r0
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L29
            r0 = r301
            android.opengl.EGLConfig r0 = r0.eglConfig
            r302 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L2b
        L29:
            r0 = 1
            r304 = r0
        L2b:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.legacy.EglBase14.isReleased():boolean");
    }

    @Override // org.webrtc.legacy.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // org.webrtc.legacy.EglBase
    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            throw AnonymousClass001.A0T("Already has an EGLSurface");
        }
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i, 12374, i2, 12344}, 0);
        this.eglSurface = eglCreatePbufferSurface;
        if (eglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
            throw AnonymousClass001.A0T(0Pz.A0x("Failed to create pixel buffer surface with size ", "x", ": 0x", Integer.toHexString(EGL14.eglGetError()), i, i2));
        }
    }

    @Override // org.webrtc.legacy.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // org.webrtc.legacy.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(surface);
    }

    @Override // org.webrtc.legacy.EglBase
    public void detachCurrent() {
        synchronized (EglBase.lock) {
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                throw AbstractC2326GOr.A0d("eglDetachCurrent failed: 0x");
            }
        }
    }

    @Override // org.webrtc.legacy.EglBase
    public /* bridge */ /* synthetic */ EglBase.Context getEglBaseContext() {
        return new Context(this.eglContext);
    }

    @Override // org.webrtc.legacy.EglBase
    public Context getEglBaseContext() {
        return new Context(this.eglContext);
    }

    @Override // org.webrtc.legacy.EglBase
    public boolean hasSurface() {
        return 1BK.A1V(this.eglSurface, EGL14.EGL_NO_SURFACE);
    }

    @Override // org.webrtc.legacy.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            throw AnonymousClass001.A0T("No EGLSurface - can't make current");
        }
        synchronized (EglBase.lock) {
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = this.eglSurface;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                throw AbstractC2326GOr.A0d("eglMakeCurrent failed: 0x");
            }
        }
    }

    @Override // org.webrtc.legacy.EglBase
    public void release() {
        if (isReleased()) {
            Logging.d(TAG, 0Pz.A0W(toString(), " already released"));
            return;
        }
        Logging.d(TAG, 0Pz.A0V("Releasing ", this));
        releaseSurface();
        detachCurrent();
        EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
        EGL14.eglReleaseThread();
        EGL14.eglTerminate(this.eglDisplay);
        this.eglContext = EGL14.EGL_NO_CONTEXT;
        this.eglDisplay = EGL14.EGL_NO_DISPLAY;
        this.eglConfig = null;
    }

    @Override // org.webrtc.legacy.EglBase
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    @Override // org.webrtc.legacy.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // org.webrtc.legacy.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    @Override // org.webrtc.legacy.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            throw AnonymousClass001.A0T("No EGLSurface - can't swap buffers");
        }
        synchronized (EglBase.lock) {
            EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        }
    }

    public void swapBuffers(long j) {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            throw AnonymousClass001.A0T("No EGLSurface - can't swap buffers");
        }
        synchronized (EglBase.lock) {
            EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, j);
            EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        }
    }
}
