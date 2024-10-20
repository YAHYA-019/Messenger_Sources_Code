package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

/* loaded from: Fpk.class */
public final class Fpk implements GOY {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ FFy A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public Fpk(Activity activity, FFy fFy, String str, String str2) {
        this.A01 = fFy;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = activity;
    }

    public void ARP() {
        FFy fFy = this.A01;
        FFy.A00(fFy).A06("pending_request");
        fFy.A00.Bxj(0S2.A0u, this.A03, "Existing request pending", "PENDING_REQUEST");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GOY
    public void ByL(Dkt dkt) {
        if (dkt != 0) {
            boolean booleanValue = dkt.getBooleanValue(1717158608);
            String A0r = dkt.A0v() != null ? dkt.A0v().A0r(756285279) : null;
            String A0k = dkt.A0v() != null ? dkt.A0v().A0k() : null;
            if (!booleanValue || A0r == null || A0k == null) {
                FFy fFy = this.A01;
                FFy.A00(fFy).A08(A0r, true);
                fFy.A00.Bxj(0S2.A0Y, this.A03, "Product is not purchaseable: product has been previously been purchased but is not consumed.", "INVALID_PARAM");
            } else {
                boolean booleanValue2 = dkt.getBooleanValue(727842896);
                ArrayList arrayList = new ArrayList(1);
                Collections.addAll(arrayList, A0r);
                ((C50u) this.A01.A02.get()).CaZ(new FmO(this.A00, this, A0r, this.A02, A0k, this.A03, 1, booleanValue2), null, arrayList, false);
            }
        }
    }

    public void onFailure(Throwable th) {
        FFy fFy = this.A01;
        FIj A00 = FFy.A00(fFy);
        LinkedHashMap A1C = 1BK.A1C();
        FHZ.A03(th, A1C);
        FIj.A03(A00, A1C);
        fFy.A00.Bxj(0S2.A0u, this.A03, "Could not fetch product information", "NETWORK_FAILURE");
    }
}
