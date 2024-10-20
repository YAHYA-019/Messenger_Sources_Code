package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: Ijz.class */
public final class Ijz implements JNR {
    public final /* synthetic */ Ik4 A00;

    public Ijz(Ik4 ik4) {
        this.A00 = ik4;
    }

    public void A5a(MediaEffect mediaEffect, int i) {
    }

    public void A7a(int i) {
    }

    public IjV AMr(long j) {
        Hud hud = this.A00.A06;
        hud.getClass();
        return hud.A01(250000L);
    }

    public void ANx(long j) {
    }

    public String Ajl() {
        Hud hud = this.A00.A06;
        hud.getClass();
        String str = null;
        try {
            str = hud.A05.getName();
        } catch (IllegalStateException unused) {
        }
        return str;
    }

    public MediaFormat B0h() {
        Hud hud = this.A00.A06;
        hud.getClass();
        return hud.A00;
    }

    public int B0n() {
        I8v i8v = this.A00.A03;
        i8v.getClass();
        return (i8v.A0B + i8v.A05) % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH;
    }

    public void CYq(Context context, Hqj hqj, I8v i8v, HLh hLh, I9e i9e, int i) {
        HBJ hbj = HBJ.A0A;
        I4o i4o = i8v.A0G;
        if (i4o != null) {
            hbj = i4o.A04;
        }
        int i2 = i8v.A0C;
        int i3 = i8v.A0A;
        boolean z = false;
        int i4 = 1;
        int i5 = 256;
        int i6 = -1;
        int A01 = i8v.A01();
        int i7 = i8v.A03;
        int i8 = i8v.A02;
        I4o i4o2 = i8v.A0G;
        if (i4o2 != null) {
            i4 = i4o2.A03;
            i5 = i4o2.A02;
            z = true;
        }
        int i9 = i8v.A0D;
        if (i9 != -1) {
            i6 = i9;
        }
        MediaFormat A00 = HLe.A00(hbj, null, 0, i6, i3, i7, i5, i4, A01, i8, i2, false, z);
        java.util.Map map = i8v.A0K;
        if (map != null) {
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                A00.setInteger(AnonymousClass001.A0j(A0z), AnonymousClass001.A03(A0z.getValue()));
            }
        }
        Ik4 ik4 = this.A00;
        Hud A02 = IEP.A02(A00, H9P.A02, i9e, hbj.value, i8v.A0I);
        ik4.A06 = A02;
        A02.A02();
        ISp iSp = new ISp(context.getResources());
        Hud hud = ik4.A06;
        IFX.A07(AnonymousClass001.A1W(hud.A07, 0S2.A01), (String) null);
        ik4.A07 = new I0T(hud.A06, iSp, i8v);
        ik4.A03 = i8v;
        Hce hce = i8v.A0F;
        hce.getClass();
        ik4.A02 = hce;
        ik4.A01 = 4294896296L;
    }

    public void Ccu(IjV ijV) {
        Hud hud = this.A00.A06;
        hud.getClass();
        hud.A08.append("releaseOutputBuffer,");
        hud.A04(ijV, hud.A0A);
    }

    public void CeD(MediaEffect mediaEffect, int i) {
    }

    public void CfH(int i) {
    }

    public void CfX(long j) {
        Ik4 ik4 = this.A00;
        ik4.A02.getClass();
        ik4.A07.getClass();
        if ((ik4.A08 || j - ik4.A01 < 71000) && !ik4.A02.A01) {
            return;
        }
        ik4.A01 = j;
        I0T i0t = ik4.A07;
        SurfaceTexture surfaceTexture = i0t.A02;
        surfaceTexture.getClass();
        float[] fArr = i0t.A0E;
        surfaceTexture.getTransformMatrix(fArr);
        I8v i8v = i0t.A06;
        int i = i8v.A08;
        int i2 = i8v.A06;
        HsS hsS = new HsS(i, i2, false);
        List list = i0t.A0B;
        list.getClass();
        list.add(hsS);
        i0t.A0D.add(Long.valueOf(j));
        GLES20.glBindFramebuffer(36160, hsS.A00);
        GLES20.glViewport(0, 0, i, i2);
        ROC roc = i0t.A07;
        roc.getClass();
        int i3 = i0t.A00;
        GLES20.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i3);
        I9C A00 = roc.A00.A00();
        A00.A05("uSTMatrix", fArr);
        A00.A05("uConstMatrix", roc.A03);
        A00.A05("uSceneMatrix", roc.A05);
        A00.A05("uContentTransform", roc.A04);
        A00.A02(roc.A01);
        GLES20.glFinish();
        GLES20.glBindFramebuffer(36160, 0);
        Hce hce = i0t.A05;
        hce.getClass();
        if (hce.A01) {
            return;
        }
        I0T.A00(hsS, i0t, j);
    }

    public void D0a() {
        Ik4 ik4 = this.A00;
        if (!ik4.A08) {
            Ik4.A00(ik4);
        }
        Hud hud = ik4.A06;
        hud.getClass();
        IFX.A07(AnonymousClass001.A1W(hud.A07, 0S2.A01), (String) null);
        hud.A05.signalEndOfInputStream();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.I3R] */
    public void finish() {
        ?? obj = new Object();
        Ik4 ik4 = this.A00;
        new H3f((I3R) obj, ik4.A06).A00();
        ik4.A07.getClass();
        IGk iGk = ik4.A07.A0A;
        iGk.getClass();
        synchronized (iGk) {
        }
        I0T i0t = ik4.A07;
        Qy3 qy3 = i0t.A09;
        qy3.getClass();
        EGLDisplay eGLDisplay = qy3.A02;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            GOo.A1A(eGLDisplay);
        }
        Qy3 qy32 = i0t.A09;
        qy32.getClass();
        EGLDisplay eGLDisplay2 = qy32.A02;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            GOo.A1A(eGLDisplay2);
            EGL14.eglDestroySurface(qy32.A02, qy32.A03);
            EGL14.eglDestroyContext(qy32.A02, qy32.A01);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(qy32.A02);
        }
        qy32.A02 = EGL14.EGL_NO_DISPLAY;
        qy32.A01 = EGL14.EGL_NO_CONTEXT;
        qy32.A00 = null;
        i0t.A09 = null;
        GLES20.glDeleteTextures(1, new int[]{i0t.A00}, 0);
        i0t.A00 = -1;
        SurfaceTexture surfaceTexture = i0t.A02;
        surfaceTexture.getClass();
        surfaceTexture.release();
        i0t.A02 = null;
        Surface surface = i0t.A04;
        surface.getClass();
        surface.release();
        i0t.A04 = null;
        ROC roc = i0t.A07;
        roc.getClass();
        roc.A00.A01();
        i0t.A07 = null;
        ROl rOl = i0t.A08;
        rOl.getClass();
        rOl.A01.A01();
        i0t.A08 = null;
        List list = i0t.A0B;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((HsS) it.next()).A01();
        }
        List list2 = i0t.A0B;
        list2.getClass();
        list2.clear();
        i0t.A0B = null;
        i0t.A0A = null;
        HandlerThread handlerThread = i0t.A03;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            i0t.A03 = null;
        }
        obj.A02();
    }

    public void flush() {
    }
}
