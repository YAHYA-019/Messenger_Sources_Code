package X;

/* loaded from: Ewd.class */
public final class Ewd {
    public final FG6 A00;
    public final DLQ A01;

    public Ewd(FG6 fg6, DLQ dlq) {
        this.A01 = dlq;
        this.A00 = fg6;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Ewd) {
            Ewd ewd = (Ewd) obj;
            if (this.A01 == ewd.A01 && this.A00.equals(ewd.A00)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(this.A01, this.A00);
    }
}
