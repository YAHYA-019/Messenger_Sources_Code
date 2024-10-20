package X;

import java.io.IOException;

/* renamed from: X.4r8, reason: invalid class name */
/* loaded from: 4r8.class */
public final class C4r8 implements C4r9 {
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, X.3pi, X.4sF, X.4sG] */
    @Override // X.C4r9
    public 4sI BMX(1Wx r302, C4r6 c4r6, AbstractC01033pi abstractC01033pi) {
        if (abstractC01033pi.A1J() == C42h.A09) {
            return 4sI.A02;
        }
        abstractC01033pi.A1K();
        if (!"code".equals(abstractC01033pi.A1Y())) {
            4DN A1C = abstractC01033pi.A1C();
            IOException iOException = new IOException("Invalid format. 'code' node not found.", null);
            ((2LD) iOException)._location = A1C;
            throw iOException;
        }
        int A18 = abstractC01033pi.A18();
        if (A18 == -1) {
            4DN A1C2 = abstractC01033pi.A1C();
            IOException iOException2 = new IOException("Invalid format. 'code' value not found.", null);
            ((2LD) iOException2)._location = A1C2;
            throw iOException2;
        }
        abstractC01033pi.A1K();
        abstractC01033pi.A1K();
        abstractC01033pi.A1K();
        if (!"body".equals(abstractC01033pi.A1Y())) {
            4DN A1C3 = abstractC01033pi.A1C();
            IOException iOException3 = new IOException("Invalid format. 'body' node not found.", null);
            ((2LD) iOException3)._location = A1C3;
            throw iOException3;
        }
        abstractC01033pi.A1K();
        ?? obj = new Object();
        ((4sG) obj).A00 = abstractC01033pi;
        ((4sF) obj).A00 = 0;
        r302.A03((AbstractC01033pi) obj, A18);
        return new 4sI((AbstractC01033pi) obj, A18);
    }

    @Override // X.C4r9
    public void CZH(07S r302) {
    }
}
