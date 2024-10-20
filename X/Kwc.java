package X;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: Kwc.class */
public abstract class Kwc {
    public static KT4 A00(byte[] bArr) {
        try {
            KDD A03 = KDF.A03(L9k.A00(), KDD.DEFAULT_INSTANCE, bArr);
            LCx lCx = LCx.A01;
            Lft A00 = Lft.A00(A03);
            return !((KkW) lCx.A00.get()).A02.containsKey(new Kt3(A00.A01, A00.getClass())) ? new KBR(A00) : lCx.A05(A00);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] A01(KT4 kt4) {
        return (kt4 instanceof KBR ? ((KBR) kt4).A00 : (Lft) LCx.A01.A07(kt4)).A00.A0E();
    }
}
