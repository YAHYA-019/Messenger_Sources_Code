package X;

/* loaded from: Dpu.class */
public final class Dpu extends FiZ {
    public final int A00;

    public Dpu(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void Bir(5Gk r302) {
        switch (this.A00) {
            case 0:
            case 2:
            case 3:
            case 6:
            case 7:
            case 8:
                11T.A0F(r302, 0);
                r302.Cfo();
                return;
            case 1:
                11T.A0F(r302, 0);
                r302.Cfo();
                r302.CXT();
                return;
            case 4:
                11T.A0F(r302, 0);
                r302.Cfo().CXT();
                return;
            case 5:
                r302.Cfo().CXT();
                return;
            case 9:
                r302.Cfo();
                return;
            default:
                return;
        }
    }
}
