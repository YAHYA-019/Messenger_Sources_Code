package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.io.File;

/* loaded from: Ijo.class */
public final class Ijo implements JNV {
    public final I9e A00;
    public final /* synthetic */ Hcf A01;

    public Ijo(Context context, Surface surface, Hqj hqj, I8v i8v, I9d i9d, JJI jji, Hcf hcf, HuZ huZ, HLh hLh, I9e i9e) {
        this.A01 = hcf;
        this.A00 = i9e;
        if (hcf.A00 == null) {
            JNc AIq = jji.AIq(context, EGL14.EGL_NO_CONTEXT, EGL14.EGL_NO_DISPLAY, EGL14.EGL_NO_SURFACE, (IFI) null, (JL0) null, hqj, i8v, i9d, i9e, 0S2.A00);
            hcf.A00 = AIq;
            if (huZ != null) {
                synchronized (huZ.A02) {
                    huZ.A00 = AIq;
                }
            }
            hcf.A00.init();
        }
        JNc jNc = hcf.A00;
        jNc.getClass();
        jNc.CsB(surface, hLh, 0);
    }

    public void A5a(MediaEffect mediaEffect, int i) {
        JNc jNc = this.A01.A00;
        jNc.getClass();
        jNc.A5a(mediaEffect, i);
    }

    public void A7a(int i) {
        JNc jNc = this.A01.A00;
        jNc.getClass();
        jNc.A7a(i);
    }

    public void ANx(long j) {
        HvA.A01("TranscodeOutputSurfaceForJBMMR2.displayFrame()");
        JNc jNc = this.A01.A00;
        jNc.getClass();
        jNc.ANw(0, j);
        HvA.A00();
    }

    public void AOV(long j) {
        JNc jNc = this.A01.A00;
        jNc.getClass();
        jNc.AOV(j);
    }

    public void CeD(MediaEffect mediaEffect, int i) {
        JNc jNc = this.A01.A00;
        if (jNc != null) {
            jNc.CeD(mediaEffect, i);
        }
    }

    public Bitmap CjO() {
        JNc jNc = this.A01.A00;
        jNc.getClass();
        return jNc.CjS(0);
    }

    public void Cl8(JJD jjd) {
        JJF jjf = this.A01.A00;
        if (jjf instanceof JJF) {
            jjf.CZQ(jjd);
        }
    }

    public void Cl9(JJD jjd, JJE jje) {
        JJF jjf = this.A01.A00;
        if (jjf instanceof JJF) {
            jjf.CZR(jjd, jje);
        }
    }

    public void D47(JLQ jlq, File file, int i, int i2, boolean z) {
        JNc jNc = this.A01.A00;
        if (jNc instanceof JGo) {
            ((JGo) jNc).D47(jlq, file, i, i2, false);
        } else {
            jlq.BwP(AnonymousClass001.A0q("FrameRenderer does not support snapshot"));
        }
    }

    public void D6u(Surface surface) {
        JNc jNc = this.A01.A00;
        jNc.getClass();
        jNc.CsB(surface, null, 0);
    }

    public void D7I(I9d i9d) {
        JNc jNc = this.A01.A00;
        jNc.getClass();
        jNc.D7I(i9d);
    }

    public void D7U(int i) {
        JNc jNc = this.A01.A00;
        jNc.getClass();
        jNc.D7V(0, i);
    }

    public void DAE() {
        this.A01.A00.getClass();
    }

    public void cancel() {
        JNc jNc = this.A01.A00;
        if (jNc != null) {
            jNc.cancel();
        }
    }

    public void flush() {
        JNc jNc = this.A01.A00;
        jNc.getClass();
        jNc.flush();
    }

    public void release() {
        Hcf hcf = this.A01;
        JNc jNc = hcf.A00;
        if (jNc != null) {
            jNc.release();
        }
        hcf.A00 = null;
    }
}
