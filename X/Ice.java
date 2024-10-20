package X;

/* loaded from: Ice.class */
public final class Ice implements JLE {
    public HsY A00 = null;
    public JMu A01;
    public final HhA A02;
    public final I1d A03;

    public Ice(I1d i1d) {
        this.A03 = i1d;
        I2I A00 = I2I.A00();
        I7A.A01(A00, new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}, 2);
        A00.A01(new I7A(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}, 2), "aTexCoord");
        this.A02 = new HhA(A00);
    }

    public void AAv(JMu jMu) {
        JMu jMu2 = this.A01;
        if (jMu2 != null && jMu2 != jMu) {
            this.A03.A00(HBq.A0U);
        }
        this.A01 = jMu;
    }

    public void AN3() {
        HsY hsY = this.A00;
        if (hsY != null) {
            hsY.A01();
            this.A00 = null;
        }
        this.A01 = null;
    }

    public void BOo(I9U i9u) {
    }

    public void release() {
    }
}
