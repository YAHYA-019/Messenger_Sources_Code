package X;

import android.view.Surface;

/* renamed from: X.Ge0, reason: case insensitive filesystem */
/* loaded from: Ge0.class */
public class C2458Ge0 extends IOr implements JOo, JEJ {
    public int A00;
    public int A01;
    public Surface A02;
    public JHx A03;
    public final Hp7 A04;
    public final HB9 A05;

    public C2458Ge0(Surface surface, HB9 hb9, int i, int i2) {
        if (surface == null) {
            throw AnonymousClass001.A0L("surface cannot be null");
        }
        this.A02 = surface;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = hb9;
        this.A04 = new Hp7();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0.isValid() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ADY() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = super.ADY()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1d
            r0 = r301
            android.view.Surface r0 = r0.A02
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1d
            r0 = r303
            boolean r0 = r0.isValid()
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L21
        L1d:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L21:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2458Ge0.ADY():boolean");
    }

    @Override // X.JOo
    public Integer AnF() {
        return 0S2.A00;
    }

    public H9r Aqv() {
        return null;
    }

    public String Aui() {
        return "SurfaceOutput";
    }

    @Override // X.JOo
    public int B8t() {
        return 0;
    }

    public HB9 BJV() {
        return this.A05;
    }

    public void BOk(JHx jHx, JEM jem) {
        this.A03 = jHx;
        Surface surface = this.A02;
        if (surface != null) {
            jHx.D3i(surface, this);
        }
    }

    public void CtA(long j) {
        HB9 hb9 = this.A05;
        if (hb9 == HB9.A01 || hb9 == HB9.A04) {
            j = this.A04.A00(j);
        }
        super.CtA(j);
    }

    public void destroy() {
        release();
    }

    public int getHeight() {
        return this.A00;
    }

    public int getWidth() {
        return this.A01;
    }
}
