package X;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: Kxo.class */
public abstract class Kxo {
    public static final Object A00 = AnonymousClass001.A0R();

    public static void A00(MIz mIz, L8N l8n, KiA kiA) {
        Throwable A0G;
        try {
            if (mIz != null) {
                byte[] bArr = new byte[0];
                KCs kCs = l8n.A01;
                byte[] AQ1 = mIz.AQ1(kCs.A0E(), bArr);
                try {
                    if (!KDF.A03(L9k.A00(), KCs.DEFAULT_INSTANCE, mIz.AMO(AQ1, bArr)).equals(kCs)) {
                        throw JQx.A10("cannot encrypt keyset");
                    }
                    KCd A0F = KD0.DEFAULT_INSTANCE.A0F();
                    KCd.A00(A0F).encryptedKeyset_ = Lj4.A01(AQ1, 0, AQ1.length);
                    KCt A002 = Kxm.A00(kCs);
                    KD0 A003 = KCd.A00(A0F);
                    A002.getClass();
                    A003.keysetInfo_ = A002;
                    A003.bitField0_ |= 1;
                    if (kiA.A00.putString(kiA.A01, Kwf.A00(A0F.A04().A0E())).commit()) {
                        return;
                    } else {
                        A0G = AnonymousClass001.A0G("Failed to write to SharedPreferences");
                    }
                } catch (KLr unused) {
                    A0G = JQx.A10("invalid keyset, corrupted key material");
                }
            } else {
                if (kiA.A00.putString(kiA.A01, Kwf.A00(l8n.A01.A0E())).commit()) {
                    return;
                } else {
                    A0G = AnonymousClass001.A0G("Failed to write to SharedPreferences");
                }
            }
            throw A0G;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
