package X;

import java.nio.charset.Charset;

/* loaded from: Kyq.class */
public abstract class Kyq {
    public static final byte[] A00;
    public static final C87v A01;
    public static final byte[] A02;
    public static final byte[] A03;
    public static final byte[] A04;

    static {
        Charset charset = C03r.A05;
        A01 = new C87v(new Jt2(DKC.A1a("PasskeyStaticPrfInputV1", charset)));
        A00 = DKC.A1a("ROOT_SCOPE", charset);
        A03 = DKC.A1a("ROOT_ROTATABLE_SCOPE", charset);
        A04 = DKC.A1a("ROOT_STORED_SCOPE", charset);
        A02 = DKC.A1a("BACKUP_KEY_SCOPE", charset);
    }

    public static final KrC A00(Jsq jsq, Jt2 jt2, Jt2 jt22) {
        11T.A0H(jsq, jt2);
        try {
            KsV A002 = jsq.A00.A00(jt2.A00);
            if (jt22 != null) {
                A002 = A002.A00(jt22.A00);
            }
            return new KrC(new Jt2(C1A9.A0J(A002.A00(DKC.A1a("encryptionKey", C03r.A05)).A00, 0, 32)));
        } catch (Exception e) {
            0fH.A0r("PasskeyBackupKeyDeriver", "Failed to derive use case encryption key", e);
            return null;
        }
    }
}
