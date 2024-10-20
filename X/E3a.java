package X;

import android.content.Context;

/* loaded from: E3a.class */
public final class E3a extends FIJ {
    public FAX A00;
    public final GL7 A01;
    public final C15h A02;
    public final C15h A03;
    public final 1De A04;

    public E3a(1De r302, GL7 gl7, FyG fyG) {
        super(gl7, fyG);
        this.A04 = r302;
        this.A01 = gl7;
        Context A0A = AbK.A0A(r302);
        this.A03 = new G7K(A0A, 66);
        this.A02 = new G7K(A0A, 67);
        F9C f9c = (F9C) 7zR.A0o(A0A, 98361);
        this.A00 = f9c != null ? f9c.A00.A05 : null;
    }
}
