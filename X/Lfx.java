package X;

/* loaded from: Lfx.class */
public final class Lfx implements MDb {
    public static final KMC A01 = KMC.A01;
    public final KBr A00;

    public Lfx(KBr kBr) {
        if (!A01.A00()) {
            throw JQx.A10("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.A00 = kBr;
    }
}
