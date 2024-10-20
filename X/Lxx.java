package X;

import java.security.GeneralSecurityException;

/* loaded from: Lxx.class */
public final class Lxx extends ThreadLocal {
    public final /* synthetic */ Lfz A00;

    public Lxx(Lfz lfz) {
        this.A00 = lfz;
    }

    @Override // java.lang.ThreadLocal
    public /* bridge */ /* synthetic */ Object initialValue() {
        try {
            Kza kza = Kza.A05;
            Lfz lfz = this.A00;
            KMC kmc = Lfz.A04;
            javax.crypto.Mac mac = (javax.crypto.Mac) kza.A00.ArR(lfz.A00);
            mac.init(lfz.A01);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
