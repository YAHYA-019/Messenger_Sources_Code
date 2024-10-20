package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: A9t.class */
public final class A9t implements AYv {
    public final C01i A00;

    public A9t(C00m c00m) {
        11T.A0F(c00m, 1);
        this.A00 = C01g.A00(C03i.A03, new AQY(c00m, 36));
    }

    @Override // X.AYv
    public C6jn Aiq(C5fv c5fv) {
        11T.A0F(c5fv, 0);
        Iterator it = ((List) this.A00.getValue()).iterator();
        while (it.hasNext()) {
            C6jn Aiq = ((AYv) 7zL.A11(it.next())).Aiq(c5fv);
            if (Aiq != null) {
                return Aiq;
            }
        }
        return C6jn.A08;
    }
}
