package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Ae2, reason: case insensitive filesystem */
/* loaded from: Ae2.class */
public final class C1324Ae2 implements DFe {
    public final WeakReference A00;

    public C1324Ae2(C1320Ady c1320Ady) {
        this.A00 = 7zL.A14(c1320Ady);
    }

    @Override // X.DFe
    public void BsT(C1323Ae1 c1323Ae1, DIW diw, ByH byH, Object obj) {
        C1320Ady c1320Ady = (C1320Ady) this.A00.get();
        if (c1320Ady != null) {
            c1320Ady.A0F(c1323Ae1, diw, byH, obj);
        }
    }
}
