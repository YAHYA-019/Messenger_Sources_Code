package X;

/* loaded from: LuW.class */
public final /* synthetic */ class LuW implements 0Jf, MFI {
    public final /* synthetic */ Kqf A00;

    public LuW(Kqf kqf) {
        this.A00 = kqf;
    }

    public final boolean BuA(Fik fik) {
        11T.A0F(fik, 0);
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
        return new 01I(1, this.A00, Kqf.class, "onDismiss", "onDismiss(Lcom/facebook/fds/tooltip/FDSTooltip;)Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
