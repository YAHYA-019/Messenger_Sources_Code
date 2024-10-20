package X;

/* loaded from: Icx.class */
public final class Icx implements JG1 {
    public final int A00;
    public final Object A01;

    public Icx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.JG1
    public final void onFrameAvailable() {
        JLq jLq;
        switch (this.A00) {
            case 0:
                jLq = ((HkX) this.A01).A0C;
                jLq.onFrameAvailable();
            case 1:
                jLq = ((Gtr) this.A01).A0S;
                break;
            default:
                jLq = ((Gtq) this.A01).A0P;
                break;
        }
        if (jLq == null) {
            return;
        }
        jLq.onFrameAvailable();
    }
}
