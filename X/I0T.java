package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.legacy.EglBase;
import org.webrtc.legacy.opengl.EglCore;

/* loaded from: I0T.class */
public final class I0T {
    public int A00;
    public SurfaceTexture A02;
    public HandlerThread A03;
    public Surface A04;
    public Hce A05;
    public I8v A06;
    public ROC A07;
    public ROl A08;
    public Qy3 A09;
    public IGk A0A;
    public final JL0 A0F;
    public final float[] A0E = GOn.A1a();
    public long A01 = 0;
    public int A0C = 0;
    public final List A0D = AnonymousClass001.A0s();
    public List A0B = AnonymousClass001.A0s();

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, X.Qy3] */
    public I0T(Surface surface, JL0 jl0, I8v i8v) {
        this.A0F = jl0;
        this.A06 = i8v;
        this.A05 = i8v.A0F;
        ?? obj = new Object();
        ((Qy3) obj).A02 = EGL14.EGL_NO_DISPLAY;
        ((Qy3) obj).A01 = EGL14.EGL_NO_CONTEXT;
        ((Qy3) obj).A03 = EGL14.EGL_NO_SURFACE;
        ((Qy3) obj).A00 = null;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        ((Qy3) obj).A02 = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw AnonymousClass001.A0T("unable to get EGL14 display");
        }
        int[] A1b = GOn.A1b();
        if (!EGL14.eglInitialize(eglGetDisplay, A1b, 0, A1b, 1)) {
            throw AnonymousClass001.A0T("unable to initialize EGL14");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(((Qy3) obj).A02, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw AnonymousClass001.A0T("unable to find RGB888+recordable ES2 EGL config");
        }
        ((Qy3) obj).A01 = EGL14.eglCreateContext(((Qy3) obj).A02, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        N34.A01("eglCreateContext");
        if (((Qy3) obj).A01 == null) {
            throw AnonymousClass001.A0T("null context");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        ((Qy3) obj).A00 = eGLConfig;
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(((Qy3) obj).A02, eGLConfig, surface, new int[]{12344}, 0);
        N34.A01("eglCreateWindowSurface");
        if (eglCreateWindowSurface == null) {
            throw AnonymousClass001.A0T("surface was null");
        }
        ((Qy3) obj).A03 = eglCreateWindowSurface;
        this.A09 = obj;
        if (((Qy3) obj).A02 == EGL14.EGL_NO_DISPLAY) {
            android.util.Log.d(EglCore.TAG, "NOTE: makeCurrent w/o display");
        }
        EGLDisplay eGLDisplay = ((Qy3) obj).A02;
        EGLSurface eGLSurface = ((Qy3) obj).A03;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, ((Qy3) obj).A01)) {
            throw AnonymousClass001.A0T("eglMakeCurrent failed");
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        N34.A02("glGenTextures", new Object[0]);
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        N34.A02(0Pz.A0T("glBindTexture ", i), new Object[0]);
        AbstractC2327GOs.A0a();
        N34.A02("glTexParameter", new Object[0]);
        this.A00 = i;
        SurfaceTexture surfaceTexture = new SurfaceTexture(i);
        this.A02 = surfaceTexture;
        this.A0A = new IGk(surfaceTexture);
        HandlerThread A0E = GOo.A0E("videotranscoder-framecallback-boomerang", -19);
        this.A03 = A0E;
        A0E.start();
        SurfaceTexture surfaceTexture2 = this.A02;
        IGk iGk = this.A0A;
        HandlerThread handlerThread = this.A03;
        handlerThread.getClass();
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        surfaceTexture2.setOnFrameAvailableListener(iGk, new Handler(looper));
        this.A04 = new Surface(this.A02);
        this.A07 = new ROC(jl0);
        this.A08 = new ROl(jl0, i8v);
    }

    public static void A00(HsS hsS, I0T i0t, long j) {
        long j2;
        int i = hsS.A03.A00;
        ROl rOl = i0t.A08;
        rOl.getClass();
        N34.A02("onDrawFrame start", new Object[0]);
        I8v i8v = rOl.A02;
        GLES20.glViewport(0, 0, i8v.A0C, i8v.A0A);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        I9C A00 = rOl.A01.A00();
        A00.A05("uSTMatrix", rOl.A05);
        A00.A05("uConstMatrix", rOl.A03);
        A00.A05("uContentTransform", rOl.A04);
        A00.A02(rOl.A00);
        N34.A02("drawFrame here", new Object[0]);
        GLES20.glBindTexture(3553, -1);
        GLES20.glFinish();
        Hce hce = i0t.A05;
        hce.getClass();
        if (hce.A01) {
            j2 = TimeUnit.MICROSECONDS.toNanos(j);
        } else {
            int i2 = i0t.A0C;
            i0t.A0C = i2 + 1;
            j2 = i2 * 50000 * 1000;
        }
        Qy3 qy3 = i0t.A09;
        qy3.getClass();
        EGLExt.eglPresentationTimeANDROID(qy3.A02, qy3.A03, j2);
        Qy3 qy32 = i0t.A09;
        qy32.getClass();
        EGL14.eglSwapBuffers(qy32.A02, qy32.A03);
    }
}
