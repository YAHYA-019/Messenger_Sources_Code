package X;

/* loaded from: LuV.class */
public final /* synthetic */ class LuV implements 0Jf, MFI {
    public final /* synthetic */ Kqt A00;

    public LuV(Kqt kqt) {
        this.A00 = kqt;
    }

    public final boolean BuA(Fik fik) {
        11T.A0F(fik, 0);
        Kqt kqt = this.A00;
        kqt.A03 = true;
        kqt.A02 = false;
        new Kpj(LDF.A00(), kqt.A0B).A00(0S2.A04);
        return true;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof MFI) && (obj instanceof 0Jf)) {
            z = 11T.A0O(getFunctionDelegate(), ((0Jf) obj).getFunctionDelegate());
        }
        return z;
    }

    public final C00l getFunctionDelegate() {
        return new 01I(1, this.A00, Kqt.class, "onDismiss", "onDismiss(Lcom/facebook/fds/tooltip/FDSTooltip;)Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
