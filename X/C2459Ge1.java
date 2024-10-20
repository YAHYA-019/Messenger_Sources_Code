package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;

/* renamed from: X.Ge1, reason: case insensitive filesystem */
/* loaded from: Ge1.class */
public final class C2459Ge1 extends IOr implements JOo, JOn {
    public int A00;
    public int A01;
    public SurfaceTexture A03;
    public HsT A04;
    public Surface A05;
    public JL0 A06;
    public final JLa A07;
    public final boolean A0A;
    public final float[] A0B = GOn.A1a();
    public final I5I A08 = new I5I();
    public long A02 = 0;
    public final H3X A09 = new H3X(false);

    public C2459Ge1(JLa jLa, JL0 jl0, int i, int i2, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A07 = jLa;
        this.A06 = jl0;
        this.A0A = z;
    }

    @Override // X.JOo
    public Integer AnF() {
        return 0S2.A00;
    }

    public H9r Aqv() {
        return null;
    }

    public String Aui() {
        return "BurstFramesOutput";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.JJD, java.lang.Object] */
    @Override // X.JOn
    public JJD B72() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.JJD, java.lang.Object] */
    @Override // X.JOn
    public JJD B73() {
        return new Object();
    }

    @Override // X.JOo
    public int B8t() {
        return 1;
    }

    public HB9 BJV() {
        return HB9.A01;
    }

    public void BOk(JHx jHx, JEM jem) {
        HsT A00 = I8U.A00("BurstFramesOutput");
        this.A04 = A00;
        SurfaceTexture surfaceTexture = new SurfaceTexture(A00.A00);
        this.A03 = surfaceTexture;
        int i = this.A01;
        int i2 = this.A00;
        surfaceTexture.setDefaultBufferSize(i, i2);
        this.A05 = new Surface(this.A03);
        H3X h3x = this.A09;
        JL0 jl0 = this.A06;
        h3x.A00 = jl0;
        this.A07.BOt(jem, null, jl0, i, i2);
        jHx.D3i(this.A05, this);
    }

    public void CtA(long j) {
        this.A02 = j;
    }

    public void D3m() {
        super.D3m();
        this.A03.updateTexImage();
        SurfaceTexture surfaceTexture = this.A03;
        float[] fArr = this.A0B;
        surfaceTexture.getTransformMatrix(fArr);
        JLa jLa = this.A07;
        if (jLa.CxH(this.A02)) {
            if (this.A0A) {
                jLa.CQ1(this.A04, fArr, this.A02);
                return;
            }
            HsS hsS = new HsS(this.A01, this.A00, false);
            GLES20.glBindFramebuffer(36160, hsS.A00);
            GLES20.glViewport(0, 0, hsS.A02, hsS.A01);
            H3X h3x = this.A09;
            I5I i5i = this.A08;
            i5i.A01(this.A04, fArr, null, null, this.A02);
            h3x.BvA(i5i, 0L);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glBindTexture(3553, 0);
            jLa.Bzf(hsS, this.A02);
        }
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

    public void release() {
        Surface surface = this.A05;
        if (surface != null) {
            surface.release();
            this.A05 = null;
        }
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A03 = null;
        }
        HsT hsT = this.A04;
        if (hsT != null) {
            hsT.A01();
            this.A04 = null;
        }
        this.A07.release();
        super.release();
        this.A09.CPG();
    }
}
