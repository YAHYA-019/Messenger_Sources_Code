package X;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import com.google.common.base.Preconditions;
import java.util.List;
import org.webrtc.legacy.EglBase;

/* loaded from: Hjz.class */
public final class Hjz {
    public long A00 = 0;
    public SurfaceTexture A01;
    public EGLContext A02;
    public EGLDisplay A03;
    public EGLSurface A04;
    public Surface A05;
    public Surface A06;
    public IGh A07;
    public HkC A08;
    public final JL0 A09;

    public Hjz(Surface surface, JL0 jl0, 7Xo r304) {
        Object[] objArr;
        String str;
        int i;
        this.A03 = EGL14.EGL_NO_DISPLAY;
        this.A02 = EGL14.EGL_NO_CONTEXT;
        this.A04 = EGL14.EGL_NO_SURFACE;
        this.A09 = jl0;
        this.A05 = surface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.A03 = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw AnonymousClass001.A0T("unable to get EGL14 display");
        }
        int[] A1b = GOn.A1b();
        if (!EGL14.eglInitialize(eglGetDisplay, A1b, 0, A1b, 1)) {
            this.A03 = null;
            throw AnonymousClass001.A0T("unable to initialize EGL14");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.A03, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw AnonymousClass001.A0T("unable to find RGB888+recordable ES2 EGL config");
        }
        this.A02 = EGL14.eglCreateContext(this.A03, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        N34.A01("eglCreateContext");
        if (this.A02 == null) {
            throw AnonymousClass001.A0T("null context");
        }
        this.A04 = EGL14.eglCreateWindowSurface(this.A03, eGLConfigArr[0], this.A05, new int[]{12344}, 0);
        N34.A01("eglCreateWindowSurface");
        EGLSurface eGLSurface = this.A04;
        if (eGLSurface == null) {
            throw AnonymousClass001.A0T("surface was null");
        }
        if (!EGL14.eglMakeCurrent(this.A03, eGLSurface, eGLSurface, this.A02)) {
            throw AnonymousClass001.A0T("eglMakeCurrent failed");
        }
        HkC hkC = new HkC(this.A09, r304);
        this.A08 = hkC;
        GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
        JL0 jl02 = hkC.A06;
        hkC.A01 = jl02.AIY(2131886234, 2131886231);
        List<JMy> list = hkC.A07;
        if (list.isEmpty()) {
            Preconditions.checkState(AnonymousClass001.A1U(hkC.A04.A0F));
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            int i2 = iArr[0];
            hkC.A00 = i2;
            GLES20.glBindTexture(36197, i2);
            N34.A02("glBindTexture mTextureID", new Object[0]);
            AbstractC2327GOs.A0a();
            objArr = new Object[0];
            str = "glTexParameter";
        } else {
            I8U i8u = new I8U("TranscodeTextureRenderer");
            I8U.A01(i8u);
            7Xo r0 = hkC.A04;
            Bitmap bitmap = r0.A0F;
            if (bitmap == null) {
                i8u.A03 = 36197;
            } else {
                i8u.A03 = 3553;
                i8u.A05 = bitmap;
            }
            hkC.A02 = new HsT(i8u);
            for (JMy jMy : list) {
                jMy.CPE(jl02);
                jMy.CPA(r0.A0D, r0.A0B);
            }
            objArr = new Object[0];
            str = "video texture";
        }
        N34.A02(str, objArr);
        HkC hkC2 = this.A08;
        if (hkC2.A07.isEmpty()) {
            i = hkC2.A00;
        } else {
            hkC2.A02.getClass();
            i = hkC2.A02.A00;
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(i);
        this.A01 = surfaceTexture;
        IGh iGh = new IGh(surfaceTexture, this.A08);
        this.A07 = iGh;
        surfaceTexture.setOnFrameAvailableListener(iGh);
        this.A06 = new Surface(this.A01);
    }
}
