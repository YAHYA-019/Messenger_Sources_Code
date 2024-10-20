package X;

/* loaded from: G5b.class */
public final class G5b implements Runnable {
    public static final String __redex_internal_original_name = "CaaAppAttestationHelper$maybeGenerateKeyPair$1$1";
    public final /* synthetic */ F68 A00;
    public final /* synthetic */ FHh A01;
    public final /* synthetic */ GJj A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ 0CL A04;

    public G5b(F68 f68, FHh fHh, GJj gJj, String str, 0CL r306) {
        this.A01 = fHh;
        this.A02 = gJj;
        this.A00 = f68;
        this.A04 = r306;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FEK.A00(this.A01, DKM.A08(4YW.A0A("encodedCertificateChain", this.A03, 1BK.A1G("keyHash", this.A04.element))), this.A02);
    }
}
