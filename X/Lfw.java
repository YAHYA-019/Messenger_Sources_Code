package X;

/* loaded from: Lfw.class */
public final class Lfw implements MDb {
    public static final KMC A01 = KMC.A00;
    public final KBq A00;

    public Lfw(KBq kBq) {
        if (!A01.A00()) {
            throw JQx.A10("Can not use AES-CMAC in FIPS-mode.");
        }
        this.A00 = kBq;
    }
}
