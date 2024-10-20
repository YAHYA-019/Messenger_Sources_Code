package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* loaded from: I2Y.class */
public final class I2Y {
    public Hua A00;
    public Hua A01;
    public final SurfaceTexture.OnFrameAvailableListener A02 = new IGg(this, 3);
    public final I5G A03;
    public final I4s A04;
    public final IDQ A05;
    public final Hp7 A06;

    public I2Y() {
        Object obj = I5G.A05;
        I5G i5g = new I5G(obj);
        this.A03 = i5g;
        i5g.A01();
        this.A05 = new IDQ();
        this.A04 = new I4s(i5g, obj);
        this.A06 = new Hp7();
    }

    public static void A00(I2Y i2y, Hua hua) {
        I5d i5d;
        I5G i5g;
        IDQ idq;
        I4s i4s;
        int i;
        float[] fArr;
        int i2;
        int i3;
        I5G i5g2;
        int i4;
        if (hua == null || (i5d = hua.A02) == null) {
            return;
        }
        synchronized (i5d) {
            if (i5d.A04()) {
                try {
                    hua.A01();
                    idq = i2y.A05;
                    i4s = i2y.A04;
                    i = i4s.A00;
                    fArr = i4s.A01;
                    i2 = i4s.A05;
                    i3 = i4s.A04;
                    i5g2 = hua.A01;
                } catch (RuntimeException unused) {
                    i5g = i2y.A03;
                } catch (Throwable th) {
                    i2y.A03.A01();
                    throw th;
                }
                if (i5g2 != null && !AnonymousClass001.A1W(i5g2.A02, EGL14.EGL_NO_DISPLAY)) {
                    EGLSurface eGLSurface = hua.A00;
                    if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                        EGLDisplay eGLDisplay = i5g2.A02;
                        int[] iArr = hua.A04;
                        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0);
                        i4 = iArr[0];
                        idq.A04(fArr, i, i2, i3, i4, hua.A00(), 0, false);
                        hua.A04(i2y.A06.A00(i4s.A06));
                        hua.A03();
                        i5g = i2y.A03;
                        i5g.A01();
                    }
                }
                i4 = 0;
                idq.A04(fArr, i, i2, i3, i4, hua.A00(), 0, false);
                hua.A04(i2y.A06.A00(i4s.A06));
                hua.A03();
                i5g = i2y.A03;
                i5g.A01();
            }
        }
    }

    public void A01() {
        synchronized (this) {
            I5G i5g = this.A03;
            if (!AnonymousClass001.A1W(i5g.A02, EGL14.EGL_NO_DISPLAY)) {
                I4s i4s = this.A04;
                I5d i5d = i4s.A07;
                if (i5d != null) {
                    i4s.A01();
                    i5d.A01();
                }
                Hua hua = this.A01;
                if (hua != null) {
                    hua.A02();
                }
                this.A01 = null;
                Hua hua2 = this.A00;
                if (hua2 != null) {
                    hua2.A02();
                }
                this.A00 = null;
                this.A05.A03();
                i5g.A02();
            }
        }
    }
}
