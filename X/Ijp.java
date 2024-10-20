package X;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.io.File;

/* loaded from: Ijp.class */
public final class Ijp implements JNV {
    public EGLContext A00;
    public EGLDisplay A01;
    public EGLSurface A02;
    public IFI A03;
    public final Surface A04;
    public final JL0 A05;
    public final I9e A06;
    public final /* synthetic */ Hcf A07;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e8, code lost:
    
        if (r301.A06.A1Z() == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Ijp(android.content.Context r302, android.view.Surface r303, X.Hqj r304, X.I8v r305, X.I9d r306, X.JJI r307, X.Hcf r308, X.HuZ r309, X.HLh r310, X.I9e r311) {
        /*
            Method dump skipped, instructions count: 1501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ijp.<init>(android.content.Context, android.view.Surface, X.Hqj, X.I8v, X.I9d, X.JJI, X.Hcf, X.HuZ, X.HLh, X.I9e):void");
    }

    public void A5a(MediaEffect mediaEffect, int i) {
        JNc jNc = this.A07.A00;
        jNc.getClass();
        jNc.A5a(mediaEffect, i);
    }

    public void A7a(int i) {
        JNc jNc = this.A07.A00;
        jNc.getClass();
        jNc.A7a(i);
    }

    public void ANx(long j) {
        HvA.A01("TranscodeOutputSurfaceForJBMMR2.displayFrame()");
        JNc jNc = this.A07.A00;
        jNc.getClass();
        jNc.ANw(0, j);
        HvA.A00();
    }

    public void AOV(long j) {
        JNc jNc = this.A07.A00;
        jNc.getClass();
        jNc.AOV(j);
    }

    public void CeD(MediaEffect mediaEffect, int i) {
        JNc jNc = this.A07.A00;
        if (jNc != null) {
            jNc.CeD(mediaEffect, i);
        }
    }

    public Bitmap CjO() {
        JNc jNc = this.A07.A00;
        jNc.getClass();
        return jNc.CjS(0);
    }

    public void Cl8(JJD jjd) {
        JJF jjf = this.A07.A00;
        if (jjf instanceof JJF) {
            jjf.CZQ(jjd);
        }
    }

    public void Cl9(JJD jjd, JJE jje) {
        JJF jjf = this.A07.A00;
        if (jjf instanceof JJF) {
            jjf.CZR(jjd, jje);
        }
    }

    public void D47(JLQ jlq, File file, int i, int i2, boolean z) {
        JNc jNc = this.A07.A00;
        if (jNc instanceof JGo) {
            ((JGo) jNc).D47(jlq, file, i, i2, false);
        } else {
            jlq.BwP(AnonymousClass001.A0q("FrameRenderer does not support snapshot"));
        }
    }

    public void D6u(Surface surface) {
        JNc jNc = this.A07.A00;
        jNc.getClass();
        jNc.CsB(surface, null, 0);
    }

    public void D7I(I9d i9d) {
        JNc jNc = this.A07.A00;
        jNc.getClass();
        jNc.D7I(i9d);
    }

    public void D7U(int i) {
        JNc jNc = this.A07.A00;
        jNc.getClass();
        jNc.D7V(0, i);
    }

    public void DAE() {
        this.A07.A00.getClass();
    }

    public void cancel() {
        JNc jNc = this.A07.A00;
        if (jNc != null) {
            jNc.cancel();
        }
    }

    public void flush() {
        JNc jNc = this.A07.A00;
        jNc.getClass();
        jNc.flush();
    }

    public void release() {
        EGLSurface eGLSurface;
        boolean A0J = this.A06.A0J();
        Hcf hcf = this.A07;
        JNc jNc = hcf.A00;
        if (jNc != null && A0J) {
            jNc.release();
        }
        IFI ifi = this.A03;
        if (ifi != null) {
            ifi.A0A();
        }
        if (this.A00 != null) {
            if (EGL14.eglGetCurrentContext().equals(this.A00)) {
                GOo.A1A(this.A01);
            }
            EGL14.eglDestroyContext(this.A01, this.A00);
        }
        EGLDisplay eGLDisplay = this.A01;
        if (eGLDisplay != null && (eGLSurface = this.A02) != null) {
            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        }
        JNc jNc2 = hcf.A00;
        if (jNc2 != null && !A0J) {
            jNc2.release();
        }
        this.A01 = null;
        this.A03 = null;
        this.A00 = null;
        this.A02 = null;
        hcf.A00 = null;
    }
}
