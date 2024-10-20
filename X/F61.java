package X;

import java.io.IOException;

/* loaded from: F61.class */
public final class F61 {
    public DLQ A00;
    public GJj A01;
    public GJj A02;
    public String A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r302v0, types: [X.F61, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r302v1 */
    /* JADX WARN: Type inference failed for: r302v2 */
    public static DLQ A00(GKB gkb) {
        String valueOf;
        F61 obj = new Object();
        if (gkb.CX2() != 0S2.A0C) {
            gkb.D0p();
            obj = 0;
        } else {
            while (gkb.BfS() != 0S2.A0N) {
                int A00 = EYi.A00(gkb.CX1());
                gkb.BfS();
                if (35 == A00) {
                    obj.A00 = (DLQ) F2T.A01((En6) null, gkb);
                } else if (33 == A00) {
                    GL3 CX3 = gkb.CX3();
                    Integer CX2 = gkb.CX2();
                    int intValue = CX2.intValue();
                    if (intValue == 7) {
                        valueOf = String.valueOf(CX3.Bc9());
                    } else {
                        if (intValue != 5) {
                            throw EKT.A00("Bloks id only supports long and String types but got: ", KYp.A00(CX2));
                        }
                        valueOf = CX3.D38();
                    }
                    obj.A03 = valueOf;
                } else if (38 == A00) {
                    obj.A02 = EYs.A00((GJy) null, gkb.CX3());
                } else if (43 == A00) {
                    obj.A01 = EYs.A00((GJy) null, gkb.CX3());
                }
                gkb.D0p();
            }
        }
        DLQ dlq = obj.A00;
        if (dlq == null) {
            throw new IOException("Shadow component should never be a leaf node");
        }
        DLQ dlq2 = new DLQ(dlq, obj);
        obj.A00 = null;
        return dlq2;
    }
}
