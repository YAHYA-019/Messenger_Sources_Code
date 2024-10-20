package org.webrtc.legacy;

import X.0Pz;
import X.1BK;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.GOn;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.webrtc.Logging;
import org.webrtc.legacy.EglBase;

/* loaded from: EglBase10.class */
public final class EglBase10 extends EglBase {
    public static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    public static final String TAG = "EglBase10";
    public final EGL10 egl;
    public EGLConfig eglConfig;
    public EGLContext eglContext;
    public EGLDisplay eglDisplay;
    public EGLSurface eglSurface;

    /* loaded from: EglBase10$Context.class */
    public class Context extends EglBase.Context {
        public final EGLContext eglContext;

        public Context(EGLContext eGLContext) {
            this.eglContext = eGLContext;
        }
    }

    public EglBase10(Context context) {
        this(context, EglBase.CONFIG_PIXEL_BUFFER);
    }

    public EglBase10(Context context, int[] iArr) {
        this.eglSurface = EGL10.EGL_NO_SURFACE;
        Logging.d(TAG, 0Pz.A0V("Constructing ", this));
        this.egl = (EGL10) EGLContext.getEGL();
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

    private EGLContext createEglContext(Context context, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eglCreateContext;
        if (context != null && context.eglContext == EGL10.EGL_NO_CONTEXT) {
            throw AnonymousClass001.A0T("Invalid sharedContext");
        }
        int[] iArr = {12440, 2, 12344};
        EGLContext eGLContext = context == null ? EGL10.EGL_NO_CONTEXT : context.eglContext;
        synchronized (EglBase.lock) {
            eglCreateContext = this.egl.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }
        if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
            return eglCreateContext;
        }
        throw AbstractC2327GOs.A0P("Failed to create EGL context: 0x", this.egl);
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof SurfaceHolder) && !(obj instanceof SurfaceTexture)) {
            throw AnonymousClass001.A0N("Input must be either a SurfaceHolder or SurfaceTexture");
        }
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            throw AnonymousClass001.A0T("Already has an EGLSurface");
        }
        EGLSurface eglCreateWindowSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344});
        this.eglSurface = eglCreateWindowSurface;
        if (eglCreateWindowSurface == eGLSurface2) {
            throw AbstractC2327GOs.A0P("Failed to create window surface: 0x", this.egl);
        }
    }

    private EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!this.egl.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, iArr2)) {
            throw AbstractC2327GOs.A0P("eglChooseConfig failed: 0x", this.egl);
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

    private EGLDisplay getEglDisplay() {
        EGLDisplay eglGetDisplay = this.egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw AbstractC2327GOs.A0P("Unable to get EGL10 display: 0x", this.egl);
        }
        if (this.egl.eglInitialize(eglGetDisplay, GOn.A1b())) {
            return eglGetDisplay;
        }
        throw AbstractC2327GOs.A0P("Unable to initialize EGL10: 0x", this.egl);
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
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglDisplay
            r302 = r0
            javax.microedition.khronos.egl.EGLDisplay r0 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L29
            r0 = r301
            javax.microedition.khronos.egl.EGLContext r0 = r0.eglContext
            r302 = r0
            javax.microedition.khronos.egl.EGLContext r0 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L29
            r0 = r301
            javax.microedition.khronos.egl.EGLConfig r0 = r0.eglConfig
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
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.legacy.EglBase10.isReleased():boolean");
    }

    @Override // org.webrtc.legacy.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // org.webrtc.legacy.EglBase
    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            throw AnonymousClass001.A0T("Already has an EGLSurface");
        }
        EGLSurface eglCreatePbufferSurface = this.egl.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i, 12374, i2, 12344});
        this.eglSurface = eglCreatePbufferSurface;
        if (eglCreatePbufferSurface == eGLSurface2) {
            throw AnonymousClass001.A0T(0Pz.A0x("Failed to create pixel buffer surface with size ", "x", ": 0x", Integer.toHexString(this.egl.eglGetError()), i, i2));
        }
    }

    @Override // org.webrtc.legacy.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // org.webrtc.legacy.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(new SurfaceHolder(surface) { // from class: org.webrtc.legacy.EglBase10.1FakeSurfaceHolder
            public final Surface surface;

            {
                this.surface = surface;
            }

            @Override // android.view.SurfaceHolder
            public void addCallback(SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public Surface getSurface() {
                return this.surface;
            }

            @Override // android.view.SurfaceHolder
            public Rect getSurfaceFrame() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public boolean isCreating() {
                return false;
            }

            @Override // android.view.SurfaceHolder
            public Canvas lockCanvas() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public Canvas lockCanvas(Rect rect) {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public void removeCallback(SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public void setFixedSize(int i, int i2) {
            }

            @Override // android.view.SurfaceHolder
            public void setFormat(int i) {
            }

            @Override // android.view.SurfaceHolder
            public void setKeepScreenOn(boolean z) {
            }

            @Override // android.view.SurfaceHolder
            public void setSizeFromLayout() {
            }

            @Override // android.view.SurfaceHolder
            public void setType(int i) {
            }

            @Override // android.view.SurfaceHolder
            public void unlockCanvasAndPost(Canvas canvas) {
            }
        });
    }

    @Override // org.webrtc.legacy.EglBase
    public void detachCurrent() {
        synchronized (EglBase.lock) {
            EGL10 egl10 = this.egl;
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
                throw AbstractC2327GOs.A0P("eglDetachCurrent failed: 0x", this.egl);
            }
        }
    }

    @Override // org.webrtc.legacy.EglBase
    public EglBase.Context getEglBaseContext() {
        return new Context(this.eglContext);
    }

    @Override // org.webrtc.legacy.EglBase
    public boolean hasSurface() {
        return 1BK.A1V(this.eglSurface, EGL10.EGL_NO_SURFACE);
    }

    @Override // org.webrtc.legacy.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
            throw AnonymousClass001.A0T("No EGLSurface - can't make current");
        }
        synchronized (EglBase.lock) {
            EGL10 egl10 = this.egl;
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = this.eglSurface;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                throw AbstractC2327GOs.A0P("eglMakeCurrent failed: 0x", this.egl);
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
        this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
        this.egl.eglTerminate(this.eglDisplay);
        this.eglContext = EGL10.EGL_NO_CONTEXT;
        this.eglDisplay = EGL10.EGL_NO_DISPLAY;
        this.eglConfig = null;
    }

    @Override // org.webrtc.legacy.EglBase
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            this.egl.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = eGLSurface2;
        }
    }

    @Override // org.webrtc.legacy.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr);
        return iArr[0];
    }

    @Override // org.webrtc.legacy.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr);
        return iArr[0];
    }

    @Override // org.webrtc.legacy.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
            throw AnonymousClass001.A0T("No EGLSurface - can't swap buffers");
        }
        synchronized (EglBase.lock) {
            this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        }
    }
}
