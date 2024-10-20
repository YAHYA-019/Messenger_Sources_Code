package X;

import android.opengl.GLES20;

/* loaded from: Icb.class */
public final class Icb implements JMg {
    public final HsS A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final HsT A04;
    public final boolean A05;

    public Icb(int i, int i2, boolean z) {
        HsS hsS = new HsS(i, i2, z);
        this.A00 = hsS;
        this.A03 = hsS.A02;
        this.A02 = hsS.A01;
        this.A01 = hsS.A00;
        this.A05 = hsS.A04;
        HsT hsT = hsS.A03;
        11T.A09(hsT);
        this.A04 = hsT;
    }

    @Override // X.JMg
    public void bind() {
        GLES20.glBindFramebuffer(36160, this.A00.A00);
    }

    @Override // X.JMg
    public int getFrameBufferId() {
        return this.A01;
    }

    @Override // X.JMg
    public int getHeight() {
        return this.A02;
    }

    @Override // X.JMg
    public HsT getTexture() {
        return this.A04;
    }

    @Override // X.JMg
    public int getWidth() {
        return this.A03;
    }

    @Override // X.JMg
    public boolean is10Bit() {
        return this.A05;
    }

    @Override // X.JMg
    public void release() {
        this.A00.A01();
    }

    @Override // X.JMg
    public void unbind() {
        GLES20.glBindFramebuffer(36160, 0);
    }
}
