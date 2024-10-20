package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: Ijm.class */
public final class Ijm implements JNc {
    public SurfaceTexture A02;
    public HsY A03;
    public HsT A04;
    public Hqj A05;
    public I8v A06;
    public I9e A07;
    public boolean A08;
    public final JL0 A09;
    public final List A0B;
    public final float[] A0C;
    public final float[] A0D;
    public final float[] A0E;
    public final float[] A0F;
    public final EGLContext A0G;
    public final EGLDisplay A0H;
    public final EGLSurface A0I;
    public final HhA A0J = Hw0.A00();
    public final I5I A0A = new I5I();
    public int A01 = -12345;
    public int A00 = 0;

    public Ijm(Context context, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLSurface eGLSurface, JL0 jl0, Hqj hqj, I8v i8v, I9d i9d, I9e i9e) {
        float[] fArr = new float[16];
        this.A0E = fArr;
        float[] fArr2 = new float[16];
        this.A0C = fArr2;
        float[] fArr3 = new float[16];
        this.A0F = fArr3;
        float[] fArr4 = new float[16];
        this.A0D = fArr4;
        jl0.getClass();
        this.A09 = jl0;
        this.A06 = i8v;
        this.A0G = eGLContext;
        this.A0H = eGLDisplay;
        this.A0I = eGLSurface;
        boolean z = i8v.A0N;
        this.A08 = z;
        if (z) {
            List list = i8v.A0J;
            if (list == null) {
                list = AnonymousClass001.A0s();
                i8v.A0J = list;
            }
            if (list.isEmpty()) {
                i8v.A0J.add(new IiJ(false));
            }
        }
        List list2 = this.A06.A0J;
        this.A0B = list2 == null ? Collections.emptyList() : list2;
        this.A07 = i9e;
        this.A05 = hqj;
        if (hqj == null && i9d != null) {
            HashMap A08 = i9d.A08(HAy.A03);
            A08.getClass();
            File file = AbstractC2326GOr.A0Y(((Huc) GOp.A15(AnonymousClass001.A0x(A08))).A04).A04;
            IFX.A06(file);
            this.A05 = IFS.A02(context, Uri.fromFile(file).toString(), false);
        }
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr3, 0);
        Hw0.A01(i8v, fArr2, fArr4);
    }

    @Override // X.JNc
    public void A5a(MediaEffect mediaEffect, int i) {
    }

    @Override // X.JNc
    public void A7a(int i) {
    }

    @Override // X.JNc
    public void ANw(int i, long j) {
        EGLDisplay eGLDisplay = this.A0H;
        EGLSurface eGLSurface = this.A0I;
        EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j);
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
    }

    @Override // X.JNc
    public void AOV(long j) {
        N34.A02("onDrawFrame start", AnonymousClass001.A1Z());
        List<JMy> list = this.A0B;
        if (list.isEmpty()) {
            SurfaceTexture surfaceTexture = this.A02;
            float[] fArr = this.A0E;
            surfaceTexture.getTransformMatrix(fArr);
            GLES20.glClear(16640);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, this.A01);
            I9C A00 = this.A03.A00();
            A00.A05("uSTMatrix", fArr);
            A00.A05("uConstMatrix", this.A0C);
            A00.A05("uSceneMatrix", this.A0F);
            A00.A05("uContentTransform", this.A0D);
            A00.A02(this.A0J);
            GLES20.glFinish();
            return;
        }
        IFX.A07(AnonymousClass001.A1T(this.A04), (String) null);
        SurfaceTexture surfaceTexture2 = this.A02;
        float[] fArr2 = this.A0E;
        surfaceTexture2.getTransformMatrix(fArr2);
        if (this.A08) {
            I9r.A02(fArr2);
        }
        for (JMy jMy : list) {
            long micros = TimeUnit.NANOSECONDS.toMicros(j);
            I5I i5i = this.A0A;
            i5i.A02(this.A04, fArr2, this.A0C, this.A0F, this.A0D, j);
            jMy.BvA(i5i, micros);
        }
    }

    @Override // X.JNc
    public SurfaceTexture Aqx(int i, boolean z) {
        return this.A02;
    }

    @Override // X.JNc
    public /* synthetic */ void C1v(int i) {
    }

    @Override // X.JNc
    public void CAT() {
    }

    @Override // X.JNc
    public void CAU() {
    }

    @Override // X.JNc
    public void CeD(MediaEffect mediaEffect, int i) {
    }

    @Override // X.JNc
    public Bitmap CjS(int i) {
        I8v i8v = this.A06;
        return R3i.A00(i8v.A0C, i8v.A0A);
    }

    @Override // X.JNc
    public void CsB(Surface surface, HLh hLh, int i) {
    }

    @Override // X.JNc
    public void D6c(int i, Bitmap bitmap) {
        int i2;
        I9r.A03(this.A0C, this.A06.A07);
        if (this.A0B.isEmpty()) {
            i2 = this.A01;
        } else {
            HsT hsT = this.A04;
            IFX.A07(AnonymousClass001.A1T(hsT), (String) null);
            i2 = hsT.A00;
        }
        GLES20.glBindTexture(3553, i2);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
    }

    @Override // X.JNc
    public void D6z(HWs hWs, int i) {
    }

    @Override // X.JNc
    public void D7I(I9d i9d) {
    }

    @Override // X.JNc
    public /* synthetic */ void D7V(int i, int i2) {
    }

    @Override // X.JNc
    public /* synthetic */ void cancel() {
    }

    @Override // X.JNc
    public void flush() {
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0243  */
    @Override // X.JNc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init() {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ijm.init():void");
    }

    @Override // X.JNc
    public void release() {
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            ((JMy) it.next()).CPG();
        }
    }
}
