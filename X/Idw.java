package X;

/* loaded from: Idw.class */
public final class Idw implements JGG {
    public final /* synthetic */ IeF A00;

    public Idw(IeF ieF) {
        this.A00 = ieF;
    }

    public void Bze(Ie3 ie3) {
        IeF ieF = this.A00;
        ieF.A02 = ie3;
        I5y i5y = ieF.A03;
        if (i5y != null) {
            if (i5y.A09()) {
                IeF.A01(ieF);
            } else if (ieF.A00 != null) {
                try {
                    ieF.A03.A07("onFrameCaptured", ieF.A08);
                } catch (Exception unused) {
                }
            }
        }
    }
}
