package X;

/* loaded from: Idv.class */
public final class Idv implements JGG {
    public final /* synthetic */ IeE A00;

    public Idv(IeE ieE) {
        this.A00 = ieE;
    }

    public void Bze(Ie3 ie3) {
        IeE ieE = this.A00;
        ieE.A01 = ie3;
        I5y i5y = ieE.A02;
        if (i5y != null) {
            if (i5y.A09()) {
                IeE.A00(ieE);
            } else if (ieE.A00 != null) {
                try {
                    ieE.A02.A07("onFrameCaptured", ieE.A07);
                } catch (Exception unused) {
                }
            }
        }
    }
}
