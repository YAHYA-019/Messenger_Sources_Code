package X;

import java.io.IOException;

/* loaded from: Lbp.class */
public final class Lbp implements C6aq {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public Lbp(IOException iOException, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = iOException;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // X.C6aq
    public final void accept(Object obj) {
        ((6Vp) obj).A01((IOException) this.A01, this.A02, this.A03);
    }
}
