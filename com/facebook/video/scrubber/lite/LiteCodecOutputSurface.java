package com.facebook.video.scrubber.lite;

import X.2DX;
import X.AnonymousClass001;
import X.GOn;
import X.GOp;
import X.H3X;
import X.HFK;
import X.HsT;
import X.I8U;
import X.JL0;
import X.JMy;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: LiteCodecOutputSurface.class */
public final class LiteCodecOutputSurface implements SurfaceTexture.OnFrameAvailableListener {
    public SurfaceTexture A00;
    public Surface A01;
    public STextureRender A02;
    public ByteBuffer A03;
    public List A04;
    public EGL10 A05;
    public EGLContext A06;
    public EGLDisplay A07;
    public EGLSurface A08;
    public boolean A09;
    public final int A0A;
    public final int A0B;
    public final RectF A0C;
    public final JL0 A0D;
    public final 2DX A0E;
    public final HFK A0F;
    public final Object A0G;

    public LiteCodecOutputSurface(RectF rectF, JL0 jl0, 2DX r304, HFK hfk, List list) {
        int i;
        List list2 = list;
        EGLDisplay eGLDisplay = EGL10.EGL_NO_DISPLAY;
        this.A07 = eGLDisplay;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        this.A06 = eGLContext;
        this.A08 = EGL10.EGL_NO_SURFACE;
        this.A0G = AnonymousClass001.A0R();
        this.A0E = r304;
        this.A0D = jl0;
        if (list == null || list.isEmpty()) {
            ArrayList A0s = AnonymousClass001.A0s();
            A0s.add(new H3X(false));
            list2 = A0s;
        }
        this.A04 = list2;
        this.A05 = (EGL10) EGLContext.getEGL();
        this.A0C = rectF;
        this.A0F = hfk;
        if (hfk.A01 % 180 == 0) {
            this.A0B = (int) (hfk.A02 * rectF.width() * 1.0f);
            i = hfk.A00;
        } else {
            this.A0B = (int) (hfk.A00 * rectF.width() * 1.0f);
            i = hfk.A02;
        }
        this.A0A = (int) (i * rectF.height() * 1.0f);
        EGL10 egl10 = this.A05;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.A07 = eglGetDisplay;
        if (eglGetDisplay == eGLDisplay) {
            this.A07 = null;
            throw AnonymousClass001.A0T("unable to get EGL14 display");
        }
        if (!egl10.eglInitialize(eglGetDisplay, GOn.A1b())) {
            this.A07 = null;
            throw AnonymousClass001.A0T("unable to initialize EGL14");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!egl10.eglChooseConfig(this.A07, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344}, eGLConfigArr, 1, new int[1])) {
            throw AnonymousClass001.A0T("unable to find RGB888+recordable ES2 EGL config");
        }
        this.A06 = egl10.eglCreateContext(this.A07, eGLConfigArr[0], eGLContext, new int[]{12440, 2, 12344});
        int eglGetError = this.A05.eglGetError();
        if (eglGetError != 12288) {
            throw GOp.A17("eglCreateContext", ": EGL error: 0x", Integer.toHexString(eglGetError));
        }
        if (this.A06 == null) {
            throw AnonymousClass001.A0T("null context");
        }
        this.A08 = egl10.eglCreatePbufferSurface(this.A07, eGLConfigArr[0], new int[]{12375, this.A0B, 12374, this.A0A, 12344});
        int eglGetError2 = this.A05.eglGetError();
        if (eglGetError2 != 12288) {
            throw GOp.A17("eglCreatePbufferSurface", ": EGL error: 0x", Integer.toHexString(eglGetError2));
        }
        EGLSurface eGLSurface = this.A08;
        if (eGLSurface == null) {
            throw AnonymousClass001.A0T("surface was null");
        }
        if (!this.A05.eglMakeCurrent(this.A07, eGLSurface, eGLSurface, this.A06)) {
            throw AnonymousClass001.A0T("eglMakeCurrent failed");
        }
        List<JMy> list3 = this.A04;
        HFK hfk2 = this.A0F;
        STextureRender sTextureRender = new STextureRender(this.A0C, list3, hfk2.A02, hfk2.A00);
        this.A02 = sTextureRender;
        I8U i8u = new I8U("STextureRender");
        i8u.A03 = 36197;
        i8u.A04 = sTextureRender.A03;
        i8u.A02 = sTextureRender.A02;
        I8U.A01(i8u);
        sTextureRender.A00 = new HsT(i8u);
        for (JMy jMy : list3) {
            jMy.CPE(this.A0D);
            jMy.CPA(this.A0B, this.A0A);
        }
        STextureRender sTextureRender2 = this.A02;
        sTextureRender2.A00.getClass();
        SurfaceTexture surfaceTexture = new SurfaceTexture(sTextureRender2.A00.A00);
        this.A00 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.A01 = new Surface(this.A00);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.A0B * this.A0A * 4);
        this.A03 = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public void A00() {
        STextureRender sTextureRender = this.A02;
        if (sTextureRender != null) {
            HsT hsT = sTextureRender.A00;
            if (hsT != null) {
                GLES20.glDeleteTextures(1, new int[]{hsT.A00}, 0);
                sTextureRender.A00 = null;
            }
            Iterator it = sTextureRender.A01.iterator();
            while (it.hasNext()) {
                ((JMy) it.next()).CPG();
            }
        }
        EGLDisplay eGLDisplay = this.A07;
        EGLDisplay eGLDisplay2 = EGL10.EGL_NO_DISPLAY;
        if (eGLDisplay != eGLDisplay2) {
            EGL10 egl10 = this.A05;
            egl10.eglDestroySurface(eGLDisplay, this.A08);
            egl10.eglDestroyContext(this.A07, this.A06);
            EGLDisplay eGLDisplay3 = this.A07;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay3, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            egl10.eglTerminate(this.A07);
        }
        this.A07 = eGLDisplay2;
        this.A06 = EGL10.EGL_NO_CONTEXT;
        this.A08 = EGL10.EGL_NO_SURFACE;
        Surface surface = this.A01;
        if (surface != null) {
            surface.release();
        }
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Object obj = this.A0G;
        synchronized (obj) {
            if (this.A09) {
                throw AnonymousClass001.A0T("mFrameAvailable already set, frame could be dropped");
            }
            this.A09 = true;
            obj.notifyAll();
        }
    }
}
