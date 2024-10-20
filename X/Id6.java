package X;

/* loaded from: Id6.class */
public final class Id6 implements JLq {
    public volatile JG3 A00;

    @Override // X.JLq
    public void Bzh() {
    }

    @Override // X.JLq
    public void CvC(Integer num) {
    }

    @Override // X.JLq
    public void D1H(JG3 jg3) {
        this.A00 = jg3;
    }

    @Override // X.JLq
    public void onFrameAvailable() {
        JG3 jg3 = this.A00;
        if (jg3 != null) {
            jg3.CfS(null);
        }
    }

    @Override // X.JLq
    public void stop() {
        this.A00 = null;
    }
}
