package X;

import android.opengl.EGL14;

/* loaded from: J3s.class */
public final class J3s implements Runnable {
    public static final String __redex_internal_original_name = "RendererSurfacePipeComponent$4";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ Gts A05;
    public final /* synthetic */ I5d A06;
    public final /* synthetic */ boolean A07;

    public J3s(Gts gts, I5d i5d, int i, int i2, int i3, int i4, int i5, boolean z) {
        this.A05 = gts;
        this.A06 = i5d;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A00 = i5;
        this.A07 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        Gts gts = this.A05;
        I5d i5d = this.A06;
        int i = this.A03;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A04;
        int i5 = this.A00;
        boolean z = this.A07;
        gts.A03 = i;
        gts.A01 = i2;
        gts.A02 = i3;
        gts.A04 = i4;
        gts.A00 = i5;
        gts.A06 = z;
        if (gts.A0K == null) {
            gts.A0K = new IGl(gts.A0F);
            Gts.A00(gts);
        }
        I5d i5d2 = gts.A0L;
        if (i5d2 != null && i5d2 != i5d) {
            IGl iGl = gts.A0K;
            if (iGl != null) {
                iGl.A00();
            }
            i5d2.A01();
        }
        gts.A0L = i5d;
        Id5 id5 = gts.A0K;
        JLq jLq = gts.A0J;
        if (id5 != null) {
            Id5 id52 = jLq != null ? gts.A0C : id5;
            synchronized (id5) {
                if (!AnonymousClass001.A1W(((IGl) id5).A02.A02, EGL14.EGL_NO_DISPLAY)) {
                    ((IGl) id5).A03.A02(id52, i5d);
                }
            }
        }
        Gts.A01(gts);
    }
}
