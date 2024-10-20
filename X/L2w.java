package X;

/* loaded from: L2w.class */
public final class L2w {
    public final Object A00;
    public final Throwable A01;

    public L2w(Object obj) {
        this.A00 = obj;
        this.A01 = null;
    }

    public L2w(Throwable th) {
        this.A01 = th;
        this.A00 = null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            boolean z = false;
            if (obj instanceof L2w) {
                L2w l2w = (L2w) obj;
                Object obj2 = this.A00;
                if (obj2 == null || !obj2.equals(l2w.A00)) {
                    Throwable th = this.A01;
                    if (th != null && l2w.A01 != null) {
                        z = DKG.A1a(th, th.toString());
                    }
                }
            }
            return z;
        }
        return true;
    }

    public int hashCode() {
        return AbM.A05(this.A00, this.A01);
    }
}
