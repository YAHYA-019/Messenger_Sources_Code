package X;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: Lfh.class */
public final class Lfh implements MGU {
    public static final byte[] A04 = {0};
    public final int A00;
    public final MGW A01;
    public final byte[] A02;
    public final byte[] A03;

    public Lfh(KBq kBq) {
        KMC kmc = Lfy.A03;
        this.A01 = new Lfy(kBq.A02.A00.A01());
        KBs kBs = kBq.A00;
        this.A00 = kBs.A01;
        this.A02 = kBq.A01.A01();
        this.A03 = kBs.A02.equals(L1m.A02) ? Arrays.copyOf(A04, 1) : new byte[0];
    }

    public Lfh(KBr kBr) {
        KMC kmc = Lfz.A04;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("HMAC");
        KBt kBt = kBr.A00;
        this.A01 = new Lfz(AnonymousClass001.A0a(kBt.A02, A0k), new SecretKeySpec(kBr.A02.A00.A01(), "HMAC"));
        this.A00 = kBt.A01;
        this.A02 = kBr.A01.A01();
        this.A03 = kBt.A03.equals(L1n.A02) ? Arrays.copyOf(A04, 1) : new byte[0];
    }

    public Lfh(MGW mgw, int i) {
        this.A01 = mgw;
        this.A00 = i;
        this.A02 = new byte[0];
        this.A03 = new byte[0];
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        mgw.AH8(new byte[0], i);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [byte[], byte[][]] */
    @Override // X.MGU
    public byte[] AHB(byte[] bArr) {
        byte[] bArr2 = this.A03;
        int length = bArr2.length;
        ?? r0 = new byte[2];
        r0[0] = this.A02;
        r0[1] = length > 0 ? this.A01.AH8(L9R.A00(bArr2, bArr), this.A00) : this.A01.AH8(bArr, this.A00);
        return L9R.A03((byte[][]) r0);
    }
}
