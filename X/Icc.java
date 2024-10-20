package X;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: Icc.class */
public final class Icc implements JMu {
    public IFI A00;
    public boolean A01;
    public final IFI A02;
    public final Huj A03;
    public final JL0 A04;
    public final Hy0 A05;
    public final JFz A06;
    public final HsM A07;
    public final Hbs A08;

    /* JADX WARN: Type inference failed for: r0v29, types: [X.JFz, java.lang.Object] */
    public Icc(Context context, IFI ifi, IFI ifi2, Hy0 hy0, I9U i9u) {
        C2551Ggz A03;
        this.A05 = hy0;
        this.A02 = ifi;
        HJQ hjq = Hy0.A03;
        Object A0d = 1BK.A0d();
        Object obj = hy0.A00.get(hjq);
        int i = AnonymousClass001.A1V(obj != null ? obj : A0d) ? 37 : 5;
        if (ifi2 != null) {
            int i2 = ifi2.A00;
            i = (i2 & 256) != 0 ? i | 256 : i;
            if ((i2 & 32) != 0) {
                i = Qzn.A00(ifi2, i | 32);
                if ((i2 & 8192) != 0) {
                    i |= 8192;
                }
            }
            ifi.A0C(ifi2, i);
        } else {
            ifi.A0B(EGL14.EGL_NO_CONTEXT, i);
        }
        this.A04 = new ISp(context.getResources());
        Object obj2 = ifi.A07;
        if (obj2 != null) {
            synchronized (obj2) {
                A03 = IFI.A03(ifi);
            }
        } else {
            A03 = IFI.A03(ifi);
        }
        this.A03 = A03;
        A03.A05();
        this.A06 = new Object();
        HsM hsM = new HsM(hy0, i9u);
        this.A07 = hsM;
        this.A08 = new Hbs(this);
        hsM.A00 = this;
    }

    @Override // X.JMu
    public IFI Aig() {
        return this.A02;
    }

    @Override // X.JMu
    public IFI Aih(int i) {
        IFI ifi = this.A02;
        if (0 == (ifi.A00 & 32)) {
            return ifi;
        }
        IFI ifi2 = this.A00;
        if (ifi2 == null) {
            Hy0 hy0 = this.A05;
            HJQ hjq = Hy0.A02;
            Object obj = I2L.A05;
            java.util.Map map = hy0.A00;
            Object obj2 = map.get(hjq);
            if (obj2 != null) {
                obj = obj2;
            }
            Object A12 = DKC.A12(Hy0.A07, map);
            11T.A0A(A12);
            ifi2 = ID2.A02(obj, AnonymousClass001.A03(A12));
            11T.A0I(ifi2, "null cannot be cast to non-null type com.facebook.gl.EGLCore<android.opengl.EGLContext>");
            ifi2.A0C(ifi, 5);
            this.A00 = ifi2;
        }
        return ifi2;
    }

    @Override // X.JMu
    public JL0 B57() {
        return this.A04;
    }

    @Override // X.JMu
    public HsM B76() {
        return this.A07;
    }

    @Override // X.JMu
    public Hbs BDn() {
        return this.A08;
    }

    @Override // X.JMu
    public JFz BEy() {
        return this.A06;
    }

    @Override // X.JMu
    public void BcD() {
        if (this.A01) {
            return;
        }
        this.A03.A05();
    }

    @Override // X.JMu
    public void finish() {
        GLES20.glFinish();
    }

    @Override // X.JMu
    public void flush() {
        GLES20.glFlush();
    }

    @Override // X.JMu
    public void release() {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        HsM hsM = this.A07;
        HzO hzO = hsM.A03;
        if (hzO != null) {
            java.util.Map map = hzO.A04;
            Iterator A1A = 1BK.A1A(map);
            while (A1A.hasNext()) {
                ((HsY) A1A.next()).A01();
            }
            map.clear();
        }
        HashMap hashMap = hsM.A04;
        Iterator A0x = AnonymousClass001.A0x(hashMap);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            ((JLE) A0z.getValue()).AN3();
            ((JLE) A0z.getValue()).release();
        }
        hashMap.clear();
        hsM.A00 = null;
        IFI ifi = this.A02;
        ifi.A09();
        this.A03.A02();
        ifi.A0A();
        IFI ifi2 = this.A00;
        if (ifi2 != null) {
            ifi2.A0A();
        }
    }
}
