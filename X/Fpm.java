package X;

import java.util.LinkedHashMap;

/* loaded from: Fpm.class */
public final class Fpm implements GIW {
    public final /* synthetic */ FFy A00;
    public final /* synthetic */ String A01;

    public Fpm(FFy fFy, String str) {
        this.A00 = fFy;
        this.A01 = str;
    }

    public void ARP() {
        FFy fFy = this.A00;
        FIj A00 = FFy.A00(fFy);
        LinkedHashMap A1C = 1BK.A1C();
        FHZ.A02("pending_request", A1C);
        FIj.A05(A00, A1C);
        fFy.A00.Bxj(0S2.A0N, this.A01, "Existing request pending", "PENDING_REQUEST");
    }

    public void onFailure(Throwable th) {
        FFy fFy = this.A00;
        FIj A00 = FFy.A00(fFy);
        LinkedHashMap A1C = 1BK.A1C();
        FHZ.A03(th, A1C);
        FIj.A05(A00, A1C);
        fFy.A00.Bxj(0S2.A0N, this.A01, "Could not fetch purchases", "NETWORK_FAILURE");
    }
}
