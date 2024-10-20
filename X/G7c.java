package X;

/* loaded from: G7c.class */
public final /* synthetic */ class G7c implements 0Jf, 3lQ {
    public final /* synthetic */ Fit A00;

    public G7c(Fit fit) {
        this.A00 = fit;
    }

    public final void Cgh(EzD ezD) {
        this.A00.Cgh(ezD);
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof 3lQ) && (obj instanceof 0Jf)) {
            z = 11T.A0O(getFunctionDelegate(), ((0Jf) obj).getFunctionDelegate());
        }
        return z;
    }

    public final C00l getFunctionDelegate() {
        return new 01I(1, this.A00, Fit.class, "request", "request(Lcom/facebook/litho/PendingStateUpdate;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
