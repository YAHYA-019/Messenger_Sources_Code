package X;

/* loaded from: Fpo.class */
public final class Fpo implements GIW {
    public final /* synthetic */ FFy A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public Fpo(FFy fFy, String str, String str2) {
        this.A00 = fFy;
        this.A01 = str;
        this.A02 = str2;
    }

    public void ARP() {
        this.A00.A00.Bxj(0S2.A01, this.A02, "Existing request pending", "PENDING_REQUEST");
    }

    public void onFailure(Throwable th) {
        this.A00.A00.Bxj(0S2.A01, this.A02, "Failed to fetch catalog", "NETWORK_FAILURE");
    }
}
