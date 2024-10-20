package X;

/* loaded from: Htm.class */
public final class Htm {
    public final int A00;
    public final HFS A01;
    public final Object A02;
    public final Throwable A03;
    public final boolean A04;

    public Htm(HFS hfs, Object obj, Throwable th, boolean z) {
        this.A04 = z;
        this.A03 = th;
        int i = 0;
        if (th != null) {
            i = th.getMessage() != null ? 7zM.A05(th.getMessage(), 0) : i;
            if (th.getLocalizedMessage() != null) {
                i = 7zM.A05(th.getLocalizedMessage(), i);
            }
        }
        this.A00 = i;
        this.A02 = obj;
        this.A01 = hfs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Htm htm = (Htm) obj;
        if (this.A04 == htm.A04 && this.A00 == htm.A00) {
            return this.A02.equals(htm.A02);
        }
        return false;
    }

    public int hashCode() {
        return 1BK.A03(this.A02, (((this.A04 ? 1 : 0) * 31) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PresenterStateHolder{mValue=");
        A0k.append(this.A02);
        A0k.append(", mLoading=");
        A0k.append(this.A04);
        A0k.append(", mError=");
        A0k.append(this.A03);
        return AnonymousClass001.A0f(A0k);
    }
}
