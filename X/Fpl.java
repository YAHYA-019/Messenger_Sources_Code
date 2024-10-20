package X;

import android.app.Activity;
import com.google.common.base.Platform;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

/* loaded from: Fpl.class */
public final class Fpl implements GOY {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ FFy A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public Fpl(Activity activity, FFy fFy, String str, String str2, String str3) {
        this.A01 = fFy;
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = activity;
    }

    public void ARP() {
        FFy fFy = this.A01;
        FFy.A00(fFy).A06("pending_request");
        fFy.A00.Bxj(0S2.A0Y, this.A04, "Existing request pending", "PENDING_REQUEST");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GOY
    public void ByL(Dkt dkt) {
        if (dkt != 0) {
            boolean booleanValue = dkt.getBooleanValue(1717158608);
            String A0r = dkt.A0u() == null ? null : dkt.A0u().A0r(1789842481);
            if (!booleanValue || Platform.stringIsNullOrEmpty(A0r)) {
                FFy fFy = this.A01;
                FFy.A00(fFy).A08(A0r, Boolean.valueOf(booleanValue));
                fFy.A00.Bxj(0S2.A0Y, this.A04, "Product is not purchaseable: user has existing, active entitlement to the subscribable product.", "INVALID_PARAM");
            } else {
                boolean booleanValue2 = dkt.getBooleanValue(727842896);
                ArrayList arrayList = new ArrayList(1);
                Collections.addAll(arrayList, A0r);
                ((C50u) this.A01.A02.get()).CaZ(new FmO(this.A00, this, A0r, this.A02, this.A03, this.A04, 0, booleanValue2), arrayList, null, false);
            }
        }
    }

    public void onFailure(Throwable th) {
        FFy fFy = this.A01;
        FIj A00 = FFy.A00(fFy);
        LinkedHashMap A1C = 1BK.A1C();
        FHZ.A03(th, A1C);
        FIj.A03(A00, A1C);
        fFy.A00.Bxj(0S2.A0Y, this.A04, "Could not fetch product information", "NETWORK_FAILURE");
    }
}
