package X;

/* loaded from: G4u.class */
public final class G4u implements Runnable {
    public static final String __redex_internal_original_name = "CaaAppAttestationHelper$maybeGenerateKeyPair$1$2";
    public final /* synthetic */ F68 A00;
    public final /* synthetic */ C1A7 A01;
    public final /* synthetic */ FHh A02;
    public final /* synthetic */ GJj A03;

    public G4u(F68 f68, C1A7 c1a7, FHh fHh, GJj gJj) {
        this.A00 = f68;
        this.A02 = fHh;
        this.A03 = gJj;
        this.A01 = c1a7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F68.A00(this.A02, this.A03, 0Pz.A1B("KeyAttestationException: ", this.A01));
    }
}
